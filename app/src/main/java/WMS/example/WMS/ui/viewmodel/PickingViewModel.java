package WMS.example.WMS.ui.viewmodel;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.repository.remote.api.PutAwayApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.ui.activity.PackingActivity;
import WMS.example.WMS.ui.model.PickslipBean;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.util.ActivityUtil;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.ApplicationSharedPreferences;
import WMS.example.WMS.util.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class PickingViewModel implements ApplicationConstants {
    private MedicoStockistDatabase medicoStockistDatabase;
    private Long userId;
    private String empId;
    private PutAwayApi packingApi;


    public PickingViewModel() {
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(ContextApplication.getContext());
        ApplicationSharedPreferences applicationSharedPreferences = new ApplicationSharedPreferences(ContextApplication.getContext());
        userId=(Long) applicationSharedPreferences.get(USER_ID);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
        this.packingApi = PutAwayApi.instance;

    }

    public List<Wms_Tran_DTL> getPickingDetails() throws  Exception{
        return medicoStockistDatabase.wms_Tran_DTLDao().getPickingDetails();
    }

//    public List<Wms_Tran_DTL> getPickingDetails() throws  Exception{
//        return medicoStockistDatabase.wms_Tran_DTLDao().getPutAwayDetails();
//    }

    public Wms_Tran_DTL getWmsDetailByTranId(Long tranId) throws  Exception{
        return medicoStockistDatabase.wms_Tran_DTLDao().getWmsDetailByTranId(tranId);
    }

    public String getDateByTranId(Long tranId, String tranType) throws  Exception{
        return medicoStockistDatabase.wmsTranHdrsDao().getDateByTranId(tranId,tranType);
    }

    public List<Wms_Tran_HDR> getPickingHeaderDetails() throws Exception {
        return medicoStockistDatabase.wms_Tran_DTLDao().getHeaderDetails();
    }

    public List<PickslipHeader> getPickSlipHeaders()throws Exception  {
        return  medicoStockistDatabase.wmsTranHdrsDao().getPickSlipHeaders();
    }

//    public List<PickslipBean> getPicslipproducts(Long tranId) throws  Exception{
//        return  medicoStockistDatabase.wmsTranHdrsDao().getPicslipproducts(tranId);
//    }

    public List<Wms_Tran_DTL> getWmsDetailListByTranId(List<Long> tranIds) throws  Exception{
        return  medicoStockistDatabase.wmsTranHdrsDao().getWmsDetailListByTranId(tranIds);
    }

    public List<PickslipBean> getPackingInvList() throws  Exception{
        return medicoStockistDatabase.wmsTranHdrsDao().getPackingInvList();
    }

    public void syncpackinginvoices(List<PickslipBean> pickslipBeans, Context context) throws  Exception{
        Call<JsonObject> data = packingApi.syncpackinginvoices(API_BASE_URL + "mobile/confirm-packing/",pickslipBeans,userId);
        data.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try{
                    final JSONObject data = new JSONObject(new Gson().toJson(response.body()));
                    boolean response_message = (boolean) data.get(ApplicationConstants.DATA_SAVED);
                    System.out.println("response_message=="+response_message);
                    if(response_message){
                        Toast.makeText(context, pickslipBeans.size() + " Invoices confirmed.", Toast.LENGTH_SHORT).show();
                        WareHouseDetail wareHouseDetail=  new WareHouseSelectionViewModel() .getActiveWareHouse();
                        new  HomePageViewModel().getTransactionData(wareHouseDetail.getWh_id(),"PA",context);
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
}
