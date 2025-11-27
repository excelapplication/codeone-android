package WMS.example.WMS.repository.remote.api;

import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface WareHouseApi {

    WareHouseApi instance = new Retrofit.Builder()
            .baseUrl(ApplicationConstants.API_BASE_URL)
            .client(RetrofitUtil.getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(WareHouseApi.class);

}
