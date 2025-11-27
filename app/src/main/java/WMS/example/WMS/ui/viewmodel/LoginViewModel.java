package WMS.example.WMS.ui.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.local.model.Bin_Master;
import WMS.example.WMS.repository.local.model.Company;
import WMS.example.WMS.repository.local.model.FinancialYear;
import WMS.example.WMS.repository.local.model.PeriodMaster;
import WMS.example.WMS.repository.local.model.SubCompany;
import WMS.example.WMS.repository.local.model.UserMaster;
import WMS.example.WMS.repository.remote.api.UserMasterApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.ui.activity.HomePageActivity;
import WMS.example.WMS.ui.activity.NewHomePageActivity;
import WMS.example.WMS.ui.activity.WarehouseSelectionActivity;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.util.ActivityUtil;
import WMS.example.WMS.util.ApplicationSharedPreferences;

//import com.example.medico_stockist.repository.local.model.DispatchDetail;
//import com.example.medico_stockist.repository.local.model.DispatchHeader;

import WMS.example.WMS.util.ApplicationConstants;

import WMS.example.WMS.util.RetrofitUtil;

import com.example.WMS.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import WMS.example.WMS.util.SecurePrefs;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel implements ApplicationConstants {

    private final UserMasterApi userMasterApi;
    private final MedicoStockistDatabase medicoStockistDatabase;
    private final Context context;
    private UserMaster userMaster;
    private String empId;
    private SubCompany subCompany;
    private final ApplicationSharedPreferences applicationSharedPreferences;
    private   List<WareHouseDetail> wareHouseDetails;
    int failedLoginCount = 0;
    public LoginViewModel(Context context) {
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(context);
        userMasterApi = UserMasterApi.instance;
        this.context = context;

        this.applicationSharedPreferences = new ApplicationSharedPreferences(context);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
    }

    public void login(UserMaster user, Context context, String uuid) throws Exception {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage(PLEASE_WAIT);
        progressDialog.setCancelable(false);
        progressDialog.show();
        medicoStockistDatabase.clearAllTables();
        try{
        Call<JsonObject> data = this.userMasterApi.signIn(API_BASE_URL + "mobile/sign-in", user.getLd_lgnid(), user.getLd_pass_ang(), uuid, "fTB-uNhEVvc:APA91bHLePndgVRbVcO-HWRzoCdfbqWa5sRBDsgcA2zD1O-6pmmBE7xXvsAPUrXyJLVtOpfIq8vwkA1haF7dzPZEG0syzhR2hci1k0oVS44gOwVE6ISBIUNaRj8ZaW1ZTuxEeq_RcU0y");
        data.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try {

                    final JSONObject data = new JSONObject(new Gson().toJson(response.body()));
                    boolean allow = data.has("ALLOW") && data.getBoolean("ALLOW");
                    if (!allow) {

                        progressDialog.dismiss();
                        failedLoginCount++;
                        System.out.println("failedLoginCount-->"+data.get("LOGIN_MESSAGE"));

                        if(data.has("user")){

                            userMaster = new Gson().fromJson(data.get("user").toString(), UserMaster.class);
                            System.out.println("userMaster@@"+userMaster);
                    }

                        if (failedLoginCount >= 3 || userMaster.getUser_lock().equalsIgnoreCase("Y")) {
                             lockUserOnServer(userMaster.getLd_emp_cb_id()); // API call to lock user
                            AlertDialog alertDialog = ActivityUtil.createAlertDialog(
                                    "❌ 3 Wrong Login Attempts\n\nYour user account has been LOCKED for security reasons.\nPlease contact Administrator.",
                                    context);
                            alertDialog.show();
                        } else {
                            AlertDialog alertDialog = ActivityUtil.createAlertDialog(
                                     data.get("LOGIN_MESSAGE").toString()+"\nAttempts left: " + (3 - failedLoginCount),
                                    context
                            );   progressDialog.dismiss();
                            alertDialog.show();
                        }
                        return;
                    }

                    if (allow) {

                        // 🔥 CHECK IF MFA/OTP IS REQUIRED
                        if(data.has("transactionId") && data.has("otp")) {

                            String otpFromServer = data.getString("otp");
                            System.out.println("otpFromServer->"+otpFromServer);
                            showOtpPopup(context, otpFromServer, () -> {

                                // 🔥 OTP successful - continue original flow
                                try {
                                    JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                                    userMaster = new Gson().fromJson(jsonObject.get("user").toString(), UserMaster.class);

                                    if(userMaster.getUser_lock().equalsIgnoreCase("Y")){
                                        progressDialog.dismiss();
                                        AlertDialog alertDialog = ActivityUtil.createAlertDialog("User Is Locked....Contact Admin Please", context);
                                        alertDialog.show();
                                        return;
                                    }

                                    userMaster.setUser_lock("Y");
                                    medicoStockistDatabase.userMasterDao().insert(userMaster);

                                    Long userId = userMaster.getLd_id();
                                    applicationSharedPreferences.put(USER_ID, userId);
                                    String accessToken = jsonObject.getString("accessToken");
                                    String refreshToken = jsonObject.optString("refreshToken");


                                    SecurePrefs.put("ACCESS_TOKEN", accessToken);
                                    SecurePrefs.put("REFRESH_TOKEN", refreshToken);


                                    getMasters(progressDialog, userMaster);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            });

                            progressDialog.dismiss();
                            return; // Don't continue until OTP verified
                        }

                        // 🔥 Normal login flow (no OTP)
                        JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                        userMaster = new Gson().fromJson(jsonObject.get("user").toString(), UserMaster.class);

                        userMaster.setUser_lock("Y");
                        medicoStockistDatabase.userMasterDao().insert(userMaster);

                        Long userId = userMaster.getLd_id();
                        applicationSharedPreferences.put(USER_ID, userId);

                        getMasters(progressDialog, userMaster);
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                    progressDialog.dismiss();

                }

            }



            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                progressDialog.dismiss();

                t.printStackTrace();  // correct way to see real error

                Log.e("API_ERROR", "Login API Failed: " + t.getMessage());
                Toast.makeText(context, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void lockUserOnServer(String ld_emp_cb_id) {
        Call<JsonObject> data = this.userMasterApi.userLock(API_BASE_URL + "mobile/user-lock",ld_emp_cb_id);
        data.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                System.out.println("");

            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

                Toast.makeText(ContextApplication.getContext(), ERROR_MESSAGE, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showOtpPopup(Context context, String correctOtp, Runnable onSuccess) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);

        View view = LayoutInflater.from(context).inflate(R.layout.activity_otp, null);
        EditText otpInput = view.findViewById(R.id.edtOtp);
        TextView txtMessage = view.findViewById(R.id.txtMessage);

        txtMessage.setText("OTP has been sent to your registered email.\nPlease enter the OTP to continue.");

        builder.setView(view);

        AlertDialog dialog = builder.create();
        dialog.show();

        final int[] attempts = {0};

        view.findViewById(R.id.btnVerify).setOnClickListener(v -> {
            String entered = otpInput.getText().toString();

            if (entered.equals(correctOtp)) {
                dialog.dismiss();
                onSuccess.run(); // Continue login
            } else {
                attempts[0]++;

                if(attempts[0] >= 3) {
                    dialog.dismiss();
                    Toast.makeText(context, "3 Wrong Attempts! Please login again.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(context, "Invalid OTP. Attempts left: " + (3 - attempts[0]), Toast.LENGTH_SHORT).show();
                }
            }
        });

        view.findViewById(R.id.btnCancel).setOnClickListener(v -> dialog.dismiss());
    }

   private void putSharedPreferences(UserMaster userMaster) throws Exception {
      Map<String, Object> map = new HashMap<>();
       map.put(ACC_CO_NAME, userMaster.getLd_lgnid());
       map.put(EMP_ID, userMaster.getLd_emp_cb_id());

       this.applicationSharedPreferences.set(map);

   }
private void putSharedPreferencesCompany(Company company){
    Map<String, Object> map = new HashMap<>();
    map.put(ACC_CO_CODE, company.getCompany());
    this.applicationSharedPreferences.set(map);


}
    private void putSharedPreferencesFianancialyear(FinancialYear fianancialyear){
        Map<String, Object> map = new HashMap<>();
        Log.v("Avc##",""+fianancialyear.getFin_year());
        map.put(SP_FIN_YEAR_ID, fianancialyear.getFin_year());
        this.applicationSharedPreferences.set(map);
     String   finYearId = (String) applicationSharedPreferences.get(SP_FIN_YEAR_ID);
        System.out.println("finYearId@@"+finYearId);
    }




 private void getMasters(final ProgressDialog progressDialog,UserMaster user) throws Exception {
        Log.v("user","user@@@"+user.getLd_emp_cb_id());
     Call<JsonObject> data = this.userMasterApi.getMasters(API_BASE_URL + "mobile/get-master-data",user.getLd_id(),user.getLd_emp_cb_id());
     data.enqueue(new Callback<JsonObject>() {
         @Override
         public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
          try{
              if(response.body() != null) {
             medicoStockistDatabase.companyDao().deleteCompany();
                  JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                  Log.v("jsonObject", "jsonObject!!!" + jsonObject.toString());
                  Log.v("company@@@","company!!!"+jsonObject.has("company"));
                if (jsonObject.has("company")) {
                    JSONArray subArray = (JSONArray) jsonObject.get("company");
                      Log.v("subArray", "subArray" + subArray.toString());
                      List<Company> companies = new Gson().fromJson(subArray.toString(), new TypeToken<List<Company>>() {
                      }.getType());
                      Log.v("company", "company" + companies.toString());
                      medicoStockistDatabase.companyDao().insert(companies);
                    for (Company sc : companies) {
                        putSharedPreferencesCompany(sc);
                    }
                  }
                  System.out.println("sub_company@@@"+jsonObject.has("sub_company"));
                  if (jsonObject.has("sub_company")) {
                      JSONArray subArray = (JSONArray) jsonObject.get("sub_company");
                      Log.v("subArray", "subArray" + subArray.toString());
                      List<SubCompany> subCompanies = new Gson().fromJson(subArray.toString(), new TypeToken<List<SubCompany>>() {
                      }.getType());
                      Log.v("subCompany", "subCompany" + subCompanies.toString());
                      medicoStockistDatabase.subCompanyDao().insert(subCompanies);



                  }

                  System.out.println("cuurentYear@@@"+jsonObject.has("cuurentYear"));
                  if (jsonObject.has("cuurentYear")) {
                      {
                          JSONArray jsonArray = (JSONArray) jsonObject.get("cuurentYear");

                          List<FinancialYear> financialYear = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<FinancialYear>>() {
                          }.getType());
                          for (FinancialYear fy : financialYear) {
                              medicoStockistDatabase.finYearDao().insertFinancialYear(fy);
                          }

                          for (FinancialYear sc : financialYear) {
                              putSharedPreferencesFianancialyear(sc);
                          }
                      }
                  }
                  System.out.println("period@@@"+jsonObject.has("period"));
                  if (jsonObject.has("period")) {
                      {
                          JSONArray jsonArray = (JSONArray) jsonObject.get("period");
                          List<PeriodMaster> periods = new Gson().fromJson(jsonArray.toString(), new TypeToken<List<PeriodMaster>>() {
                          }.getType());
                          for (PeriodMaster pm : periods) {
                              pm.getPeriod_company().trim();
                              medicoStockistDatabase.periodMasterDao().insertPeriod(pm);
                          }
                      }
                  }
                  putSharedPreferences(userMaster);

                  System.out.println("Financieal@@@"+medicoStockistDatabase.finYearDao().selectFinyear().size());
                  System.out.println("medicoStockistDatabase.selectPeriod()"+medicoStockistDatabase.finYearDao().selectPeriod().size());
                  progressDialog.dismiss();
                  getWareHouseDetails(userMaster);


              }
          }

          catch(Exception e){
              e.printStackTrace();
          }
         }

         @Override
         public void onFailure(Call<JsonObject> call, Throwable t) {

         }
     });
    }

    public void getWareHouseDetails(UserMaster userMaster) throws Exception{
        Call<JsonObject> data = this.userMasterApi.getWareHouseDetails(API_BASE_URL + "mobile/getLocationMobileEmp",userMaster.getLd_emp_cb_id());
        data.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try{
                    JSONObject jsonObject = new JSONObject(new Gson().toJson(response.body()));
                    Log.v("jsonObject","jsonObject!!!"+jsonObject.toString());
                    if(jsonObject.has("EmpLoc"))
                    {
                        JSONArray subArray = (JSONArray) jsonObject.get("EmpLoc");
                        Log.v("subArray",""+subArray.toString());
                  wareHouseDetails = new Gson().fromJson(subArray.toString(), new TypeToken<List<WareHouseDetail>>() {
                        }.getType());
                  if(wareHouseDetails.size()>1) {
                      for (WareHouseDetail wm : wareHouseDetails) {
                          wm.setIsActive("N");
                      }
                  }
                  else{
                      wareHouseDetails.get(0).setIsActive("Y");
                  }

                        medicoStockistDatabase.wh_masterDao().insertWareHouseDetial(wareHouseDetails);
                    }
                    System.out.println("jsonObject.has(BinMaster)"+jsonObject.has("BinMaster"));
                    if(jsonObject.has("BinMaster")){
                        JSONArray subArray = (JSONArray) jsonObject.get("BinMaster");
                   List<Bin_Master>     binMastersList = new Gson().fromJson(subArray.toString(), new TypeToken<List<Bin_Master>>() {
                        }.getType());
                   if(binMastersList != null)
                        medicoStockistDatabase.wh_masterDao().insertBinMaster(binMastersList);
                    }
              Log.v("wareHouseDetailsSIZE",""+wareHouseDetails.size());
                    if(wareHouseDetails.size()>1){
                        context.startActivity(new Intent(context, WarehouseSelectionActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        ((Activity) context).finish();
                    }
                    else{

//                        context.startActivity(new Intent(context, HomePageActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        List<PeriodMaster> periodMasterList = medicoStockistDatabase.periodMasterDao().getPeriodsByFinYearId(10l, "2024");
                        System.out.println("periodMasterList@@@"+periodMasterList.size());

                        context.startActivity(new Intent(context, NewHomePageActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        ((Activity) context).finish();// half a second delay

                    }
                }

                catch(Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }



}
