package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PURCH_CNDN_DTL")
public class PurchaseCnDnDtl {

    @PrimaryKey
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "PUR_DTL_ID")
    private Long pur_dtl_id;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

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

    @ColumnInfo(name = "CUST_ID")
    private Long cust_id;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "AC_CCD")
    private String ac_ccd;

    @ColumnInfo(name = "INV_TYPE")
    private String inv_type;

    @ColumnInfo(name = "INV_DATE")
    private String inv_date;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "BATCH_ID")
    private Long batch_id;

    @ColumnInfo(name = "STOCK_TYPE")
    private String stock_type;

    @ColumnInfo(name = "BILLED_QTY")
    private BigDecimal billed_qty;

    @ColumnInfo(name = "FREE_QTY")
    private BigDecimal free_qty;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "SCHM_ADJ_RATE")
    private BigDecimal schm_adj_rate;

    @ColumnInfo(name = "RTDIFF_OLDRATE")
    private BigDecimal rtdiff_oldrate;

    @ColumnInfo(name = "RTDIFF_NEWRATE")
    private BigDecimal rtdiff_newrate;

    @ColumnInfo(name = "GOODS_VALUE")
    private BigDecimal goods_value;

    @ColumnInfo(name = "TRD_DISC_AMT")
    private BigDecimal trd_disc_amt;

    @ColumnInfo(name = "PROD_DISC_AMT")
    private BigDecimal prod_disc_amt;

    @ColumnInfo(name = "SCHM_DISC_AMT")
    private BigDecimal schm_disc_amt;

    @ColumnInfo(name = "SCHM_DTL_ID")
    private Long schm_dtl_id;

    @ColumnInfo(name = "MRP")
    private BigDecimal mrp;

    @ColumnInfo(name = "CESS_RATE")
    private BigDecimal cess_rate;

    @ColumnInfo(name = "CESS_BILL_AMT")
    private BigDecimal cess_bill_amt;

    @ColumnInfo(name = "POST_GL_ID")
    private Long post_gl_id;

    @ColumnInfo(name = "POST_SL_ID")
    private Long post_sl_id;

    @ColumnInfo(name = "REASON_CODE")
    private String reason_code;

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "TAX_CAL")
    private String tax_cal;

    @ColumnInfo(name = "APPROVED_VAL")
    private BigDecimal approved_val;

    @ColumnInfo(name = "NEW_PRODUCT")
    private String new_product;

    @ColumnInfo(name = "INVOICE_VALUE")
    private BigDecimal invoice_value;

    @ColumnInfo(name = "SLNUMBER")
    private BigDecimal slnumber;

    @ColumnInfo(name = "INV_NUM")
    private String inv_num;

    @ColumnInfo(name = "PARTY_DISC_RATE")
    private BigDecimal party_disc_rate;

    @ColumnInfo(name = "PARTY_DISC_AMT")
    private BigDecimal party_disc_amt;

    @ColumnInfo(name = "PROD_DISC_RATE")
    private BigDecimal prod_disc_rate;

    @ColumnInfo(name = "COMINATIONKEY")
    private Long  cominationkey;

    @ColumnInfo(name = "CLAIM_NUM")
    private String claim_num;

    @ColumnInfo(name = "CLAIM_DATE")
    private String claim_date;

    @ColumnInfo(name = "CLAIM_STATUS")
    private String claim_status;

    @ColumnInfo(name = "CLAIM_APPR_VALUE")
    private BigDecimal claim_appr_value;

    @ColumnInfo(name = "ERP_CN_NUMBER")
    private String erp_cn_number;

    @ColumnInfo(name = "ERP_CN_DATE")
    private String erp_cn_date;

    @ColumnInfo(name = "TOT_RET_QTY")
    private BigDecimal tot_ret_qty;

    @ColumnInfo(name = "TRAN_MODE")
    private String tran_mode;

    @ColumnInfo(name = "BATCH_RATE")
    private BigDecimal batch_rate;

    @ColumnInfo(name = "RTDIFF_OLDMRP")
    private BigDecimal rtdiff_oldmrp;

    @ColumnInfo(name = "RTDIFF_NEWMRP")
    private BigDecimal rtdiff_newmrp;

    @ColumnInfo(name = "INVOICE_TYPE")
    private String invoice_type;

    @ColumnInfo(name = "SGST_RATE")
    private BigDecimal sgst_rate;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgst_bill_amt;

    @ColumnInfo(name = "CGST_RATE")
    private BigDecimal cgst_rate;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgst_bill_amt;

    @ColumnInfo(name = "IGST_RATE")
    private BigDecimal igst_rate;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igst_bill_amt;

    @ColumnInfo(name = "GST_DOC_TYPE")
    private String gst_doc_type;

    @ColumnInfo(name = "BATCH_NO")
    private String batch_no;

    @ColumnInfo(name = "NS_BATCH_ID")
    private Long ns_batch_id;

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

    public Long getHeader_pk() {
        return header_pk;
    }

    public void setHeader_pk(Long header_pk) {
        this.header_pk = header_pk;
    }

    public Long getPur_dtl_id() {
        return pur_dtl_id;
    }

    public void setPur_dtl_id(Long pur_dtl_id) {
        this.pur_dtl_id = pur_dtl_id;
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

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
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

    public String getInv_date() {
        return inv_date;
    }

    public void setInv_date(String inv_date) {
        this.inv_date = inv_date;
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

    public BigDecimal getSchm_adj_rate() {
        return schm_adj_rate;
    }

    public void setSchm_adj_rate(BigDecimal schm_adj_rate) {
        this.schm_adj_rate = schm_adj_rate;
    }

    public BigDecimal getRtdiff_oldrate() {
        return rtdiff_oldrate;
    }

    public void setRtdiff_oldrate(BigDecimal rtdiff_oldrate) {
        this.rtdiff_oldrate = rtdiff_oldrate;
    }

    public BigDecimal getRtdiff_newrate() {
        return rtdiff_newrate;
    }

    public void setRtdiff_newrate(BigDecimal rtdiff_newrate) {
        this.rtdiff_newrate = rtdiff_newrate;
    }

    public BigDecimal getGoods_value() {
        return goods_value;
    }

    public void setGoods_value(BigDecimal goods_value) {
        this.goods_value = goods_value;
    }

    public BigDecimal getTrd_disc_amt() {
        return trd_disc_amt;
    }

    public void setTrd_disc_amt(BigDecimal trd_disc_amt) {
        this.trd_disc_amt = trd_disc_amt;
    }

    public BigDecimal getProd_disc_amt() {
        return prod_disc_amt;
    }

    public void setProd_disc_amt(BigDecimal prod_disc_amt) {
        this.prod_disc_amt = prod_disc_amt;
    }

    public BigDecimal getSchm_disc_amt() {
        return schm_disc_amt;
    }

    public void setSchm_disc_amt(BigDecimal schm_disc_amt) {
        this.schm_disc_amt = schm_disc_amt;
    }

    public Long getSchm_dtl_id() {
        return schm_dtl_id;
    }

    public void setSchm_dtl_id(Long schm_dtl_id) {
        this.schm_dtl_id = schm_dtl_id;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getCess_rate() {
        return cess_rate;
    }

    public void setCess_rate(BigDecimal cess_rate) {
        this.cess_rate = cess_rate;
    }

    public BigDecimal getCess_bill_amt() {
        return cess_bill_amt;
    }

    public void setCess_bill_amt(BigDecimal cess_bill_amt) {
        this.cess_bill_amt = cess_bill_amt;
    }

    public Long getPost_gl_id() {
        return post_gl_id;
    }

    public void setPost_gl_id(Long post_gl_id) {
        this.post_gl_id = post_gl_id;
    }

    public Long getPost_sl_id() {
        return post_sl_id;
    }

    public void setPost_sl_id(Long post_sl_id) {
        this.post_sl_id = post_sl_id;
    }

    public String getReason_code() {
        return reason_code;
    }

    public void setReason_code(String reason_code) {
        this.reason_code = reason_code;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getTax_cal() {
        return tax_cal;
    }

    public void setTax_cal(String tax_cal) {
        this.tax_cal = tax_cal;
    }

    public BigDecimal getApproved_val() {
        return approved_val;
    }

    public void setApproved_val(BigDecimal approved_val) {
        this.approved_val = approved_val;
    }

    public String getNew_product() {
        return new_product;
    }

    public void setNew_product(String new_product) {
        this.new_product = new_product;
    }

    public BigDecimal getInvoice_value() {
        return invoice_value;
    }

    public void setInvoice_value(BigDecimal invoice_value) {
        this.invoice_value = invoice_value;
    }

    public BigDecimal getSlnumber() {
        return slnumber;
    }

    public void setSlnumber(BigDecimal slnumber) {
        this.slnumber = slnumber;
    }

    public String getInv_num() {
        return inv_num;
    }

    public void setInv_num(String inv_num) {
        this.inv_num = inv_num;
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

    public BigDecimal getTot_ret_qty() {
        return tot_ret_qty;
    }

    public void setTot_ret_qty(BigDecimal tot_ret_qty) {
        this.tot_ret_qty = tot_ret_qty;
    }

    public String getTran_mode() {
        return tran_mode;
    }

    public void setTran_mode(String tran_mode) {
        this.tran_mode = tran_mode;
    }

    public BigDecimal getBatch_rate() {
        return batch_rate;
    }

    public void setBatch_rate(BigDecimal batch_rate) {
        this.batch_rate = batch_rate;
    }

    public BigDecimal getRtdiff_oldmrp() {
        return rtdiff_oldmrp;
    }

    public void setRtdiff_oldmrp(BigDecimal rtdiff_oldmrp) {
        this.rtdiff_oldmrp = rtdiff_oldmrp;
    }

    public BigDecimal getRtdiff_newmrp() {
        return rtdiff_newmrp;
    }

    public void setRtdiff_newmrp(BigDecimal rtdiff_newmrp) {
        this.rtdiff_newmrp = rtdiff_newmrp;
    }

    public String getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(String invoice_type) {
        this.invoice_type = invoice_type;
    }

    public BigDecimal getSgst_rate() {
        return sgst_rate;
    }

    public void setSgst_rate(BigDecimal sgst_rate) {
        this.sgst_rate = sgst_rate;
    }

    public BigDecimal getSgst_bill_amt() {
        return sgst_bill_amt;
    }

    public void setSgst_bill_amt(BigDecimal sgst_bill_amt) {
        this.sgst_bill_amt = sgst_bill_amt;
    }

    public BigDecimal getCgst_rate() {
        return cgst_rate;
    }

    public void setCgst_rate(BigDecimal cgst_rate) {
        this.cgst_rate = cgst_rate;
    }

    public BigDecimal getCgst_bill_amt() {
        return cgst_bill_amt;
    }

    public void setCgst_bill_amt(BigDecimal cgst_bill_amt) {
        this.cgst_bill_amt = cgst_bill_amt;
    }

    public BigDecimal getIgst_rate() {
        return igst_rate;
    }

    public void setIgst_rate(BigDecimal igst_rate) {
        this.igst_rate = igst_rate;
    }

    public BigDecimal getIgst_bill_amt() {
        return igst_bill_amt;
    }

    public void setIgst_bill_amt(BigDecimal igst_bill_amt) {
        this.igst_bill_amt = igst_bill_amt;
    }

    public String getGst_doc_type() {
        return gst_doc_type;
    }

    public void setGst_doc_type(String gst_doc_type) {
        this.gst_doc_type = gst_doc_type;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public Long getNs_batch_id() {
        return ns_batch_id;
    }

    public void setNs_batch_id(Long ns_batch_id) {
        this.ns_batch_id = ns_batch_id;
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
