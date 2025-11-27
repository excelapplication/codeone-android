package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.UserMaster;


import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserMasterDao {

    @Insert
    void insert(UserMaster userMaster) throws Exception;

//    @Query("SELECT USER_ID FROM USER_MAS WHERE ACC_CO_CD = :accCode")
//    Long getUserIdByAccCode(String accCode) throws Exception;
//
//    @Query("select * from am_m_login_detail where ACC_CO_CD = :accCode")
//  UserMaster userData(String accCode) throws Exception;
}
