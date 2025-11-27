package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SKU_MASTER")
public class SKUMaster {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "MAIN_PROD_ID")
    private Long main_prod_id;

    @ColumnInfo(name = "PROD_CD")
    private String prod_cd;

    @ColumnInfo(name = "ERP_PROD_CD")
    private String erp_prod_cd;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "SKU_ID")
    private Long sku_id;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "MODEL_BATCH_NO")
    private String model_batch_no;

    @ColumnInfo(name = "SKU_TYPE")
    private String sku_type;

    @ColumnInfo(name = "QTY")
    private BigDecimal qty;

    @ColumnInfo(name = "UOM")
    private String uom;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "VALUE")
    private BigDecimal value;

    @ColumnInfo(name = "LOCAL_VALUE")
    private BigDecimal local_value;

    @ColumnInfo(name = "UPD_IND")
    private Long upd_ind;

    @ColumnInfo(name = "COUNTRY")
    private String country;

    @ColumnInfo(name = "CURRENCY")
    private String currency;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name ="SYNC")
    private String sync;

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getMain_prod_id() {
        return main_prod_id;
    }

    public void setMain_prod_id(Long main_prod_id) {
        this.main_prod_id = main_prod_id;
    }

    public String getProd_cd() {
        return prod_cd;
    }

    public void setProd_cd(String prod_cd) {
        this.prod_cd = prod_cd;
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

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getModel_batch_no() {
        return model_batch_no;
    }

    public void setModel_batch_no(String model_batch_no) {
        this.model_batch_no = model_batch_no;
    }

    public String getSku_type() {
        return sku_type;
    }

    public void setSku_type(String sku_type) {
        this.sku_type = sku_type;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getLocal_value() {
        return local_value;
    }

    public void setLocal_value(BigDecimal local_value) {
        this.local_value = local_value;
    }

    public Long getUpd_ind() {
        return upd_ind;
    }

    public void setUpd_ind(Long upd_ind) {
        this.upd_ind = upd_ind;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
