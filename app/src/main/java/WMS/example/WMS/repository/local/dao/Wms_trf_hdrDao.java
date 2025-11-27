package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Wms_trf_hdr;

import java.util.List;

@Dao
public interface Wms_trf_hdrDao {
    @Query("DELETE FROM WMS_TRF_HDR ")
    void deleteWms_Tran_HDR() throws Exception;

    @Insert
    void insertWms_trf_hdrDao(Wms_trf_hdr wms_tran_hdr) throws Exception;

    @Query("select * from WMS_TRF_HDR ")
    List<Wms_trf_hdr> getTransferHdr()throws Exception;

}
