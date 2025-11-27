package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.PurchaseOrderDetail;
import WMS.example.WMS.repository.local.model.PurchaseOrderHeader;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PurchaseOrderDao {

    @Insert
    long insertPurchaseOrderHeader(PurchaseOrderHeader purchaseOrderHeader);

    @Query("select * from PO_HDR where status =:status and ACCNTG_COCD =:accComCode and ORD_PRINCIPAL_COCD =:prinComCode ")
    List<PurchaseOrderHeader> getPurchaseOrderHeader(String status, String accComCode, String prinComCode);

    @Query("select * from PO_HDR where sync =:sync ")
    List<PurchaseOrderHeader> getPurchaseOrderHeaderForSync(String sync);

    @Query("select * from PO_DETAIL where header_pk =:headerPk ")
    List<PurchaseOrderDetail> getPurchaseOrderDetail(Long headerPk);

    @Query("delete from Po_detail where header_Pk =:headerPk")
    void deletePoDetail(Long headerPk);

    @Query("delete from PO_HDR where Pk =:headerPk")
    void deletePoHdr(Long headerPk);

    @Query("select max(pk) from PO_HDR ")
    Long getNo();

    @Update
    void updateProHd(PurchaseOrderHeader po) throws Exception;

    @Insert
    long insertPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);

    @Query("update PO_HDR set ord_id = :ordId,status =:status, sync =:sync where pk=:pk ")
    void update(Long pk, String sync,String status, Long ordId) throws Exception;

    @Query("update SO_DETAIL set ord_id = :ordId, ord_dtl_id =:ordDtlId where pk=:pk ")
    void updateDetail(Long pk, Long ordDtlId, Long ordId) throws Exception;

    @Query("SELECT COUNT(*) AS TOTAL FROM PO_HDR where STATUS =:status")
    Long getTotalCountByStatus(String status) throws Exception;

}
