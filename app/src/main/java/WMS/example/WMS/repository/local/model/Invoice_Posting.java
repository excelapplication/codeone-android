package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class Invoice_Posting {

    private String octroi_params;
    private BigDecimal goods_value;
    private BigDecimal party_discount;
    private BigDecimal prod_discount;
    private BigDecimal inward_charges;
    private BigDecimal oct_bef_tax;
    private BigDecimal excise;
    private BigDecimal vat_on_billed;
    private BigDecimal vat_on_free;
    private BigDecimal vat_on_repl;
    private BigDecimal cst;
    private BigDecimal surch_on_billed;
    private BigDecimal surch_on_free;
    private BigDecimal surch_on_repl;
    private BigDecimal cess_on_billed;
    private BigDecimal cess_on_free;
    private BigDecimal cess_on_repl;
    private BigDecimal turnover_tax;
    private BigDecimal octroi_refund;
    private BigDecimal octroi_charged;
    private BigDecimal non_refund_st;
    private BigDecimal cst_reimburse;
    private BigDecimal spl_cash_disc;
    private Long alloc_id;
    private BigDecimal curr_ivn_amt;
    private BigDecimal party_dis_rate;
    private BigDecimal prod_dis_rate;
    private BigDecimal inward_charges_rate;
    private BigDecimal octroi_flag;
    private BigDecimal octroi_rate;
    private BigDecimal vat_rate;
    private BigDecimal cst_rate;
    private BigDecimal surch_rate;
    private BigDecimal cess_rate;
    private BigDecimal trun_over_tax_rate;
    private BigDecimal freight;
    private BigDecimal roundoff;
    private BigDecimal taxable_amt_billed;
    private BigDecimal taxable_amt_free;

    // newly added for GST
    private BigDecimal cgst_rate;
    private BigDecimal cgst_bill_amount;
    private BigDecimal sgst_rate;
    private BigDecimal sgst_bill_amount;
    private BigDecimal igst_rate;
    private BigDecimal igst_bill_amount;
    private String gst_doc_type;

    public String getOctroi_params() {
        return octroi_params;
    }

    public void setOctroi_params(String octroi_params) {
        this.octroi_params = octroi_params;
    }

    public BigDecimal getGoods_value() {
        return goods_value;
    }

    public void setGoods_value(BigDecimal goods_value) {
        this.goods_value = goods_value;
    }

    public BigDecimal getParty_discount() {
        return party_discount;
    }

    public void setParty_discount(BigDecimal party_discount) {
        this.party_discount = party_discount;
    }

    public BigDecimal getProd_discount() {
        return prod_discount;
    }

    public void setProd_discount(BigDecimal prod_discount) {
        this.prod_discount = prod_discount;
    }

    public BigDecimal getInward_charges() {
        return inward_charges;
    }

    public void setInward_charges(BigDecimal inward_charges) {
        this.inward_charges = inward_charges;
    }

    public BigDecimal getOct_bef_tax() {
        return oct_bef_tax;
    }

    public void setOct_bef_tax(BigDecimal oct_bef_tax) {
        this.oct_bef_tax = oct_bef_tax;
    }

    public BigDecimal getExcise() {
        return excise;
    }

    public void setExcise(BigDecimal excise) {
        this.excise = excise;
    }

    public BigDecimal getVat_on_billed() {
        return vat_on_billed;
    }

    public void setVat_on_billed(BigDecimal vat_on_billed) {
        this.vat_on_billed = vat_on_billed;
    }

    public BigDecimal getVat_on_free() {
        return vat_on_free;
    }

    public void setVat_on_free(BigDecimal vat_on_free) {
        this.vat_on_free = vat_on_free;
    }

    public BigDecimal getVat_on_repl() {
        return vat_on_repl;
    }

    public void setVat_on_repl(BigDecimal vat_on_repl) {
        this.vat_on_repl = vat_on_repl;
    }

    public BigDecimal getCst() {
        return cst;
    }

    public void setCst(BigDecimal cst) {
        this.cst = cst;
    }

    public BigDecimal getSurch_on_billed() {
        return surch_on_billed;
    }

    public void setSurch_on_billed(BigDecimal surch_on_billed) {
        this.surch_on_billed = surch_on_billed;
    }

    public BigDecimal getSurch_on_free() {
        return surch_on_free;
    }

    public void setSurch_on_free(BigDecimal surch_on_free) {
        this.surch_on_free = surch_on_free;
    }

    public BigDecimal getSurch_on_repl() {
        return surch_on_repl;
    }

    public void setSurch_on_repl(BigDecimal surch_on_repl) {
        this.surch_on_repl = surch_on_repl;
    }

    public BigDecimal getCess_on_billed() {
        return cess_on_billed;
    }

    public void setCess_on_billed(BigDecimal cess_on_billed) {
        this.cess_on_billed = cess_on_billed;
    }

    public BigDecimal getCess_on_free() {
        return cess_on_free;
    }

    public void setCess_on_free(BigDecimal cess_on_free) {
        this.cess_on_free = cess_on_free;
    }

    public BigDecimal getCess_on_repl() {
        return cess_on_repl;
    }

    public void setCess_on_repl(BigDecimal cess_on_repl) {
        this.cess_on_repl = cess_on_repl;
    }

    public BigDecimal getTurnover_tax() {
        return turnover_tax;
    }

    public void setTurnover_tax(BigDecimal turnover_tax) {
        this.turnover_tax = turnover_tax;
    }

    public BigDecimal getOctroi_refund() {
        return octroi_refund;
    }

    public void setOctroi_refund(BigDecimal octroi_refund) {
        this.octroi_refund = octroi_refund;
    }

    public BigDecimal getOctroi_charged() {
        return octroi_charged;
    }

    public void setOctroi_charged(BigDecimal octroi_charged) {
        this.octroi_charged = octroi_charged;
    }

    public BigDecimal getNon_refund_st() {
        return non_refund_st;
    }

    public void setNon_refund_st(BigDecimal non_refund_st) {
        this.non_refund_st = non_refund_st;
    }

    public BigDecimal getCst_reimburse() {
        return cst_reimburse;
    }

    public void setCst_reimburse(BigDecimal cst_reimburse) {
        this.cst_reimburse = cst_reimburse;
    }

    public BigDecimal getSpl_cash_disc() {
        return spl_cash_disc;
    }

    public void setSpl_cash_disc(BigDecimal spl_cash_disc) {
        this.spl_cash_disc = spl_cash_disc;
    }

    public Long getAlloc_id() {
        return alloc_id;
    }

    public void setAlloc_id(Long alloc_id) {
        this.alloc_id = alloc_id;
    }

    public BigDecimal getCurr_ivn_amt() {
        return curr_ivn_amt;
    }

    public void setCurr_ivn_amt(BigDecimal curr_ivn_amt) {
        this.curr_ivn_amt = curr_ivn_amt;
    }

    public BigDecimal getParty_dis_rate() {
        return party_dis_rate;
    }

    public void setParty_dis_rate(BigDecimal party_dis_rate) {
        this.party_dis_rate = party_dis_rate;
    }

    public BigDecimal getProd_dis_rate() {
        return prod_dis_rate;
    }

    public void setProd_dis_rate(BigDecimal prod_dis_rate) {
        this.prod_dis_rate = prod_dis_rate;
    }

    public BigDecimal getInward_charges_rate() {
        return inward_charges_rate;
    }

    public void setInward_charges_rate(BigDecimal inward_charges_rate) {
        this.inward_charges_rate = inward_charges_rate;
    }

    public BigDecimal getOctroi_flag() {
        return octroi_flag;
    }

    public void setOctroi_flag(BigDecimal octroi_flag) {
        this.octroi_flag = octroi_flag;
    }

    public BigDecimal getOctroi_rate() {
        return octroi_rate;
    }

    public void setOctroi_rate(BigDecimal octroi_rate) {
        this.octroi_rate = octroi_rate;
    }

    public BigDecimal getVat_rate() {
        return vat_rate;
    }

    public void setVat_rate(BigDecimal vat_rate) {
        this.vat_rate = vat_rate;
    }

    public BigDecimal getCst_rate() {
        return cst_rate;
    }

    public void setCst_rate(BigDecimal cst_rate) {
        this.cst_rate = cst_rate;
    }

    public BigDecimal getSurch_rate() {
        return surch_rate;
    }

    public void setSurch_rate(BigDecimal surch_rate) {
        this.surch_rate = surch_rate;
    }

    public BigDecimal getCess_rate() {
        return cess_rate;
    }

    public void setCess_rate(BigDecimal cess_rate) {
        this.cess_rate = cess_rate;
    }

    public BigDecimal getTrun_over_tax_rate() {
        return trun_over_tax_rate;
    }

    public void setTrun_over_tax_rate(BigDecimal trun_over_tax_rate) {
        this.trun_over_tax_rate = trun_over_tax_rate;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getRoundoff() {
        return roundoff;
    }

    public void setRoundoff(BigDecimal roundoff) {
        this.roundoff = roundoff;
    }

    public BigDecimal getTaxable_amt_billed() {
        return taxable_amt_billed;
    }

    public void setTaxable_amt_billed(BigDecimal taxable_amt_billed) {
        this.taxable_amt_billed = taxable_amt_billed;
    }

    public BigDecimal getTaxable_amt_free() {
        return taxable_amt_free;
    }

    public void setTaxable_amt_free(BigDecimal taxable_amt_free) {
        this.taxable_amt_free = taxable_amt_free;
    }

    public BigDecimal getCgst_rate() {
        return cgst_rate;
    }

    public void setCgst_rate(BigDecimal cgst_rate) {
        this.cgst_rate = cgst_rate;
    }

    public BigDecimal getCgst_bill_amount() {
        return cgst_bill_amount;
    }

    public void setCgst_bill_amount(BigDecimal cgst_bill_amount) {
        this.cgst_bill_amount = cgst_bill_amount;
    }

    public BigDecimal getSgst_rate() {
        return sgst_rate;
    }

    public void setSgst_rate(BigDecimal sgst_rate) {
        this.sgst_rate = sgst_rate;
    }

    public BigDecimal getSgst_bill_amount() {
        return sgst_bill_amount;
    }

    public void setSgst_bill_amount(BigDecimal sgst_bill_amount) {
        this.sgst_bill_amount = sgst_bill_amount;
    }

    public BigDecimal getIgst_rate() {
        return igst_rate;
    }

    public void setIgst_rate(BigDecimal igst_rate) {
        this.igst_rate = igst_rate;
    }

    public BigDecimal getIgst_bill_amount() {
        return igst_bill_amount;
    }

    public void setIgst_bill_amount(BigDecimal igst_bill_amount) {
        this.igst_bill_amount = igst_bill_amount;
    }

    public String getGst_doc_type() {
        return gst_doc_type;
    }

    public void setGst_doc_type(String gst_doc_type) {
        this.gst_doc_type = gst_doc_type;
    }
}
