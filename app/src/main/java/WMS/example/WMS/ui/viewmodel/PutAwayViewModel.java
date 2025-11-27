package WMS.example.WMS.ui.viewmodel;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.repository.remote.api.PutAwayApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.ui.activity.HomePageActivity;
import WMS.example.WMS.ui.activity.MainScannerActivittiv;
import WMS.example.WMS.ui.activity.NewHomePageActivity;
import WMS.example.WMS.ui.activity.PutAwayActivity;
import WMS.example.WMS.ui.activity.TransferActivity;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.util.ActivityUtil;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.ApplicationSharedPreferences;
import WMS.example.WMS.util.RetrofitUtil;
import WMS.example.WMS.ContextApplication;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PutAwayViewModel implements ApplicationConstants {
    private MedicoStockistDatabase medicoStockistDatabase;
    private Long userId;
    private PutAwayApi putAwayApi;
    private String empId,finYearId;
    private HomePageViewModel homePageViewModel;

    public PutAwayViewModel( ) {
        this.homePageViewModel= new HomePageViewModel();
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(ContextApplication.getContext());
        ApplicationSharedPreferences applicationSharedPreferences = new ApplicationSharedPreferences(ContextApplication.getContext());
        userId=(Long) applicationSharedPreferences.get(USER_ID);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
        finYearId = (String) applicationSharedPreferences.get(SP_FIN_YEAR_ID);
       this.putAwayApi = PutAwayApi.instance;

    }

    public List<Wms_Tran_HDR> getPutAwayHeaderDetails() throws  Exception{
        return medicoStockistDatabase.wmsTranHdrsDao().getPutAwayDetails(finYearId);
    }

    public List<Wms_Tran_DTL> getPutAwayDetails() throws  Exception{
        return medicoStockistDatabase.wms_Tran_DTLDao().getPutAwayDetails();
    }

    public Wms_Tran_DTL getWmsDetailByTranId(Long tranId) throws  Exception{
        return medicoStockistDatabase.wms_Tran_DTLDao().getWmsDetailByTranId(tranId);
    }
    public void confirmBin(String tranType, Long tranDtlId, Context context,String bincode) throws Exception {



    Call<JsonObject> data = putAwayApi.confirmBins(API_BASE_URL + "mobile/confirm-bin/",bincode,tranType,tranDtlId,empId);
        data.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try{
                    final JSONObject data = new JSONObject(new Gson().toJson(response.body()));
                 String response_message = data.get("RESPONSE_MESSAGE").toString();
                 if(response_message.equals(ApplicationConstants.DATA_SAVED)){
                     if(tranType.equalsIgnoreCase("01")){
                         medicoStockistDatabase.wms_Tran_DTLDao().updateWmsConfirmed(tranType,tranDtlId);
                         Toast.makeText(context,"PutAway Saved  successfully",Toast.LENGTH_SHORT).show();
                         WareHouseDetail wareHouseDetail=  new WareHouseSelectionViewModel() .getActiveWareHouse();
                         homePageViewModel.getTransactionData(wareHouseDetail.getWh_id(),"PT",context);
                     }
                     else if(tranType.equalsIgnoreCase("02")) {
                         medicoStockistDatabase.wms_Tran_DTLDao().updateWmsConfirmed(tranType,tranDtlId);
                         Toast.makeText(context,"Picking Saved successfully",Toast.LENGTH_SHORT).show();
                         WareHouseDetail wareHouseDetail=  new WareHouseSelectionViewModel() .getActiveWareHouse();
                         homePageViewModel.getTransactionData(wareHouseDetail.getWh_id(),"PI",context);

                     }else{
                         medicoStockistDatabase.wmsTrfDtlDao().updateWmsConfirmed(tranType,tranDtlId);
                         Toast.makeText(context,"Stock Transfer Saved  successfully",Toast.LENGTH_SHORT).show();
                         WareHouseDetail wareHouseDetail=  new WareHouseSelectionViewModel() .getActiveWareHouse();
                         homePageViewModel.getTransactionData(wareHouseDetail.getWh_id(),"TR",context);

                     }


                 }

                 else{
                     AlertDialog alertDialog =  ActivityUtil.createAlertDialog(ApplicationConstants.ERROR_OCCURED,context);
                     alertDialog.show();
                 }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }

    public String getDateByTranId(Long tranId, String tranType) throws  Exception{
        return medicoStockistDatabase.wmsTranHdrsDao().getDateByTranId(tranId,tranType);
    }

    public String getbincodeByBinId(Long binId) {
        return  medicoStockistDatabase.wh_masterDao().getbincodeByBinId(binId);
    }
}
