package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.time.Period;
import java.util.List;

import WMS.example.WMS.repository.local.model.FinancialYear;
import WMS.example.WMS.repository.local.model.PeriodMaster;


@Dao
public interface FinYearDao {

    @Query("DELETE FROM FINYEAR")
    void deleteFinYear() throws Exception;

    @Insert
    void insertFinancialYear(FinancialYear financialYear) throws Exception;


   @Query("SELECT * FROM FINYEAR")
   List<FinancialYear> selectFinyear() throws Exception;

   @Query("SELECT * FROM PERIOD")
   List<PeriodMaster> selectPeriod() throws Exception;



}
