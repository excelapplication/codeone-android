package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import WMS.example.WMS.repository.local.model.BatchMaster;
import WMS.example.WMS.repository.local.model.NSBatchMaster;


import java.math.BigDecimal;
import java.util.List;

@Dao
public interface BatchMasterDao {

    @Insert
    void insert(BatchMaster batchMasters);

    @Query("SELECT * FROM BATCH_MAS WHERE SYNC_FLAG = :sync")
    List<BatchMaster> getBatchMasterForSync(String sync) throws Exception;

    @Query("select * from BATCH_MAS where batch_no =:batchNo and prod_id =:prodId and ACCNTG_CO_CD =:aactngCcd and PRINCIPAL_CODE=:prinCcd")
    BatchMaster getBatchMaster(String batchNo, Long prodId, String aactngCcd, String prinCcd);

    @Update
    void update(BatchMaster batchMaster);

    @Insert
    void insert(List<BatchMaster> batchMasters);

    @Insert
    long insertBatch(BatchMaster batchMaster);

    @Update
    void updateBatch(BatchMaster batchMaster);

    @Insert
    void insertNsBatchMaster(List<NSBatchMaster> nsBatchMasterList);

    @Query("SELECT * FROM BATCH_MAS WHERE PROD_ID = :prodId AND ACCNTG_CO_CD = :acc_code AND PRINCIPAL_CODE = :principal_code")
    List<BatchMaster> getBatchMasterByProdIdAndCode(Long prodId, String acc_code, String principal_code) throws Exception;

    @Query("SELECT * FROM BATCH_MAS WHERE PROD_ID = :prodId")
    List<BatchMaster> getBatchMasterByProdIdAndCode(Long prodId) throws Exception;

    @Query("SELECT * FROM NS_BATCH_MAS WHERE PROD_ID = :prodId AND STOCK_TYPE = :stockType AND ACCNTG_CO_CD = :acc_code AND PRINCIPAL_CODE = :principal_code")
    List<NSBatchMaster> getNsBatchMasterByProdIdAndStockType(Long prodId, String stockType, String acc_code, String principal_code) throws Exception;

    @Query("SELECT OPEN_STOCK_BILLED FROM BATCH_MAS WHERE PROD_ID = :prodId AND BATCH_ID = :batchId")
    BigDecimal getOpenStockByProdAndBatchIdInBatchMas(Long prodId, Long batchId) throws Exception;

    @Query("SELECT OPEN_STOCK_BILLED FROM NS_BATCH_MAS WHERE PROD_ID = :prodId AND BATCH_ID = :batchId")
    BigDecimal getOpenStockByProdAndBatchIdInNonBatchMas(Long prodId, Long batchId) throws Exception;

    @Query("SELECT * FROM NS_BATCH_MAS WHERE PROD_ID = :prodId AND STOCK_TYPE = :stockType AND BATCH_NO = :batchNo AND ACCNTG_CO_CD = :acc_code AND PRINCIPAL_CODE = :principal_code")
    NSBatchMaster getNsBatchMasterByBatchNo(Long prodId, String stockType, String batchNo, String acc_code, String principal_code) throws Exception;

    @Query("select batch_id,BATCH_NO,MFG_DT,EXPIRY_DT,mrp,pts,PTR,prod_id,qty,WITH_HELD_QTY,sum((qty - WITH_HELD_QTY )) actual_qty from (\n" +
            "SELECT batch_id,BATCH_NO,MFG_DT,EXPIRY_DT,mrp,pts,PTR,prod_id,\n" +
            "sum(OPEN_STOCK_BILLED+OPEN_STOCK_FREE+OPEN_STOCK_REPL+NET_TRAN_BILLED+NET_TRAN_FREE+NET_TRAN_REPL) qty,\n" +
            "sum(WITH_HELD_QTY) WITH_HELD_QTY\n" +
            "FROM BATCH_MAS --WHERE PROD_ID = 12 AND ACCNTG_CO_CD = 'FRS5424' AND PRINCIPAL_CODE = 'PR1111'\n" +
            "group by batch_id,BATCH_NO,MFG_DT,EXPIRY_DT,mrp,pts,PTR,prod_id )\n" +
            "group by batch_id,BATCH_NO,MFG_DT,EXPIRY_DT,mrp,pts,PTR,prod_id,qty,WITH_HELD_QTY\n" +
            "having sum((qty - WITH_HELD_QTY )) > 0")
    List<BatchMaster> getBatchListByQty() throws Exception;

