package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PRINCIPAL")
public class Principal {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "PRINCIPAL_ID")
    private Long principal_id;

    @ColumnInfo(name = "PRINCIPAL_NAME")
    private String principal_name;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "CFA_LOC_NAME")
    private String cfa_loc_name;

    @ColumnInfo(name = "SUPP_Address1")
    private String supp_address1;

    @ColumnInfo(name = "SUPP_Address2")
    private String supp_address2;

    @ColumnInfo(name = "SUPP_ADDRESS3")
    private String supp_address3;

    @ColumnInfo(name = "SUPP_PIN_CODE")
    private Long supp_pin_code;

    @ColumnInfo(name = "SUPP_City")
    private String supp_city;

    @ColumnInfo(name = "SUPP_State")
    private String supp_state;

    @ColumnInfo(name = "SUPP_PAN")
    private String supp_pan;

    @ColumnInfo(name = "SUPP_GSTNO")
    private String supp_gstno;

    @ColumnInfo(name = "SUPP_DLIC1")
    private String supp_dlic1;

    @ColumnInfo(name = "SUPP_DLIC2")
    private String supp_dlic2;

    @ColumnInfo(name = "SUPP_DLIC3")
    private String supp_dlic3;

    @ColumnInfo(name = "SUPP_CONTACTPERSON")
    private String supp_contactperson;

    @ColumnInfo(name = "SUPP_PHONE")
    private String supp_phone;

    @ColumnInfo(name = "SUPP_MOBILE")
    private String supp_mobile;

    @ColumnInfo(name = "SUPP_EMAIL")
    private String supp_email;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "CREDIT_LIMIT")
    private Long credit_limit;

    @ColumnInfo(name = "ERP_PARTY_CODE")
    private String erp_party_code;

    @ColumnInfo(name = "FIELD_STAFF_NAME")
    private String field_staff_name;

    @ColumnInfo(name = "FIELD_STAFF_MOBILE1")
    private String field_staff_mobile1;

    @ColumnInfo(name = "FIELD_STAFF_MOBILE2")
    private String field_staff_mobile2;

    @ColumnInfo(name = "SYNC_IP_PATH")
    private String sync_ip_path;

    @ColumnInfo(name = "DIV_NAME")
    private String div_name;

    @ColumnInfo(name = "MSR_NAME")
    private String msr_name;

    @ColumnInfo(name = "HQ_NAME")
    private String hq_name;

    @ColumnInfo(name = "AM_NAME")
    private String am_name;

    @ColumnInfo(name = "RM_NAME")
    private String rm_name;

    @ColumnInfo(name = "SYNC_FLAG")
    private String sync_flag;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

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

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Long principal_id) {
        this.principal_id = principal_id;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    public String getPrincipal_code() {
        return principal_code;
    }

    public void setPrincipal_code(String principal_code) {
        this.principal_code = principal_code;
    }

    public String getCfa_loc_code() {
        return cfa_loc_code;
    }

    public void setCfa_loc_code(String cfa_loc_code) {
        this.cfa_loc_code = cfa_loc_code;
    }

    public String getCfa_loc_name() {
        return cfa_loc_name;
    }

    public void setCfa_loc_name(String cfa_loc_name) {
        this.cfa_loc_name = cfa_loc_name;
    }

    public String getSupp_address1() {
        return supp_address1;
    }

    public void setSupp_address1(String supp_address1) {
        this.supp_address1 = supp_address1;
    }

    public String getSupp_address2() {
        return supp_address2;
    }

    public void setSupp_address2(String supp_address2) {
        this.supp_address2 = supp_address2;
    }

    public String getSupp_address3() {
        return supp_address3;
    }

    public void setSupp_address3(String supp_address3) {
        this.supp_address3 = supp_address3;
    }

    public Long getSupp_pin_code() {
        return supp_pin_code;
    }

    public void setSupp_pin_code(Long supp_pin_code) {
        this.supp_pin_code = supp_pin_code;
    }

    public String getSupp_city() {
        return supp_city;
    }

    public void setSupp_city(String supp_city) {
        this.supp_city = supp_city;
    }

    public String getSupp_state() {
        return supp_state;
    }

    public void setSupp_state(String supp_state) {
        this.supp_state = supp_state;
    }

    public String getSupp_pan() {
        return supp_pan;
    }

    public void setSupp_pan(String supp_pan) {
        this.supp_pan = supp_pan;
    }

    public String getSupp_gstno() {
        return supp_gstno;
    }

    public void setSupp_gstno(String supp_gstno) {
        this.supp_gstno = supp_gstno;
    }

    public String getSupp_dlic1() {
        return supp_dlic1;
    }

    public void setSupp_dlic1(String supp_dlic1) {
        this.supp_dlic1 = supp_dlic1;
    }

    public String getSupp_dlic2() {
        return supp_dlic2;
    }

    public void setSupp_dlic2(String supp_dlic2) {
        this.supp_dlic2 = supp_dlic2;
    }

    public String getSupp_dlic3() {
        return supp_dlic3;
    }

    public void setSupp_dlic3(String supp_dlic3) {
        this.supp_dlic3 = supp_dlic3;
    }

    public String getSupp_contactperson() {
        return supp_contactperson;
    }

    public void setSupp_contactperson(String supp_contactperson) {
        this.supp_contactperson = supp_contactperson;
    }

    public String getSupp_phone() {
        return supp_phone;
    }

    public void setSupp_phone(String supp_phone) {
        this.supp_phone = supp_phone;
    }

    public String getSupp_mobile() {
        return supp_mobile;
    }

    public void setSupp_mobile(String supp_mobile) {
        this.supp_mobile = supp_mobile;
    }

    public String getSupp_email() {
        return supp_email;
    }

    public void setSupp_email(String supp_email) {
        this.supp_email = supp_email;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public Long getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(Long credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
    }

    public String getField_staff_name() {
        return field_staff_name;
    }

    public void setField_staff_name(String field_staff_name) {
        this.field_staff_name = field_staff_name;
    }

    public String getField_staff_mobile1() {
        return field_staff_mobile1;
    }

    public void setField_staff_mobile1(String field_staff_mobile1) {
        this.field_staff_mobile1 = field_staff_mobile1;
    }

    public String getField_staff_mobile2() {
        return field_staff_mobile2;
    }

    public void setField_staff_mobile2(String field_staff_mobile2) {
        this.field_staff_mobile2 = field_staff_mobile2;
    }

    public String getSync_ip_path() {
        return sync_ip_path;
    }

    public void setSync_ip_path(String sync_ip_path) {
        this.sync_ip_path = sync_ip_path;
    }

    public String getDiv_name() {
        return div_name;
    }

    public void setDiv_name(String div_name) {
        this.div_name = div_name;
    }

    public String getMsr_name() {
        return msr_name;
    }

    public void setMsr_name(String msr_name) {
        this.msr_name = msr_name;
    }

    public String getHq_name() {
        return hq_name;
    }

    public void setHq_name(String hq_name) {
        this.hq_name = hq_name;
    }

    public String getAm_name() {
        return am_name;
    }

    public void setAm_name(String am_name) {
        this.am_name = am_name;
    }

    public String getRm_name() {
        return rm_name;
    }

    public void setRm_name(String rm_name) {
        this.rm_name = rm_name;
    }

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }
}
