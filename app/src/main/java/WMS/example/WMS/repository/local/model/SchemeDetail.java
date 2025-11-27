package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SCHEME_DETAIL")
public class SchemeDetail {

    @PrimaryKey
    @ColumnInfo(name = "SCHEME_DT_ID")
    private Long scheme_dt_id;

    @ColumnInfo(name = "SCHEME_ID")
    private Long scheme_id;

    @ColumnInfo(name = "SCHEME_CODE")
    private String scheme_code;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "SCHEME_TYPE")
    private String scheme_type;

    @ColumnInfo(name = "SCHEME_ITEM_GRP")
    private String scheme_item_grp;

    @ColumnInfo(name = "SCHEME_ITEM_ID")
    private Long scheme_item_id;

    @ColumnInfo(name = "MIN_ORDER")
    private BigDecimal min_order;

    @ColumnInfo(name = "SALE_QTY")
    private BigDecimal sale_qty;

    @ColumnInfo(name = "FREE_ITEM_ID")
    private Long free_item_id;

    @ColumnInfo(name = "FREE_ITEM_QTY")
    private BigDecimal free_item_qty;

    @ColumnInfo(name = "DISCOUNT")
    private BigDecimal discount;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "BATCH_NO")
    private String batch_no;

    @ColumnInfo(name = "MIN_GOODS_VAL")
    private BigDecimal min_goods_val;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    public Long getScheme_dt_id() {
        return scheme_dt_id;
    }

    public void setScheme_dt_id(Long scheme_dt_id) {
        this.scheme_dt_id = scheme_dt_id;
    }

    public Long getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(Long scheme_id) {
        this.scheme_id = scheme_id;
    }

    public String getScheme_code() {
        return scheme_code;
    }

    public void setScheme_code(String scheme_code) {
        this.scheme_code = scheme_code;
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

    public String getScheme_type() {
        return scheme_type;
    }

    public void setScheme_type(String scheme_type) {
        this.scheme_type = scheme_type;
    }

    public String getScheme_item_grp() {
        return scheme_item_grp;
    }

    public void setScheme_item_grp(String scheme_item_grp) {
        this.scheme_item_grp = scheme_item_grp;
    }

    public Long getScheme_item_id() {
        return scheme_item_id;
    }

    public void setScheme_item_id(Long scheme_item_id) {
        this.scheme_item_id = scheme_item_id;
    }

    public BigDecimal getMin_order() {
        return min_order;
    }

    public void setMin_order(BigDecimal min_order) {
        this.min_order = min_order;
    }

    public BigDecimal getSale_qty() {
        return sale_qty;
    }

    public void setSale_qty(BigDecimal sale_qty) {
        this.sale_qty = sale_qty;
    }

    public Long getFree_item_id() {
        return free_item_id;
    }

    public void setFree_item_id(Long free_item_id) {
        this.free_item_id = free_item_id;
    }

    public BigDecimal getFree_item_qty() {
        return free_item_qty;
    }

    public void setFree_item_qty(BigDecimal free_item_qty) {
        this.free_item_qty = free_item_qty;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public BigDecimal getMin_goods_val() {
        return min_goods_val;
    }

    public void setMin_goods_val(BigDecimal min_goods_val) {
        this.min_goods_val = min_goods_val;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
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
