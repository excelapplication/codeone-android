package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import WMS.example.WMS.repository.local.model.GRNDetail;
import WMS.example.WMS.repository.local.model.GRNHeader;

import java.util.List;

@Dao
public interface GRNDao {

    @Insert
    Long insert(GRNHeader grnHeader);

    @Insert
    void insert(GRNDetail grnDetail);

    @Query("select * from GRN_HD where pk =:pk  ")
    GRNHeader getGrnHeader(Long pk);

    @Query("select max(pk) from GRN_HD")
    long getmax();

    @Query("update GRN_HD set grn_id = :grnId,APPR_STATUS =:status,Status =:status, sync =:sync where pk=:pk ")
    void update(Long pk, String sync,String status, Long grnId) throws Exception;

    @Update
    void updateGrnHeader(GRNHeader grnHeader);

    @Update
    void updateGrnDetail(GRNDetail grnHeader);


    //
    @Insert
    void insertGrnHeader(List<GRNHeader> grnHeaderList) throws Exception;

    @Insert
    void insertGrnDetail(List<GRNDetail> grnDetailList) throws Exception;

    @Query("SELECT GH.PUR_INV_NUM, GH.PUR_INV_DATE FROM GRN_HD as GH INNER JOIN GRN_DT as GT where GH.GRN_ID = GT.GRN_ID\n" +
            "AND GT.BATCH_ID = :batchId")
    List<GRNHeader> getGrnDataByProdIdAndBatchId(Long batchId) throws Exception;

//    @Query("SELECT GT.RATE, GT.FREE_QTY, GT.SGST_RATE, GT.CGST_RATE, GT.IGST_RATE, GT.PROD_DISC, GT.CESS_RATE, GT.CESS_BILL_AMT FROM GRN_HD as GH INNER JOIN GRN_DT as GT where GH.GRN_ID = GT.GRN_ID AND GH.PUR_INV_NUM = :invoiceNo")
//    GRNDetail getGrnDtByInvoiceNo(String invoiceNo) throws Exception;

//    @Query("SELECT sum(GT.BILLED_QTY) BILLED_QTY, sum(GT.FREE_QTY) FREE_QTY, sum(GT.REPL_QTY) REPL_QTY FROM GRN_HD as GH INNER JOIN GRN_DT as GT where GH.GRN_ID = GT.GRN_ID\n" +
//            "AND GT.PROD_ID = :prodId AND GT.BATCH_ID = :batchId")
//    GRNDetail getSumOfQtyByProdAndBatchId(Long prodId, Long batchId) throws Exception;

    @Query("SELECT COUNT(*) AS TOTAL FROM GRN_hd where STATUS =:status")
    Long getTotalCountByStatus(String status) throws Exception;



}
