package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import WMS.example.WMS.repository.local.model.ACCCompany;

import java.util.List;

@Dao
public interface AccountingMasterDao {

    @Insert
    void insert(List<ACCCompany> company) throws Exception;

    @Insert
    long insertAcc(ACCCompany accCompany) throws Exception;

    @Update
    void updateAcc(ACCCompany accCompany) throws Exception;

    @Query("select * from ACC_COMPANY where ACC_CO_CODE = :accCode")
    List<ACCCompany> getAccCompany(String accCode) throws Exception;

    @Query("select * from ACC_COMPANY where SYNC_FLAG = 'N'")
    List<ACCCompany> getAllAccCompanyByFlag() throws Exception;

    @Query("SELECT * FROM ACC_COMPANY WHERE ACC_CO_CODE = :accCode")
    ACCCompany getAccCompanyByCode(String accCode) throws Exception;

    @Query("SELECT ACC_CO_CODE FROM ACC_COMPANY where PK = (SELECT max(PK) FROM ACC_COMPANY)")
    String getLastAccCode() throws Exception;

    @Query("SELECT PM.PARA_DESCR AS ACC_City, AC.ACC_State \n" +
            "FROM ACC_COMPANY AS AC LEFT OUTER JOIN PARAMETER AS PM ON PM.PARA_TYPE = 'STT' AND PM.PARA_CODE = AC.ACC_State \n" +
            "WHERE AC.ACC_CO_CODE =:accCode ")
    ACCCompany getStateNameByParaCode(String accCode) throws Exception;

    @Query("UPDATE ACC_COMPANY SET ACC_CO_ID = :accId, SYNC_FLAG = :syncFlag WHERE ACC_CO_CODE = :accCode")
    void updateAccIdSyncFlag(Long accId, String syncFlag, String accCode) throws Exception;

}
