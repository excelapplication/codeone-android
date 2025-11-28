package WMS.example.WMS.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;

import com.codeone.wms.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BottomNavigationToolbar extends AppCompatActivity {

    public void home(View view) {
        this.startActivity(new Intent(this, HomePageActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }

    public void other(View view) {
    }

    public void claim(View view) {
    }

    public void retailerOrder(View view) {
    }

    public void grn(View view) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(BottomNavigationToolbar.this);
        View layoutView = getLayoutInflater().inflate(R.layout.custom_layout, null);
        dialogBuilder.setView(layoutView);
        final AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();
        TextView auto = layoutView.findViewById(R.id.entry);
        TextView modify = layoutView.findViewById(R.id.modify);
        TextView delete = layoutView.findViewById(R.id.delete);
        View view1 = layoutView.findViewById(R.id.view);
        view1.setVisibility(View.VISIBLE);
        auto.setText("GRN Entry");
        modify.setText("GRN Modify");
        delete.setText("GRN Delete");
        delete.setVisibility(View.VISIBLE);

    }
}