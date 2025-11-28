package WMS.example.WMS.ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codeone.wms.R;

import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.repository.local.model.Wms_trf_hdr;
import WMS.example.WMS.ui.adapter.StockTransferAdapter;
import WMS.example.WMS.ui.viewmodel.StockTransferViewModel;

import java.util.List;

public class TransferActivity extends AppCompatActivity {
    private StockTransferViewModel stockTransferViewModel;
    private Button back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transfer_list_view);
        RecyclerView listView = findViewById(R.id.transfer_list);
        back = findViewById(R.id.back);

        this.stockTransferViewModel = new StockTransferViewModel();
        try {
            List<Wms_trf_hdr> wms_trf_hdrs = stockTransferViewModel.getTransferHdr();
            Log.v("wms_trf_hdrs", wms_trf_hdrs.size() + "");
            List<Wms_trf_dtl> wmsTrfDtls = stockTransferViewModel.getStockTransferDetail();

            if (wmsTrfDtls == null || wmsTrfDtls.isEmpty()) {
                new AlertDialog.Builder(this)
                        .setTitle("Stock Transfer")
                        .setMessage("No stock transfer data available.                                                                                                                                                                                                                                                                                                                                                                                                           ")
                        .setCancelable(false)
                        .setPositiveButton("OK", (d, w) -> {
                            Intent intent = new Intent(TransferActivity.this, NewHomePageActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                            startActivity(intent);
                            finish();
                        })
                        .show();
                return;
            }
            StockTransferAdapter stockTransferAdapter = new StockTransferAdapter( wmsTrfDtls,TransferActivity.this);
            listView.setHasFixedSize(true);
            listView.setLayoutManager(new LinearLayoutManager(this));
            listView.setItemAnimator(new DefaultItemAnimator());
            listView.setAdapter(stockTransferAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TransferActivity.this, NewHomePageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
//        this.startActivity(new Intent(TransferActivity.this, NewHomePageActivity.class));

    }
}
