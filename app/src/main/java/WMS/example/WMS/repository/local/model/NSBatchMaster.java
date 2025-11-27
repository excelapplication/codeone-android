package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "NS_BATCH_MAS")
public class NSBatchMaster {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "BATCH_ID")
    private Long batch_id;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "ERP_PROD_CD")
    private String erp_prod_cd;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "SALEABLE_BATCH_ID")
    private Long saleable_batch_id;

    @ColumnInfo(name = "BATCH_NO")
    private String batch_no;

    @ColumnInfo(name = "STOCK_TYPE")
    private String stock_type;

    @ColumnInfo(name = "MFG_DT")
    private String mfg_dt;

    @ColumnInfo(name = "EXPIRY_DT")
    private String expiry_dt;

    @ColumnInfo(name = "MRP")
    private BigDecimal mrp;

    @ColumnInfo(name = "PTS")
    private BigDecimal pts;

    @ColumnInfo(name = "PTR")
    private BigDecimal ptr;

    @ColumnInfo(name = "Rate1")
    private BigDecimal rate1;

    @ColumnInfo(name = "Rate2")
    private BigDecimal rate2;

    @ColumnInfo(name = "Rate3")
    private BigDecimal rate3;

    @ColumnInfo(name = "Rate4")
    private BigDecimal rate4;

    @ColumnInfo(name = "Rate5")
    private BigDecimal rate5;

    @ColumnInfo(name = "SGST_PERC")
    private BigDecimal sgst_perc;

    @ColumnInfo(name = "CGST_PERC")
    private BigDecimal cgst_perc;

    @ColumnInfo(name = "IGST_PERC")
    private BigDecimal igst_perc;

    @ColumnInfo(name = "CESS_PERC")
    private BigDecimal cess_perc;

    @ColumnInfo(name = "PHYSICAL_STOCK")
    private BigDecimal physical_stock;

    @ColumnInfo(name = "OPEN_STOCK_BILLED")
    private BigDecimal open_stock_billed;

    @ColumnInfo(name = "OPEN_STOCK_FREE")
    private BigDecimal open_stock_free;

    @ColumnInfo(name = "OPEN_STOCK_REPL")
    private BigDecimal open_stock_repl;

    @ColumnInfo(name = "NET_TRAN_BILLED")
    private BigDecimal net_tran_billed;

    @ColumnInfo(name = "NET_TRAN_FREE")
    private BigDecimal net_tran_free;

    @ColumnInfo(name = "NET_TRAN_REPL")
    private BigDecimal net_tran_repl;

    @ColumnInfo(name = "WITH_HELD_QTY")
    private BigDecimal with_held_qty;

    @ColumnInfo(name = "BAY_NO1")
    private String bay_no1;

    @ColumnInfo(name = "BAY_NO2")
    private String bay_no2;

    @ColumnInfo(name = "STOCK_POINT_ID")
    private Long stock_point_id;

    @ColumnInfo(name = "BATCH_BLOCK")
    private String batch_block;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

    @ColumnInfo(name = "RATE_TYPE")
    private String rate_type;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Long batch_id) {
        this.batch_id = batch_id;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getErp_prod_cd() {
        return erp_prod_cd;
    }

    public void setErp_prod_cd(String erp_prod_cd) {
        this.erp_prod_cd = erp_prod_cd;
    }

    public String getPrincipal_code() {
        return principal_code;
    }

    public void setPrincipal_code(String principal_code) {
        this.principal_code = principal_code;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public Long getSaleable_batch_id() {
        return saleable_batch_id;
    }

    public void setSaleable_batch_id(Long saleable_batch_id) {
        this.saleable_batch_id = saleable_batch_id;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    public String getMfg_dt() {
        return mfg_dt;
    }

    public void setMfg_dt(String mfg_dt) {
        this.mfg_dt = mfg_dt;
    }

    public String getExpiry_dt() {
        return expiry_dt;
    }

    public void setExpiry_dt(String expiry_dt) {
        this.expiry_dt = expiry_dt;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getPts() {
        return pts;
    }

    public void setPts(BigDecimal pts) {
        this.pts = pts;
    }

    public BigDecimal getPtr() {
        return ptr;
    }

    public void setPtr(BigDecimal ptr) {
        this.ptr = ptr;
    }

    public BigDecimal getRate1() {
        return rate1;
    }

    public void setRate1(BigDecimal rate1) {
        this.rate1 = rate1;
    }

    public BigDecimal getRate2() {
        return rate2;
    }

    public void setRate2(BigDecimal rate2) {
        this.rate2 = rate2;
    }

    public BigDecimal getRate3() {
        return rate3;
    }

    public void setRate3(BigDecimal rate3) {
        this.rate3 = rate3;
    }

    public BigDecimal getRate4() {
        return rate4;
    }

    public void setRate4(BigDecimal rate4) {
        this.rate4 = rate4;
    }

    public BigDecimal getRate5() {
        return rate5;
    }

    public void setRate5(BigDecimal rate5) {
        this.rate5 = rate5;
    }

    public BigDecimal getSgst_perc() {
        return sgst_perc;
    }

    public void setSgst_perc(BigDecimal sgst_perc) {
        this.sgst_perc = sgst_perc;
    }

    public BigDecimal getCgst_perc() {
        return cgst_perc;
    }

    public void setCgst_perc(BigDecimal cgst_perc) {
        this.cgst_perc = cgst_perc;
    }

    public BigDecimal getIgst_perc() {
        return igst_perc;
    }

    public void setIgst_perc(BigDecimal igst_perc) {
        this.igst_perc = igst_perc;
    }

    public BigDecimal getCess_perc() {
        return cess_perc;
    }

    public void setCess_perc(BigDecimal cess_perc) {
        this.cess_perc = cess_perc;
    }

    public BigDecimal getPhysical_stock() {
        return physical_stock;
    }

    public void setPhysical_stock(BigDecimal physical_stock) {
        this.physical_stock = physical_stock;
    }

    public BigDecimal getOpen_stock_billed() {
        return open_stock_billed;
    }

    public void setOpen_stock_billed(BigDecimal open_stock_billed) {
        this.open_stock_billed = open_stock_billed;
    }

    public BigDecimal getOpen_stock_free() {
        return open_stock_free;
    }

    public void setOpen_stock_free(BigDecimal open_stock_free) {
        this.open_stock_free = open_stock_free;
    }

    public BigDecimal getOpen_stock_repl() {
        return open_stock_repl;
    }

    public void setOpen_stock_repl(BigDecimal open_stock_repl) {
        this.open_stock_repl = open_stock_repl;
    }

    public BigDecimal getNet_tran_billed() {
        return net_tran_billed;
    }

    public void setNet_tran_billed(BigDecimal net_tran_billed) {
        this.net_tran_billed = net_tran_billed;
    }

    public BigDecimal getNet_tran_free() {
        return net_tran_free;
    }

    public void setNet_tran_free(BigDecimal net_tran_free) {
        this.net_tran_free = net_tran_free;
    }

    public BigDecimal getNet_tran_repl() {
        return net_tran_repl;
    }

    public void setNet_tran_repl(BigDecimal net_tran_repl) {
        this.net_tran_repl = net_tran_repl;
    }

    public BigDecimal getWith_held_qty() {
        return with_held_qty;
    }

    public void setWith_held_qty(BigDecimal with_held_qty) {
        this.with_held_qty = with_held_qty;
    }

    public String getBay_no1() {
        return bay_no1;
    }

    public void setBay_no1(String bay_no1) {
        this.bay_no1 = bay_no1;
    }

    public String getBay_no2() {
        return bay_no2;
    }

    public void setBay_no2(String bay_no2) {
        this.bay_no2 = bay_no2;
    }

    public Long getStock_point_id() {
        return stock_point_id;
    }

    public void setStock_point_id(Long stock_point_id) {
        this.stock_point_id = stock_point_id;
    }

    public String getBatch_block() {
        return batch_block;
    }

    public void setBatch_block(String batch_block) {
        this.batch_block = batch_block;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    public String getRate_type() {
        return rate_type;
    }

    public void setRate_type(String rate_type) {
        this.rate_type = rate_type;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getLast_mod_by() {
        return last_mod_by;
    }

    public void setLast_mod_by(String last_mod_by) {
        this.last_mod_by = last_mod_by;
    }

    public String getLast_mod_dt() {
        return last_mod_dt;
    }

    public void setLast_mod_dt(String last_mod_dt) {
        this.last_mod_dt = last_mod_dt;
    }
}
