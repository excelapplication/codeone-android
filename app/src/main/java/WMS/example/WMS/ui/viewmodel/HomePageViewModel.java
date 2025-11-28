package WMS.example.WMS.ui.viewmodel;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.local.model.PeriodMaster;
import WMS.example.WMS.repository.local.model.PickslipBinDetail;
import WMS.example.WMS.repository.local.model.PickslipDetail;
import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.Wms_AnalyticsBean;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.repository.local.model.Wms_trf_hdr;
import WMS.example.WMS.repository.remote.api.TransactionalApi;
import WMS.example.WMS.repository.remote.api.UserMasterApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.ui.activity.NewHomePageActivity;
import WMS.example.WMS.ui.activity.PackingActivity;
import WMS.example.WMS.ui.activity.PickingActivity;
import WMS.example.WMS.ui.activity.PutAwayActivity;
import WMS.example.WMS.ui.activity.TransferActivity;
import WMS.example.WMS.ui.adapter.ChartAdapter;
import WMS.example.WMS.ui.adapter.WmsStorageSumAdapter;
import WMS.example.WMS.ui.model.WmsStorageSummary;
import WMS.example.WMS.util.ApplicationSharedPreferences;


import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.RetrofitUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.codeone.wms.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import WMS.example.WMS.util.CustomViewPager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePageViewModel implements ApplicationConstants {

    private MedicoStockistDatabase medicoStockistDatabase;
    private UserMasterApi userMasterApi;
    private String accCompanyCode, companyName, finYearId;
    private String empId;
    private TransactionalApi transactionalApi;
    private Long userId;

    public HomePageViewModel() {
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(ContextApplication.getContext());
        this.userMasterApi = UserMasterApi.instance;
        ApplicationSharedPreferences applicationSharedPreferences = new ApplicationSharedPreferences(ContextApplication.getContext());
        accCompanyCode = (String) applicationSharedPreferences.get(ACC_CO_CODE);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
        Log.v("empId", "empId" + empId);
        this.transactionalApi = TransactionalApi.instance;
        userId = (Long) applicationSharedPreferences.get(USER_ID);
        finYearId = (String) applicationSharedPreferences.get(SP_FIN_YEAR_ID);
        companyName =(String) applicationSharedPreferences.get(ACC_CO_CODE);
        System.out.println("userId!!!"+userId);
        System.out.println("finYearId!!!"+finYearId);
        System.out.println("companyName!!!"+companyName);
    }


    private void changeApprovalStatus(TextView approvalStatus) {
        approvalStatus.setText(R.string.send);
        approvalStatus.setTextColor(ContextCompat.getColor(ContextApplication.getContext(), R.color.green_color));
        approvalStatus.setCompoundDrawablesWithIntrinsicBounds(R.drawable.dcr_approval_icon, 0, 0, 0);
        approvalStatus.setOnClickListener(null);
    }


    public List<PeriodMaster> getPeriodsByFinYearId(Long periodId) throws Exception {
        System.out.println("periodId@@ "+periodId+"finYearId@@ "+finYearId);
        return medicoStockistDatabase.periodMasterDao().getPeriodsByFinYearId(periodId, finYearId);
    }

    public List<PeriodMaster> getToPeriod(Long periodId) throws Exception {
        Log.v("parameter@@", "" + periodId + "" + finYearId + " " + companyName);
        return medicoStockistDatabase.periodMasterDao().getToPeriodbyFinyears(periodId, finYearId);
    }


    public void syncPurchaseCnDn(final Context context, final TextView purchaseCnDnSync) throws Exception {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage(PLEASE_WAIT);
        progressDialog.setCancelable(false);
        progressDialog.show();
//        Call<JsonObject> syncData = this.userMasterApi.syncPurchaseCnDn(API_BASE_URL + "mobile/sync-poCnDn", createJsonPurchaseCnDn());

    }

    public void getTransactionData(Long whId,String tranType,Context context) {
        System.out.println("empId"+empId);
        System.out.println("whId"+whId);
        System.out.println("userId"+userId);
        final ProgressDialog dataDialog = new ProgressDialog(context);
        dataDialog.setTitle("Loading Data");
        dataDialog.setMessage(PLEASE_WAIT);
        dataDialog.setCancelable(false);

            showProgressDialog(context);

        Call<JsonObject> getAndroidData = this.transactionalApi.getTransactionData(API_BASE_URL + "mobile/getTransaction-data", userId, empId,whId);
        getAndroidData.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try {
                    List<Wms_Tran_HDR> wmsTranHdrs = null;
                    List<Wms_Tran_DTL> wmsTranDtls = null;

                    if (response.body() != null) {

                        medicoStockistDatabase.wmsTranHdrsDao().deleteWms_Tran_HDR();
                        medicoStockistDatabase.wms_Tran_DTLDao().deleteWms_Tran_DTL();
                        medicoStockistDatabase.wms_trf_hdrDao().deleteWms_Tran_HDR();
                        medicoStockistDatabase.wmsTrfDtlDao().deleteWms_Transefer_DTL();
                        medicoStockistDatabase.wmsTranHdrsDao().deletepicksliphdr();
                        medicoStockistDatabase.wmsTranHdrsDao().deletepickslipdtl();


                        JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                        if (jsonObject.has("wmsTranHeader")) {
                            {
                                JSONArray jsonArray = (JSONArray) jsonObject.get("wmsTranHeader");
                                List<Wms_Tran_HDR> WmsTranhd = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Wms_Tran_HDR>>() {
                                }.getType());
                                for (Wms_Tran_HDR wh : WmsTranhd) {
                                    medicoStockistDatabase.wmsTranHdrsDao().insertwmsTranHdrs(wh);
                                }
                            }
                        }
                        if (jsonObject.has("wmsTranDetail")) {
                            {
                                JSONArray jsonArray = (JSONArray) jsonObject.get("wmsTranDetail");
                                List<Wms_Tran_DTL> wmsTranDtl = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Wms_Tran_DTL>>() {
                                }.getType());
                                Log.v("wmsTranDtl@@@", " " + wmsTranDtl.toString());
                                for (Wms_Tran_DTL wt : wmsTranDtl) {
                                    medicoStockistDatabase.wms_Tran_DTLDao().insertwmsTranDetail(wt);
                                }
                            }
                        }
                        if (jsonObject.has("wmsStocktransferHeader")) {
                            {
                                JSONArray jsonArray = (JSONArray) jsonObject.get("wmsStocktransferHeader");
                                List<Wms_trf_hdr> wmsTranDtl = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Wms_trf_hdr>>() {
                                }.getType());
                                for (Wms_trf_hdr wth : wmsTranDtl) {
                                    medicoStockistDatabase.wms_trf_hdrDao().insertWms_trf_hdrDao(wth);
                                }
                            }
                        }

                        if (jsonObject.has("wmsStocktransferDetail")) {
                            {
                                JSONArray jsonArray = (JSONArray) jsonObject.get("wmsStocktransferDetail");
                                List<Wms_trf_dtl> wmsTranDtl = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Wms_trf_dtl>>() {
                                }.getType());
                                for (Wms_trf_dtl wth : wmsTranDtl) {
                                    medicoStockistDatabase.wmsTrfDtlDao().insertwmsTranDetail(wth);
                                }
                            }
                        }

                        if (jsonObject.has("pickSliphdr")) {

                                JSONArray jsonArray = (JSONArray) jsonObject.get("pickSliphdr");
                                List<PickslipHeader> pickslipHd = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<PickslipHeader>>() {
                                }.getType());
                            System.out.println("pickslipHd"+pickslipHd.size());
                            medicoStockistDatabase.wmsTranHdrsDao().insertPickSlipheaderList(pickslipHd);

                        } if (jsonObject.has("pickSlipDtl")) {

                                JSONArray jsonArray = (JSONArray) jsonObject.get("pickSlipDtl");
                                List<PickslipDetail> pickslipDtl = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<PickslipDetail>>() {
                                }.getType());
                            System.out.println("pickslipDtl"+pickslipDtl);
                                medicoStockistDatabase.wmsTranHdrsDao().insertPickSlipDetailList(pickslipDtl);
                            List<PickslipDetail> dtl=  medicoStockistDatabase.wmsTranHdrsDao().getPickSlipdetails();
                            System.out.println("dtl--->"+dtl);

                        } if (jsonObject.has("pickSlipbin")) {

                                JSONArray jsonArray = (JSONArray) jsonObject.get("pickSlipbin");
                                List<PickslipBinDetail> pickslipDtlBin = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<PickslipBinDetail>>() {
                                }.getType());
                                medicoStockistDatabase.wmsTranHdrsDao().insertPickSlipDetailBinList(pickslipDtlBin);


                        }
                        dismissProgressDialog();
                        dataDialog.dismiss();
                        if(tranType.equalsIgnoreCase("PT")){
                            Intent intent = new Intent(context, PutAwayActivity.class);
                                     intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                     context.startActivity(intent);
//                            context.startActivity(new Intent(context, PutAwayActivity.class));
                        }else if(tranType.equalsIgnoreCase("PI")){
                            Intent intent = new Intent(context, PickingActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            context.startActivity(intent);
//                            context.startActivity(new Intent(context,PickingActivity.class));
                        }else if (tranType.equalsIgnoreCase("PA")){
                            Intent intent = new Intent(context, PackingActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            context.startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(context, TransferActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            context.startActivity(intent);
//                            context.startActivity(new Intent(context, TransferActivity.class));
                        }
                    }
                } catch (Exception e) {
                    dataDialog.dismiss();
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                dataDialog.dismiss();
            }
        });
    }
