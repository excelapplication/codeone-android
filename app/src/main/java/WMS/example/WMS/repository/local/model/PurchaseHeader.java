package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class PurchaseHeader {

    private Long tran_id;

    private Long fin_year_id;

    private String principal_cocd;

    private String erp_party_code;

    private String accntg_cocd;

    private Long supplier_id;

    private String cfa_loc_code;

    private String tran_type;

    private String tran_no;

    private String ac_ccd;

    private String inv_type;

    private String inv_number;

    private String inv_date;

    private String pur_inv_number;

    private String pur_inv_date;

    private Long inv_tran_id;

    private Long credit_days;

    private String due_date;

    private String rec_date;

    private BigDecimal cashdisc_rt;

    private BigDecimal cashdisc_amt;

    private String printed;

    private BigDecimal goods_value;

    private BigDecimal pre_tax_amt;

    private BigDecimal taxable_amt;

    private BigDecimal invoice_value;

    private String destination;

    private String claim_num;

    private String claim_date;

    private String narration;

    private String claim_status;

    private BigDecimal claim_appr_value;

    private String erp_cn_number;

    private String erp_cn_date;
    private String road_permit;
    private String transporter;
    private String lr_num;
    private String lr_date;
    private String cases_shippers;
    private Long cases_loose;
    private BigDecimal party_disc_amt;
    private BigDecimal prod_disc_amt;
    private Long currency_id;
    private BigDecimal conv_rate;
    private BigDecimal conv_value;
    private BigDecimal sgst_bill_amt;
    private BigDecimal cgst_bill_amt;
    private BigDecimal igst_bill_amt;
    private String cancelled;
    private String last_mod_by;
    private String last_mod_dt;
    private Long grn_id;
    private String supplier_code;
    private String bill_number;
    private String bill_date;
    private String supp_inv_number;
    private String supp_inv_date;
    private Long grn_tran_id;
    private BigDecimal cess_amt;
    private BigDecimal freight_amt;
    private BigDecimal round_off_amt;
    private BigDecimal bill_value;
    private BigDecimal tcs_amount;

    public BigDecimal getTcs_amount() {
        return tcs_amount;
    }

    public void setTcs_amount(BigDecimal tcs_amount) {
        this.tcs_amount = tcs_amount;
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

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
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

    public String getPur_inv_number() {
        return pur_inv_number;
    }

    public void setPur_inv_number(String pur_inv_number) {
        this.pur_inv_number = pur_inv_number;
    }

    public String getPur_inv_date() {
        return pur_inv_date;
    }

    public void setPur_inv_date(String pur_inv_date) {
        this.pur_inv_date = pur_inv_date;
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

    public String getCases_shippers() {
        return cases_shippers;
    }

    public void setCases_shippers(String cases_shippers) {
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

    public Long getGrn_id() {
        return grn_id;
    }

    public void setGrn_id(Long grn_id) {
        this.grn_id = grn_id;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getBill_number() {
        return bill_number;
    }

    public void setBill_number(String bill_number) {
        this.bill_number = bill_number;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getSupp_inv_number() {
        return supp_inv_number;
    }

    public void setSupp_inv_number(String supp_inv_number) {
        this.supp_inv_number = supp_inv_number;
    }

    public String getSupp_inv_date() {
        return supp_inv_date;
    }

    public void setSupp_inv_date(String supp_inv_date) {
        this.supp_inv_date = supp_inv_date;
    }

    public Long getGrn_tran_id() {
        return grn_tran_id;
    }

    public void setGrn_tran_id(Long grn_tran_id) {
        this.grn_tran_id = grn_tran_id;
    }

    public BigDecimal getCess_amt() {
        return cess_amt;
    }

    public void setCess_amt(BigDecimal cess_amt) {
        this.cess_amt = cess_amt;
    }

    public BigDecimal getFreight_amt() {
        return freight_amt;
    }

    public void setFreight_amt(BigDecimal freight_amt) {
        this.freight_amt = freight_amt;
    }

    public BigDecimal getRound_off_amt() {
        return round_off_amt;
    }

    public void setRound_off_amt(BigDecimal round_off_amt) {
        this.round_off_amt = round_off_amt;
    }

    public BigDecimal getBill_value() {
        return bill_value;
    }

    public void setBill_value(BigDecimal bill_value) {
        this.bill_value = bill_value;
    }

    public PurchaseHeader() {
        bill_value = BigDecimal.ZERO;
        goods_value = BigDecimal.ZERO;
        invoice_value = BigDecimal.ZERO;
        cess_amt = BigDecimal.ZERO;
        igst_bill_amt = BigDecimal.ZERO;
        cgst_bill_amt = BigDecimal.ZERO;
        sgst_bill_amt = BigDecimal.ZERO;
        cashdisc_amt = BigDecimal.ZERO;
        cashdisc_rt = BigDecimal.ZERO;
        party_disc_amt = BigDecimal.ZERO;
        prod_disc_amt = BigDecimal.ZERO;
        taxable_amt = BigDecimal.ZERO;
        pre_tax_amt = BigDecimal.ZERO;
        freight_amt = BigDecimal.ZERO;
        round_off_amt = BigDecimal.ZERO;
        tcs_amount = BigDecimal.ZERO;

    }
}
