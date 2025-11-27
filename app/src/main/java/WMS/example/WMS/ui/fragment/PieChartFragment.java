package WMS.example.WMS.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//import com.excelsfa_manager.R;
//import com.excelsfa_manager.repository.local.model.MsrWiseSales;
import com.example.WMS.R;
import WMS.example.WMS.repository.local.model.Wms_AnalyticsBean;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PieChartFragment extends Fragment {
    private List<Wms_AnalyticsBean> wms_analyticsBeans;

    private BarChart barchart;
    private String analyzeOn;

    private static final int MAX_X_VALUE = 2;

    private static final int GROUPS = 3;
    private static final String GROUP_1_LABEL = "Inward(SD)";
    private static final String GROUP_2_LABEL = "Inward(WMS)";
    //  private static final String GROUP_3_LABEL = "Picking";
    private static final float BAR_SPACE = 0.08f;
    private static final float BAR_WIDTH = 0.2f;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            wms_analyticsBeans = new Gson().fromJson(getArguments().getString("BarGraphDatails"), new TypeToken<List<Wms_AnalyticsBean>>() {
            }.getType());
            analyzeOn = getArguments().get("analyzeOn").toString();
            // new Gson().toJson(wms_analyticsBeans);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bar_graph_fragment, container, false);

        if (wms_analyticsBeans != null) {
            barchart = view.findViewById(R.id.barchart);
            BarData data;
            if (analyzeOn.equals("Qty")) {
                data = createQuantityChartData();

            }
            else if(analyzeOn.equals("Volume")){
                data = createVolumeChartData();
            }
            else if(analyzeOn.equals("Weight")){
                data = createWeightChartData();
            }
            else {
                data = createValueChartData();
            }
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

        XAxis xAxis = barchart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setCenterAxisLabels(true);

        YAxis leftAxis = barchart.getAxisLeft();
        leftAxis.setDrawGridLines(false);
        leftAxis.setSpaceTop(35f);
        leftAxis.setAxisMinimum(0f);

        barchart.getAxisRight().setEnabled(false);

        barchart.getXAxis().setAxisMinimum(0);
        barchart.getXAxis().setAxisMaximum(MAX_X_VALUE);
    }

    public BarData createVolumeChartData() {
        /*Variables For Volume wise Comparison*/
        BigDecimal inwardVolGrn = BigDecimal.ZERO;
        BigDecimal inwardVolReturns = BigDecimal.ZERO;
        BigDecimal inwardVolIaa = BigDecimal.ZERO;
        BigDecimal wmsGrnVol = BigDecimal.ZERO;
        BigDecimal wmsReturnsVol = BigDecimal.ZERO;
        BigDecimal wmsTransferVol = BigDecimal.ZERO;
        BigDecimal outwardDispatchVol = BigDecimal.ZERO;
        BigDecimal outwardTransferVol = BigDecimal.ZERO;
        BigDecimal outwardWithdrawlVol = BigDecimal.ZERO;
        BigDecimal outwardWmsSalesVol = BigDecimal.ZERO;
        BigDecimal outwardWmspickingVol = BigDecimal.ZERO;
        BigDecimal outwardWmsTransferVol = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Volume wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");
            if (m.getRow().equals("01")) {
                Log.v("01###", "01###");
                inwardVolGrn = m.getTrn_volume();
                Log.v("01###", "" + inwardVolGrn);
            } else if (inwardVolGrn == null) {
                Log.v("Else@@@@@", "Else@@@@@");
                inwardVolGrn = BigDecimal.ZERO;
            }

            if (m.getRow().equals("02")) {
                inwardVolReturns = m.getTrn_volume();
            } else if (inwardVolReturns == null) {
                inwardVolReturns = BigDecimal.ZERO;
            }

            if (m.getRow().equals("03")) {
                inwardVolIaa = m.getTrn_volume();
            } else if (inwardVolIaa == null) {
                inwardVolIaa = BigDecimal.ZERO;
            }

            if (m.getRow().equals("04")) {
                wmsGrnVol = m.getTrn_volume();
            } else if (wmsGrnVol == null) {
                wmsGrnVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("05")) {
                wmsReturnsVol = m.getTrn_volume();
            } else if (wmsReturnsVol == null) {
                wmsReturnsVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("06")) {
                wmsTransferVol = m.getTrn_volume();
            } else if (wmsTransferVol == null) {
                wmsTransferVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("07")) {
                outwardDispatchVol = m.getTrn_volume();
            } else if (outwardDispatchVol == null) {
                outwardDispatchVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")) {
                outwardTransferVol = m.getTrn_volume();
            } else if (outwardTransferVol == null) {
                outwardTransferVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")) {
                outwardWithdrawlVol = m.getTrn_volume();
            } else if (outwardWithdrawlVol == null) {
                outwardWithdrawlVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")) {
                outwardWmsSalesVol = m.getTrn_volume();
            } else if (outwardWmsSalesVol == null) {
                outwardWmsSalesVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")) {
                outwardWmspickingVol = m.getTrn_volume();
            } else if (outwardWmspickingVol == null) {
                outwardWmspickingVol = BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")) {
                outwardWmsTransferVol = m.getTrn_volume();
            } else if (outwardWmsTransferVol == null) {
                outwardWmsTransferVol = BigDecimal.ZERO;
            }
        }

        values1.add(new BarEntry(0, Float.valueOf(String.valueOf(inwardVolGrn))));
        values2.add(new BarEntry(0, Float.valueOf(String.valueOf(wmsGrnVol))));

        values1.add(new BarEntry(1, Float.valueOf(String.valueOf(inwardVolReturns))));
        values2.add(new BarEntry(1, Float.valueOf(String.valueOf(wmsReturnsVol))));

        values1.add(new BarEntry(2, Float.valueOf(String.valueOf(inwardVolIaa))));
        values2.add(new BarEntry(2, Float.valueOf(String.valueOf(wmsTransferVol))));
        BarDataSet set1 = new BarDataSet(values1, GROUP_1_LABEL);
        BarDataSet set2 = new BarDataSet(values2, GROUP_2_LABEL);


        set1.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        set2.setColor(ColorTemplate.MATERIAL_COLORS[1]);


        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        dataSets.add(set2);

        BarData data = new BarData(dataSets);

        return data;

    }

    public BarData createValueChartData() {
        /*Variables For Value wise Comparison*/
        BigDecimal inwardValGrn = BigDecimal.ZERO;
        BigDecimal inwardValReturns = BigDecimal.ZERO;
        BigDecimal inwardValIaa = BigDecimal.ZERO;
        BigDecimal wmsGrnVal = BigDecimal.ZERO;
        BigDecimal wmsReturnsVal = BigDecimal.ZERO;
        BigDecimal wmsTransferVal = BigDecimal.ZERO;
        BigDecimal outwardDispatchVal = BigDecimal.ZERO;
        BigDecimal outwardTransferVal = BigDecimal.ZERO;
        BigDecimal outwardWithdrawlVal = BigDecimal.ZERO;
        BigDecimal outwardWmsSalesVal = BigDecimal.ZERO;
        BigDecimal outwardWmspickingVal = BigDecimal.ZERO;
        BigDecimal outwardWmsTransferVal = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Value wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");
            if (m.getRow().equals("01")) {
                Log.v("01###", "01###");
                inwardValGrn = m.getTrn_value();
                Log.v("01###", "" + inwardValGrn);
            } else if (inwardValGrn == null) {
                Log.v("Else@@@@@", "Else@@@@@");
                inwardValGrn = BigDecimal.ZERO;
            }

            if (m.getRow().equals("02")) {
                inwardValReturns = m.getTrn_value();
            } else if (inwardValReturns == null) {
                inwardValReturns = BigDecimal.ZERO;
            }

            if (m.getRow().equals("03")) {
                inwardValIaa = m.getTrn_value();
            } else if (inwardValIaa == null) {
                inwardValIaa = BigDecimal.ZERO;
            }

            if (m.getRow().equals("04")) {
                wmsGrnVal = m.getTrn_value();
            } else if (wmsGrnVal == null) {
                wmsGrnVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("05")) {
                wmsReturnsVal = m.getTrn_value();
            } else if (wmsReturnsVal == null) {
                wmsReturnsVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("06")) {
                wmsTransferVal = m.getTrn_value();
            } else if (wmsTransferVal == null) {
                wmsTransferVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("07")) {
                outwardDispatchVal = m.getTrn_value();
            } else if (outwardDispatchVal == null) {
                outwardDispatchVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")) {
                outwardTransferVal = m.getTrn_value();
            } else if (outwardTransferVal == null) {
                outwardTransferVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")) {
                outwardWithdrawlVal = m.getTrn_value();
            } else if (outwardWithdrawlVal == null) {
                outwardWithdrawlVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")) {
                outwardWmsSalesVal = m.getTrn_value();
            } else if (outwardWmsSalesVal == null) {
                outwardWmsSalesVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")) {
                outwardWmspickingVal = m.getTrn_value();
            } else if (outwardWmspickingVal == null) {
                outwardWmspickingVal = BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")) {
                outwardWmsTransferVal = m.getTrn_value();
            } else if (outwardWmsTransferVal == null) {
                outwardWmsTransferVal = BigDecimal.ZERO;
            }
        }
        values1.add(new BarEntry(0, Float.valueOf(String.valueOf(inwardValGrn))));
        values2.add(new BarEntry(0, Float.valueOf(String.valueOf(wmsGrnVal))));

        values1.add(new BarEntry(1, Float.valueOf(String.valueOf(inwardValReturns))));
        values2.add(new BarEntry(1, Float.valueOf(String.valueOf(wmsReturnsVal))));

        values1.add(new BarEntry(2, Float.valueOf(String.valueOf(inwardValIaa))));
        values2.add(new BarEntry(2, Float.valueOf(String.valueOf(wmsTransferVal))));

        BarDataSet set1 = new BarDataSet(values1, GROUP_1_LABEL);
        BarDataSet set2 = new BarDataSet(values2, GROUP_2_LABEL);

        set1.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        set2.setColor(ColorTemplate.MATERIAL_COLORS[1]);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        dataSets.add(set2);

        BarData data = new BarData(dataSets);

        return data;
    }

    public BarData createWeightChartData() {

        /*Variables For Weight wise Comparison*/
        BigDecimal inwardWtGrn = BigDecimal.ZERO;
        BigDecimal inwardWtReturns = BigDecimal.ZERO;
        BigDecimal inwardWtIaa = BigDecimal.ZERO;
        BigDecimal wmsGrnWt = BigDecimal.ZERO;
        BigDecimal wmsReturnsWt = BigDecimal.ZERO;
        BigDecimal wmsTransferWt = BigDecimal.ZERO;
        BigDecimal outwardDispatchWt = BigDecimal.ZERO;
        BigDecimal outwardTransferWt = BigDecimal.ZERO;
        BigDecimal outwardWithdrawlWt = BigDecimal.ZERO;
        BigDecimal outwardWmsSalesWt = BigDecimal.ZERO;
        BigDecimal outwardWmspickingWt = BigDecimal.ZERO;
        BigDecimal outwardWmsTransferWt = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Weight wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");
            if (m.getRow().equals("01")) {
                Log.v("01###", "01###");
                inwardWtGrn = m.getTrn_weight();
                Log.v("01###", "" + inwardWtGrn);
            } else if (inwardWtGrn == null) {
                Log.v("Else@@@@@", "Else@@@@@");
                inwardWtGrn = BigDecimal.ZERO;
            }

            if (m.getRow().equals("02")) {
                inwardWtReturns = m.getTrn_weight();
            } else if (inwardWtReturns == null) {
                inwardWtReturns = BigDecimal.ZERO;
            }

            if (m.getRow().equals("03")) {
                inwardWtIaa = m.getTrn_weight();
            } else if (inwardWtIaa == null) {
                inwardWtIaa = BigDecimal.ZERO;
            }

            if (m.getRow().equals("04")) {
                wmsGrnWt = m.getTrn_weight();
            } else if (wmsGrnWt == null) {
                wmsGrnWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("05")) {
                wmsReturnsWt = m.getTrn_weight();
            } else if (wmsReturnsWt == null) {
                wmsReturnsWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("06")) {
                wmsTransferWt = m.getTrn_weight();
            } else if (wmsTransferWt == null) {
                wmsTransferWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("07")) {
                outwardDispatchWt = m.getTrn_weight();
            } else if (outwardDispatchWt == null) {
                outwardDispatchWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")) {
                outwardTransferWt = m.getTrn_weight();
            } else if (outwardTransferWt == null) {
                outwardTransferWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")) {
                outwardWithdrawlWt = m.getTrn_weight();
            } else if (outwardWithdrawlWt == null) {
                outwardWithdrawlWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")) {
                outwardWmsSalesWt = m.getTrn_weight();
            } else if (outwardWmsSalesWt == null) {
                outwardWmsSalesWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")) {
                outwardWmspickingWt = m.getTrn_weight();
            } else if (outwardWmspickingWt == null) {
                outwardWmspickingWt = BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")) {
                outwardWmsTransferWt = m.getTrn_weight();
            } else if (outwardWmsTransferWt == null) {
                outwardWmsTransferWt = BigDecimal.ZERO;
            }
        }
        values1.add(new BarEntry(0, Float.valueOf(String.valueOf(inwardWtGrn))));
        values2.add(new BarEntry(0, Float.valueOf(String.valueOf(wmsGrnWt))));

        values1.add(new BarEntry(1, Float.valueOf(String.valueOf(inwardWtReturns))));
        values2.add(new BarEntry(1, Float.valueOf(String.valueOf(wmsReturnsWt))));

        values1.add(new BarEntry(2, Float.valueOf(String.valueOf(inwardWtIaa))));
        values2.add(new BarEntry(2, Float.valueOf(String.valueOf(wmsTransferWt))));

        BarDataSet set1 = new BarDataSet(values1, GROUP_1_LABEL);
        BarDataSet set2 = new BarDataSet(values2, GROUP_2_LABEL);

        set1.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        set2.setColor(ColorTemplate.MATERIAL_COLORS[1]);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        dataSets.add(set2);

        BarData data = new BarData(dataSets);

        return data;
    }


    public BarData createQuantityChartData() {
        /*Variables For Qty wise Comparison*/
        BigDecimal inwardQtyGrn = BigDecimal.ZERO;
        BigDecimal inwardQtyReturns = BigDecimal.ZERO;
        BigDecimal inwardQtyIaa = BigDecimal.ZERO;
        BigDecimal wmsGrn = BigDecimal.ZERO;
        BigDecimal wmsReturns = BigDecimal.ZERO;
        BigDecimal wmsTransfer = BigDecimal.ZERO;
        BigDecimal outwardDispatch = BigDecimal.ZERO;
        BigDecimal outwardTransfer = BigDecimal.ZERO;
        BigDecimal outwardWithdrawl = BigDecimal.ZERO;
        BigDecimal outwardWmsSales = BigDecimal.ZERO;
        BigDecimal outwardWmspicking = BigDecimal.ZERO;
        BigDecimal outwardWmsTransfer = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Qty wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");
            if (m.getRow().equals("01")) {
                Log.v("01###", "01###");
                inwardQtyGrn = m.getTrn_qty();
                Log.v("01###", "" + inwardQtyGrn);
            } else if (inwardQtyGrn == null) {
                Log.v("Else@@@@@", "Else@@@@@");
                inwardQtyGrn = BigDecimal.ZERO;
            }

            if (m.getRow().equals("02")) {
                inwardQtyReturns = m.getTrn_qty();
            } else if (inwardQtyReturns == null) {
                inwardQtyReturns = BigDecimal.ZERO;
            }

            if (m.getRow().equals("03")) {
                inwardQtyIaa = m.getTrn_qty();
            } else if (inwardQtyIaa == null) {
                inwardQtyIaa = BigDecimal.ZERO;
            }

            if (m.getRow().equals("04")) {
                wmsGrn = m.getTrn_qty();
            } else if (wmsGrn == null) {
                wmsGrn = BigDecimal.ZERO;
            }

            if (m.getRow().equals("05")) {
                wmsReturns = m.getTrn_qty();
            } else if (wmsReturns == null) {
                wmsReturns = BigDecimal.ZERO;
            }

            if (m.getRow().equals("06")) {
                wmsTransfer = m.getTrn_qty();
            } else if (wmsTransfer == null) {
                wmsTransfer = BigDecimal.ZERO;
            }

            if (m.getRow().equals("07")) {
                outwardDispatch = m.getTrn_qty();
            } else if (outwardDispatch == null) {
                outwardDispatch = BigDecimal.ZERO;
            }


            if (m.getRow().equals("08")) {
                outwardTransfer = m.getTrn_qty();
            } else if (outwardTransfer == null) {
                outwardTransfer = BigDecimal.ZERO;
            }

            if (m.getRow().equals("9")) {
                outwardWithdrawl = m.getTrn_qty();
            } else if (outwardWithdrawl == null) {
                outwardWithdrawl = BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")) {
                outwardWmsSales = m.getTrn_qty();
            } else if (outwardWmsSales == null) {
                outwardWmsSales = BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")) {
                outwardWmspicking = m.getTrn_qty();
            } else if (outwardWmspicking == null) {
                outwardWmspicking = BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")) {
                outwardWmsTransfer = m.getTrn_qty();
            } else if (outwardWmsTransfer == null) {
                outwardWmsTransfer = BigDecimal.ZERO;
            }
        }

        values1.add(new BarEntry(0, Float.valueOf(String.valueOf(inwardQtyGrn))));
        values2.add(new BarEntry(0, Float.valueOf(String.valueOf(wmsGrn))));

