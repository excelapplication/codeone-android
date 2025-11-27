package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import WMS.example.WMS.repository.local.model.GLMaster;
import WMS.example.WMS.repository.local.model.GlPost;

import java.util.List;

@Dao
public interface GLMasterDao {

    @Insert
    void insert(List<GLMaster> glMasterList) throws Exception;

    @Query("SELECT GL_ACC_ID, SUMM_IND FROM GL_MAST WHERE GL_ACC_CODE = :glAccCode AND ACCTG_COMP_CD = :accCode")
    GLMaster getGlMasterByGlAccCodeAndCompanyCode(String glAccCode, String accCode) throws Exception;

    @Insert
    void insertGlPost(GlPost glPost) throws Exception;

    @Update
    void updateGlPost(GlPost glPost) throws Exception;

    @Query("SELECT * FROM GL_MAST WHERE BANK_IND = 'Y' AND ACCTG_COMP_CD = :accCode")
    List<GLMaster> getGlListByAccCode(String accCode) throws Exception;

    @Query("SELECT GL_ACC_ID FROM GL_MAST WHERE BANK_IND = 'Y' AND ACCTG_COMP_CD = :accCode AND ACC_NAME = :bankName")
    Long getGlAccIdByAccName(String accCode, String bankName) throws Exception;

    @Query("SELECT ACC_NAME FROM GL_MAST WHERE BANK_IND = 'Y' AND ACCTG_COMP_CD = :accCode AND GL_ACC_ID = :glAccId")
    String getBankNameByGlId(String accCode, Long glAccId) throws Exception;
}
