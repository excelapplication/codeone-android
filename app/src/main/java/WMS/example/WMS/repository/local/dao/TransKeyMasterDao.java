package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.TranKeyMaster;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface TransKeyMasterDao {

    @Insert
    void insertTranData(List<TranKeyMaster> tranKeyMasterList) throws Exception;

    @Query("SELECT * FROM TRANS_KEY_MASTER WHERE ACC_CO_CODE = :accCode AND TRAN_TYPE_ID = :tranTypeId")
    TranKeyMaster getTranDataByAccCode(String accCode, Long tranTypeId) throws Exception;

    @Query("UPDATE TRANS_KEY_MASTER SET LAST_NUM = :lastNum WHERE ACC_CO_CODE = :accCode AND TRAN_TYPE_ID = :tranTypeId")
    void updateLastNumByAccCode(String lastNum, String accCode, Long tranTypeId) throws Exception;
}