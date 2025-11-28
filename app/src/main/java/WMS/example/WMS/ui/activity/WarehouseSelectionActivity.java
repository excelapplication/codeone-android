package WMS.example.WMS.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.codeone.wms.R;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import WMS.example.WMS.ui.viewmodel.WareHouseSelectionViewModel;
import WMS.example.WMS.util.ActivityUtil;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.ApplicationSharedPreferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseSelectionActivity extends AppCompatActivity {
    ImageButton confirmWarehouse, compSpinner;
    Spinner warehouseSpinner;
    private final Context context = this;
    private String empCode;
    private WareHouseDetail wareHouseDetailBean;
    private Map<String, WareHouseDetail> wareHouseDetailMap;
    private PutAwayViewModel putAwayViewModel;
    private List<String> wareNames;
    private WareHouseSelectionViewModel wareHouseSelectionViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_warehouse_selection);
        confirmWarehouse = findViewById(R.id.warehouse_confirmation);
        warehouseSpinner = findViewById(R.id.warehouseSpinner);

        ApplicationSharedPreferences sharedPreferences = new ApplicationSharedPreferences(context);
        this.empCode = (String) sharedPreferences.get(ApplicationConstants.EMP_ID);
        this.putAwayViewModel = new PutAwayViewModel();
        this.wareHouseSelectionViewModel = new WareHouseSelectionViewModel();

        confirmWarehouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((warehouseSpinner.getSelectedItem().toString().equalsIgnoreCase(ApplicationConstants.SPINNER_FIRST_INDEX))) {
                    ActivityUtil.setErrorMessageInSpinner(warehouseSpinner, "Please select WareHouse");
                } else {
                    Long whlocId = wareHouseDetailMap.get(warehouseSpinner.getSelectedItem().toString()).getWh_id();
                    Log.v("whlocId!!!!!", "whlocId" + (wareHouseDetailMap.get(warehouseSpinner.getSelectedItem().toString())) + " " + whlocId.toString());

                    try {
                        wareHouseSelectionViewModel.updateIsActivetoN();
                        wareHouseSelectionViewModel.updateActiveWareHouse(whlocId);
                        startActivity(new Intent(WarehouseSelectionActivity.this, NewHomePageActivity.class));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        List<WareHouseDetail> wareHouseDetails = wareHouseSelectionViewModel.getWareHouses();
        wareHouseDetailMap = new HashMap<>();

        if (wareHouseDetails != null) {
            List<String> wareList = new ArrayList<>();
            for (WareHouseDetail wd : wareHouseDetails) {
                wareList.add(wd.getWh_name());
                wareHouseDetailMap.put(wd.getWh_name(), wd);
            }
            wareList.add(0, ApplicationConstants.SPINNER_FIRST_INDEX);
            ArrayAdapter<String> warehAdapter = new ArrayAdapter<>(WarehouseSelectionActivity.this, android.R.layout.simple_spinner_dropdown_item, wareList);
            warehouseSpinner.setAdapter(warehAdapter);
            warehouseSpinner.setSelection(0);
        }

    }


}
