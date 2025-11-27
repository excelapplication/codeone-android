package WMS.example.WMS.ui.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.ui.adapter.PutAwayListAdapter;
import WMS.example.WMS.ui.model.PickslipBean;
import WMS.example.WMS.ui.viewmodel.PickingViewModel;
import com.example.WMS.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PickingActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button back;
    private PickingViewModel pickingViewModel;
    private boolean   showPickSlipWiseData;
    List<PickslipHeader> PickheaderList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.listview);

            recyclerView = findViewById(R.id.pick_product_list);
            back = findViewById(R.id.back);
            pickingViewModel = new PickingViewModel();
            showPickSlipWiseData=false;
            List<String> dispatchNoList = new ArrayList<>();

            // Load dispatch headers
            if(showPickSlipWiseData){
                PickheaderList  = pickingViewModel.getPickSlipHeaders();
                if (PickheaderList == null || PickheaderList.isEmpty()) {
                    new AlertDialog.Builder(this)
                            .setTitle("No Pickslip Found.")
                            .setMessage("No dispatch data available.")
                            .setCancelable(false)
                            .setPositiveButton("OK", (d, w) -> {
                                startActivity(new Intent(PickingActivity.this, NewHomePageActivity.class));
                                finish();
                            })
                            .show();
                    return;
                }
                for (PickslipHeader hdr : PickheaderList) {
                    dispatchNoList.add(hdr.getPs_tran_no());
                }
            }else{
                List<Wms_Tran_HDR> headerList = pickingViewModel.getPickingHeaderDetails();

                if (headerList == null || headerList.isEmpty()) {
                    new AlertDialog.Builder(this)
                            .setTitle("No Dispatch Found")
                            .setMessage("No dispatch data available.")
                            .setCancelable(false)
                            .setPositiveButton("OK", (d, w) -> {
                                startActivity(new Intent(PickingActivity.this, NewHomePageActivity.class));
                                finish();
                            })
                            .show();
                    return;
                }


                for (Wms_Tran_HDR hdr : headerList) {
                    dispatchNoList.add(hdr.getSd_tran_no());
                }

            }

            // Show searchable dropdown dialog
            WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics metrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(metrics);

            int screenWidth = metrics.widthPixels;
            int screenHeight = metrics.heightPixels;

            Dialog dialog = new Dialog(PickingActivity.this);
            dialog.setContentView(R.layout.dialog_searchable_spinner);
            dialog.setCancelable(false);


            dialog.getWindow().setLayout(screenWidth - 20, screenHeight - 100);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            EditText editText = dialog.findViewById(R.id.edit_text);
            TextView heading_text = dialog.findViewById(R.id.heading_text);
            ListView listView = dialog.findViewById(R.id.list_view);
            ImageView backbutton = dialog.findViewById(R.id.back_arrow);
            backbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PickingActivity.this, NewHomePageActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                    finish(); // finish current activity
                }
            });
            heading_text.setText("Select Dispatch Number");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(PickingActivity.this, android.R.layout.simple_list_item_1, dispatchNoList);
            listView.setAdapter(adapter);

            editText.addTextChangedListener(new TextWatcher() {
                @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s);
                }
                @Override public void afterTextChanged(Editable s) {}
            });

            listView.setOnItemClickListener((parent, view, position, id) -> {
                String selectedDispatch = adapter.getItem(position);
                try {
                List<Wms_Tran_DTL> allDtls = null;
                List<Wms_Tran_DTL> filteredList = new ArrayList<>();

//                if(showPickSlipWiseData){
//                    Long tranId = PickheaderList.stream()
//                            .filter(e -> e.getPs_tran_no() != null && e.getPs_tran_no().equalsIgnoreCase(selectedDispatch))
//                            .map(PickslipHeader::getSl_no)   // or whichever field gives you the transaction ID
//                            .findFirst()
//                            .orElse(null);
//                    List<PickslipBean> picking=pickingViewModel.getPicslipproducts(tranId);
//
//                    List<Long> tranIds = picking.stream()
//                            .map(PickslipBean::getSd_tran_hdr_id) // extract the field
//                            .filter(Objects::nonNull)             // skip nulls (optional)
//                            .collect(Collectors.toList());
//                    filteredList=pickingViewModel.getWmsDetailListByTranId(tranIds);

//                }else{
                    allDtls = pickingViewModel.getPickingDetails();


                    for (Wms_Tran_DTL dtl : allDtls) {
                        if (dtl.getSd_tran_no().equals(selectedDispatch)) {
                            filteredList.add(dtl);
                        }
                    }
//                }



                PutAwayListAdapter pickingAdapter = new PutAwayListAdapter(filteredList, PickingActivity.this);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(PickingActivity.this));
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pickingAdapter);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                dialog.dismiss();


            });

            dialog.show();

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PickingActivity.this, NewHomePageActivity.class);
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