//         values1.add(new BarEntry(1,Float.valueOf(111500)));
//        values2.add(new BarEntry(1,Float.valueOf(11120)));
//
//        values1.add(new BarEntry(4,Float.valueOf(511100)));
//        values2.add(new BarEntry(8,Float.valueOf(111200)));

        values1.add(new BarEntry(1, Float.valueOf(String.valueOf(inwardQtyReturns))));
        values2.add(new BarEntry(1, Float.valueOf(String.valueOf(wmsReturns))));

        values1.add(new BarEntry(2, Float.valueOf(String.valueOf(inwardQtyIaa))));
        values2.add(new BarEntry(2, Float.valueOf(String.valueOf(wmsTransfer))));

        BarDataSet set1 = new BarDataSet(values1, GROUP_1_LABEL);
        BarDataSet set2 = new BarDataSet(values2, GROUP_2_LABEL);

        //  set1.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        //  set2.setColor(ColorTemplate.JOYFUL_COLORS[1]);
        set1.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        set2.setColor(Color.BLUE);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        dataSets.add(set2);

        BarData data = new BarData(dataSets);

        return data;
    }

    private void prepareChartData(BarData data) {
        barchart.setData(data);

        barchart.getBarData().setBarWidth(BAR_WIDTH);

        float groupSpace = 1f - ((BAR_SPACE + BAR_WIDTH) * GROUPS);
        barchart.groupBars(0, groupSpace, BAR_SPACE);
        barchart.animateXY(2000, 2000);
        barchart.invalidate();

    }

}





























