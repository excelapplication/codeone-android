package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Company;

import java.util.List;

@Dao
public interface CompanyDao {

    @Insert
    void insert(List<Company> company) throws Exception;

    @Query("SELECT * FROM Company WHERE COMPANY = :cmp")
    Company getCompanyByName(String cmp) throws Exception;


    @Query("UPDATE Company set Company =:Company, COMPANY_NAME =:companyName ,COMPANY_GROUP_ID=:companyGroupId,COMPANY_ins_usr_id =:companyInsUsrId ,COMPANY_mod_usr_id=:company_mod_usr_id,ADDRESS1 =:ADDRESS1,ADDRESS2 =:ADDRESS2,ADDRESS3 =:ADDRESS3")
    void updateCOmPanyByName(String Company,String companyName,String companyGroupId,int companyInsUsrId,String company_mod_usr_id,String ADDRESS1,
    String ADDRESS2,String ADDRESS3);

    @Query("DELETE FROM Company")
    void deleteCompany() throws Exception;



    
}

