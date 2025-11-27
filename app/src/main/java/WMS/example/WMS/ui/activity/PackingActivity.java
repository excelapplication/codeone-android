package WMS.example.WMS.ui.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WMS.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import WMS.example.WMS.repository.local.model.PickslipDetail;
import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.ui.adapter.PackingListAdapter;
import WMS.example.WMS.ui.adapter.PutAwayListAdapter;
import WMS.example.WMS.ui.model.PickslipBean;
import WMS.example.WMS.ui.viewmodel.PickingViewModel;

public class PackingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button back;
    private PickingViewModel pickingViewModel;
    private boolean   showPickSlipWiseData;
    List<PickslipBean> packingInvList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            System.out.println("pepeoeioei");
            super.onCreate(savedInstanceState);
            setContentView(R.layout.listview);

            recyclerView = findViewById(R.id.pick_product_list);
            back = findViewById(R.id.back);
            pickingViewModel = new PickingViewModel();
            showPickSlipWiseData=false;
            List<String> dispatchNoList = new ArrayList<>();

            // Load dispatch headers

            packingInvList  = pickingViewModel.getPackingInvList();
                if (packingInvList == null || packingInvList.isEmpty()) {
                    new AlertDialog.Builder(this)
                            .setTitle("Packing Invoices")
                            .setMessage("No Packing Invoices Found.")
                            .setCancelable(false)
                            .setPositiveButton("OK", (d, w) -> {
                                startActivity(new Intent(PackingActivity.this, NewHomePageActivity.class));
                                finish();
                            })
                            .show();
                    return;
                }

            PackingListAdapter pickingAdapter = new PackingListAdapter(packingInvList, PackingActivity.this);

            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(PackingActivity.this));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(pickingAdapter);


            Button btnConfirm = findViewById(R.id.packingConfirm);


            btnConfirm.setOnClickListener(v -> {
                List<PickslipBean> selectedItems = pickingAdapter.getSelectedItems();
                if (selectedItems.isEmpty()) {
                    Toast.makeText(this, "Please select at least one item.", Toast.LENGTH_SHORT).show();
                    return;
                }


                try {
                    pickingViewModel.syncpackinginvoices(selectedItems,this);
                } catch (Exception e) {
                    e.printStackTrace();
                }


            });

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PackingActivity.this, NewHomePageActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                    finish();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