    /*@Query("SELECT PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
            "sum((qty - WITH_HELD_QTY )) actual_qty, GRN_BILLED_QTY,\n" +
            "CASE WHEN sum((qty - WITH_HELD_QTY )) < GRN_BILLED_QTY THEN sum((qty - WITH_HELD_QTY )) ELSE GRN_BILLED_QTY END OPEN_STOCK_BILLED from (\n" +
            "SELECT BM.PROD_ID,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
            "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
            "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
            "SUM(GD.BILLED_QTY) GRN_BILLED_QTY\n" +
            "FROM BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_ID = GD.BATCH_ID AND BM.PROD_ID = GD.PROD_ID\n" +
            "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
            "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code\n" +
            "group by BM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,BM.MRP,BM.PTS,BM.PTR\n" +
            "ORDER BY BM.PROD_ID,BM.BATCH_ID \n" +
            ") DTL\n" +
            "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY\n" +
            "having sum((qty - WITH_HELD_QTY )) > 0\n" +
            "ORDER BY PROD_ID,BATCH_ID")
    List<BatchMaster> getBatchMasterByGreaterQty(Long prodId, String acc_code, String principal_code) throws Exception;*/

    /*@Query("SELECT  PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
            "sum((qty - WITH_HELD_QTY )) actual_qty, GRN_BILLED_QTY,\n" +
            "CASE WHEN sum((qty - WITH_HELD_QTY )) < GRN_BILLED_QTY THEN sum((qty - WITH_HELD_QTY )) ELSE GRN_BILLED_QTY END OPEN_STOCK_BILLED,\n" +
            "REASON from (\n" +
            "SELECT PM.PROD_ID,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
            "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
            "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
            "SUM(GD.BILLED_QTY) GRN_BILLED_QTY,NST.PARA_DESCR REASON\n" +
            "FROM NS_BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_ID = GD.BATCH_ID AND BM.PROD_ID = GD.PROD_ID\n" +
            "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
            "JOIN PARAMETER NST ON NST.MEDICO2 = BM.STOCK_TYPE AND NST.PARA_TYPE = 'NST'\n" +
            "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code\n" +
            "AND BM.STOCK_TYPE = :stockType\n" +
            "group by PM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,BM.MRP,BM.PTS,BM.PTR,NST.PARA_DESCR\n" +
            "ORDER BY BM.PROD_ID,BM.BATCH_ID \n" +
            ") DTL\n" +
            "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY,REASON\n" +
            "having sum((qty - WITH_HELD_QTY )) > 0\n" +
            "ORDER BY PROD_ID,BATCH_ID")
    List<NSBatchMaster> getNsBatchMasterByGrtQty(Long prodId, String acc_code, String principal_code, String stockType) throws Exception;*/



