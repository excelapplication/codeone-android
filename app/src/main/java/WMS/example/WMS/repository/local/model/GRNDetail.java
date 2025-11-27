package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "GRN_DT")
public class GRNDetail {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "GRN_ID")
    private Long grn_id;

    @ColumnInfo(name = "GRN_SL_NO")
    private Long grn_sl_no;

    @ColumnInfo(name = "FINYEAR_ID")
    private Long finyear_id;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "ERP_CUST_CODE")
    private String erp_cust_code;

    @ColumnInfo(name = "PROD_CODE")
    private String prod_code;

    @ColumnInfo(name = "BATCH_Number")
    private String batch_number;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "BATCH_ID")
    private Long batch_id;

    @ColumnInfo(name = "Batch_Expiry")
    private String batch_expiry;

    @ColumnInfo(name = "BATCH_MFGDT")
    private String batch_mfgdt;

    @ColumnInfo(name = "BATCH_MRP")
    private BigDecimal batch_mrp;

    @ColumnInfo(name = "BATCH_PTS")
    private BigDecimal batch_pts;

    @ColumnInfo(name = "BATCH_PTR")
    private BigDecimal batch_ptr;

    @ColumnInfo(name = "BILLED_QTY")
    private BigDecimal billed_qty;

    @ColumnInfo(name = "FREE_QTY")
    private BigDecimal free_qty;

    @ColumnInfo(name = "REPL_QTY")
    private BigDecimal repl_qty;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "PROD_DISC")
    private BigDecimal prod_disc;

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

    @ColumnInfo(name = "CESS_RATE")
    private BigDecimal cess_rate;

    @ColumnInfo(name = "CESS_BILL_AMT")
    private BigDecimal cess_bill_amt;

    @ColumnInfo(name = "TAXABLE_AMT")
    private BigDecimal taxable_amt;

    @ColumnInfo(name = "PKG_DTL_ID")
    private Long pkg_dtl_id;

    @ColumnInfo(name = "COST_SHEET_ID")
    private Long cost_sheet_id;

    @ColumnInfo(name = "STOCK_POINT_ID")
    private long stock_point_id;

    @ColumnInfo(name = "CONV_VALUE")
    private BigDecimal conv_value;

    @ColumnInfo(name = "GST_REVERSE_CHG")
    private String gst_reverse_chg;

    @ColumnInfo(name = "GST_DOC_TYPE")
    private Long gst_doc_type;

    @ColumnInfo(name = "CUSTOMS_DUTY")
    private Long customs_duty;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name = "CHALLAN_QTY")
    private BigDecimal challan_qty;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

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

    public Long getGrn_id() {
        return grn_id;
    }

    public void setGrn_id(Long grn_id) {
        this.grn_id = grn_id;
    }

    public Long getGrn_sl_no() {
        return grn_sl_no;
    }

    public void setGrn_sl_no(Long grn_sl_no) {
        this.grn_sl_no = grn_sl_no;
    }

    public Long getFinyear_id() {
        return finyear_id;
    }

    public void setFinyear_id(Long finyear_id) {
        this.finyear_id = finyear_id;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
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

    public String getBatch_expiry() {
        return batch_expiry;
    }

    public void setBatch_expiry(String batch_expiry) {
        this.batch_expiry = batch_expiry;
    }

    public String getBatch_mfgdt() {
        return batch_mfgdt;
    }

    public void setBatch_mfgdt(String batch_mfgdt) {
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

    public BigDecimal getProd_disc() {
        return prod_disc;
    }

    public void setProd_disc(BigDecimal prod_disc) {
        this.prod_disc = prod_disc;
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

    public BigDecimal getTaxable_amt() {
        return taxable_amt;
    }

    public void setTaxable_amt(BigDecimal taxable_amt) {
        this.taxable_amt = taxable_amt;
    }

    public Long getPkg_dtl_id() {
        return pkg_dtl_id;
    }

    public void setPkg_dtl_id(Long pkg_dtl_id) {
        this.pkg_dtl_id = pkg_dtl_id;
    }

    public Long getCost_sheet_id() {
        return cost_sheet_id;
    }

    public void setCost_sheet_id(Long cost_sheet_id) {
        this.cost_sheet_id = cost_sheet_id;
    }

    public long getStock_point_id() {
        return stock_point_id;
    }

    public void setStock_point_id(long stock_point_id) {
        this.stock_point_id = stock_point_id;
    }

    public BigDecimal getConv_value() {
        return conv_value;
    }

    public void setConv_value(BigDecimal conv_value) {
        this.conv_value = conv_value;
    }

    public String getGst_reverse_chg() {
        return gst_reverse_chg;
    }

    public void setGst_reverse_chg(String gst_reverse_chg) {
        this.gst_reverse_chg = gst_reverse_chg;
    }

    public Long getGst_doc_type() {
        return gst_doc_type;
    }

    public void setGst_doc_type(Long gst_doc_type) {
        this.gst_doc_type = gst_doc_type;
    }

    public Long getCustoms_duty() {
        return customs_duty;
    }

    public void setCustoms_duty(Long customs_duty) {
        this.customs_duty = customs_duty;
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

    public BigDecimal getChallan_qty() {
        return challan_qty;
    }

    public void setChallan_qty(BigDecimal challan_qty) {
        this.challan_qty = challan_qty;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    public String getPrincipal_code() {
        return principal_code;
    }

    public void setPrincipal_code(String principal_code) {
        this.principal_code = principal_code;
    }
}
