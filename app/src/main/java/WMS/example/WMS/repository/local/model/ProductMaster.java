package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "PRODUCT")
public class ProductMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @Ignore
    private Long sold_qty;

    @Ignore
    private Long stock;

    @Ignore Long free_qty;

    @Ignore String pack;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "PROD_CD")
    private String prod_cd;

    @ColumnInfo(name = "COMPANY_CD")
    private String company_cd;

    @ColumnInfo(name = "ERP_PROD_CD")
    private String erp_prod_cd;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "DIV_ID")
    private Long div_id;

    @ColumnInfo(name = "PROD_NAME")
    private String prod_name;

    @ColumnInfo(name = "ALTER_NAME")
    private String alter_name;

    @ColumnInfo(name = "STATUS")
    private String status;

    @ColumnInfo(name = "SCH_IND")
    private String sch_ind;

    @ColumnInfo(name = "EXPIRY_RQ_IND_LOG")
    private String expiry_rq_ind_log;

    @ColumnInfo(name = "ETHICAL_IND_LOG")
    private String ethical_ind_log;

    @ColumnInfo(name = "BATCH_RQ_IND_LOG")
    private String batch_rq_ind_log;

    @ColumnInfo(name = "MIN_ORD_QTY")
    private Long min_ord_qty;

    @ColumnInfo(name = "ORDER_MULTI_LOG")
    private String order_multi_log;

    @ColumnInfo(name = "SHELF_LIFE")
    private Long shelf_life;

    @ColumnInfo(name = "QTY_BOX")
    private BigDecimal qty_box;

    @ColumnInfo(name = "QTY_STRIP")
    private BigDecimal qty_strip;

    @ColumnInfo(name = "SHIPPER_VOL")
    private BigDecimal shipper_vol;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    @ColumnInfo(name = "AIOCD")
    private String aiocd;

    @ColumnInfo(name = "SKU_TYPE")
    private Long sku_type;

    @ColumnInfo(name = "SET_DESCRIPTION")
    private String set_description;

    @ColumnInfo(name = "BASKET_RATE")
    private BigDecimal basket_rate;

    @ColumnInfo(name = "COMMODITY")
    private String commodity;

    @ColumnInfo(name = "PRODUCT_MONITOR")
    private String product_monitor;

    @ColumnInfo(name = "HSN_CODE")
    private String hsn_code;

    @ColumnInfo(name = "PTS_RATE")
    private BigDecimal pts_rate;

    @ColumnInfo(name ="SYNC")
    private String sync;

    @ColumnInfo(name = "UOM_ID")
    private String uom_id;

    @ColumnInfo(name = "PACK_ID")
    private String pack_id;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @Ignore
    private BigDecimal sgst_rate;
    @Ignore
    private BigDecimal cgst_rate;
    @Ignore
    private BigDecimal igst_rate;

    public BigDecimal getSgst_rate() {
        return sgst_rate;
    }

    public void setSgst_rate(BigDecimal sgst_rate) {
        this.sgst_rate = sgst_rate;
    }

    public BigDecimal getCgst_rate() {
        return cgst_rate;
    }

    public void setCgst_rate(BigDecimal cgst_rate) {
        this.cgst_rate = cgst_rate;
    }

    public BigDecimal getIgst_rate() {
        return igst_rate;
    }

    public void setIgst_rate(BigDecimal igst_rate) {
        this.igst_rate = igst_rate;
    }

    public Long getSold_qty() {
        return sold_qty;
    }

    public void setSold_qty(Long sold_qty) {
        this.sold_qty = sold_qty;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getFree_qty() {
        return free_qty;
    }

    public void setFree_qty(Long free_qty) {
        this.free_qty = free_qty;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getUom_id() {
        return uom_id;
    }

    public void setUom_id(String uom_id) {
        this.uom_id = uom_id;
    }

    public String getPack_id() {
        return pack_id;
    }

    public void setPack_id(String pack_id) {
        this.pack_id = pack_id;
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

    @Ignore
    private Long count;

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BigDecimal getPts_rate() {
        return pts_rate;
    }

    public void setPts_rate(BigDecimal pts_rate) {
        this.pts_rate = pts_rate;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_cd() {
        return prod_cd;
    }

    public void setProd_cd(String prod_cd) {
        this.prod_cd = prod_cd;
    }

    public String getCompany_cd() {
        return company_cd;
    }

    public void setCompany_cd(String company_cd) {
        this.company_cd = company_cd;
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

    public Long getDiv_id() {
        return div_id;
    }

    public void setDiv_id(Long div_id) {
        this.div_id = div_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getAlter_name() {
        return alter_name;
    }

    public void setAlter_name(String alter_name) {
        this.alter_name = alter_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSch_ind() {
        return sch_ind;
    }

    public void setSch_ind(String sch_ind) {
        this.sch_ind = sch_ind;
    }

    public String getExpiry_rq_ind_log() {
        return expiry_rq_ind_log;
    }

    public void setExpiry_rq_ind_log(String expiry_rq_ind_log) {
        this.expiry_rq_ind_log = expiry_rq_ind_log;
    }

    public String getEthical_ind_log() {
        return ethical_ind_log;
    }

    public void setEthical_ind_log(String ethical_ind_log) {
        this.ethical_ind_log = ethical_ind_log;
    }

    public String getBatch_rq_ind_log() {
        return batch_rq_ind_log;
    }

    public void setBatch_rq_ind_log(String batch_rq_ind_log) {
        this.batch_rq_ind_log = batch_rq_ind_log;
    }

    public Long getMin_ord_qty() {
        return min_ord_qty;
    }

    public void setMin_ord_qty(Long min_ord_qty) {
        this.min_ord_qty = min_ord_qty;
    }

    public String getOrder_multi_log() {
        return order_multi_log;
    }

    public void setOrder_multi_log(String order_multi_log) {
        this.order_multi_log = order_multi_log;
    }

    public Long getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(Long shelf_life) {
        this.shelf_life = shelf_life;
    }

    public BigDecimal getQty_box() {
        return qty_box;
    }

    public void setQty_box(BigDecimal qty_box) {
        this.qty_box = qty_box;
    }

    public BigDecimal getQty_strip() {
        return qty_strip;
    }

    public void setQty_strip(BigDecimal qty_strip) {
        this.qty_strip = qty_strip;
    }

    public BigDecimal getShipper_vol() {
        return shipper_vol;
    }

    public void setShipper_vol(BigDecimal shipper_vol) {
        this.shipper_vol = shipper_vol;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getAiocd() {
        return aiocd;
    }

    public void setAiocd(String aiocd) {
        this.aiocd = aiocd;
    }

    public Long getSku_type() {
        return sku_type;
    }

    public void setSku_type(Long sku_type) {
        this.sku_type = sku_type;
    }

    public String getSet_description() {
        return set_description;
    }

    public void setSet_description(String set_description) {
        this.set_description = set_description;
    }

    public BigDecimal getBasket_rate() {
        return basket_rate;
    }

    public void setBasket_rate(BigDecimal basket_rate) {
        this.basket_rate = basket_rate;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getProduct_monitor() {
        return product_monitor;
    }

    public void setProduct_monitor(String product_monitor) {
        this.product_monitor = product_monitor;
    }

    public String getHsn_code() {
        return hsn_code;
    }

    public void setHsn_code(String hsn_code) {
        this.hsn_code = hsn_code;
    }
}
