package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PO_HDR")
public class PurchaseOrderHeader {

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

    @ColumnInfo(name = "ORD_ERP_PARTY_CODE")
    private String erp_party_code;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "ORD_TERMS")
    private Long ord_terms;

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

    public String getAccntg_cocd() {
        return accntg_cocd;
    }

    public void setAccntg_cocd(String accntg_cocd) {
        this.accntg_cocd = accntg_cocd;
    }

    public String getCfa_loc_code() {
        return cfa_loc_code;
    }

    public void setCfa_loc_code(String cfa_loc_code) {
        this.cfa_loc_code = cfa_loc_code;
    }

    public Long getOrd_terms() {
        return ord_terms;
    }

    public void setOrd_terms(Long ord_terms) {
        this.ord_terms = ord_terms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrd_principal_cocd() {
        return ord_principal_cocd;
    }

    public void setOrd_principal_cocd(String ord_principal_cocd) {
        this.ord_principal_cocd = ord_principal_cocd;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
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

    public String getOrd_dt() {
        return ord_dt;
    }

    public void setOrd_dt(String ord_dt) {
        this.ord_dt = ord_dt;
    }

    public String getLast_mod_dt() {
        return last_mod_dt;
    }

    public void setLast_mod_dt(String last_mod_dt) {
        this.last_mod_dt = last_mod_dt;
    }
}