    /*@Query("SELECT PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,PUR_INV_NUM,PUR_INV_DATE,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
            "sum((qty - WITH_HELD_QTY )) actual_qty, GRN_BILLED_QTY,PUR_RET_QTY,(GRN_BILLED_QTY-PUR_RET_QTY) PUR_GRN__RET_QTY,\n" +
            "CASE WHEN sum((qty - WITH_HELD_QTY )) < IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) THEN sum((qty - WITH_HELD_QTY )) ELSE IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) END NET_AVAIL_QTY\n" +
            "from (\n" +
            "SELECT GH.GRN_NO,BM.prod_id,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,\n" +
            "GH.PUR_INV_NUM,GH.PUR_INV_DATE,GH.GRN_DT,IFNULL(BM.MRP,0) MRP,IFNULL(BM.PTS,0)PTS,IFNULL(BM.PTR,0) PTR,\n" +
            "SUM(IFNULL(PUR.PUR_RET_QTY,0)) PUR_RET_QTY,\n" +
            "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
            "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
            "SUM(GD.BILLED_QTY) GRN_BILLED_QTY\n" +
            "FROM NS_BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_ID = GD.BATCH_ID AND BM.PROD_ID = GD.PROD_ID\n" +
            "JOIN GRN_HD GH ON GH.GRN_ID = GD.GRN_ID\n" +
            "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
            "LEFT OUTER JOIN ( SELECT PDH.PK,PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
            "PDT.PROD_ID,PDT.BATCH_ID,SUM(PDT.TOT_RET_QTY) PUR_RET_QTY\n" +
            "FROM PURCH_CNDN_HDR PDH JOIN PURCH_CNDN_DTL PDT ON PDH.PK = PDT.HEADER_PK\n" +
            "GROUP BY PDH.PK,PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
            "PDT.PROD_ID,PDT.BATCH_ID ) PUR ON PUR.BATCH_ID = GD.BATCH_ID AND PUR.PROD_ID = GD.PROD_ID\n" +
            "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code AND BM.STOCK_TYPE = :stockType\n" +
            "group by GH.GRN_NO,BM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,GH.GRN_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
            "GH.PUR_INV_NUM,GH.PUR_INV_DATE\n" +
            "ORDER BY BM.PROD_ID,BM.BATCH_ID\n" +
            ") DTL WHERE DTL.BATCH_ID = :batchId\n" +
            "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY,PUR_RET_QTY\n" +
            "--having sum((qty - WITH_HELD_QTY )) > 0\n" +
            "--AND (GRN_BILLED_QTY-PUR_RET_QTY) > 0\n" +
            "ORDER BY PROD_ID,BATCH_ID")*/


//    @Query("SELECT DISTINCT (BATCH_ID), BATCH_NO, MRP, EXPIRY_DT AS BATCH_EXPIRY_DT, MRP,PTS FROM (\n" +
//            "SELECT PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,PUR_INV_NUM,PUR_INV_DATE,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
//            "sum((qty - WITH_HELD_QTY )) actual_qty,GRN_BILLED_QTY,PUR_RET_QTY,\n" +
//            "(GRN_BILLED_QTY-PUR_RET_QTY) PUR_GRN__RET_QTY,\n" +
//            "CASE WHEN sum((qty - WITH_HELD_QTY )) < IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) THEN sum((qty - WITH_HELD_QTY )) ELSE IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) END NET_AVAIL_QTY\n" +
//            "from (\n" +
//            "SELECT GH.GRN_NO,BM.prod_id,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,\n" +
//            "GH.PUR_INV_NUM,GH.PUR_INV_DATE,GH.GRN_DT,IFNULL(BM.MRP,0) MRP,IFNULL(BM.PTS,0)PTS,IFNULL(BM.PTR,0) PTR,\n" +
//            "SUM(IFNULL(PUR.PUR_RET_QTY,0)) PUR_RET_QTY,\n" +
//            "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
//            "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
//            "IFNULL(SUM(GD.BILLED_QTY),0) GRN_BILLED_QTY\n" +
//            "FROM BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_ID = GD.BATCH_ID AND BM.PROD_ID = GD.PROD_ID\n" +
//            "JOIN GRN_HD GH ON GH.GRN_ID = GD.GRN_ID\n" +
//            "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
//            "LEFT OUTER JOIN ( SELECT PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
//            "PDT.PROD_ID,PDT.BATCH_ID,SUM(PDT.TOT_RET_QTY) PUR_RET_QTY\n" +
//            "FROM PURCH_CNDN_HDR PDH JOIN PURCH_CNDN_DTL PDT ON PDH.PK = PDT.HEADER_PK\n" +
//            "GROUP BY PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
//            "PDT.PROD_ID,PDT.BATCH_ID ) PUR ON PUR.BATCH_ID = GD.BATCH_ID AND PUR.PROD_ID = GD.PROD_ID\n" +
//            "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code\n" +
//            "group by GH.GRN_NO,BM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,GH.GRN_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
//            "GH.PUR_INV_NUM,GH.PUR_INV_DATE\n" +
//            "ORDER BY BM.PROD_ID,BM.BATCH_ID\n" +
//            ") DTL --WHERE DTL.BATCH_ID = 58567\n" +
//            "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY,PUR_RET_QTY\n" +
//            "--having sum((qty - WITH_HELD_QTY )) > 0\n" +
//            "--AND (GRN_BILLED_QTY-PUR_RET_QTY) > 0\n" +
//            "ORDER BY PROD_ID,BATCH_ID )")
//    List<BatchCnDnBean> getDistinctBatchIdFromBatchMaster(Long prodId, String acc_code, String principal_code) throws Exception;

