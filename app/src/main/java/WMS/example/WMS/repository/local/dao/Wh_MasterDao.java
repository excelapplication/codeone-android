package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Bin_Master;
import WMS.example.WMS.ui.model.WareHouseDetail;

import java.util.List;

@Dao
public interface Wh_MasterDao {

    @Query("DELETE FROM WAREHOUSE_DETAIL")
    void deletePeriod() throws Exception;

    @Insert
    void insertWareHouseDetial(List<WareHouseDetail> wm) throws Exception;

    @Insert
    void insertBinMaster(List<Bin_Master> binMastersList);

    @Query("SELECT BIN_CODE FROM BIN_MASTER WHERE BIN_ID=:binId")
    String getbincodeByBinId(Long binId);
}
