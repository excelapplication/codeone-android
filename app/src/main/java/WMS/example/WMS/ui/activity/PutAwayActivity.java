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
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.ui.adapter.PutAwayListAdapter;
import WMS.example.WMS.ui.model.DataModel;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import com.codeone.wms.R;

import java.util.ArrayList;
import java.util.List;

public class PutAwayActivity extends AppCompatActivity {
    public static OnClickListener myOnClickListener;
    // private TextView productName, manuDate, expDate, binNo, prefferdbin;
    // private Button cam;
    ListView listView;
    TextView textView;
    String[] listItem;
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    private static ArrayList<Integer> removedItems;
    private Button back;

    private PutAwayViewModel putAwayViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_grn);


            RecyclerView recyclerView = findViewById(R.id.product_list);
            back = findViewById(R.id.back);
            this.putAwayViewModel = new PutAwayViewModel();

            List<Wms_Tran_HDR> headerList =  this.putAwayViewModel.getPutAwayHeaderDetails();

            if (headerList == null || headerList.isEmpty()) {
                new AlertDialog.Builder(this)
                        .setTitle("No GRN Found")
                        .setMessage("No GRN data available.")
                        .setCancelable(false)
                        .setPositiveButton("OK", (d, w) -> {
                            startActivity(new Intent(PutAwayActivity.this, NewHomePageActivity.class));
                            finish();
                        })
                        .show();
                return;
            }

            List<String> dispatchNoList = new ArrayList<>();
            for (Wms_Tran_HDR hdr : headerList) {
                dispatchNoList.add(hdr.getSd_tran_no());
            }

            // Show searchable dropdown dialog
            WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics metrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(metrics);

            int screenWidth = metrics.widthPixels;
            int screenHeight = metrics.heightPixels;

            Dialog dialog = new Dialog(PutAwayActivity.this);
            dialog.setContentView(R.layout.dialog_searchable_spinner);
            dialog.setCancelable(false);


            dialog.getWindow().setLayout(screenWidth - 20, screenHeight - 100);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            EditText editText = dialog.findViewById(R.id.edit_text);
            TextView heading_text = dialog.findViewById(R.id.heading_text);
            ListView listViews = dialog.findViewById(R.id.list_view);
            ImageView backbutton = dialog.findViewById(R.id.back_arrow);
            backbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(PutAwayActivity.this, NewHomePageActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                    finish(); // finish current activity
                }
            });

            heading_text.setText("Select GRN Number");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(PutAwayActivity.this, android.R.layout.simple_list_item_1, dispatchNoList);
            listViews.setAdapter(adapter);

            editText.addTextChangedListener(new TextWatcher() {
                @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s);
                }
                @Override public void afterTextChanged(Editable s) {}
            });

            listViews.setOnItemClickListener((parent, view, position, id) -> {
                String selectedDispatch = adapter.getItem(position);
                try {
                    List<Wms_Tran_DTL> allDtls = null;
                    List<Wms_Tran_DTL> filteredList = new ArrayList<>();


                    allDtls =  this.putAwayViewModel.getPutAwayDetails();


                    for (Wms_Tran_DTL dtl : allDtls) {
                        if (dtl.getSd_tran_no().equals(selectedDispatch)) {
                            filteredList.add(dtl);
                        }
                    }

                    PutAwayListAdapter pickingAdapter = new PutAwayListAdapter(filteredList, PutAwayActivity.this);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setLayoutManager(new LinearLayoutManager(PutAwayActivity.this));
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(pickingAdapter);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                dialog.dismiss();


            });

            dialog.show();

           back.setOnClickListener(new OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(PutAwayActivity.this, NewHomePageActivity.class);
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

    }

}

