package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "INTRANSIT_DTL")
public class InTransitGRNDetail {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "DSP_DTL_ID")
    private Long dsp_dtl_id;

    @ColumnInfo(name = "DSP_ID")
    private Long dsp_id;

    @ColumnInfo(name = "FINYEAR_ID")
    private Long finyear_id;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "ERP_CUST_CODE")
    private String erp_cust_code;

    @ColumnInfo(name = "DSP_DT")
    private Date dsp_dt;

    @ColumnInfo(name = "PROD_CODE")
    private String prod_code;

    @ColumnInfo(name = "BATCH_Number")
    private String batch_number;

    @ColumnInfo(name = "Batch_Expiry")
    private Date batch_expiry;

    @ColumnInfo(name = "BATCH_MFGDT")
    private Date batch_mfgdt;

    @ColumnInfo(name = "BATCH_MRP")
    private BigDecimal batch_mrp;

    @ColumnInfo(name = "BATCH_PTS")
    private BigDecimal batch_pts;

    @ColumnInfo(name = "BATCH_PTR")
    private BigDecimal batch_ptr;

    @ColumnInfo(name = "SOLD_QTY")
    private BigDecimal sold_qty;

    @ColumnInfo(name = "FREE_QTY")
    private BigDecimal free_qty;

    @ColumnInfo(name = "REPL_QTY")
    private BigDecimal repl_qty;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "TAXABLE_AMT")
    private BigDecimal taxable_amt;

    @ColumnInfo(name = "GOODS_VALUE")
    private BigDecimal goods_value;

    @ColumnInfo(name = "PARTY_DISC_RATE")
    private BigDecimal party_disc_rate;

    @ColumnInfo(name = "PARTY_DISC_AMT")
    private BigDecimal party_disc_amt;

    @ColumnInfo(name = "PROD_DISC_RATE")
    private BigDecimal prod_disc_rate;

    @ColumnInfo(name = "PROD_DISC_AMT")
    private BigDecimal prod_disc_amt;

    @ColumnInfo(name = "SPL_CASH_DISC")
    private BigDecimal spl_cash_disc;

    @ColumnInfo(name = "INSTALLATION_CHARGES")
    private BigDecimal installation_charges;

    @ColumnInfo(name = "INVOICE_VALUE")
    private BigDecimal invoice_value;

    @ColumnInfo(name = "ADDL_SCHM_QTY")
    private BigDecimal addl_schm_qty;

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

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @Ignore
    private String productname;

    @Ignore
    private Long prod_id;

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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

    public String getCfa_loc_code() {
        return cfa_loc_code;
    }

    public void setCfa_loc_code(String cfa_loc_code) {
        this.cfa_loc_code = cfa_loc_code;
    }

    public String getErp_cust_code() {
        return erp_cust_code;
    }

    public void setErp_cust_code(String erp_cust_code) {
        this.erp_cust_code = erp_cust_code;
    }

    public Date getDsp_dt() {
        return dsp_dt;
    }

    public void setDsp_dt(Date dsp_dt) {
        this.dsp_dt = dsp_dt;
    }

    public String getProd_code() {
        return prod_code;
    }

    public void setProd_code(String prod_code) {
        this.prod_code = prod_code;
    }

    public String getBatch_number() {
        return batch_number;
    }

    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number;
    }

    public Date getBatch_expiry() {
        return batch_expiry;
    }

    public void setBatch_expiry(Date batch_expiry) {
        this.batch_expiry = batch_expiry;
    }

    public Date getBatch_mfgdt() {
        return batch_mfgdt;
    }

    public void setBatch_mfgdt(Date batch_mfgdt) {
        this.batch_mfgdt = batch_mfgdt;
    }

    public BigDecimal getBatch_mrp() {
        return batch_mrp;
    }

    public void setBatch_mrp(BigDecimal batch_mrp) {
        this.batch_mrp = batch_mrp;
    }

    public BigDecimal getBatch_pts() {
        return batch_pts;
    }

    public void setBatch_pts(BigDecimal batch_pts) {
        this.batch_pts = batch_pts;
    }

    public BigDecimal getBatch_ptr() {
        return batch_ptr;
    }

    public void setBatch_ptr(BigDecimal batch_ptr) {
        this.batch_ptr = batch_ptr;
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

    public BigDecimal getAddl_schm_qty() {
        return addl_schm_qty;
    }

    public void setAddl_schm_qty(BigDecimal addl_schm_qty) {
        this.addl_schm_qty = addl_schm_qty;
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
}