    /*
        @Query("SELECT DISTINCT (BATCH_ID), BATCH_NO, MRP, EXPIRY_DT,PTS FROM (\n" +
                "SELECT PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,PUR_INV_NUM,PUR_INV_DATE,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
                "sum((qty - WITH_HELD_QTY )) actual_qty, GRN_BILLED_QTY,PUR_RET_QTY,(GRN_BILLED_QTY-PUR_RET_QTY) PUR_GRN__RET_QTY,\n" +
                "CASE WHEN sum((qty - WITH_HELD_QTY )) < IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) THEN sum((qty - WITH_HELD_QTY )) ELSE IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) END NET_AVAIL_QTY\n" +
                "from (\n" +
                "SELECT GH.GRN_NO,BM.prod_id,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,\n" +
                "GH.PUR_INV_NUM,GH.PUR_INV_DATE,GH.GRN_DT,IFNULL(BM.MRP,0) MRP,IFNULL(BM.PTS,0)PTS,IFNULL(BM.PTR,0) PTR,\n" +
                "SUM(IFNULL(PUR.PUR_RET_QTY,0)) PUR_RET_QTY,\n" +
                "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
                "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
                "SUM(GD.BILLED_QTY) GRN_BILLED_QTY\n" +
                "FROM NS_BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_ID = GD.BATCH_ID AND BM.PROD_ID = GD.PROD_ID\n" +
                "JOIN GRN_HD GH ON GH.GRN_ID = GD.GRN_ID\n" +
                "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
                "LEFT OUTER JOIN ( SELECT PDH.PK,PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
                "PDT.PROD_ID,PDT.BATCH_ID,SUM(PDT.TOT_RET_QTY) PUR_RET_QTY\n" +
                "FROM PURCH_CNDN_HDR PDH JOIN PURCH_CNDN_DTL PDT ON PDH.PK = PDT.HEADER_PK\n" +
                "GROUP BY PDH.PK,PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
                "PDT.PROD_ID,PDT.BATCH_ID ) PUR ON PUR.BATCH_ID = GD.BATCH_ID AND PUR.PROD_ID = GD.PROD_ID\n" +
                "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code AND BM.STOCK_TYPE = :stockType\n" +
                "group by GH.GRN_NO,BM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,GH.GRN_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
                "GH.PUR_INV_NUM,GH.PUR_INV_DATE\n" +
                "ORDER BY BM.PROD_ID,BM.BATCH_ID\n" +
                ") DTL --WHERE DTL.BATCH_ID = 58567\n" +
                "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY,PUR_RET_QTY\n" +
                "--having sum((qty - WITH_HELD_QTY )) > 0\n" +
                "--AND (GRN_BILLED_QTY-PUR_RET_QTY) > 0\n" +
                "ORDER BY PROD_ID,BATCH_ID)")
    */
//    @Query("SELECT DISTINCT (BATCH_ID), BATCH_NO, MRP, EXPIRY_DT AS BATCH_EXPIRY_DT,PTS FROM (\n" +
//            "SELECT PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,PUR_INV_NUM,PUR_INV_DATE,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,\n" +
//            "sum((qty - WITH_HELD_QTY )) actual_qty, GRN_BILLED_QTY,PUR_RET_QTY,(GRN_BILLED_QTY-PUR_RET_QTY) PUR_GRN__RET_QTY,\n" +
//            "CASE WHEN sum((qty - WITH_HELD_QTY )) < IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) THEN sum((qty - WITH_HELD_QTY )) ELSE IFNULL((GRN_BILLED_QTY-PUR_RET_QTY),0) END NET_AVAIL_QTY\n" +
//            "from (\n" +
//            "SELECT GH.GRN_NO,BM.prod_id,PM.PROD_NAME PRODUCT,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,\n" +
//            "GH.PUR_INV_NUM,GH.PUR_INV_DATE,GH.GRN_DT,IFNULL(BM.MRP,0) MRP,IFNULL(BM.PTS,0)PTS,IFNULL(BM.PTR,0) PTR,\n" +
//            "IFNULL(PUR.PUR_RET_QTY,0) PUR_RET_QTY,\n" +
//            "sum(BM.OPEN_STOCK_BILLED+BM.OPEN_STOCK_FREE+BM.OPEN_STOCK_REPL+BM.NET_TRAN_BILLED+BM.NET_TRAN_FREE+BM.NET_TRAN_REPL) qty,\n" +
//            "sum(BM.WITH_HELD_QTY) WITH_HELD_QTY,\n" +
//            "SUM(GD.BILLED_QTY) GRN_BILLED_QTY\n" +
//            "FROM NS_BATCH_MAS BM JOIN GRN_DT GD ON BM.BATCH_NO = GD.BATCH_Number AND BM.PROD_ID = GD.PROD_ID --and bm.stock_type = '04'\n" +
//            "JOIN GRN_HD GH ON GH.GRN_ID = GD.GRN_ID\n" +
//            "JOIN PRODUCT PM ON PM.PROD_ID = BM.PROD_ID\n" +
//            "LEFT OUTER JOIN ( SELECT PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
//            "PDT.PROD_ID,PDT.BATCH_ID,SUM(PDT.TOT_RET_QTY) PUR_RET_QTY\n" +
//            "FROM PURCH_CNDN_HDR PDH JOIN PURCH_CNDN_DTL PDT ON PDH.PK = PDT.HEADER_PK\n" +
//            "GROUP BY PDH.FIN_YEAR_ID,PDH.PRINCIPAL_COCD,PDH.ERP_PARTY_CODE,PDH.ACCNTG_COCD,PDH.TRAN_TYPE,\n" +
//            "PDT.PROD_ID,PDT.BATCH_ID ) \n" +
//            "PUR ON PUR.BATCH_ID = GD.BATCH_ID AND PUR.PROD_ID = GD.PROD_ID\n" +
//            "WHERE PM.PROD_ID = :prodId AND PM.ACCNTG_CO_CD = :acc_code AND PM.PRINCIPAL_CODE = :principal_code AND BM.STOCK_TYPE = :stockType\n" +
//            "group by GH.GRN_NO,BM.PROD_ID,PM.PROD_NAME,BM.BATCH_ID,BM.BATCH_NO,BM.MFG_DT,BM.EXPIRY_DT,GH.GRN_DT,BM.MRP,BM.PTS,BM.PTR,\n" +
//            "PUR_RET_QTY,GH.PUR_INV_NUM,GH.PUR_INV_DATE\n" +
//            "ORDER BY BM.PROD_ID,BM.BATCH_ID\n" +
//            ") DTL --WHERE DTL.BATCH_ID = 58567\n" +
//            "group by PROD_ID,PRODUCT,BATCH_ID,BATCH_NO,MFG_DT,EXPIRY_DT,GRN_DT,MRP,PTS,PTR,qty,WITH_HELD_QTY,GRN_BILLED_QTY,PUR_RET_QTY\n" +
//            "-- having sum((qty - WITH_HELD_QTY )) > 0\n" +
//            "--AND (GRN_BILLED_QTY-PUR_RET_QTY) > 0\n" +
//            "ORDER BY PROD_ID,BATCH_ID)")
//    List<BatchCnDnBean> getDistinctBatchIdFromNsBatch(Long prodId, String acc_code, String principal_code, String stockType) throws Exception;

