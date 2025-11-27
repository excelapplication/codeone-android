package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CLAIM_HDR")
public class ClaimHeader {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "CLAIM_NUMBER")
    private String claim_number;

    @ColumnInfo(name = "CLAIM_DATE")
    private Date claim_date;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "PARENT_COCD")
    private String parent_cocd;

    @ColumnInfo(name = "PARTY_CODE")
    private String party_code;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "INV_TYPE")
    private String inv_type;

    @ColumnInfo(name = "PURCH_RET_REF")
    private String purch_ret_ref;

    @ColumnInfo(name = "PURCH_RET_DATE")
    private Date purch_ret_date;

    @ColumnInfo(name = "REC_DATE")
    private Date rec_date;

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "CLAIM_STATUS")
    private String claim_status;

    @ColumnInfo(name = "CLAIM_APPR_VALUE")
    private BigDecimal claim_appr_value;

    @ColumnInfo(name = "ERP_CN_NUMBER")
    private String erp_cn_number;

    @ColumnInfo(name = "ERP_CN_DATE")
    private Date erp_cn_date;

    @ColumnInfo(name = "ERP_CN_GVAL")
    private BigDecimal erp_cn_gval;

    @ColumnInfo(name = "ERP_CN_VALUE")
    private BigDecimal erp_cn_value;

    @ColumnInfo(name = "ERP_DISC_VALUE")
    private BigDecimal erp_disc_value;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgst_bill_amt;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgst_bill_amt;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igst_bill_amt;

    @ColumnInfo(name = "CURRENCY_ID")
    private Long currency_id;

    @ColumnInfo(name = "CONV_RATE")
    private BigDecimal conv_rate;

    @ColumnInfo(name = "CONV_VALUE")
    private BigDecimal conv_value;

    @ColumnInfo(name = "CANCELLED")
    private String cancelled;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private Date last_mod_dt;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getTran_no() {
        return tran_no;
    }

    public void setTran_no(String tran_no) {
        this.tran_no = tran_no;
    }

    public String getClaim_number() {
        return claim_number;
    }

    public void setClaim_number(String claim_number) {
        this.claim_number = claim_number;
    }

    public Date getClaim_date() {
        return claim_date;
    }

    public void setClaim_date(Date claim_date) {
        this.claim_date = claim_date;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getParent_cocd() {
        return parent_cocd;
    }

    public void setParent_cocd(String parent_cocd) {
        this.parent_cocd = parent_cocd;
    }

    public String getParty_code() {
        return party_code;
    }

    public void setParty_code(String party_code) {
        this.party_code = party_code;
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

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public String getInv_type() {
        return inv_type;
    }

    public void setInv_type(String inv_type) {
        this.inv_type = inv_type;
    }

    public String getPurch_ret_ref() {
        return purch_ret_ref;
    }

    public void setPurch_ret_ref(String purch_ret_ref) {
        this.purch_ret_ref = purch_ret_ref;
    }

    public Date getPurch_ret_date() {
        return purch_ret_date;
    }

    public void setPurch_ret_date(Date purch_ret_date) {
        this.purch_ret_date = purch_ret_date;
    }

    public Date getRec_date() {
        return rec_date;
    }

    public void setRec_date(Date rec_date) {
        this.rec_date = rec_date;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getClaim_status() {
        return claim_status;
    }

    public void setClaim_status(String claim_status) {
        this.claim_status = claim_status;
    }

    public BigDecimal getClaim_appr_value() {
        return claim_appr_value;
    }

    public void setClaim_appr_value(BigDecimal claim_appr_value) {
        this.claim_appr_value = claim_appr_value;
    }

    public String getErp_cn_number() {
        return erp_cn_number;
    }

    public void setErp_cn_number(String erp_cn_number) {
        this.erp_cn_number = erp_cn_number;
    }

    public Date getErp_cn_date() {
        return erp_cn_date;
    }

    public void setErp_cn_date(Date erp_cn_date) {
        this.erp_cn_date = erp_cn_date;
    }

    public BigDecimal getErp_cn_gval() {
        return erp_cn_gval;
    }

    public void setErp_cn_gval(BigDecimal erp_cn_gval) {
        this.erp_cn_gval = erp_cn_gval;
    }

    public BigDecimal getErp_cn_value() {
        return erp_cn_value;
    }

    public void setErp_cn_value(BigDecimal erp_cn_value) {
        this.erp_cn_value = erp_cn_value;
    }

    public BigDecimal getErp_disc_value() {
        return erp_disc_value;
    }

    public void setErp_disc_value(BigDecimal erp_disc_value) {
        this.erp_disc_value = erp_disc_value;
    }

    public BigDecimal getSgst_bill_amt() {
        return sgst_bill_amt;
    }

    public void setSgst_bill_amt(BigDecimal sgst_bill_amt) {
        this.sgst_bill_amt = sgst_bill_amt;
    }

    public BigDecimal getCgst_bill_amt() {
        return cgst_bill_amt;
    }

    public void setCgst_bill_amt(BigDecimal cgst_bill_amt) {
        this.cgst_bill_amt = cgst_bill_amt;
    }

    public BigDecimal getIgst_bill_amt() {
        return igst_bill_amt;
    }

    public void setIgst_bill_amt(BigDecimal igst_bill_amt) {
        this.igst_bill_amt = igst_bill_amt;
    }

    public Long getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Long currency_id) {
        this.currency_id = currency_id;
    }

    public BigDecimal getConv_rate() {
        return conv_rate;
    }

    public void setConv_rate(BigDecimal conv_rate) {
        this.conv_rate = conv_rate;
    }

    public BigDecimal getConv_value() {
        return conv_value;
    }

    public void setConv_value(BigDecimal conv_value) {
        this.conv_value = conv_value;
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

    public Date getLast_mod_dt() {
        return last_mod_dt;
    }

    public void setLast_mod_dt(Date last_mod_dt) {
        this.last_mod_dt = last_mod_dt;
    }
}
