package WMS.example.WMS.repository.remote.api;

import WMS.example.WMS.repository.local.model.ProductMaster;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ProductApi {

    ProductApi instance = new Retrofit.Builder()
            .baseUrl(ApplicationConstants.API_BASE_URL)
            .client(RetrofitUtil.getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ProductApi.class);

    @GET
    Call<JsonObject> getProdListBySupplier(@Url String url, @Query("acc_comp_cd") String accCode, @Query("supplierId") Long supplierId) throws Exception;

    @GET
    Call<JsonObject> getProdListByAccCode(@Url String url, @Query("acc_comp_cd") String accCode) throws Exception;

    @GET
    Call<JsonObject> getProdList(@Url String url, @Query("acc_co_cd") String accCode, @Query("dspId") Long dspId, @Query("invdate") String invdate) throws Exception;

    @GET
    Call<JsonObject> getProdList(@Url String url, @Query("acc_comp_cd") String accCode, @Query("principal_code") String dspId) throws Exception;

    @GET
    Call<JsonObject> getProdListModify(@Url String url, @Query("acc_co_cd") String accCode, @Query("headerId") Long headerId) throws Exception;

    @GET
    Call<JsonObject> setProdLock(@Url String url, @Query("acc_comp_cd") String accCode,
                                 @Query("prod_id") Long prodId, @Query("user") String user) throws Exception;

    @GET
    Call<JsonObject> setProdRelease(@Url String url, @Query("acc_comp_cd") String accCode,
                                 @Query("prod_id") Long prodId, @Query("user") String user) throws Exception;

    @GET
    Call<JsonObject> getProdListByClaimNum(@Url String url, @Query("acc_comp_cd") String accCode, @Query("supplierId") Long supplierId, @Query("claim_Num") String claimNum) throws Exception;


    @POST
    Call<JsonObject> saveProductMaster(@Url String url, @Body ProductMaster saveproductMaster) throws Exception;

    @GET
    Call<JsonObject> getProdMax(@Url String url) throws Exception;

}
