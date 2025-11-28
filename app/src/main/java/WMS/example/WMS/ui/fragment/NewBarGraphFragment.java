package WMS.example.WMS.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.codeone.wms.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import WMS.example.WMS.repository.local.model.Wms_AnalyticsBean;

public class NewBarGraphFragment extends Fragment {

    private List<Wms_AnalyticsBean> wms_analyticsBeans;

    private BarChart barchart;
    private String analyzeOn;





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            wms_analyticsBeans = new Gson().fromJson(getArguments().getString("BarGraphDatails"), new TypeToken<List<Wms_AnalyticsBean>>() {
            }.getType());

            analyzeOn = getArguments().get("analyzeOn").toString();


            System.out.println("analyzeOn"+analyzeOn);
            System.out.println("wms_analyticsBeans"+wms_analyticsBeans.toString());
            // new Gson().toJson(wms_analyticsBeans);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bar_graph_fragment, container, false);

        if (wms_analyticsBeans != null) {
            barchart = view.findViewById(R.id.barchart);
//            BarData data = createQuantityChartData();
            BarData data = createQuantityChartDataS();
            configureChartAppearance();
            prepareChartData(data);
        }
        return view;
    }

    private void configureChartAppearance() {
        barchart.setPinchZoom(false);
        barchart.setDrawBarShadow(false);
        barchart.setDrawGridBackground(false);
        barchart.getDescription().setEnabled(false);
        barchart.getLegend().setEnabled(true);


        XAxis xAxis = barchart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false); // ❌ Remove vertical grid lines
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM); // ✅ Move labels to bottom
        xAxis.setDrawAxisLine(true); // ✅ Keep the X axis line
        xAxis.setAxisMinimum(0f);

        YAxis leftAxis = barchart.getAxisLeft();
        leftAxis.setDrawGridLines(false); // ❌ Remove horizontal grid lines
        leftAxis.setAxisMinimum(0f);
        leftAxis.setDrawAxisLine(true); // ✅ Keep the Y axis line
        leftAxis.setSpaceTop(15f);

        barchart.getAxisRight().setEnabled(false); // ❌ Hide right Y axis
    }




    public BarData createQuantityChartDataS() {
        BigDecimal inwardWms = BigDecimal.ZERO;
       BigDecimal inwardSd = BigDecimal.ZERO;
        BigDecimal outwardSd = BigDecimal.ZERO;
        BigDecimal outwardWms = BigDecimal.ZERO;

        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            String row = m.getRow();
            BigDecimal qty = m.getTrn_qty() != null ? m.getTrn_qty() : BigDecimal.ZERO;

            switch (row) {
                case "01": inwardSd = inwardSd.add(qty); break;
                case "04":inwardWms = inwardWms.add(qty); break;
                case "06":
                case "07":
                case "10":outwardSd = outwardSd.add(qty); break;
                case "12": outwardWms = outwardWms.add(qty); break;
            }
        }

        // Each entry is a single bar on the chart
        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0, inwardSd.floatValue()));  // GRN
        entries.add(new BarEntry(1, inwardWms.floatValue())); // Putaway
        entries.add(new BarEntry(2, outwardSd.floatValue())); // Dispatch
        entries.add(new BarEntry(3, outwardWms.floatValue())); // Picking

        BarDataSet dataSet = new BarDataSet(entries, "Operations");
        dataSet.setColors(
                Color.rgb(66, 133, 244),   // Vibrant Blue
                Color.rgb(52, 168, 83),    // Fresh Green
                Color.rgb(251, 188, 5),    // Bright Yellow/Orange
                Color.rgb(234, 67, 53)     // Google Red
        );

        dataSet.setValueTextSize(10f);
        dataSet.setValueTextColor(Color.BLACK);



        return new BarData(dataSet);
    }


    private void prepareChartData(BarData data) {
        barchart.setData(data);
        barchart.setFitBars(true); // Fit bars nicely
        barchart.getDescription().setEnabled(false);
        barchart.setDrawGridBackground(false);
//        Legend legend = barchart.getLegend();;
//        legend.setEnabled(false);// Or any neutral color you prefer
        data.setBarWidth(0.5f);


        XAxis xAxis = barchart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1f);
        xAxis.setLabelCount(4);
        xAxis.setAxisMinimum(-0.5f);
        xAxis.setCenterAxisLabels(false); // Important ✅
      xAxis.setValueFormatter(new IndexAxisValueFormatter(new String[]{"GRN", "Putaway", "Dispatch", "Picking"}));
//        xAxis.setValueFormatter(new IndexAxisValueFormatter(new String[]{"Putaway","GRN","Picking","Dispatch"}));
//        xAxis.setValueFormatter(new IndexAxisValueFormatter(new String[]{"GRN","Dispatch"}));

        YAxis leftAxis = barchart.getAxisLeft();

        leftAxis.setDrawGridLines(false);
        barchart.getAxisRight().setEnabled(false);

        barchart.animateY(1500);
        barchart.invalidate();
    }



}
