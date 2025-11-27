package WMS.example.WMS.repository.remote.api;

import WMS.example.WMS.ui.model.PickslipBean;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface PutAwayApi {
    PutAwayApi instance = new Retrofit.Builder()
            .baseUrl(ApplicationConstants.API_BASE_URL)
            .client(RetrofitUtil.getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PutAwayApi.class);


    @POST
    @FormUrlEncoded
    Call<JsonObject> confirmBins(@Url String url, @Field("binScanText") String binScanText, @Field("tranType") String tranType,@Field("tranDtlId") Long tranDtlId,@Field("userId") String userId) throws Exception;

    @POST
    Call<JsonObject> syncpackinginvoices(@Url String url, @Body List<PickslipBean> pickslipBeans, @Query("userId") Long userId);
}
