package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class DispatchDetail {

    private Long pk;
    private String last_mod_by;
    private String last_mod_dt;
    private Long batch_number;
    private String batch_no;
    private String expiry_dt;
    private String prodName;
    private int position;
    private Long prodId;

    private Long physical_stock;
    private Long dsp_dtl_id;
    private Long dsp_id;
    private Long finyear_id;
    private Long cust_id;
    private Long div_id;
    private String dsp_dt;
    private Long prod_code;
    private BigDecimal sold_qty;
    private BigDecimal free_qty;
    private BigDecimal repl_qty;
    private BigDecimal rate;
    private BigDecimal taxable_amt;
    private BigDecimal goods_value;
    private BigDecimal party_disc_rate;
    private BigDecimal party_disc_amt;
    private BigDecimal prod_disc_rate;
    private BigDecimal prod_disc_amt;
    private BigDecimal spl_cash_disc;
    private BigDecimal installation_charges;
    private BigDecimal invoice_value;
    private BigDecimal sgst_rate;
    private BigDecimal sgst_bill_amt;
    private BigDecimal cgst_rate;
    private BigDecimal cgst_bill_amt;
    private BigDecimal igst_rate;

    private BigDecimal igst_bill_amt;


    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public Long getPhysical_stock() {
        return physical_stock;
    }

    public void setPhysical_stock(Long physical_stock) {
        this.physical_stock = physical_stock;
    }

    public Long getBatch_number() {
        return batch_number;
    }

    public void setBatch_number(Long batch_number) {
        this.batch_number = batch_number;
    }

    public String getExpiry_dt() {
        return expiry_dt;
    }

    public void setExpiry_dt(String expiry_dt) {
        this.expiry_dt = expiry_dt;
    }

    public String getLast_mod_dt() {
        return last_mod_dt;
    }

    public void setLast_mod_dt(String last_mod_dt) {
        this.last_mod_dt = last_mod_dt;
    }

    public String getLast_mod_by() {
        return last_mod_by;
    }

    public void setLast_mod_by(String last_mod_by) {
        this.last_mod_by = last_mod_by;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getDsp_dtl_id() {
        return dsp_dtl_id;
    }

    public void setDsp_dtl_id(Long dsp_dtl_id) {
        this.dsp_dtl_id = dsp_dtl_id;
    }

    public Long getDsp_id() {
        return dsp_id;
    }

    public void setDsp_id(Long dsp_id) {
        this.dsp_id = dsp_id;
    }

    public Long getFinyear_id() {
        return finyear_id;
    }

    public void setFinyear_id(Long finyear_id) {
        this.finyear_id = finyear_id;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public Long getDiv_id() {
        return div_id;
    }

    public void setDiv_id(Long div_id) {
        this.div_id = div_id;
    }

    public String getDsp_dt() {
        return dsp_dt;
    }

    public void setDsp_dt(String dsp_dt) {
        this.dsp_dt = dsp_dt;
    }

    public Long getProd_code() {
        return prod_code;
    }

    public void setProd_code(Long prod_code) {
        this.prod_code = prod_code;
    }

    public BigDecimal getSold_qty() {
        return sold_qty;
    }

    public void setSold_qty(BigDecimal sold_qty) {
        this.sold_qty = sold_qty;
    }

    public BigDecimal getFree_qty() {
        return free_qty;
    }

    public void setFree_qty(BigDecimal free_qty) {
        this.free_qty = free_qty;
    }

    public BigDecimal getRepl_qty() {
        return repl_qty;
    }

    public void setRepl_qty(BigDecimal repl_qty) {
        this.repl_qty = repl_qty;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getTaxable_amt() {
        return taxable_amt;
    }

    public void setTaxable_amt(BigDecimal taxable_amt) {
        this.taxable_amt = taxable_amt;
    }

    public BigDecimal getGoods_value() {
        return goods_value;
    }

    public void setGoods_value(BigDecimal goods_value) {
        this.goods_value = goods_value;
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

    public BigDecimal getProd_disc_amt() {
        return prod_disc_amt;
    }

    public void setProd_disc_amt(BigDecimal prod_disc_amt) {
        this.prod_disc_amt = prod_disc_amt;
    }

    public BigDecimal getSpl_cash_disc() {
        return spl_cash_disc;
    }

    public void setSpl_cash_disc(BigDecimal spl_cash_disc) {
        this.spl_cash_disc = spl_cash_disc;
    }

    public BigDecimal getInstallation_charges() {
        return installation_charges;
    }

    public void setInstallation_charges(BigDecimal installation_charges) {
        this.installation_charges = installation_charges;
    }

    public BigDecimal getInvoice_value() {
        return invoice_value;
    }

    public void setInvoice_value(BigDecimal invoice_value) {
        this.invoice_value = invoice_value;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
