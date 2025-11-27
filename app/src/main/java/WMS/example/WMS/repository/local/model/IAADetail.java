package WMS.example.WMS.repository.local.model;

import android.icu.text.StringSearch;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "IAA_DETAIL")
public class IAADetail {

    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "IAA_ADJ_ID")
    private Long iaaAdjId;

    @ColumnInfo(name = "ADJ_DTL_ID")
    private Long adjDtlId;

    @ColumnInfo(name = "IAA_NO")
    private String iaaNo;

    @ColumnInfo(name = "IAA_DATE")
    private String iaaDate;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long finYearId;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntgCoCd;

    @ColumnInfo(name = "ADJ_REASON_ID")
    private Long adjReasonId;

    @ColumnInfo(name = "OUT_ITEM_ID")
    private Long outItemId;

    @ColumnInfo(name = "OUT_BATCH_ID")
    private Long outBatchId;

    @ColumnInfo(name = "OUT_QTY")
    private BigDecimal outQty;

    @ColumnInfo(name = "OUT_STK_TYPE")
    private String outStkType;

    @ColumnInfo(name = "OUT_RATE")
    private BigDecimal outRate;

    @ColumnInfo(name = "IN_ITEM_ID")
    private Long inItemId;

    @ColumnInfo(name = "IN_BATCH_ID")
    private Long inBatchId;

    @ColumnInfo(name = "IN_QTY")
    private BigDecimal inQty;

    @ColumnInfo(name = "IN_STK_TYPE")
    private String inStkType;

    @ColumnInfo(name = "IN_RATE")
    private BigDecimal inRate;

    @ColumnInfo(name = "IN_RATE_DT_ID")
    private Long inRateDtId;

    @ColumnInfo(name = "REMARKS")
    private String remarks;

    @ColumnInfo(name = "GOODS_VALUE")
    private BigDecimal goodsValue;

    @ColumnInfo(name = "CESS_RATE")
    private BigDecimal cessRate;

    @ColumnInfo(name = "CESS_BILL_AMT")
    private BigDecimal cessBillAmt;

    @ColumnInfo(name = "SGST_RATE")
    private BigDecimal sgstRate;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgstBillAmt;

    @ColumnInfo(name = "CGST_RATE")
    private BigDecimal cgstRate;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgstBillAmt;

    @ColumnInfo(name = "IGST_RATE")
    private BigDecimal igstRate;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igstBillAmt;

    @ColumnInfo(name = "GST_REVERSE_CHG")
    private String gstReverseChg;

    @ColumnInfo(name = "GST_DOC_TYPE")
    private String gstDocType;

    @ColumnInfo(name = "GRN_DT")
    private String grnDt;

    @ColumnInfo(name = "GRN_ID")
    private BigDecimal grnId;

    @ColumnInfo(name = "GRN_NO")
    private String grnNo;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getIaaAdjId() {
        return iaaAdjId;
    }

    public void setIaaAdjId(Long iaaAdjId) {
        this.iaaAdjId = iaaAdjId;
    }

    public Long getAdjDtlId() {
        return adjDtlId;
    }

    public void setAdjDtlId(Long adjDtlId) {
        this.adjDtlId = adjDtlId;
    }

    public String getIaaNo() {
        return iaaNo;
    }

    public void setIaaNo(String iaaNo) {
        this.iaaNo = iaaNo;
    }

    public String getIaaDate() {
        return iaaDate;
    }

    public void setIaaDate(String iaaDate) {
        this.iaaDate = iaaDate;
    }

    public Long getFinYearId() {
        return finYearId;
    }

    public void setFinYearId(Long finYearId) {
        this.finYearId = finYearId;
    }

    public String getAccntgCoCd() {
        return accntgCoCd;
    }

    public void setAccntgCoCd(String accntgCoCd) {
        this.accntgCoCd = accntgCoCd;
    }

    public Long getAdjReasonId() {
        return adjReasonId;
    }

    public void setAdjReasonId(Long adjReasonId) {
        this.adjReasonId = adjReasonId;
    }

    public Long getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(Long outItemId) {
        this.outItemId = outItemId;
    }

    public Long getOutBatchId() {
        return outBatchId;
    }

    public void setOutBatchId(Long outBatchId) {
        this.outBatchId = outBatchId;
    }

    public BigDecimal getOutQty() {
        return outQty;
    }

    public void setOutQty(BigDecimal outQty) {
        this.outQty = outQty;
    }

    public String getOutStkType() {
        return outStkType;
    }

    public void setOutStkType(String outStkType) {
        this.outStkType = outStkType;
    }

    public BigDecimal getOutRate() {
        return outRate;
    }

    public void setOutRate(BigDecimal outRate) {
        this.outRate = outRate;
    }

    public Long getInItemId() {
        return inItemId;
    }

    public void setInItemId(Long inItemId) {
        this.inItemId = inItemId;
    }

    public Long getInBatchId() {
        return inBatchId;
    }

    public void setInBatchId(Long inBatchId) {
        this.inBatchId = inBatchId;
    }

    public BigDecimal getInQty() {
        return inQty;
    }

    public void setInQty(BigDecimal inQty) {
        this.inQty = inQty;
    }

    public String getInStkType() {
        return inStkType;
    }

    public void setInStkType(String inStkType) {
        this.inStkType = inStkType;
    }

    public BigDecimal getInRate() {
        return inRate;
    }

    public void setInRate(BigDecimal inRate) {
        this.inRate = inRate;
    }

    public Long getInRateDtId() {
        return inRateDtId;
    }

    public void setInRateDtId(Long inRateDtId) {
        this.inRateDtId = inRateDtId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }

    public BigDecimal getCessRate() {
        return cessRate;
    }

    public void setCessRate(BigDecimal cessRate) {
        this.cessRate = cessRate;
    }

    public BigDecimal getCessBillAmt() {
        return cessBillAmt;
    }

    public void setCessBillAmt(BigDecimal cessBillAmt) {
        this.cessBillAmt = cessBillAmt;
    }

    public BigDecimal getSgstRate() {
        return sgstRate;
    }

    public void setSgstRate(BigDecimal sgstRate) {
        this.sgstRate = sgstRate;
    }

    public BigDecimal getSgstBillAmt() {
        return sgstBillAmt;
    }

    public void setSgstBillAmt(BigDecimal sgstBillAmt) {
        this.sgstBillAmt = sgstBillAmt;
    }

    public BigDecimal getCgstRate() {
        return cgstRate;
    }

    public void setCgstRate(BigDecimal cgstRate) {
        this.cgstRate = cgstRate;
    }

    public BigDecimal getCgstBillAmt() {
        return cgstBillAmt;
    }

    public void setCgstBillAmt(BigDecimal cgstBillAmt) {
        this.cgstBillAmt = cgstBillAmt;
    }

    public BigDecimal getIgstRate() {
        return igstRate;
    }

    public void setIgstRate(BigDecimal igstRate) {
        this.igstRate = igstRate;
    }

    public BigDecimal getIgstBillAmt() {
        return igstBillAmt;
    }

    public void setIgstBillAmt(BigDecimal igstBillAmt) {
        this.igstBillAmt = igstBillAmt;
    }

    public String getGstReverseChg() {
        return gstReverseChg;
    }

    public void setGstReverseChg(String gstReverseChg) {
        this.gstReverseChg = gstReverseChg;
    }

    public String getGstDocType() {
        return gstDocType;
    }

    public void setGstDocType(String gstDocType) {
        this.gstDocType = gstDocType;
    }

    public String getGrnDt() {
        return grnDt;
    }

    public void setGrnDt(String grnDt) {
        this.grnDt = grnDt;
    }

    public BigDecimal getGrnId() {
        return grnId;
    }

    public void setGrnId(BigDecimal grnId) {
        this.grnId = grnId;
    }

    public String getGrnNo() {
        return grnNo;
    }

    public void setGrnNo(String grnNo) {
        this.grnNo = grnNo;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }
}
