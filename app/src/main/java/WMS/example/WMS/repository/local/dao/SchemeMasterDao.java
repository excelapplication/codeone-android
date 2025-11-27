package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.SchemeDetail;
import WMS.example.WMS.repository.local.model.SchemeHeader;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface SchemeMasterDao {

    @Insert
    void insertSchemeHeader(List<SchemeHeader> schemeHeader);

    @Insert
    void insertSchemeDetail(List<SchemeDetail> schemeDetail);

    @Query("select * from SCHEME_HEADER where PROD_ID =:prodId and date() BETWEEN VALID_FROM_DT and VALID_TO_DT GROUP by SCHEME_NAME")
    List<SchemeHeader> getSchemes(Long prodId);

    @Query("select * from SCHEME_DETAIL where scheme_code =:schemeCode")
    SchemeDetail getSchemeDetail(String schemeCode);

}
