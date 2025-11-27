package WMS.example.WMS.ui.activity;

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

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.WMS.R;

import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import WMS.example.WMS.ui.viewmodel.StockTransferViewModel;
import WMS.example.WMS.util.MedicoResources;

public class TransferDetailActivity extends AppCompatActivity {
    TextView Bin_No, Date, Tran_type, Batch_Name, tobin_no;
    LinearLayout Scan;
    private StockTransferViewModel stockTransferViewModel;
    private Wms_trf_dtl wms_trf_dtl;

    public static TextView scantext;
    public static LinearLayout bin_code_layout, confirm_layout;

    public static Button save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.transfer_product_list);
            PutAwayViewModel viewModel = new PutAwayViewModel();

            Bin_No = findViewById(R.id.bin_no);
            Date = findViewById(R.id.date_id);
            Tran_type = findViewById(R.id.trans_no_id);
            Batch_Name = findViewById(R.id.batch_name);
            tobin_no = findViewById(R.id.out_bin_no);
            Scan = findViewById(R.id.scan_layout);
            scantext = findViewById(R.id.scantext);
            bin_code_layout = findViewById(R.id.bin_code_layout);
            save = findViewById(R.id.save);
            confirm_layout = findViewById(R.id.confirm_layout);
            this.stockTransferViewModel = new StockTransferViewModel();
            String wmsTrfDtlId = getIntent().getStringExtra("wmsTranId");
            Long wmsTrfDetailId = Long.valueOf(wmsTrfDtlId);
                        Log.v("wmsTrfDetailId", "" + wmsTrfDetailId.toString());
            String binCode = getIntent().getStringExtra("binCode");
            ImageView backImage = findViewById(R.id.back_icon);
            backImage.setVisibility(View.VISIBLE);
            backImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(TransferDetailActivity.this, TransferActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY));
                    finish();
                }
            });

            wms_trf_dtl = stockTransferViewModel.getStockTrfDetail(wmsTrfDetailId);
            String outBinCode=viewModel.getbincodeByBinId(wms_trf_dtl.getOut_bin_id());

//            Bin_No.setText(String.valueOf(wms_trf_dtl.getOut_bin_id()));
            Date.setText(MedicoResources.convertDateAndTime_to_DD_MM_YYYY_date(wms_trf_dtl.getTran_date()));
            Tran_type.setText(wms_trf_dtl.getTran_id().toString());
            Batch_Name.setText(wms_trf_dtl.getOut_batch_name());
//            tobin_no.setText(String.valueOf(wms_trf_dtl.getIn_bin_id()));
            Bin_No.setText(outBinCode);
            tobin_no.setText(binCode);

            Scan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(TransferDetailActivity.this, ScannerView.class).putExtra("tran_type", wms_trf_dtl.getTran_type()));
                }
            });


            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if (!scantext.getText().toString().trim().equals("")) {
                            if(binCode.equalsIgnoreCase(scantext.getText().toString())){
                            new PutAwayViewModel().confirmBin(wms_trf_dtl.getTran_type(), wms_trf_dtl.getTran_dtl_id(), TransferDetailActivity.this, scantext.getText().toString().trim());
                        }else{
                            Toast.makeText(TransferDetailActivity.this, "Invalide bin ...Please scan "+binCode+" bin  ", Toast.LENGTH_SHORT).show();
                        }
                        } else {
                            Toast.makeText(TransferDetailActivity.this, "Please Scan The Bar Code...", Toast.LENGTH_SHORT).show();
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

