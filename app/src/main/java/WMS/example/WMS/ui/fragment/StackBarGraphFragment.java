package WMS.example.WMS.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.codeone.wms.R;
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

public class StackBarGraphFragment extends Fragment {
    private List<Wms_AnalyticsBean> wms_analyticsBeans;

    private BarChart stkbarchart;

    private static final float BAR_SPACE = 0.08f;

    private static final String STACK_1_LABEL = "Outward(SD)";
    private static final String STACK_2_LABEL = "Picking(Wms)";
    private static final String SET_LABEL = "";
    Long value1,value2;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            wms_analyticsBeans = new Gson().fromJson(getArguments().getString("StackBarGraphDatails"), new TypeToken<List<Wms_AnalyticsBean>>() {
            }.getType());
            Log.v("wms_analyticsBeans2@", "wms_analyticsBeans" + wms_analyticsBeans);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bar_graph_fragment, container, false);


        stkbarchart = view.findViewById(R.id.barchart);

        BarData data = createOutwardWeightChartData();
        configureChartAppearance();
        prepareChartData(data);


        return view;
    }

    private void configureChartAppearance () {
        stkbarchart.setDrawGridBackground(false);
        stkbarchart.setDrawValueAboveBar(false);

        stkbarchart.getDescription().setEnabled(false);

        XAxis xAxis = stkbarchart.getXAxis();
        xAxis.setGranularity(1f);

        YAxis leftAxis = stkbarchart.getAxisLeft();
        leftAxis.setDrawGridLines(false);

        YAxis rightAxis = stkbarchart.getAxisRight();
        rightAxis.setDrawGridLines(false);
    }

    private BarData createOutwardShipperChartData () {

        /*Variables For ShipperPack Comparison*/

        BigDecimal outwardDispatchshrp_pack = BigDecimal.ZERO;
        BigDecimal outwardTransfershrp_pack = BigDecimal.ZERO;
        BigDecimal outwardWithdrawlshrp_pack = BigDecimal.ZERO;
        BigDecimal outwardWmsSalesshrp_pack = BigDecimal.ZERO;
        BigDecimal  outwardWmspickingshrp_pack = BigDecimal.ZERO;
        BigDecimal outwardWmsTransfershrp_pack = BigDecimal.ZERO;

        /*Data For ShipperPack wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {

            if (m.getRow().equals("07")){
                outwardDispatchshrp_pack = BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardDispatchshrp_pack == null){
                outwardDispatchshrp_pack =BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")){
                outwardTransfershrp_pack =BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardTransfershrp_pack==null){
                outwardTransfershrp_pack =BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")){
                outwardWithdrawlshrp_pack=BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardWithdrawlshrp_pack==null){
                outwardWithdrawlshrp_pack =BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")){
                outwardWmsSalesshrp_pack= BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardWmsSalesshrp_pack==null){
                outwardWmsSalesshrp_pack=BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")){
                outwardWmspickingshrp_pack = BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardWmspickingshrp_pack==null){
                outwardWmspickingshrp_pack =BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")){
                outwardWmsTransfershrp_pack=BigDecimal.valueOf(m.getTrn_shpr_pack());
            }
            else if(outwardWmsTransfershrp_pack==null){
                outwardWmsTransfershrp_pack=BigDecimal.ZERO;
            }
            Log.v("outwardDispatchshrp_pack###","outwardDispatchshrp_pack###"+outwardDispatchshrp_pack);
            Log.v("outwardWmsSalesshrp_pack###","outwardWmsSalesshrp_pack###"+outwardWmsSalesshrp_pack);
            Log.v("outwardWmspickingshrp_pack###","outwardWmspickingshrp_pack###"+outwardWmspickingshrp_pack);
            Log.v("outwardWithdrawlshrp_pack###","outwardWithdrawlshrp_pack###"+outwardWithdrawlshrp_pack);
            Log.v("outwardTransfershrp_pack###","outwardTransfershrp_pack###"+outwardTransfershrp_pack);
            Log.v("outwardWmsTransfershrp_pack###","outwardWmsTransfershrp_pack###"+outwardWmsTransfershrp_pack);
        }

        ArrayList<BarEntry> values = new ArrayList<>();


        values.add(new BarEntry(1f,new float[] {Float.valueOf(String.valueOf(outwardDispatchshrp_pack)), Float.valueOf(String.valueOf(outwardWmsSalesshrp_pack))}));
        values.add(new BarEntry(2f,new float[] {Float.valueOf(String.valueOf(outwardTransfershrp_pack)), Float.valueOf(String.valueOf(outwardWmspickingshrp_pack))}));
        values.add(new BarEntry(3f,new float[] {Float.valueOf(String.valueOf(outwardWithdrawlshrp_pack)), Float.valueOf(String.valueOf(outwardWmsTransfershrp_pack))}));


        BarDataSet set1 = new BarDataSet(values, SET_LABEL);

        set1.setColors(new int[] {ColorTemplate.MATERIAL_COLORS[0], ColorTemplate.MATERIAL_COLORS[1]});
        set1.setStackLabels(new String[] {STACK_1_LABEL, STACK_2_LABEL});

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(0.5f);

        return data;
    }


    public BarData createOutwardWeightChartData (){



        BigDecimal outwardDispatchWt = BigDecimal.ZERO;
        BigDecimal outwardTransferWt= BigDecimal.ZERO;
        BigDecimal outwardWithdrawlWt= BigDecimal.ZERO;
        BigDecimal outwardWmsSalesWt= BigDecimal.ZERO;
        BigDecimal  outwardWmspickingWt= BigDecimal.ZERO;
        BigDecimal outwardWmsTransferWt = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Weight wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");

            if (m.getRow().equals("07")){
                outwardDispatchWt = m.getTrn_weight();
            }
            else if(outwardDispatchWt == null){
                outwardDispatchWt =BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")){
                outwardTransferWt = m.getTrn_weight();
            }
            else if(outwardTransferWt==null){
                outwardTransferWt =BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")){
                outwardWithdrawlWt= m.getTrn_weight();
            }
            else if(outwardWithdrawlWt==null){
                outwardWithdrawlWt =BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")){
                outwardWmsSalesWt= m.getTrn_weight();
            }
            else if(outwardWmsSalesWt==null){
                outwardWmsSalesWt =BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")){
                outwardWmspickingWt = m.getTrn_weight();
            }
            else if(outwardWmspickingWt==null){
                outwardWmspickingWt =BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")){
                outwardWmsTransferWt= m.getTrn_weight();
            }
            else if(outwardWmsTransferWt==null){
                outwardWmsTransferWt=BigDecimal.ZERO;
            }
        }
        ArrayList<BarEntry> values = new ArrayList<>();


        values.add(new BarEntry(1f,new float[] {Float.valueOf(String.valueOf(outwardDispatchWt)), Float.valueOf(String.valueOf(outwardWmsSalesWt))}));
        values.add(new BarEntry(2f,new float[] {Float.valueOf(String.valueOf(outwardTransferWt)), Float.valueOf(String.valueOf(outwardWmspickingWt))}));
        values.add(new BarEntry(3f,new float[] {Float.valueOf(String.valueOf(outwardWithdrawlWt)), Float.valueOf(String.valueOf(outwardWmsTransferWt))}));


        BarDataSet set1 = new BarDataSet(values, SET_LABEL);

        set1.setColors(new int[] {ColorTemplate.MATERIAL_COLORS[0], ColorTemplate.MATERIAL_COLORS[1]});
        set1.setStackLabels(new String[] {STACK_1_LABEL, STACK_2_LABEL});

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(0.5f);

        return data;
    }


    public BarData createOutwardVolumeChartData (){

        /*Variables For Weight wise Comparison*/

        BigDecimal outwardDispatchVol = BigDecimal.ZERO;
        BigDecimal outwardTransferVol= BigDecimal.ZERO;
        BigDecimal outwardWithdrawlVol= BigDecimal.ZERO;
        BigDecimal outwardWmsSalesVol= BigDecimal.ZERO;
        BigDecimal  outwardWmspickingVol= BigDecimal.ZERO;
        BigDecimal outwardWmsTransferVol = BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Weight wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {


            if (m.getRow().equals("07")){
                outwardDispatchVol = m.getTrn_volume();
            }

            else if(outwardDispatchVol == null){
                outwardDispatchVol =BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")){
                outwardTransferVol= m.getTrn_volume();
            }
            else if(outwardTransferVol==null){
                outwardTransferVol =BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")){
                outwardWithdrawlVol= m.getTrn_volume();
            }
            else if(outwardWithdrawlVol==null){
                outwardWithdrawlVol =BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")){
                outwardWmsSalesVol= m.getTrn_volume();
            }
            else if(outwardWmsSalesVol==null){
                outwardWmsSalesVol=BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")){
                outwardWmspickingVol = m.getTrn_volume();
            }
            else if(outwardWmspickingVol==null){
                outwardWmspickingVol=BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")){
                outwardWmsTransferVol= m.getTrn_volume();
            }
            else if(outwardWmsTransferVol==null){
                outwardWmsTransferVol=BigDecimal.ZERO;
            }
        }
        ArrayList<BarEntry> values = new ArrayList<>();


        values.add(new BarEntry(1f,new float[] {Float.valueOf(String.valueOf(outwardDispatchVol)), Float.valueOf(String.valueOf(outwardWmsSalesVol))}));
        values.add(new BarEntry(2f,new float[] {Float.valueOf(String.valueOf(outwardTransferVol)), Float.valueOf(String.valueOf(outwardWmspickingVol))}));
        values.add(new BarEntry(3f,new float[] {Float.valueOf(String.valueOf(outwardWithdrawlVol)), Float.valueOf(String.valueOf(outwardWmsTransferVol))}));


        BarDataSet set1 = new BarDataSet(values, SET_LABEL);

        set1.setColors(new int[] {ColorTemplate.MATERIAL_COLORS[0], ColorTemplate.MATERIAL_COLORS[1]});
        set1.setStackLabels(new String[] {STACK_1_LABEL, STACK_2_LABEL});

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(0.5f);

        return data;
    }

    public BarData createOutwardValueChartData (){

        /*Variables For Weight wise Comparison*/

        BigDecimal outwardDispatchVal = BigDecimal.ZERO;
        BigDecimal outwardTransferVal= BigDecimal.ZERO;
        BigDecimal outwardWithdrawlVal= BigDecimal.ZERO;
        BigDecimal outwardWmsSalesVal= BigDecimal.ZERO;
        BigDecimal  outwardWmspickingVal= BigDecimal.ZERO;
        BigDecimal outwardWmsTransferVal= BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Weight wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");

            if (m.getRow().equals("07")){
                outwardDispatchVal = m.getTrn_value();
            }
            else if(outwardDispatchVal == null){
                outwardDispatchVal =BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")){
                outwardTransferVal= m.getTrn_value();
            }
            else if(outwardTransferVal==null){
                outwardTransferVal =BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")){
                outwardWithdrawlVal= m.getTrn_value();
            }
            else if(outwardWithdrawlVal==null){
                outwardWithdrawlVal =BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")){
                outwardWmsSalesVal= m.getTrn_value();
            }
            else if(outwardWmsSalesVal==null){
                outwardWmsSalesVal=BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")){
                outwardWmspickingVal = m.getTrn_value();
            }
            else if(outwardWmspickingVal==null){
                outwardWmspickingVal=BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")){
                outwardWmsTransferVal= m.getTrn_value();
            }
            else if(outwardWmsTransferVal==null){
                outwardWmsTransferVal=BigDecimal.ZERO;
            }
        }
        ArrayList<BarEntry> values = new ArrayList<>();


        values.add(new BarEntry(1f,new float[] {Float.valueOf(String.valueOf(outwardDispatchVal)), Float.valueOf(String.valueOf(outwardWmsSalesVal))}));
        values.add(new BarEntry(2f,new float[] {Float.valueOf(String.valueOf(outwardTransferVal)), Float.valueOf(String.valueOf(outwardWmspickingVal))}));
        values.add(new BarEntry(3f,new float[] {Float.valueOf(String.valueOf(outwardWithdrawlVal)), Float.valueOf(String.valueOf(outwardWmsTransferVal))}));

        BarDataSet set1 = new BarDataSet(values, SET_LABEL);

        set1.setColors(new int[] {ColorTemplate.MATERIAL_COLORS[0], ColorTemplate.MATERIAL_COLORS[1]});
        set1.setStackLabels(new String[] {STACK_1_LABEL, STACK_2_LABEL});

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(0.5f);

        return data;
    }

    public BarData createOutwardQtyChartData (){

        /*Variables For Weight wise Comparison*/

        BigDecimal outwardDispatchQty = BigDecimal.ZERO;
        BigDecimal outwardTransferQty= BigDecimal.ZERO;
        BigDecimal outwardWithdrawlQty= BigDecimal.ZERO;
        BigDecimal outwardWmsSalesQty= BigDecimal.ZERO;
        BigDecimal  outwardWmspickingQty= BigDecimal.ZERO;
        BigDecimal outwardWmsTransferQty= BigDecimal.ZERO;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();

        /*Data For Weight wise Comparison*/
        for (Wms_AnalyticsBean m : wms_analyticsBeans) {
            //   Log.v("insideBean###","insideBean###");

            if (m.getRow().equals("07")){
                outwardDispatchQty = m.getTrn_qty();
            }
            else if(outwardDispatchQty == null){
                outwardDispatchQty =BigDecimal.ZERO;
            }

            if (m.getRow().equals("08")){
                outwardTransferQty= m.getTrn_qty();
            }
            else if(outwardTransferQty==null){
                outwardTransferQty =BigDecimal.ZERO;
            }

            if (m.getRow().equals("09")){
                outwardWithdrawlQty= m.getTrn_qty();
            }
            else if(outwardWithdrawlQty==null){
                outwardWithdrawlQty =BigDecimal.ZERO;
            }

            if (m.getRow().equals("10")){
                outwardWmsSalesQty= m.getTrn_qty();
            }
            else if(outwardWmsSalesQty==null){
                outwardWmsSalesQty=BigDecimal.ZERO;
            }

            if (m.getRow().equals("11")){
                outwardWmspickingQty= m.getTrn_qty();
            }
            else if(outwardWmspickingQty==null){
                outwardWmspickingQty=BigDecimal.ZERO;
            }

            if (m.getRow().equals("12")){
                outwardWmsTransferQty= m.getTrn_qty();
            }
            else if(outwardWmsTransferQty==null){
                outwardWmsTransferQty=BigDecimal.ZERO;
            }
        }
        ArrayList<BarEntry> values = new ArrayList<>();


        values.add(new BarEntry(1f,new float[] {Float.valueOf(String.valueOf(outwardDispatchQty)), Float.valueOf(String.valueOf(outwardWmsSalesQty))}));
        values.add(new BarEntry(2f,new float[] {Float.valueOf(String.valueOf(outwardTransferQty)), Float.valueOf(String.valueOf(outwardWmspickingQty))}));
        values.add(new BarEntry(3f,new float[] {Float.valueOf(String.valueOf(outwardWithdrawlQty)), Float.valueOf(String.valueOf(outwardWmsTransferQty))}));

        BarDataSet set1 = new BarDataSet(values, SET_LABEL);

        set1.setColors(new int[] {ColorTemplate.MATERIAL_COLORS[0], ColorTemplate.MATERIAL_COLORS[1]});
        set1.setStackLabels(new String[] {STACK_1_LABEL, STACK_2_LABEL});

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(0.5f);

        return data;
    }

    private void prepareChartData (BarData data){
        data.setValueTextSize(12f);
        stkbarchart.setData(data);
        stkbarchart.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        stkbarchart.invalidate();


    }
}
