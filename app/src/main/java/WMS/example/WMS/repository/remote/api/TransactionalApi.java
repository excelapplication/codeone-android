package WMS.example.WMS.repository.remote.api;

import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface TransactionalApi {

    TransactionalApi instance = new Retrofit.Builder()
            .baseUrl(ApplicationConstants.API_BASE_URL)
            .client(RetrofitUtil.getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(TransactionalApi.class);

    @POST
    @FormUrlEncoded
    Call<JsonObject> getTransactionData(@Url String url,@Field("userId") Long ld_id,@Field("empId") String empId,@Field("wh_id") Long wh_id);

    @GET
    Call<JsonObject> getDashBoardData(@Url String url,@Query("company") String company,@Query("finflag") String finflag,@Query("finyear") String finyear,@Query("fromperiod") String fromperiod,@Query("toperiodcd") String toperiodcd);

}
