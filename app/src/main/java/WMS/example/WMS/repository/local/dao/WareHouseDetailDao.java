package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import WMS.example.WMS.ui.model.WareHouseDetail;

import java.util.List;

@Dao
public interface WareHouseDetailDao {
    @Query("DELETE FROM WareHouse_Detail")
    void deleteWarehouseDetails() throws Exception;

    @Insert
    void insertPeriod(WareHouseDetail pm) throws Exception;

    @Query("SELECT * FROM WareHouse_Detail")
    List<WareHouseDetail> getWareHouses();

    @Query("update WareHouse_Detail set isActive='Y' where WH_ID = :WhId")
    void updateActiveWareHouse(Long WhId);

    @Query("update WareHouse_Detail set isActive='N'")
    void updateIsActivetoN();

    @Query("select * from WareHouse_Detail where isActive='Y' ")
    WareHouseDetail getActiveWareHouse();
}
