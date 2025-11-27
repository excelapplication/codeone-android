package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class PurchaseDetail {

    private Long pur_dtl_id;

    private Long tran_id;

    private Long fin_year_id;

    private String parent_cocd;

    private String party_code;

    private String accntg_cocd;

    private String cfa_loc_code;

    private String tran_type;

    private String tran_no;

    private String ac_ccd;

    private String inv_type;

    private String inv_date;

    private Long cust_id;

    private Long prod_id;

    private Long batch_id;

    private String stock_type;

    private BigDecimal billed_qty;

    private BigDecimal free_qty;

    private BigDecimal rate;

    private BigDecimal schm_adj_rate;

    private BigDecimal rtdiff_newrate;

    private BigDecimal rtdiff_oldrate;

    private BigDecimal goods_value;

    private BigDecimal trd_disc_amt;

    private BigDecimal prod_disc_amt;

    private BigDecimal schm_disc_amt;

    private Long schm_dtl_id;

    private BigDecimal mrp;

    private BigDecimal cess_rate;

    private BigDecimal cess_bill_amt;

    private Long post_gl_id;

    private Long post_sl_id;

    private String reason_code;

    private String narration;

    private String tax_cal;

    private BigDecimal approved_val;

    private String new_product;

    private BigDecimal invoice_value;

    private Long slnumber;

    private String inv_num;

    private BigDecimal party_disc_rate;

    private BigDecimal prod_disc_rate;

    private String combinationkey;

    private String claim_num;

    private String claim_date;

    private String erp_narration;

    private String claim_status;

    private Long claim_appr_value;

    private String erp_cn_number;

    private String erp_cn_date;

    private BigDecimal tot_ret_qty;

    private String tran_mode;

    private BigDecimal batch_rate;

    private BigDecimal rtdiff_newmrp;

    private BigDecimal rtdiff_oldmrp;

    private String invoice_type;

    private BigDecimal sgst_rate;

    private BigDecimal sgst_bill_amt;

    private BigDecimal cgst_rate;

    private BigDecimal cgst_bill_amt;

    private BigDecimal igst_rate;

    private BigDecimal igst_bill_amt;

    private String gst_doc_type;

    private String batch_no;

    private Long ns_batch_id;

    private String last_mod_by;

    private String last_mod_dt;

    private Long grn_id;

    private String grn_dt;

    private String supplier_code;

    private String erp_party_code;

    private Long grn_dtl_id;


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

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
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

    public BigDecimal getRtdiff_newrate() {
        return rtdiff_newrate;
    }

    public void setRtdiff_newrate(BigDecimal rtdiff_newrate) {
        this.rtdiff_newrate = rtdiff_newrate;
    }

    public BigDecimal getRtdiff_oldrate() {
        return rtdiff_oldrate;
    }

    public void setRtdiff_oldrate(BigDecimal rtdiff_oldrate) {
        this.rtdiff_oldrate = rtdiff_oldrate;
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

    public Long getSlnumber() {
        return slnumber;
    }

    public void setSlnumber(Long slnumber) {
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

    public BigDecimal getProd_disc_rate() {
        return prod_disc_rate;
    }

    public void setProd_disc_rate(BigDecimal prod_disc_rate) {
        this.prod_disc_rate = prod_disc_rate;
    }

    public String getCombinationkey() {
        return combinationkey;
    }

    public void setCombinationkey(String combinationkey) {
        this.combinationkey = combinationkey;
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

    public String getErp_narration() {
        return erp_narration;
    }

    public void setErp_narration(String erp_narration) {
        this.erp_narration = erp_narration;
    }

    public String getClaim_status() {
        return claim_status;
    }

    public void setClaim_status(String claim_status) {
        this.claim_status = claim_status;
    }

    public Long getClaim_appr_value() {
        return claim_appr_value;
    }

    public void setClaim_appr_value(Long claim_appr_value) {
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

    public BigDecimal getRtdiff_newmrp() {
        return rtdiff_newmrp;
    }

    public void setRtdiff_newmrp(BigDecimal rtdiff_newmrp) {
        this.rtdiff_newmrp = rtdiff_newmrp;
    }

    public BigDecimal getRtdiff_oldmrp() {
        return rtdiff_oldmrp;
    }

    public void setRtdiff_oldmrp(BigDecimal rtdiff_oldmrp) {
        this.rtdiff_oldmrp = rtdiff_oldmrp;
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

    public Long getGrn_id() {
        return grn_id;
    }

    public void setGrn_id(Long grn_id) {
        this.grn_id = grn_id;
    }

    public String getGrn_dt() {
        return grn_dt;
    }

    public void setGrn_dt(String grn_dt) {
        this.grn_dt = grn_dt;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
    }

    public Long getGrn_dtl_id() {
        return grn_dtl_id;
    }

    public void setGrn_dtl_id(Long grn_dtl_id) {
        this.grn_dtl_id = grn_dtl_id;
    }
}
