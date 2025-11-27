package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SO_HDR")
public class SalesOrderHeader {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "ORD_ID")
    private Long ord_id;

    @ColumnInfo(name = "ORD_NO")
    private String ord_no;

    @ColumnInfo(name = "ORD_DT")
    private String ord_dt;

    @ColumnInfo(name = "ORD_PRINCIPAL_COCD")
    private String ord_principal_cocd;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "ORD_CUST_CODE")
    private String ord_cust_code;

    @ColumnInfo(name = "ORD_CREDIT_DAYS")
    private Long ord_credit_days;

    @ColumnInfo(name = "STATUS")
    private String status;

    @ColumnInfo(name = "ORD_VALUE")
    private BigDecimal ord_value;

    @ColumnInfo(name = "USER_ID")
    private String user_id;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name = "CUST_WALKIN_ID")
    private Long cust_walkin_id;

    @ColumnInfo(name = "SYNC")
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

    public Long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Long ord_id) {
        this.ord_id = ord_id;
    }

    public String getOrd_no() {
        return ord_no;
    }

    public void setOrd_no(String ord_no) {
        this.ord_no = ord_no;
    }

    public String getOrd_dt() {
        return ord_dt;
    }

    public void setOrd_dt(String ord_dt) {
        this.ord_dt = ord_dt;
    }

    public String getOrd_principal_cocd() {
        return ord_principal_cocd;
    }

    public void setOrd_principal_cocd(String ord_principal_cocd) {
        this.ord_principal_cocd = ord_principal_cocd;
    }

    public String getAccntg_cocd() {
        return accntg_cocd;
    }

    public void setAccntg_cocd(String accntg_cocd) {
        this.accntg_cocd = accntg_cocd;
    }

    public String getOrd_cust_code() {
        return ord_cust_code;
    }

    public void setOrd_cust_code(String ord_cust_code) {
        this.ord_cust_code = ord_cust_code;
    }

    public Long getOrd_credit_days() {
        return ord_credit_days;
    }

    public void setOrd_credit_days(Long ord_credit_days) {
        this.ord_credit_days = ord_credit_days;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getOrd_value() {
        return ord_value;
    }

    public void setOrd_value(BigDecimal ord_value) {
        this.ord_value = ord_value;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public Long getCust_walkin_id() {
        return cust_walkin_id;
    }

    public void setCust_walkin_id(Long cust_walkin_id) {
        this.cust_walkin_id = cust_walkin_id;
    }
}
