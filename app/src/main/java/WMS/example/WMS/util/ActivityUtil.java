package WMS.example.WMS.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.codeone.wms.R;

public class ActivityUtil {

    public static void setErrorMessageInSpinner(Spinner spinner, String message) {
        Log.v("called!!!","v");
        TextView errorText = (TextView) spinner.getSelectedView();
        errorText.setError("");
        errorText.setTextColor(Color.RED);//just to highlight that this is an error
        errorText.setText(message);//changes the selected item text to this
    }

    public static AlertDialog createAlertDialog(String message, Context context, String titleMsg) {
        Log.v("message@@@@@@",""+message +context +titleMsg);
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle(titleMsg)
                .setMessage(message)
                .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
        return dialog.create();
    }

    public static AlertDialog createAlertDialogForValidation(String message, Context context, String titleMsg, final EditText editText) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle(titleMsg)
                .setMessage(message)
                .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        editText.getText().clear();
                    }
                });
        return dialog.create();
    }

    public static String getLastNumValue(String getLastNum) {
        Long lastNum = Long.valueOf(getLastNum);
        String lastNumValue = null;
        if (lastNum > 0 && lastNum < 9) {
            lastNumValue = "0000"+lastNum;
        } else if (lastNum >= 9 && lastNum < 99) {
            lastNumValue = "000"+lastNum;
        } else if (lastNum >= 99 && lastNum < 999) {
            lastNumValue = "00"+lastNum;
        } else if (lastNum >= 999 && lastNum < 9999) {
            lastNumValue = "0"+lastNum;
        } else if (lastNum >= 9999 && lastNum < 99999){
            lastNumValue = String.valueOf(lastNum);
        }
        return lastNumValue;
    }

    public static String getMaxLastNumValue(String getLastNum) {
        Long lastNum = Long.valueOf(getLastNum);
        String lastNumValue = null;
        if (lastNum > 0 && lastNum < 9) {
            long newNum = lastNum + 1;
            lastNumValue = "0000"+newNum;
        } else if (lastNum >= 9 && lastNum < 99) {
            long newNum = lastNum + 1;
            lastNumValue = "000"+newNum;
        } else if (lastNum >= 99 && lastNum < 999) {
            long newNum = lastNum + 1;
            lastNumValue = "00"+newNum;
        } else if (lastNum >= 999 && lastNum < 9999) {
            long newNum = lastNum + 1;
            lastNumValue = "0"+newNum;
        } else if (lastNum >= 9999 && lastNum < 99999){
            long newNum = lastNum + 1;
            lastNumValue = String.valueOf(newNum);
        }
        return lastNumValue;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    public static AlertDialog.Builder createAlertDialogForAllowPermission(String message, final Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Please Allow Permission!")
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
        return dialog;
    }

    public static AlertDialog createAlertDialogForLoginIST(String message, final Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Error Message!")
                .setIcon(R.drawable.error_icon)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        context.startActivity(new Intent(Settings.ACTION_DATE_SETTINGS));
                    }
                });
        return dialog.create();
    }

    public static AlertDialog createAlertDialog(String message, Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Error Message!")
                .setIcon(R.drawable.error_icon)
                .setMessage(message)
                .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
        return dialog.create();
    }


}
