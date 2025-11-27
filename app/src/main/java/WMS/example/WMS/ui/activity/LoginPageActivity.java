package WMS.example.WMS.ui.activity;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import WMS.example.WMS.repository.local.model.UserMaster;
import WMS.example.WMS.ui.viewmodel.LoginViewModel;
import com.example.WMS.R;


import WMS.example.WMS.util.ActivityUtil;
import WMS.example.WMS.util.SecurePrefs;
import WMS.example.WMS.util.eventlistener.OnTouchHideKeyboard;

import java.util.TimeZone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import WMS.example.WMS.util.ApplicationConstants;

import static WMS.example.WMS.ContextApplication.getContext;

public class LoginPageActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private UserMaster user;
    private String uuid = null;
    private String deviceTimeZone;
    private String android_id;
    private Long loginIdForPasswordExpiry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_login_page);
            deviceTimeZone = TimeZone.getDefault().getDisplayName();
            int permissionCheckRead = ContextCompat.checkSelfPermission(getContext(), Manifest.permission.INTERNET);
            if (permissionCheckRead != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(LoginPageActivity.this, new String[]{Manifest.permission.INTERNET}, 1);
            }
            this.usernameEditText = findViewById(R.id.username);
            this.passwordEditText = findViewById(R.id.password);
            this.user = new UserMaster();
            this.loginViewModel = new LoginViewModel(LoginPageActivity.this);
            ConstraintLayout constraintLayout = findViewById(R.id.constraintLayoutId);
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
            constraintLayout.setOnClickListener(new OnTouchHideKeyboard());
            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);

            android_id = Settings.Secure.getString(getContext().getContentResolver(),
                    Settings.Secure.ANDROID_ID);  //Get Device Secure ID

            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                int REQUEST_READ_PHONE_STATE = 1;
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_READ_PHONE_STATE);
            } else {
                uuid = android_id;  //Get Device UUID Number

            }

        } catch (Exception e) {
            uuid = android_id;
            e.printStackTrace();
        }

    }

    public void login(View v) {
        try {
            boolean isNetworkConnected = ActivityUtil.isNetworkConnected(this);
            if (isNetworkConnected) {
                String username = this.usernameEditText.getText().toString();
                String password = this.passwordEditText.getText().toString();
                if (username.equalsIgnoreCase("")) {
                    usernameEditText.setError("Username cannot be empty.");
                } else if (password.equalsIgnoreCase("")) {
                    passwordEditText.setError("Password cannot be empty.");
                    Toast.makeText(this, "Password cannot be empty.", Toast.LENGTH_SHORT).show();
                } else {
                    if (deviceTimeZone.equalsIgnoreCase(ApplicationConstants.IST)) {
                        if (uuid != null) {
                            this.user.setLd_lgnid(this.usernameEditText.getText().toString());
                            this.user.setLd_pass_ang(this.passwordEditText.getText().toString());
                            this.loginViewModel.login(this.user, LoginPageActivity.this, uuid);
                        } else if (android_id != null) {
                            this.user.setLd_lgnid(this.usernameEditText.getText().toString());
                            this.user.setLd_pass_ang(this.passwordEditText.getText().toString());
                            this.loginViewModel.login(this.user, LoginPageActivity.this, android_id);
                        } else {
                            AlertDialog alertDialog = ActivityUtil.createAlertDialog(ApplicationConstants.UUID_MESSAGE, LoginPageActivity.this, "");
                            alertDialog.show();
                        }
                    } else {
                        AlertDialog alertDialog = ActivityUtil.createAlertDialogForLoginIST(ApplicationConstants.IST_MESSAGE, LoginPageActivity.this);
                        alertDialog.show();  //go to the Date and Time Setting screen
                    }
                }
            } else {
                AlertDialog alertDialog = ActivityUtil.createAlertDialog(getString(R.string.no_internet_connection), LoginPageActivity.this, "Error Message!");
                alertDialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, ApplicationConstants.ERROR_MESSAGE, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, but getDeviceId() will still not work on Android 10+
                uuid = android_id;  // fallback
            } else {
                uuid = android_id;
                // You may show a message: permission denied
            }
        }
    }


}
