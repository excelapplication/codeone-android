package WMS.example.WMS.ui.viewmodel;

import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.remote.api.WareHouseApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.ApplicationSharedPreferences;
import WMS.example.WMS.util.RetrofitUtil;

import java.util.List;

public class WareHouseSelectionViewModel implements ApplicationConstants {
    private MedicoStockistDatabase medicoStockistDatabase;
    private Long userId;
    private String empId;
    private WareHouseApi wareHouseApi;

    public WareHouseSelectionViewModel() {
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(ContextApplication.getContext());
        ApplicationSharedPreferences applicationSharedPreferences = new ApplicationSharedPreferences(ContextApplication.getContext());
        userId = (Long) applicationSharedPreferences.get(USER_ID);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
        this.wareHouseApi = WareHouseApi.instance;


    }

    public List<WareHouseDetail> getWareHouses() {

        return medicoStockistDatabase.wareHouseDetailDao().getWareHouses();
    }

    public void updateActiveWareHouse(Long whId){
        medicoStockistDatabase.wareHouseDetailDao().updateActiveWareHouse(whId);
    }

    public void updateIsActivetoN(){
        medicoStockistDatabase.wareHouseDetailDao().updateIsActivetoN();
    }

    public WareHouseDetail getActiveWareHouse(){
        return medicoStockistDatabase.wareHouseDetailDao().getActiveWareHouse();

    }

}
