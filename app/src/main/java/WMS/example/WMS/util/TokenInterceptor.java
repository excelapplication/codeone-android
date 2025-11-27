package WMS.example.WMS.util;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        String path = request.url().encodedPath();

        // 🔥 SKIP TOKEN for login & refresh API
        if (path.contains("/mobile/sign-in") ||
                path.contains("/mobile/refresh")) {

            return chain.proceed(request);
        }

        // 🔥 Any other API MUST have ACCESS_TOKEN
        String token = SecurePrefs.get("ACCESS_TOKEN");

        if (token == null || token.trim().isEmpty()) {
            // This is EXACT error shown earlier:
            // Unauthorized: Access Token Missing
            throw new IOException("Unauthorized: Access Token Missing");
        }

        // 🔥 Attach JWT Bearer token
        Request newRequest = request.newBuilder()
                .header("Authorization", "Bearer " + token)
                .build();

        return chain.proceed(newRequest);
    }
}
