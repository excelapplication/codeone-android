package WMS.example.WMS.repository.local.dao;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import WMS.example.WMS.repository.local.model.PeriodMaster;

import java.util.List;

@Dao
public interface PeriodMasterDao {
    @Query("DELETE FROM PERIOD")
    void deletePeriod() throws Exception;

    @Insert
    void insertPeriod(PeriodMaster pm) throws Exception;


    @Query("SELECT PERIOD_ID,PERIOD_NAME,PERIOD_CODE FROM PERIOD  WHERE PERIOD_ID <= :periodId  AND PERIOD_FIN_YEAR = :finYearId  ")
    List<PeriodMaster> getPeriodsByFinYearId(Long periodId, String finYearId) throws Exception;

    @Query("SELECT PERIOD_ID,PERIOD_NAME,PERIOD_CODE FROM PERIOD  WHERE PERIOD_ID >= :periodId  AND PERIOD_FIN_YEAR = :finYearId  ")
    List<PeriodMaster> getToPeriodbyFinyears(Long periodId, String finYearId) throws Exception;

    @Query("SELECT * FROM PERIOD where PERIOD_FIN_YEAR = :finYearId and PERIOD_CURRENT='Y' ")
    PeriodMaster getCuurentPeriod(String  finYearId)throws Exception;

}
