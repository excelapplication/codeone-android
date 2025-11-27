package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import WMS.example.WMS.repository.local.model.SubCompany;

import java.util.List;

@Dao
public interface SubCompanyDao {
    @Insert
    void insert(List<SubCompany> company) throws Exception;

    @Query("SELECT * FROM Sub_Company WHERE SubComp_id = :SubComp_id")
    SubCompany getCompanyByName(Long SubComp_id) throws Exception;

    @Query("UPDATE Sub_Company set SubComp_COMPANY =:SubComp_COMPANY,SubComp_code =:SubComp_code,SubComp_Nm =:SubComp_Nm, SubComp_ins_usr_id =:SubComp_ins_usr_id,SubComp_status=:SubComp_status")
   void updateSubCompany(String SubComp_COMPANY, String SubComp_code, String SubComp_Nm, String SubComp_ins_usr_id,String SubComp_status);
}
