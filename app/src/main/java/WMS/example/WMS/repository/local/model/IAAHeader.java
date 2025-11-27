package WMS.example.WMS.repository.local.model;


import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "IAA_HD")
public class IAAHeader {

    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "IAA_ADJ_ID")
    private long iaaAdjId;

    @ColumnInfo(name = "IAA_NO")
    private String iaaNo;

    @ColumnInfo(name = "IAA_DATE")
    private String iaaDate;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long finYearId;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntgCoCd;

    @ColumnInfo(name = "REMARKS")
    private String remarks;

    @ColumnInfo(name = "GOODS_VALUE")
    private BigDecimal goodsValue;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgstBillAmt;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgstBillAmt;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igstBillAmt;

    @ColumnInfo(name = "GST_REVERSE_CHG")
    private String gstReverseChg;

    @ColumnInfo(name = "GST_DOC_TYPE")
    private String gstDocType;

    @ColumnInfo(name = "ROWID")
    private Long rowId;

    @ColumnInfo(name = "USER_ID")
    private Long userId;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public long getIaaAdjId() {
        return iaaAdjId;
    }

    public void setIaaAdjId(long iaaAdjId) {
        this.iaaAdjId = iaaAdjId;
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

    public BigDecimal getSgstBillAmt() {
        return sgstBillAmt;
    }

    public void setSgstBillAmt(BigDecimal sgstBillAmt) {
        this.sgstBillAmt = sgstBillAmt;
    }

    public BigDecimal getCgstBillAmt() {
        return cgstBillAmt;
    }

    public void setCgstBillAmt(BigDecimal cgstBillAmt) {
        this.cgstBillAmt = cgstBillAmt;
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

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
