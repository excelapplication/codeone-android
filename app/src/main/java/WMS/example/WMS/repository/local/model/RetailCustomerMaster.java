package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Retail_Cust")
public class RetailCustomerMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "CUST_ID")
    private Long cust_id;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "CITY_Name")
    private String city_name;

    @ColumnInfo(name = "TRANSPORTER")
    private String transporter;

    @ColumnInfo(name = "STATE_ID")
    private Long state_id;

    @ColumnInfo(name = "DL1_VALID_DT")
    private String dl1_valid_dt;

    @ColumnInfo(name = "DL2_VALID_DT")
    private String dl2_valid_dt;

    @ColumnInfo(name = "DL3_VALID_DT")
    private String dl3_valid_dt;

    @ColumnInfo(name = "TOT_CREDIT_LMT")
    private BigDecimal tot_credit_lmt;

    @ColumnInfo(name = "DELETED")
    private String deleted;

    @ColumnInfo(name = "CUST_CD")
    private String cust_cd;

    @ColumnInfo(name = "CUST_NAME")
    private String cust_name;

    @ColumnInfo(name = "SHORT_NAME")
    private String short_name;

    @ColumnInfo(name = "ADDR1")
    private String addr1;

    @ColumnInfo(name = "ADDR2")
    private String addr2;

    @ColumnInfo(name = "ADDR3")
    private String addr3;

    @ColumnInfo(name = "ADDR4")
    private String addr4;

    @ColumnInfo(name = "PIN_CODE")
    private Long pin_code;

    @ColumnInfo(name = "GSTIN_NO")
    private String gstin_no;

    @ColumnInfo(name = "GSTIN_VALID_FROM")
    private String gstin_valid_from;

    @ColumnInfo(name = "GSTIN_VALID_TO")
    private String gstin_valid_to;

    @ColumnInfo(name = "DRUG_LIC1")
    private String drug_lic1;

    @ColumnInfo(name = "DRUG_LIC2")
    private String drug_lic2;

    @ColumnInfo(name = "DRUG_LIC3")
    private String drug_lic3;

    @ColumnInfo(name = "PAN_NO")
    private String pan_no;

    @ColumnInfo(name = "BANK_NAME")
    private String bank_name;

    @ColumnInfo(name = "BANK_ADDR1")
    private String bank_addr1;

    @ColumnInfo(name = "BANK_ADDR2")
    private String bank_addr2;

    @ColumnInfo(name = "BANK_ADDR3")
    private String bank_addr3;

    @ColumnInfo(name = "TEL_NO")
    private String tel_no;

    @ColumnInfo(name = "MOBILE")
    private String mobile;

    @ColumnInfo(name = "EMAIL")
    private String email;

    @ColumnInfo(name = "ERP_CUST_CD")
    private String erp_cust_cd;

    @ColumnInfo(name = "PAY_MODE")
    private String pay_mode;

    @ColumnInfo(name = "AIOCD")
    private String aiocd;

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "WALK_IN")
    private String walk_in;

    @ColumnInfo(name = "CONTACT_PERSON")
    private String contact_person;

    @ColumnInfo(name = "CASH_DISC_PERC")
    private BigDecimal cash_disc_perc;

    @ColumnInfo(name = "CREDIT_DAYS")
    private Long credit_days;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name = "SYNC_FLAG")
    private String sync_flag;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public Long getState_id() {
        return state_id;
    }

    public void setState_id(Long state_id) {
        this.state_id = state_id;
    }

    public String getDl1_valid_dt() {
        return dl1_valid_dt;
    }

    public void setDl1_valid_dt(String dl1_valid_dt) {
        this.dl1_valid_dt = dl1_valid_dt;
    }

    public String getDl2_valid_dt() {
        return dl2_valid_dt;
    }

    public void setDl2_valid_dt(String dl2_valid_dt) {
        this.dl2_valid_dt = dl2_valid_dt;
    }

    public String getDl3_valid_dt() {
        return dl3_valid_dt;
    }

    public void setDl3_valid_dt(String dl3_valid_dt) {
        this.dl3_valid_dt = dl3_valid_dt;
    }

    public BigDecimal getTot_credit_lmt() {
        return tot_credit_lmt;
    }

    public void setTot_credit_lmt(BigDecimal tot_credit_lmt) {
        this.tot_credit_lmt = tot_credit_lmt;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getCust_cd() {
        return cust_cd;
    }

    public void setCust_cd(String cust_cd) {
        this.cust_cd = cust_cd;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }

    public String getAddr4() {
        return addr4;
    }

    public void setAddr4(String addr4) {
        this.addr4 = addr4;
    }

    public Long getPin_code() {
        return pin_code;
    }

    public void setPin_code(Long pin_code) {
        this.pin_code = pin_code;
    }

    public String getGstin_no() {
        return gstin_no;
    }

    public void setGstin_no(String gstin_no) {
        this.gstin_no = gstin_no;
    }

    public String getGstin_valid_from() {
        return gstin_valid_from;
    }

    public void setGstin_valid_from(String gstin_valid_from) {
        this.gstin_valid_from = gstin_valid_from;
    }

    public String getGstin_valid_to() {
        return gstin_valid_to;
    }

    public void setGstin_valid_to(String gstin_valid_to) {
        this.gstin_valid_to = gstin_valid_to;
    }

    public String getDrug_lic1() {
        return drug_lic1;
    }

    public void setDrug_lic1(String drug_lic1) {
        this.drug_lic1 = drug_lic1;
    }

    public String getDrug_lic2() {
        return drug_lic2;
    }

    public void setDrug_lic2(String drug_lic2) {
        this.drug_lic2 = drug_lic2;
    }

    public String getDrug_lic3() {
        return drug_lic3;
    }

    public void setDrug_lic3(String drug_lic3) {
        this.drug_lic3 = drug_lic3;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_addr1() {
        return bank_addr1;
    }

    public void setBank_addr1(String bank_addr1) {
        this.bank_addr1 = bank_addr1;
    }

    public String getBank_addr2() {
        return bank_addr2;
    }

    public void setBank_addr2(String bank_addr2) {
        this.bank_addr2 = bank_addr2;
    }

    public String getBank_addr3() {
        return bank_addr3;
    }

    public void setBank_addr3(String bank_addr3) {
        this.bank_addr3 = bank_addr3;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getErp_cust_cd() {
        return erp_cust_cd;
    }

    public void setErp_cust_cd(String erp_cust_cd) {
        this.erp_cust_cd = erp_cust_cd;
    }

    public String getPay_mode() {
        return pay_mode;
    }

    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    public String getAiocd() {
        return aiocd;
    }

    public void setAiocd(String aiocd) {
        this.aiocd = aiocd;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getWalk_in() {
        return walk_in;
    }

    public void setWalk_in(String walk_in) {
        this.walk_in = walk_in;
    }

    public Long getCredit_days() {
        return credit_days;
    }

    public void setCredit_days(Long credit_days) {
        this.credit_days = credit_days;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public BigDecimal getCash_disc_perc() {
        return cash_disc_perc;
    }

    public void setCash_disc_perc(BigDecimal cash_disc_perc) {
        this.cash_disc_perc = cash_disc_perc;
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

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }
}