    @Query("SELECT * FROM BATCH_MAS WHERE BATCH_ID = :batchId")
    BatchMaster getBatchByBatchId(Long batchId) throws Exception;

    @Query("UPDATE BATCH_MAS SET NET_TRAN_BILLED = :netTranBill WHERE BATCH_ID = :batchId")
    void updateNetTranBillByBatchId(BigDecimal netTranBill, Long batchId) throws Exception;

    @Query("SELECT * FROM NS_BATCH_MAS WHERE PROD_ID = :prodId AND STOCK_TYPE = :stockType AND BATCH_NO = :batchNo")
    NSBatchMaster getNsBatchByBatchNo(Long prodId, String stockType, String batchNo) throws Exception;

    @Query("UPDATE NS_BATCH_MAS SET NET_TRAN_BILLED = :netTranBill WHERE PROD_ID = :prodId AND STOCK_TYPE = :stockType AND BATCH_NO = :batchNo")
    void updateNsBatchNetTranBillByBatchNo(BigDecimal netTranBill, Long prodId, String stockType, String batchNo) throws Exception;

    @Query("SELECT * FROM BATCH_MAS WHERE PROD_ID = :prodId AND PRINCIPAL_CODE = :principalCode AND BATCH_NO = :batchNo")
    BatchMaster geBatchByProdIdAndBatchNo(Long prodId, String principalCode, String batchNo) throws Exception;

