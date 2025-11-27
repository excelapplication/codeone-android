package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CLAIM_DETAIL")
public class ClaimDetail {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "TRAN_SL_NO")
    private String tran_sl_no;

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

    @ColumnInfo(name = "CNDN_TYPE")
    private String cndn_type;

    @ColumnInfo(name = "CNDN_DATE")
    private Date cndn_date;

    @ColumnInfo(name = "PROD_CODE")
    private String prod_code;

    @ColumnInfo(name = "BATCH_ID")
    private String batch_id;

    @ColumnInfo(name = "STOCK_TYPE")
    private String stock_type;

    @ColumnInfo(name = "BILLED_QTY")
    private BigDecimal billed_qty;

    @ColumnInfo(name = "FREE_QTY")
    private BigDecimal free_qty;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

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

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "APPROVED_VAL")
    private BigDecimal approved_val;

    @ColumnInfo(name = "PARTY_DISC_RATE")
    private BigDecimal party_disc_rate;

    @ColumnInfo(name = "PARTY_DISC_AMT")
    private BigDecimal party_disc_amt;

    @ColumnInfo(name = "PROD_DISC_RATE")
    private BigDecimal prod_disc_rate;

    @ColumnInfo(name = "COMINATIONKEY")
    private Long cominationkey;

    @ColumnInfo(name = "CLAIM_STATUS")
    private String claim_status;

    @ColumnInfo(name = "ERP_CN_NUMBER")
    private String erp_cn_number;

    @ColumnInfo(name = "ERP_CN_DATE")
    private Date erp_cn_date;

    @ColumnInfo(name = "SGST_RATE")
    private BigDecimal sgst_rate;

    @ColumnInfo(name = "CGST_RATE")
    private BigDecimal cgst_rate;

    @ColumnInfo(name = "IGST_RATE")
    private BigDecimal igst_rate;

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

    public String getTran_sl_no() {
        return tran_sl_no;
    }

    public void setTran_sl_no(String tran_sl_no) {
        this.tran_sl_no = tran_sl_no;
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

    public String getCndn_type() {
        return cndn_type;
    }

    public void setCndn_type(String cndn_type) {
        this.cndn_type = cndn_type;
    }

    public Date getCndn_date() {
        return cndn_date;
    }

    public void setCndn_date(Date cndn_date) {
        this.cndn_date = cndn_date;
    }

    public String getProd_code() {
        return prod_code;
    }

    public void setProd_code(String prod_code) {
        this.prod_code = prod_code;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    public BigDecimal getBilled_qty() {
        return billed_qty;
    }

    public void setBilled_qty(BigDecimal billed_qty) {
        this.billed_qty = billed_qty;
    }

    public BigDecimal getFree_qty() {
        return free_qty;
    }

    public void setFree_qty(BigDecimal free_qty) {
        this.free_qty = free_qty;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public BigDecimal getApproved_val() {
        return approved_val;
    }

    public void setApproved_val(BigDecimal approved_val) {
        this.approved_val = approved_val;
    }

    public BigDecimal getParty_disc_rate() {
        return party_disc_rate;
    }

    public void setParty_disc_rate(BigDecimal party_disc_rate) {
        this.party_disc_rate = party_disc_rate;
    }

    public BigDecimal getParty_disc_amt() {
        return party_disc_amt;
    }

    public void setParty_disc_amt(BigDecimal party_disc_amt) {
        this.party_disc_amt = party_disc_amt;
    }

    public BigDecimal getProd_disc_rate() {
        return prod_disc_rate;
    }

    public void setProd_disc_rate(BigDecimal prod_disc_rate) {
        this.prod_disc_rate = prod_disc_rate;
    }

    public Long getCominationkey() {
        return cominationkey;
    }

    public void setCominationkey(Long cominationkey) {
        this.cominationkey = cominationkey;
    }

    public String getClaim_status() {
        return claim_status;
    }

    public void setClaim_status(String claim_status) {
        this.claim_status = claim_status;
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
