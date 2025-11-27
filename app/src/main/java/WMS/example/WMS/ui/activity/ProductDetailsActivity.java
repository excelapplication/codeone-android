package WMS.example.WMS.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import WMS.example.WMS.util.MedicoResources;

import com.example.WMS.R;

public class ProductDetailsActivity extends AppCompatActivity {
    TextView Bin_code, Date, Tran_type, Batch_Name;
    LinearLayout scan_layout;
    private PutAwayViewModel putAwayViewModel;
    private Wms_Tran_DTL wmsTranDtlList;
    public static TextView scantext;
    public static LinearLayout bin_code_layout, confirm_layout;

    public static Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_product_details);
            Bin_code = findViewById(R.id.bin_no);
            Date = findViewById(R.id.date_id);
            Tran_type = findViewById(R.id.trans_no_id);
            Batch_Name = findViewById(R.id.batch_name);
            scantext = findViewById(R.id.scantext);
            bin_code_layout = findViewById(R.id.bin_code_layout);
            save = findViewById(R.id.save);
            confirm_layout = findViewById(R.id.confirm_layout);
            ImageView backImage = findViewById(R.id.back_icon);
            backImage.setVisibility(View.VISIBLE);

            scan_layout = findViewById(R.id.scan_layout);
            this.putAwayViewModel = new PutAwayViewModel();
            String wmsDtlId = getIntent().getStringExtra("wmsTranId");
            String binCode = getIntent().getStringExtra("binCode");
            Long wmsDtlIds = Long.valueOf(wmsDtlId);

            wmsTranDtlList = putAwayViewModel.getWmsDetailByTranId(wmsDtlIds);
            String sd_tran_date = putAwayViewModel.getDateByTranId(wmsTranDtlList.getTran_id(), wmsTranDtlList.getTran_type());

            backImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    if (wmsTranDtlList.getTran_type().equalsIgnoreCase("01")) {
////                        startActivity(new Intent(ProductDetailsActivity.this, PutAwayActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY));
//
//                    } else if (wmsTranDtlList.getTran_type().equalsIgnoreCase("02")) {
////                        startActivity(new Intent(ProductDetailsActivity.this, PickingActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY));
//
//                    }
                    onBackPressed();
                    finish();
                }
            });

//            Bin_No.setText(wmsTranDtlList.getBin_id().toString());
            Bin_code.setText(binCode);
            Date.setText(MedicoResources.convertDateAndTime_to_DD_MM_YYYY_date(sd_tran_date));
            Tran_type.setText(wmsTranDtlList.getSd_tran_no().toString());
            Batch_Name.setText(wmsTranDtlList.getBatch_name().toString());

            scan_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), ScannerView.class).putExtra("tran_type",wmsTranDtlList.getTran_type()));
                }
            });
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        System.out.println("cantext.getText()" + scantext.getText());
                        if (!scantext.getText().toString().trim().equals("")) {
                            if(binCode.equalsIgnoreCase(scantext.getText().toString())){
                                putAwayViewModel.confirmBin(wmsTranDtlList.getTran_type(), wmsTranDtlList.getTran_dtl_id(), ProductDetailsActivity.this, scantext.getText().toString().trim());
                            }else{
                                Toast.makeText(ProductDetailsActivity.this, "Invalide bin ...Please scan "+binCode+" bin  ", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(ProductDetailsActivity.this, "Please Scan The  Bar Code...", Toast.LENGTH_SHORT).show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}

