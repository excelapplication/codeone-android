package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Wms_trf_dtl;

import java.util.List;

@Dao
public interface Wms_trf_dtlDao {
    @Query("DELETE FROM Wms_trf_dtl")
    void deleteWms_Transefer_DTL() throws Exception;

    @Insert
    void insertwmsTranDetail(Wms_trf_dtl wms_trf_dtl) throws Exception;


    @Query("SELECT * from WMS_TRF_DTL where WMS_CONFIRMED='N'")
    public List<Wms_trf_dtl> getStockTransferDetail();


    @Query("SELECT * from WMS_TRF_DTL where TRAN_DTL_ID =:wmsTrfDetailId ")
    public Wms_trf_dtl  getStockTrfDetail(Long wmsTrfDetailId);

    @Query("UPDATE  WMS_TRF_DTL set WMS_CONFIRMED='Y' where TRAN_TYPE= :tranType and TRAN_DTL_ID= :tranDtlId ")
    void updateWmsConfirmed(String tranType, Long tranDtlId);
}