    @Query("SELECT BATCH_NO FROM BATCH_MAS WHERE PROD_ID = :prodId AND PRINCIPAL_CODE = :parentCode AND BATCH_BLOCK = :batchBlock")
    List<BatchMaster> getAllBatchNoByParentCode(Long prodId, String parentCode, String batchBlock) throws Exception;

    @Query("SELECT * FROM BATCH_MAS WHERE SYNC_FLAG = 'N' AND BATCH_BLOCK = 'N'")
    List<BatchMaster> getAllBatchesByFlag() throws Exception;

    @Query("UPDATE BATCH_MAS SET BATCH_ID = :batchId, SYNC_FLAG = :syncFlag WHERE PROD_ID = :prodId AND PRINCIPAL_CODE = :parentCode AND ACCNTG_CO_CD = :accCode AND BATCH_NO = :batchNo")
    void updateBatchIdAndSyncFlag(Long batchId, String syncFlag, Long prodId, String parentCode, String accCode, String batchNo) throws Exception;

    @Query("UPDATE BATCH_MAS SET NET_TRAN_BILLED = :netTranBill, PHYSICAL_STOCK =:physicalStock, NET_TRAN_FREE =:netTranFree  WHERE PROD_ID = :prodId AND PRINCIPAL_CODE = :parentCode AND ACCNTG_CO_CD = :accCode AND BATCH_NO = :batchNo")
    void updateNetTranBillByBatchNo(BigDecimal netTranBill, BigDecimal physicalStock, BigDecimal netTranFree, Long prodId, String parentCode, String accCode, String batchNo) throws Exception;

}
