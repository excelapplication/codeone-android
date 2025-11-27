package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.PickslipBinDetail;
import WMS.example.WMS.repository.local.model.PickslipDetail;
import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.ui.model.PickslipBean;

import java.util.List;

@Dao
public interface wmsTranHdrsDao {

    @Query("DELETE FROM WMS_TRAN_HDR")
    void deleteWms_Tran_HDR() throws Exception;

    @Insert
    void insertwmsTranHdrs(Wms_Tran_HDR wms_tran_hdr) throws Exception;

    @Query("select * from WMS_TRAN_HDR where TRAN_TYPE= '01' and WMS_CONFIRMED='N' and FIN_YEAR_ID=:finYear ")
    List<Wms_Tran_HDR> getPutAwayDetails(String finYear)throws Exception;

    @Query("select SD_TRAN_DATE from WMS_TRAN_HDR where TRAN_TYPE= :tranType AND  WMS_TRAN_ID=:tranId")
    String getDateByTranId(Long tranId ,String tranType)throws Exception;

    @Insert
    void insertPickSlipheaderList(List<PickslipHeader> pickslipHd);

    @Insert
    void insertPickSlipDetailList(List<PickslipDetail> pickslipHd);

    @Insert
    void insertPickSlipDetailBinList(List<PickslipBinDetail> pickslipDtlBin);

    @Query("DELETE FROM PICKSLIP_HDR")
    void deletepicksliphdr() throws  Exception;

    @Query("DELETE FROM PICKSLIP_DTL")
    void deletepickslipdtl() throws  Exception;

    @Query("SELECT * FROM PICKSLIP_HDR WHERE PS_HDR_STATUS='Y' AND PS_HDR_CONFIRM != 'Y' ")
    List<PickslipHeader> getPickSlipHeaders();

    @Query("SELECT * FROM PICKSLIP_DTL ")
    List<PickslipDetail> getPickSlipdetails();


//    @Query("SELECT  PD.SL_NO AS PIC_DTL_ID,PD.ps_hdr_slno AS PIC_HDR_ID,WD.SD_TRAN_ID ,WD.PROD_NAME,WD.PROD_ID,WD.TRAN_QTY,WD.WMS_CONFIRMED \n" +
//            "FROM PICKSLIP_DTL PD INNER JOIN  Wms_Tran_DTL WD ON PD.SD_TRAN_HDR_ID=WD.SD_TRAN_ID \n" +
//            "WHERE PD.ps_hdr_slno=:tranId  AND WD.WMS_CONFIRMED='N' ")
//    List<PickslipBean> getPicslipproducts(Long tranId)throws  Exception;

    @Query("SELECT * FROM WMS_TRAN_DTL WHERE  SD_TRAN_ID IN (:tranIds)")
    List<Wms_Tran_DTL> getWmsDetailListByTranId(List<Long> tranIds)throws  Exception;

    @Query("SELECT PD.SL_NO as sl_no , PD.SD_TRAN_HDR_NO  as sd_tran_hdr_no,SD_TRAN_HDR_ID  as sd_tran_hdr_id,WH.SD_TRAN_ID AS pickslip_hdr_id ,PD.DSP_TRANSPORTER AS dsp_transporter  FROM WMS_TRAN_HDR WH  \n" +
            "INNER JOIN PICKSLIP_DTL PD ON PD.PS_HDR_SLNO=WH.SD_TRAN_ID\n" +
            "WHERE WH.WMS_CONFIRMED='Y' and WH.TRAN_TYPE='02'  AND  PD.PACKING_CONFIRM IS NULL")
    List<PickslipBean> getPackingInvList()throws  Exception;
}
