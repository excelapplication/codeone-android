package WMS.example.WMS.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import WMS.example.WMS.util.ApplicationSharedPreferences;
import com.example.WMS.R;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.SecurePrefs;


import androidx.appcompat.app.AppCompatActivity;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            // Hide title bar
            getWindow().requestFeature(Window.FEATURE_NO_TITLE);

            // Full screen
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            setContentView(R.layout.activity_splash_screen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    ApplicationSharedPreferences sharedPreferences =
                            new ApplicationSharedPreferences(SplashScreenActivity.this);

                    Boolean check = sharedPreferences.contains(ApplicationConstants.ACC_CO_CODE);

                    if (isVpnConnected()) {

                        if (check) {
                            startActivity(new Intent(SplashScreenActivity.this, NewHomePageActivity.class));
                        } else {
                            startActivity(new Intent(SplashScreenActivity.this, LoginPageActivity.class));
                        }

                        finish();  // ✔ Only finish when moving to next screen

                    } else {

                        // ❗ Do NOT finish() here. Keep activity alive for the dialog.
                        AlertDialog.Builder builder = new AlertDialog.Builder(SplashScreenActivity.this);
                        builder.setTitle("VPN Required");
                        builder.setMessage("VPN is not connected.\nPlease connect to VPN and try again.");
                        builder.setCancelable(false);

                        builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                recreate();   // Reload activity & check VPN again
                            }
                        });

                        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAffinity();   // Fully close app
                            }
                        });

                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                }
            }, 2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isVpnConnected() {
        try {
            for (NetworkInterface networkInterface :
                    Collections.list(NetworkInterface.getNetworkInterfaces())) {

                if (networkInterface.isUp() &&
                        (networkInterface.getName().contains("tun")
                                || networkInterface.getName().contains("ppp")
                                || networkInterface.getName().contains("tap"))) {
                    List<InetAddress> addresses = Collections.list(networkInterface.getInetAddresses());

                    for (InetAddress address : addresses) {
                        String ip = address.getHostAddress();

                        System.out.println("ipaddress:"+ip);
                    }

                    return true; // VPN is active
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
