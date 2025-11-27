package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.APMaster;

import java.util.List;

@Dao
public interface APMasterDao {

    @Insert
    void insert(List<APMaster> apMasters) throws Exception;

    @Insert
    void insertApMaster(APMaster apMasters) throws Exception;

    @Query("DELETE FROM APMAS WHERE HEADER_PK = :headerPk AND ACCNTG_COCD = :accCode AND INV_NUM = :invoiceNo AND TRAN_TYPE = :tranType")
    void deleteApMasByHeaderPk(Long headerPk, String accCode, String invoiceNo, String tranType) throws Exception;

    @Query("UPDATE APMAS SET TRAN_ID = :tranId, SL_NO = :slNo WHERE PK = :headerPk")
    void updateApMasByHeaderPk(Long tranId, Long slNo, Long headerPk) throws Exception;

    @Query("SELECT * FROM APMAS WHERE HEADER_PK =:headerPk")
    List<APMaster> getAllApMasterByHeaderPk(Long headerPk) throws Exception;

}
