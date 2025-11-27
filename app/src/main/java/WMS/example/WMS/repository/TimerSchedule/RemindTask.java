package WMS.example.WMS.repository.TimerSchedule;

import android.util.Log;

import WMS.example.WMS.ui.viewmodel.HomePageViewModel;

import java.util.TimerTask;

public class RemindTask extends TimerTask {
    private HomePageViewModel homePageViewModel;

//    public RemindTask(){
//        homePageViewModel = new HomePageViewModel(RemindTask.this);
//    }
    @Override
    public void run() {
        Log.v("called ","called@@@@@");
      //  homePageViewModel.getTransactionData();
    }
}
