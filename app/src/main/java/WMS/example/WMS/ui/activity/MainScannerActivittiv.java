package WMS.example.WMS.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import com.codeone.wms.R;

public class MainScannerActivittiv  extends AppCompatActivity {
    ImageButton scanbtn;
    public static TextView scantext;
    ImageButton confirm;
    private PutAwayViewModel putAwayViewModel;
 private Long tranDetlId;
 private String tranType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scanner_activity);
         tranType = getIntent().getStringExtra("tranType");
        String tranDtlId = getIntent().getStringExtra("tranDtlId");
        Log.v("tranDtlId@@@@","tranDtlId"+tranDtlId);

        tranDetlId = Long.valueOf(tranDtlId);

        scantext=findViewById(R.id.scantext);
        scanbtn=findViewById(R.id.scanbtn);
        confirm=findViewById(R.id.confirm);
        this.putAwayViewModel=new PutAwayViewModel();
        scanbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ScannerView.class));
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("called","calleds");
                try {
                    System.out.println("cantext.getText()"+scantext.getText());
                    if(!scantext.getText().equals("scaned text")){
//                        putAwayViewModel.confirmBin(tranType,tranDetlId,MainScannerActivittiv.this);
                    }else{
                        Toast.makeText(MainScannerActivittiv.this,"Please Scan The Bar Code...",Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
       // Log.v("scantext",""+scantext.getText());
    }

}
