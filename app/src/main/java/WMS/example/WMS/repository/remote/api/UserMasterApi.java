package WMS.example.WMS.repository.remote.api;

import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;
import WMS.example.WMS.util.json.MastersJson;
import WMS.example.WMS.util.json.PurchaseCnDnJson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface UserMasterApi {

    UserMasterApi instance = new Retrofit.Builder()
            .baseUrl(ApplicationConstants.API_BASE_URL)
            .client(RetrofitUtil.getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(UserMasterApi.class);

    @POST
    @FormUrlEncoded
    Call<JsonObject> login(@Url String url, @Query("username") String username, @Query("password") String password);



    @GET
    Call<JsonArray> getCityMaster(@Url String url);

    @GET
    Call<JsonObject> getMasters(@Url String url,@Query("userId") Long ld_id,@Query("empId") String empId);

    @GET
    Call<JsonObject> getWareHouseDetails(@Url String url,@Query("empCode") String empCode);


    @GET
    Call<JsonObject> getBatchMaster(@Url String url);

    @GET
    Call<JsonObject> getParameter(@Url String url);

    @GET
    Call<JsonObject> getNonSaleableBatchMaster(@Url String url);

    @GET
    Call<JsonObject> getGrn(@Url String url);

    @GET
    Call<JsonObject> getDispatch(@Url String url);

    @GET
    Call<JsonObject> getApMaster(@Url String url);

    @GET
    Call<JsonObject> getClaim(@Url String url);

    @GET
    Call<JsonObject> getIntransit(@Url String url);

    @GET
    Call<JsonObject> getGlMaster(@Url String url);

    @POST
    @FormUrlEncoded
    Call<JsonObject> signIn(@Url String url, @Field("username") String username, @Field("password") String password, @Field("uuid") String uuid, @Field("fcmToken") String fcmToken);

    @POST
    Call<JsonObject> updateAllTablesByManualSync(@Url String url, @Body MastersJson mastersJson);

    @POST
    Call<JsonObject> syncPurchaseCnDn(@Url String url, @Body PurchaseCnDnJson purchaseCnCnJson);

    @GET
    Call<JsonObject> getDashBoardData(@Url String url);

    @POST
    @FormUrlEncoded
    Call<JsonObject> userLock(@Url String url, @Field("ld_emp_cb_id") String username);

    @POST("rest/refresh")
    Call<JsonObject> refreshAccessToken(@Body Map<String,String> body);

}

