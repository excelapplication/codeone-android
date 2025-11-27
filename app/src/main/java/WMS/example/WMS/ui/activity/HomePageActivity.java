package WMS.example.WMS.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import WMS.example.WMS.repository.local.model.PeriodMaster;
import WMS.example.WMS.ui.activity.ui.gallery.GalleryFragment;
import WMS.example.WMS.ui.activity.ui.home.HomeFragment;
import WMS.example.WMS.ui.activity.ui.slideshow.SlideshowFragment;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.ui.viewmodel.HomePageViewModel;
import WMS.example.WMS.ui.viewmodel.WareHouseSelectionViewModel;
import WMS.example.WMS.util.ApplicationSharedPreferences;
import com.example.WMS.R;
import com.google.android.material.navigation.NavigationView;

import WMS.example.WMS.util.CustomViewPager2;
import WMS.example.WMS.util.MedicoResources;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

import WMS.example.WMS.util.CustomViewPager;

import static android.R.layout.simple_spinner_dropdown_item;

public class HomePageActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private TextView drawer;
    private final Context context = this;
    ImageView putawayview, pickingview, transferview, homeview;
    private ImageButton Warehouse;
    private Button bar, pie;
    private HomePageViewModel homePageViewModel;
    private WareHouseSelectionViewModel wareHouseSelectionViewModel;
    private HashMap<String, PeriodMaster> periodMap;
    private HashMap<String, PeriodMaster> toPeriodMap;
    private HashMap<String, String> analyzed;
    private SwipeRefreshLayout swipeRefreshLayout;

    Spinner WarehouseSp, brandName, monthNameSpinner, toPeriod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ApplicationSharedPreferences sharedPreferences = new ApplicationSharedPreferences(context);
        this.homePageViewModel = new HomePageViewModel();
        this.wareHouseSelectionViewModel = new WareHouseSelectionViewModel();
        monthNameSpinner = findViewById(R.id.month_name);
        brandName = findViewById(R.id.brand_name);
        toPeriod = findViewById(R.id.to_period);
        final CustomViewPager viewPager = findViewById(R.id.viewpager);
//       final CustomViewPager2 viewPager2 = findViewById(R.id.viewpager2);


        //int i = 10/0;
        try {
            putawayview = findViewById(R.id.putaway_button);
            pickingview = findViewById(R.id.pick_button);
            transferview = findViewById(R.id.transfer_button);
            homeview = findViewById(R.id.home);
            bar = findViewById(R.id.bar_graph);
            pie = findViewById(R.id.pie_graph);
//            Toolbar toolbar = findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
            //   FloatingActionButton fab = findViewById(R.id.fab);

            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            NavigationView navigationView = findViewById(R.id.nav_view);

            // Passing each menu ID as a set of Ids because each
            // menu should be considered as top level destinations.
            mAppBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                    .setDrawerLayout(drawer)
                    .build();


            View headerView = navigationView.inflateHeaderView(R.layout.nav_header_main);
            ImageView ware_house = (ImageView) headerView.findViewById(R.id.ware_imageView);

            // implement setNavigationItemSelectedListener event on NavigationView
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem) {
                    Fragment frag = null; // create a Fragment Object
                    int itemId = menuItem.getItemId(); // get selected menu item's id

           // check selected menu item's id and replace a Fragment Accordingly
                    if (itemId == R.id.nav_home) {
                        frag = new HomeFragment();

                    } else if (itemId == R.id.nav_gallery) {
                        Intent newIntent = new Intent(HomePageActivity.this, WarehouseSelectionActivity.class);
                        startActivity(newIntent);

                    } else if (itemId == R.id.nav_slideshow) {
                        frag = new SlideshowFragment();
                    }

                    if (frag != null) {
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.nav_host_fragment, frag); // replace a Fragment with Frame Layout
                        transaction.commit(); // commit the changes
                        drawer.closeDrawers(); // close the all open Drawer Views
                        return true;
                    }
                    return false;
                }
            });
//            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                    int id=menuItem.getItemId();
//                    if (id == R.id.nav_gallery){
//                        Intent newIntent = new Intent(this, WarehouseSelectionActivity.class);
//                        startActivity(newIntent);
//                    }
//                    return true;
//                }
//            });
            ware_house.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(HomePageActivity.this, WarehouseSelectionActivity.class));
                    //  Toast.makeText(getApplicationContext(), "Hello warehouse", Toast.LENGTH_SHORT).show();
                }
            });

            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
            NavigationUI.setupWithNavController(navigationView, navController);

       //     Warehouse=findViewById(R.id.warehouseId);
            // get Active warehouse
        WareHouseDetail detail = wareHouseSelectionViewModel.getActiveWareHouse();
            Long whId=detail.getWh_id();
            Log.v("whIdActive", "" + whId);

