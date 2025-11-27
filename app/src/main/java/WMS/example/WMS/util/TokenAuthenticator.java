package WMS.example.WMS.util;

import android.content.Intent;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.remote.api.UserMasterApi;
import WMS.example.WMS.ui.activity.LoginPageActivity;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Call;
//
//public class AuthTokenInterceptor implements Interceptor ,ApplicationConstants{
//
//    private Context context;
//    private UserMasterApi userMasterApi;
//
//    public AuthTokenInterceptor() {
//        this.userMasterApi = UserMasterApi.instance;
//    }
//
//    @Override
//    public Response intercept(Chain chain) throws IOException {
//
//        // 1️⃣ Get current Access Token
//        String accessToken = SecurePrefs.get("ACCESS_TOKEN");
//        Request requests = chain.request();
//        String path = requests.url().encodedPath();
//
//        // 🔥 SKIP token for login & refresh API
//        if (path.contains("mobile/sign-in") ||
//                path.contains("mobile/refresh")) {
//
//            return chain.proceed(requests);
//        };
//        if (accessToken == null || accessToken.isEmpty()) {
//            throw new IOException("Unauthorized: Access Token Missing");
//        }
//
//        // 2️⃣ Add Authorization Header
//        Request request = chain.request().newBuilder()
//                .addHeader("Authorization", "Bearer " + accessToken)
//                .build();
//
//        Response response = chain.proceed(request);
//        System.out.println("response--->"+response);
//        // 3️⃣ If access token expired → server sends 401
//        if (response.code() == 401) {
//            response.close();
//
//            synchronized (this) {
//
//                String oldToken = SecurePrefs.get("ACCESS_TOKEN");
//
//                // Token may already be refreshed by another thread
//                if (!oldToken.equals(accessToken)) {
//                    // Retry old request with new token
//                    return retryRequest(chain);
//                }
//
//                // 4️⃣ Refresh token call
//                Response refreshResponse = refreshAccessToken();
//
//                if (refreshResponse == null) {
//                    throw new IOException("Refresh token failed");
//                }
//
//                // 5️⃣ Token refreshed → retry original request
//                return retryRequest(chain);
//            }
//        }
//
//        return response;
//    }
//
//        private Response refreshAccessToken() throws IOException {
//
//            String refreshToken = SecurePrefs.get("REFRESH_TOKEN");
//
//            Map<String, String> body = new HashMap<>();
//            body.put("refreshToken", refreshToken);
//
//            Call<JsonObject> call = this.userMasterApi.refreshAccessToken(API_BASE_URL+REFRESH_TOKEN,refreshToken);
//            retrofit2.Response<JsonObject> refreshResponse = call.execute();
//
//            if (!refreshResponse.isSuccessful()) {
//                // ❌ Refresh token expired — logout user
//                SecurePrefs.clear();
//                throw new IOException("Session expired. Please login again.");
//            }
//
//            String newAccessToken = refreshResponse.body().get("accessToken").getAsString();
//
//            // Save NEW token
//            SecurePrefs.put("ACCESS_TOKEN", newAccessToken);
//
//            return null;
//        }
//
//    private Response retryRequest(Chain chain) throws IOException {
//
//        String newToken = SecurePrefs.get("ACCESS_TOKEN");
//
//        Request newRequest = chain.request().newBuilder()
//                .removeHeader("Authorization")
//                .addHeader("Authorization", "Bearer " + newToken)
//                .build();
//
//        return chain.proceed(newRequest);
//    }
//}
public class TokenAuthenticator implements Authenticator {


    public TokenAuthenticator() {

    }

    @Override
    public Request authenticate(Route route, Response response) throws IOException {

        // Only act on 401
        if (response.code() != 401) return null;

        String refresh = SecurePrefs.get("REFRESH_TOKEN");
        if (refresh == null || refresh.isEmpty()) {
            SecurePrefs.clear();
            return null;   // 👉 STOP retry
        }

        Map<String,String> body = new HashMap<>();
        body.put("refreshToken", refresh);
        UserMasterApi authApi= UserMasterApi.instance;

        System.out.println("refresh--->"+refresh);
        Call<JsonObject> call = authApi.refreshAccessToken(body);
        retrofit2.Response<JsonObject> res = call.execute();

        System.out.println("res---->"+res);
        // ❌ If refresh token expired → DO NOT RETRY
        if (!res.isSuccessful() || res.body() == null || res.body().has("error")) {

            // CLEAR TOKEN
            SecurePrefs.clear();

            // FORCE LOGOUT (notify UI)
            Intent intent = new Intent(ContextApplication.getContext(), LoginPageActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            ContextApplication.getContext().startActivity(intent);

            return null;  // 👉 DO NOT RETRY
        }

        // ✔ Refresh success
        String newAccess = res.body().get("accessToken").getAsString();
        SecurePrefs.put("ACCESS_TOKEN", newAccess);

        // Retry original request with new Access Token
        return response.request().newBuilder()
                .removeHeader("Authorization")
                .addHeader("Authorization","Bearer " + newAccess)
                .build();
    }
}


