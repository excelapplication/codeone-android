package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;

import java.util.List;

@Dao
public interface Wms_Tran_DTLDao {
    @Query("DELETE FROM WMS_TRAN_DTL")
    void deleteWms_Tran_DTL() throws Exception;

    @Insert
    void insertwmsTranDetail(Wms_Tran_DTL wmsTranDtl) throws Exception;

    @Query("select * from Wms_Tran_DTL where TRAN_TYPE= '01' and WMS_CONFIRMED='N' ")
    List<Wms_Tran_DTL> getPutAwayDetails()throws Exception;

    @Query("select * from WMS_TRAN_DTL where TRAN_DTL_ID= :tranDtlId")
    Wms_Tran_DTL getWmsDetailByTranId(Long tranDtlId) throws  Exception;


    @Query("select * from WMS_TRAN_HDR where TRAN_TYPE= '02' and WMS_CONFIRMED='N' ")
    List<Wms_Tran_HDR> getHeaderDetails()throws Exception;
    // Picking Details
    @Query("select * from Wms_Tran_DTL where TRAN_TYPE= '02' and WMS_CONFIRMED='N' ")
    List<Wms_Tran_DTL> getPickingDetails()throws Exception;


    @Query("UPDATE  WMS_TRAN_DTL set WMS_CONFIRMED='Y' where TRAN_TYPE= :tranType and TRAN_DTL_ID= :tranDtlId ")
    void updateWmsConfirmed(String tranType,Long tranDtlId);


}
