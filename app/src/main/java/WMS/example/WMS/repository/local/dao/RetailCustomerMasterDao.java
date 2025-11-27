package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.RetailCustomerMaster;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface RetailCustomerMasterDao {

    @Insert
    long insert(RetailCustomerMaster retailCustomerMaster) throws Exception;

    @Insert
    void insertList(List<RetailCustomerMaster> retailCustomerMasterList) throws Exception;

    @Update
    void update(RetailCustomerMaster retailCustomerMaster) throws Exception;

    @Query("SELECT * FROM RETAIL_CUST WHERE ACCNTG_CO_CD = :accountingCode AND CUST_NAME = :custName")
    RetailCustomerMaster getRetailCustomerMasterData(String accountingCode, String custName) throws Exception;

    @Query("SELECT * FROM Retail_Cust WHERE ACCNTG_CO_CD = :accCode AND DELETED = :deleted order by cust_name")
    List<RetailCustomerMaster> getAllRetailerByAccCode(String accCode, String deleted) throws Exception;

    @Query("SELECT * FROM Retail_Cust WHERE ACCNTG_CO_CD = :accCode AND DELETED = :deleted and cust_id is not null")
    List<RetailCustomerMaster> getAllRetailerByAccCodeID(String accCode, String deleted) throws Exception;

    @Query("SELECT * FROM Retail_Cust")
    List<RetailCustomerMaster> getAllCustomerMaster() throws Exception;

    @Query("SELECT * FROM Retail_Cust WHERE SYNC_FLAG = 'N'")
    List<RetailCustomerMaster> getAllCustomerMasterByFlag() throws Exception;

    @Query("SELECT CUST_CD FROM Retail_Cust where PK = (SELECT max(PK) FROM Retail_Cust)")
    String getLastCusCodeByMaxPk() throws Exception;

    @Query("UPDATE Retail_Cust SET CUST_ID = :cusId, SYNC_FLAG = :syncFlag WHERE ACCNTG_CO_CD = :accCode AND CUST_CD = :cusCode")
    void updateCusIdAndSyncFlag(Long cusId, String syncFlag, String accCode, String cusCode) throws Exception;

    //
}
