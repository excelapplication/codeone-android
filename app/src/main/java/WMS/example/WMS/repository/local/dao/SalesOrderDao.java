package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.SalesOrderDetail;
import WMS.example.WMS.repository.local.model.SalesOrderHeader;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SalesOrderDao {


    @Insert
    long insertSalesOrderHeader(SalesOrderHeader salesOrderHeader);

    @Query("select * from SO_HDR where status =:status and ACCNTG_COCD =:accComCode")
    List<SalesOrderHeader> getSalesOrderHeader(String status, String accComCode);

    @Query("select * from SO_DETAIL where header_pk =:headerPk ")
    List<SalesOrderDetail> getSalesOrderDetail(Long headerPk);

    @Query("delete from SO_DETAIL where header_Pk =:headerPk")
    void deleteSoDetail(Long headerPk);

    @Query("delete from SO_HDR where Pk =:headerPk")
    void deleteSoHdr(Long headerPk);

    @Query("select max(pk) from SO_HDR ")
    Long getNo();

    @Update
    void updateSoHd(SalesOrderHeader so) throws Exception;

    @Insert
    long insertSalesOrderDetail(SalesOrderDetail salesOrderDetail);

    @Query("select * from SO_HDR where sync =:sync ")
    List<SalesOrderHeader> getSalesOrderHeaderForSync(String sync);

    @Query("update SO_HDR set ord_id = :ordId,status =:status, sync =:sync where pk=:pk ")
    void update(Long pk, String sync,String status, Long ordId) throws Exception;

    @Query("update SO_DETAIL set ord_id = :ordId, ord_dtl_id =:ordDtlId where pk=:pk ")
    void updateDetail(Long pk, Long ordDtlId, Long ordId) throws Exception;

    @Query("SELECT COUNT(*) AS TOTAL FROM SO_HDR where STATUS =:status")
    Long getTotalCountByStatus(String status) throws Exception;

}
