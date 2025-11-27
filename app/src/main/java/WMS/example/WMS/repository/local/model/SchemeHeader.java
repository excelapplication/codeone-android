package WMS.example.WMS.repository.local.model;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SCHEME_HEADER")
public class SchemeHeader {

    @PrimaryKey
    @ColumnInfo(name = "SCHEME_ID")
    private Long scheme_id;

    @ColumnInfo(name = "SCHEME_CODE")
    private String scheme_code;

    @ColumnInfo(name = "SCHEME_NAME")
    private String scheme_name;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "VALID_FROM_DT")
    private Date valid_from_dt;

    @ColumnInfo(name = "VALID_TO_DT")
    private Date valid_to_dt;

    @ColumnInfo(name = "SCH_TYPE_ID")
    private String sch_type_id;

    @ColumnInfo(name = "APPLICATION")
    private String application;

    @ColumnInfo(name = "ERP_PROD_CD")
    private String erp_prod_cd;

    @ColumnInfo(name = "PROD_CODE")
    private String prod_code;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "BATCH_ID")
    private Long batch_id;

    @ColumnInfo(name = "BATCH_NO")
    private String batch_no;

    @ColumnInfo(name = "CUSTOMER_ID")
    private Long customer_id;

    @ColumnInfo(name = "CUST_TYPE_ID")
    private Long cust_type_id;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    @ColumnInfo(name = "CANCELLED")
    private String cancelled;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

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

    public String getScheme_name() {
        return scheme_name;
    }

    public void setScheme_name(String scheme_name) {
        this.scheme_name = scheme_name;
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

    public Date getValid_from_dt() {
        return valid_from_dt;
    }

    public void setValid_from_dt(Date valid_from_dt) {
        this.valid_from_dt = valid_from_dt;
    }

    public Date getValid_to_dt() {
        return valid_to_dt;
    }

    public void setValid_to_dt(Date valid_to_dt) {
        this.valid_to_dt = valid_to_dt;
    }

    public String getSch_type_id() {
        return sch_type_id;
    }

    public void setSch_type_id(String sch_type_id) {
        this.sch_type_id = sch_type_id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getErp_prod_cd() {
        return erp_prod_cd;
    }

    public void setErp_prod_cd(String erp_prod_cd) {
        this.erp_prod_cd = erp_prod_cd;
    }

    public String getProd_code() {
        return prod_code;
    }

    public void setProd_code(String prod_code) {
        this.prod_code = prod_code;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public Long getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Long batch_id) {
        this.batch_id = batch_id;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getCust_type_id() {
        return cust_type_id;
    }

    public void setCust_type_id(Long cust_type_id) {
        this.cust_type_id = cust_type_id;
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

    public String getCancelled() {
        return cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
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
