package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.FinancialYear;


import java.util.List;

@Dao
public interface FinancialYearDao {

    @Insert
    void insert(List<FinancialYear> financialYearList) throws Exception;

    @Query("SELECT max( FIN_YEAR_ID ) FIN_YEAR_ID, ERP_FIN_YEAR, END_DT, START_DT FROM FINANCIAL_YEAR WHERE ACC_COMPANY_CD = :AccCompanyCode AND FIN_YEAR_CLOSED = :finYearClose")
    FinancialYear getFinYearDataByAccCode(String AccCompanyCode, String finYearClose) throws Exception;


}