//            Warehouse.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//
//                //    WarehouseSp = (Spinner) findViewById(R.id.warehouseSpinner);
//                  startActivity(new Intent(HomePageActivity.this, MainActivity.class));
//                    //          startActivity(new Intent(HomePageActivity.this, WarehouseSelectionActivity.class));
//
//                }
//            });


            putawayview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // api for getting all transaction data
                    homePageViewModel.getTransactionData(whId,"PT",HomePageActivity.this);
                    //  Toast.makeText(getApplicationContext(), "Hello Putaway view", Toast.LENGTH_SHORT).show();

                }
            });

            pickingview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // api for getting all transaction data
                    homePageViewModel.getTransactionData(whId,"PI",HomePageActivity.this);
//                    startActivity(new Intent(HomePageActivity.this, PickingActivity.class));
                }
            });

            transferview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // api for getting all transaction data
                    homePageViewModel.getTransactionData(whId,"TR",HomePageActivity.this);
//                    startActivity(new Intent(HomePageActivity.this, TransferActivity.class));
                }
            });

            homeview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(HomePageActivity.this, HomePageActivity.class));
                }
            });
            // get all types of comparasion
            List<String> analyzeOn = new ArrayList<>();
            analyzeOn.add(0, "Qty");
            analyzeOn.add(1, "Volume");
            analyzeOn.add(2, "Weight");
            analyzeOn.add(3, "Value");
            if (analyzeOn != null) {
                ArrayAdapter<String> AnalyzeAdapter = new ArrayAdapter<>(this, R.layout.spinner_dropdown_view, analyzeOn);
                AnalyzeAdapter.setDropDownViewResource(simple_spinner_dropdown_item);
                brandName.setAdapter(AnalyzeAdapter);
                brandName.setSelection(0);

            }

            /*display month name list*/
            final String currentPeriodCd = String.valueOf(MedicoResources.convertUtilDateToString_MM(new Date()));

// get current
            try {
                PeriodMaster period = homePageViewModel.getCuurentPeriod();

                List<PeriodMaster> periodMasterList = homePageViewModel.getPeriodsByFinYearId(period.period_id);

                periodMap = new HashMap<>();
                if (periodMasterList != null) {
                    List<String> monthList = new ArrayList<>();
                    for (PeriodMaster pm : periodMasterList) {
                        monthList.add(pm.getPeriod_name());
                        periodMap.put(pm.getPeriod_name(), pm);
                    }
                    ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, R.layout.spinner_dropdown_view, monthList);
                    monthAdapter.setDropDownViewResource(simple_spinner_dropdown_item);
                    monthNameSpinner.setAdapter(monthAdapter);
                    monthNameSpinner.setSelection(0);
                }
                Long toPeriods = periodMap.get(monthNameSpinner.getSelectedItem()).getPeriod_id();
                List<PeriodMaster> toperiodMaster = homePageViewModel.getToPeriod(toPeriods);
                toPeriodMap = new HashMap<>();
                if (toperiodMaster != null) {
                    List<String> toperiStrings = new ArrayList<>();
                    for (PeriodMaster pm : toperiodMaster) {
                        toperiStrings.add(pm.getPeriod_name());
                        toPeriodMap.put(pm.getPeriod_name(), pm);
                    }
                    ArrayAdapter<String> tomontAdaptrt;
                    tomontAdaptrt = new ArrayAdapter<>(context, R.layout.spinner_dropdown_view, toperiStrings);
                    tomontAdaptrt.setDropDownViewResource(simple_spinner_dropdown_item);
                    toPeriod.setAdapter(tomontAdaptrt);
                    toPeriod.setSelection(0);
                }
                monthNameSpinner.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        monthNameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                try {
                                    Long toPeriods = periodMap.get(monthNameSpinner.getSelectedItem()).getPeriod_id();
                                    List<PeriodMaster> toperiodMaster = homePageViewModel.getToPeriod(toPeriods);
                                    toPeriodMap = new HashMap<>();
                                    if (toperiodMaster != null) {
                                        List<String> toperiStrings = new ArrayList<>();
                                        for (PeriodMaster pm : toperiodMaster) {
                                            toperiStrings.add(pm.getPeriod_name());
                                            toPeriodMap.put(pm.getPeriod_name(), pm);
                                        }
                                        ArrayAdapter<String> tomontAdaptrt;
                                        tomontAdaptrt = new ArrayAdapter<>(context, R.layout.spinner_dropdown_view, toperiStrings);
                                        tomontAdaptrt.setDropDownViewResource(simple_spinner_dropdown_item);
                                        toPeriod.setAdapter(tomontAdaptrt);
                                        toPeriod.setSelection(0);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        return false;
                    }
                });
//
                toPeriod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        homePageViewModel.getDashBoardData(periodMap.get(monthNameSpinner.getSelectedItem()).getPeriod_code(), HomePageActivity.this, bar, pie, viewPager,
                                         toPeriodMap.get(toPeriod.getSelectedItem()).getPeriod_code(),brandName.getSelectedItem().toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }

// code for brand Name

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