public PeriodMaster getCuurentPeriod() throws Exception {
        Log.v("finYearId",""+finYearId +" "+" "+companyName);
    return medicoStockistDatabase.periodMasterDao().getCuurentPeriod(finYearId);
}
//public getAnalyticsData(){

    public View getDashBoardData(String periodCd, final Context context, final Button bar, final Button pie, final CustomViewPager viePwager, String  toperiodcd, String analyzeOn) {
        System.out.println("periodCd"+periodCd);
        System.out.println("toperiodcd"+toperiodcd);
        System.out.println("companyName"+companyName);
        System.out.println("finYearId"+finYearId);
        System.out.println("companyName"+companyName);
        Call<JsonObject> getAndroidData = this.transactionalApi.getDashBoardData(API_BASE_URL + "rest/getDashBoardData", companyName, "CURRENT", finYearId, periodCd,toperiodcd);
        getAndroidData.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try {
                    if (response.body() != null) {

                        JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                        System.out.println("comming_wms_analyticsBeans@@@"+jsonObject.keys());
                        if (jsonObject.has("AnalyticData")) {
                            JSONArray jsonArray = (JSONArray) jsonObject.get("AnalyticData");
                            List<Wms_AnalyticsBean>  wms_analyticsBeans = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<Wms_AnalyticsBean>>() {
                            }.getType());

                            System.out.println("wms_analyticsBeans@@@"+wms_analyticsBeans.toString());
                            String wmsAnalytics = new Gson().toJson(wms_analyticsBeans);
                            ChartAdapter chartAdapter = new ChartAdapter(context, ((AppCompatActivity) context).getSupportFragmentManager(), 1, wmsAnalytics,analyzeOn);
                            setDataInBarAndPieGraph(viePwager, chartAdapter, bar, pie, context);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
            }
        });


        return viePwager;
    }
    private void setDataInBarAndPieGraph(final CustomViewPager viewPager, ChartAdapter chartAdapter, final Button bar, final Button pie, final Context context) throws Exception {


        viewPager.disableScroll(true);
        viewPager.setAdapter(chartAdapter);

       // viewPager2.disableScroll(true);
     //   viewPager2.setAdapter(chartAdapter);

//        bar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                viewPager.setCurrentItem(0);
//                bar.setBackground(ContextCompat.getDrawable(context, R.drawable.btn_yellow));
//                bar.setTextColor(context.getResources().getColor(R.color.white));
//                pie.setBackground(ContextCompat.getDrawable(context, R.drawable.whitecurve));
//                pie.setTextColor(context.getResources().getColor(R.color.black));
//            }
//        });

//        pie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                viewPager.setCurrentItem(1);
//                pie.setBackground(ContextCompat.getDrawable(context, R.drawable.btn_yellow));
//                pie.setTextColor(context.getResources().getColor(R.color.white));
//                bar.setBackground(ContextCompat.getDrawable(context, R.drawable.whitecurve));
//                bar.setTextColor(context.getResources().getColor(R.color.black));
//
//            }
//        });
    }
    private AlertDialog progressDialog;

    public void showProgressDialog(Context context) {
        // Create layout programmatically
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(50, 50, 50, 50);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundResource(R.drawable.dialog_background); // Rounded background

        // Add ProgressBar
        ProgressBar progressBar = new ProgressBar(context);
        layout.addView(progressBar);

        // Add TextView
        TextView message = new TextView(context);
        message.setText("Loading Data...");
        message.setPadding(0, 20, 0, 0);
        message.setTextSize(16);
        message.setTextColor(Color.BLACK);
        message.setGravity(Gravity.CENTER);
        layout.addView(message);

        // Build Dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(layout);
        builder.setCancelable(false);
        progressDialog = builder.create();

        // Optional: Make background transparent
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        progressDialog.show();
    }

    public void dismissProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    public void getWmsStorageData(RecyclerView innerRecyclerView) {

        Call<JsonObject> getAndroidData = this.userMasterApi.getDashBoardData(API_BASE_URL + "mobile/get-wms-storage");
        getAndroidData.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try {
                    if (response.body() != null) {
                        JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                        System.out.println("jsonObject.hasdata##)"+jsonObject.has("WmsStorageData"));
                        if (jsonObject.has("WmsStorageData")) {
                            JSONArray jsonArray = (JSONArray) jsonObject.get("WmsStorageData");
                            List<WmsStorageSummary>  wmsStorageSummary = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<WmsStorageSummary>>() {
                            }.getType());
                            System.out.println("wmsStorageSummary@@"+wmsStorageSummary);
                            WmsStorageSumAdapter adapter = new WmsStorageSumAdapter(wmsStorageSummary);
                            innerRecyclerView.setAdapter(adapter);

                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
            }
        });


    }

    public void loadSharedPrefs(Context context) {
    }
}

