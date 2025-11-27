package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PURCH_CNDN_HDR")
public class PurchaseCndnHdr {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "PRINCIPAL_COCD")
    private String principal_cocd;

    @ColumnInfo(name = "ERP_PARTY_CODE")
    private String erp_party_code;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "AC_CCD")
    private String ac_ccd;

    @ColumnInfo(name = "INV_TYPE")
    private String inv_type;

    @ColumnInfo(name = "INV_NUMBER")
    private String inv_number;

    @ColumnInfo(name = "INV_DATE")
    private String inv_date;

    @ColumnInfo(name = "INV_TRAN_ID")
    private Long inv_tran_id;

    @ColumnInfo(name = "CREDIT_DAYS")
    private Long credit_days;

    @ColumnInfo(name = "DUE_DATE")
    private String due_date;

    @ColumnInfo(name = "REC_DATE")
    private String rec_date;

    @ColumnInfo(name = "CASHDISC_RT")
    private BigDecimal cashdisc_rt;

    @ColumnInfo(name = "CASHDISC_AMT")
    private BigDecimal cashdisc_amt;

    @ColumnInfo(name = "PRINTED")
    private String printed;

    @ColumnInfo(name = "GOODS_VALUE")
    private BigDecimal goods_value;

    @ColumnInfo(name = "PRE_TAX_AMT")
    private BigDecimal pre_tax_amt;

    @ColumnInfo(name = "TAXABLE_AMT")
    private BigDecimal taxable_amt;

    @ColumnInfo(name = "INVOICE_VALUE")
    private BigDecimal invoice_value;

    @ColumnInfo(name = "DESTINATION")
    private String destination;

    @ColumnInfo(name = "CLAIM_NUM")
    private String claim_num;

    @ColumnInfo(name = "CLAIM_DATE")
    private String claim_date;

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "CLAIM_STATUS")
    private String claim_status;

    @ColumnInfo(name = "CLAIM_APPR_VALUE")
    private BigDecimal claim_appr_value;

    @ColumnInfo(name = "ERP_CN_NUMBER")
    private String erp_cn_number;

    @ColumnInfo(name = "ERP_CN_DATE")
    private String erp_cn_date;

    @ColumnInfo(name = "ROAD_PERMIT")
    private String road_permit;

    @ColumnInfo(name = "TRANSPORTER")
    private String transporter;

    @ColumnInfo(name = "LR_NUM")
    private String lr_num;

    @ColumnInfo(name = "LR_DATE")
    private String lr_date;

    @ColumnInfo(name = "CASES_SHIPPERS")
    private Long cases_shippers;

    @ColumnInfo(name = "CASES_LOOSE")
    private Long cases_loose;

    @ColumnInfo(name = "PARTY_DISC_AMT")
    private BigDecimal party_disc_amt;

    @ColumnInfo(name = "PROD_DISC_AMT")
    private BigDecimal prod_disc_amt;

    @ColumnInfo(name = "CURRENCY_ID")
    private Long currency_id;

    @ColumnInfo(name = "CONV_RATE")
    private BigDecimal conv_rate;

    @ColumnInfo(name = "CONV_VALUE")
    private BigDecimal conv_value;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgst_bill_amt;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgst_bill_amt;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igst_bill_amt;

    @ColumnInfo(name = "CANCELLED")
    private String cancelled;

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

    public Long getTran_id() {
        return tran_id;
    }

    public void setTran_id(Long tran_id) {
        this.tran_id = tran_id;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getPrincipal_cocd() {
        return principal_cocd;
    }

    public void setPrincipal_cocd(String principal_cocd) {
        this.principal_cocd = principal_cocd;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
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

    public String getTran_no() {
        return tran_no;
    }

    public void setTran_no(String tran_no) {
        this.tran_no = tran_no;
    }

    public String getAc_ccd() {
        return ac_ccd;
    }

    public void setAc_ccd(String ac_ccd) {
        this.ac_ccd = ac_ccd;
    }

    public String getInv_type() {
        return inv_type;
    }

    public void setInv_type(String inv_type) {
        this.inv_type = inv_type;
    }

    public String getInv_number() {
        return inv_number;
    }

    public void setInv_number(String inv_number) {
        this.inv_number = inv_number;
    }

    public String getInv_date() {
        return inv_date;
    }

    public void setInv_date(String inv_date) {
        this.inv_date = inv_date;
    }

    public Long getInv_tran_id() {
        return inv_tran_id;
    }

    public void setInv_tran_id(Long inv_tran_id) {
        this.inv_tran_id = inv_tran_id;
    }

    public Long getCredit_days() {
        return credit_days;
    }

    public void setCredit_days(Long credit_days) {
        this.credit_days = credit_days;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getRec_date() {
        return rec_date;
    }

    public void setRec_date(String rec_date) {
        this.rec_date = rec_date;
    }

    public BigDecimal getCashdisc_rt() {
        return cashdisc_rt;
    }

    public void setCashdisc_rt(BigDecimal cashdisc_rt) {
        this.cashdisc_rt = cashdisc_rt;
    }

    public BigDecimal getCashdisc_amt() {
        return cashdisc_amt;
    }

    public void setCashdisc_amt(BigDecimal cashdisc_amt) {
        this.cashdisc_amt = cashdisc_amt;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
    }

    public BigDecimal getGoods_value() {
        return goods_value;
    }

    public void setGoods_value(BigDecimal goods_value) {
        this.goods_value = goods_value;
    }

    public BigDecimal getPre_tax_amt() {
        return pre_tax_amt;
    }

    public void setPre_tax_amt(BigDecimal pre_tax_amt) {
        this.pre_tax_amt = pre_tax_amt;
    }

    public BigDecimal getTaxable_amt() {
        return taxable_amt;
    }

    public void setTaxable_amt(BigDecimal taxable_amt) {
        this.taxable_amt = taxable_amt;
    }

    public BigDecimal getInvoice_value() {
        return invoice_value;
    }

    public void setInvoice_value(BigDecimal invoice_value) {
        this.invoice_value = invoice_value;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getClaim_num() {
        return claim_num;
    }

    public void setClaim_num(String claim_num) {
        this.claim_num = claim_num;
    }

    public String getClaim_date() {
        return claim_date;
    }

    public void setClaim_date(String claim_date) {
        this.claim_date = claim_date;
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

    public String getErp_cn_date() {
        return erp_cn_date;
    }

    public void setErp_cn_date(String erp_cn_date) {
        this.erp_cn_date = erp_cn_date;
    }

    public String getRoad_permit() {
        return road_permit;
    }

    public void setRoad_permit(String road_permit) {
        this.road_permit = road_permit;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public String getLr_num() {
        return lr_num;
    }

    public void setLr_num(String lr_num) {
        this.lr_num = lr_num;
    }

    public String getLr_date() {
        return lr_date;
    }

    public void setLr_date(String lr_date) {
        this.lr_date = lr_date;
    }

    public Long getCases_shippers() {
        return cases_shippers;
    }

    public void setCases_shippers(Long cases_shippers) {
        this.cases_shippers = cases_shippers;
    }

    public Long getCases_loose() {
        return cases_loose;
    }

    public void setCases_loose(Long cases_loose) {
        this.cases_loose = cases_loose;
    }

    public BigDecimal getParty_disc_amt() {
        return party_disc_amt;
    }

    public void setParty_disc_amt(BigDecimal party_disc_amt) {
        this.party_disc_amt = party_disc_amt;
    }

    public BigDecimal getProd_disc_amt() {
        return prod_disc_amt;
    }

    public void setProd_disc_amt(BigDecimal prod_disc_amt) {
        this.prod_disc_amt = prod_disc_amt;
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

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }
}
