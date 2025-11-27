package WMS.example.WMS.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.ui.viewmodel.PickingViewModel;
import WMS.example.WMS.util.MedicoResources;

import com.example.WMS.R;

public class PickingProductActivity extends AppCompatActivity {
    TextView Bin_No, Date,Tran_type,Batch_Name;
    ImageButton Scan;
    private PickingViewModel pickingViewModel;
    private Wms_Tran_DTL wmsTranDtlList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.picking_product_list);

            Bin_No = findViewById(R.id.pickbin_no);
            Date = findViewById(R.id.pickdate_id);
            Tran_type = findViewById(R.id.picktrans_no_id);
            Batch_Name = findViewById(R.id.pickbatch_name);
            Scan = findViewById(R.id.scanbtn);
            this.pickingViewModel = new PickingViewModel();
            String wmsDtlId = getIntent().getStringExtra("wmsTranId");
            Long wmsDtlIds = Long.valueOf(wmsDtlId);
            Log.v("wmsDtlId@", "" + wmsDtlId);

             wmsTranDtlList = pickingViewModel.getWmsDetailByTranId(wmsDtlIds);
             String sd_tran_date=pickingViewModel.getDateByTranId(wmsTranDtlList.getTran_id(),"02");
            Log.v("wmsTranDtlList@@@@","wmsTranDtlList"+wmsTranDtlList.toString());
            Bin_No.setText(wmsTranDtlList.getBin_id().toString());
            Date.setText (MedicoResources.convertDateAndTime_to_DD_MM_YYYY_date(sd_tran_date));
//           Date.setText(wmsTranDtlList.getFin_year_id().toString());
            Tran_type.setText(wmsTranDtlList.getSd_tran_no().toString());
            Batch_Name.setText(wmsTranDtlList.getBatch_name().toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }

        Scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PickingProductActivity.this, MainScannerActivittiv.class).putExtra("tranType",wmsTranDtlList.getTran_type())
                        .putExtra("tranDtlId",String.valueOf(wmsTranDtlList.getTran_dtl_id())));
            }
        });
    }

}
