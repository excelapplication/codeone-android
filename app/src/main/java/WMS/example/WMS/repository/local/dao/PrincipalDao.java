package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.Principal;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PrincipalDao {

    @Query("select * from PRINCIPAL where ACCNTG_CO_CD = :actCompanyCode ")
    List<Principal> getPrincipalCompany(String actCompanyCode) throws Exception;

    @Query("select * from PRINCIPAL where principal_code =:principalId and ACCNTG_CO_CD = :actCompanyCode")
    Principal getPrincipalById(String principalId, String actCompanyCode) throws Exception;

    @Insert
    void insert(List<Principal> principal) throws Exception;

    @Insert
    long insertPrincipal(Principal principal) throws Exception;

    @Update
    void updatePrincipal(Principal principal) throws Exception;

    @Query("SELECT PRINCIPAL_CODE FROM PRINCIPAL where PK = (SELECT max(PK) FROM PRINCIPAL)")
    String getLastPrincipalCode() throws Exception;

    @Query("SELECT * FROM PRINCIPAL")
    List<Principal> getAllPrincipal() throws Exception;

    @Query("SELECT DISTINCT P.PK,P.PRINCIPAL_NAME,P.PRINCIPAL_CODE,P.ERP_PARTY_CODE,P.ACCNTG_CO_CD FROM PRINCIPAL AS P INNER JOIN BATCH_MAS AS BM ON BM.PRINCIPAL_CODE = P.PRINCIPAL_CODE")
    List<Principal> getPrincipalListByCode() throws Exception;

    @Query("SELECT * FROM PRINCIPAL WHERE SYNC_FLAG = 'N'")
    List<Principal> getAllPrincipalByFlag() throws Exception;

    @Query("UPDATE PRINCIPAL SET PRINCIPAL_ID = :principalId, SYNC_FLAG = :syncFlag WHERE PRINCIPAL_CODE = :principalCode")
    void updatePrincipalIdAndSyncFlag(Long principalId, String syncFlag, String principalCode) throws Exception;

    @Query("SELECT PRINCIPAL_ID FROM PRINCIPAL WHERE PRINCIPAL_CODE = :principalCode AND ACCNTG_CO_CD = :actCompanyCode")
    Long getPrincipalIdByCode(String principalCode, String actCompanyCode) throws Exception;

}
