package WMS.example.WMS.ui.adapter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import WMS.example.WMS.ui.fragment.BarGraphFragment;
import WMS.example.WMS.ui.fragment.NewBarGraphFragment;
import WMS.example.WMS.ui.fragment.StackBarGraphFragment;


public class ChartAdapter extends FragmentStatePagerAdapter {

    private int totalTabs;
    private String wmsData;
    private String analyzeOn;

    public ChartAdapter(Context context, FragmentManager fm, int totalTabs, String  wmsData,String analyzeOn) {
        super(fm);
        this.totalTabs = totalTabs;
        this.wmsData = wmsData;
        this.analyzeOn = analyzeOn;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                BarGraphFragment barGraphFragment = new BarGraphFragment();
//                Bundle bundle = new Bundle();
//                bundle.putString("BarGraphDatails", wmsData);
//                bundle.putString("analyzeOn", analyzeOn);
//                barGraphFragment.setArguments(bundle);
//                return barGraphFragment;


            NewBarGraphFragment newBarGraphFragment = new NewBarGraphFragment();
                Bundle bundle = new Bundle();
                bundle.putString("BarGraphDatails", wmsData);
                bundle.putString("analyzeOn", analyzeOn);
                newBarGraphFragment.setArguments(bundle);
                return newBarGraphFragment;

//            case 1:
//                StackBarGraphFragment stackBarGraphFragment = new StackBarGraphFragment();
//                Bundle stackbundle = new Bundle();
//                stackbundle.putString("StackBarGraphDatails", wmsData);
//                stackBarGraphFragment.setArguments(stackbundle);
//                return stackBarGraphFragment;

            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }

}
