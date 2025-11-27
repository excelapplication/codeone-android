package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "GRN_HD")
public class GRNHeader {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "GRN_ID")
    private Long grn_id;

    @ColumnInfo(name = "GRN_NO")
    private String grn_no;

    @ColumnInfo(name = "GRN_DT")
    private String grn_dt;

    @ColumnInfo(name = "PURCH_ORDER_NO")
    private String purch_order_no;

    @ColumnInfo(name = "LR_NO")
    private String lr_no;

    @ColumnInfo(name = "LR_DT")
    private String lr_dt;

    @ColumnInfo(name = "LORRY_NO")
    private String lorry_no;

    @ColumnInfo(name = "ROAD_PERMIT")
    private String road_permit;

    @ColumnInfo(name = "ROAD_PERMIT_DT")
    private String road_permit_dt;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "TRANSPORTER")
    private String transporter;

    @ColumnInfo(name = "TOTAL_GOODS_VAL")
    private BigDecimal total_goods_val;

    @ColumnInfo(name = "TRD_DISC_AMT")
    private BigDecimal trd_disc_amt;

    @ColumnInfo(name = "SCHM_DISC_AMT")
    private BigDecimal schm_disc_amt;

    @ColumnInfo(name = "TOTAL_TAXABLE_AMT")
    private BigDecimal total_taxable_amt;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgst_bill_amt;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgst_bill_amt;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igst_bill_amt;

    @ColumnInfo(name = "CESS_BILL_AMT")
    private BigDecimal cess_bill_amt;

    @ColumnInfo(name = "MAN_INTRANSIT")
    private String man_intransit;

    @ColumnInfo(name = "STATUS")
    private String status;

    @ColumnInfo(name = "COUNTRY")
    private String country;

    @ColumnInfo(name = "PKGLST_NO")
    private String pkglst_no;

    @ColumnInfo(name = "BL_NO")
    private String bl_no;

    @ColumnInfo(name = "COST_SHEET_ID")
    private Long cost_sheet_id;

    @ColumnInfo(name = "CURRENCY")
    private String currency;

    @ColumnInfo(name = "CONV_RATE")
    private Long conv_rate;

    @ColumnInfo(name = "PUR_INV_NUM")
    private String pur_inv_num;

    @ColumnInfo(name = "PUR_INV_DATE")
    private String pur_inv_date;

    @ColumnInfo(name = "DRIVER_NAME")
    private String driver_name;

    @ColumnInfo(name = "MOBILE")
    private String mobile;

    @ColumnInfo(name = "APPR_STATUS")
    private String appr_status;

    @ColumnInfo(name = "RATE_TYPE")
    private String rate_type;

    @ColumnInfo(name = "GST_REVERSE_CHG")
    private String gst_reverse_chg;

    @ColumnInfo(name = "GST_DOC_TYPE")
    private String gst_doc_type;

    @ColumnInfo(name = "CUSTOMS_DUTY")
    private Long customs_duty;

    @ColumnInfo(name = "AUTO_GRN_DT")
    private String auto_grn_dt;

    @ColumnInfo(name = "AUTO_GRN_AUTH")
    private String auto_grn_auth;

    @ColumnInfo(name = "NEW_PROD")
    private String new_prod;

    @ColumnInfo(name = "IN_TRANSIT")
    private String in_transit;

    @ColumnInfo(name = "LOCKED_YN")
    private String locked_yn;

    @ColumnInfo(name = "USER_ID")
    private String user_id;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name = "ROWID")
    private Long rowid;

    @ColumnInfo(name = "SUPPLIER_ID")
    private Long supplier_id;

    @ColumnInfo(name = "SYNC")
    private String sync;

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getGrn_id() {
        return grn_id;
    }

    public void setGrn_id(Long grn_id) {
        this.grn_id = grn_id;
    }

    public String getGrn_no() {
        return grn_no;
    }

    public void setGrn_no(String grn_no) {
        this.grn_no = grn_no;
    }

    public String getGrn_dt() {
        return grn_dt;
    }

    public void setGrn_dt(String grn_dt) {
        this.grn_dt = grn_dt;
    }

    public String getPurch_order_no() {
        return purch_order_no;
    }

    public void setPurch_order_no(String purch_order_no) {
        this.purch_order_no = purch_order_no;
    }

    public String getLr_no() {
        return lr_no;
    }

    public void setLr_no(String lr_no) {
        this.lr_no = lr_no;
    }

    public String getLr_dt() {
        return lr_dt;
    }

    public void setLr_dt(String lr_dt) {
        this.lr_dt = lr_dt;
    }

    public String getLorry_no() {
        return lorry_no;
    }

    public void setLorry_no(String lorry_no) {
        this.lorry_no = lorry_no;
    }

    public String getRoad_permit() {
        return road_permit;
    }

    public void setRoad_permit(String road_permit) {
        this.road_permit = road_permit;
    }

    public String getRoad_permit_dt() {
        return road_permit_dt;
    }

    public void setRoad_permit_dt(String road_permit_dt) {
        this.road_permit_dt = road_permit_dt;
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

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public BigDecimal getTotal_goods_val() {
        return total_goods_val;
    }

    public void setTotal_goods_val(BigDecimal total_goods_val) {
        this.total_goods_val = total_goods_val;
    }

    public BigDecimal getTrd_disc_amt() {
        return trd_disc_amt;
    }

    public void setTrd_disc_amt(BigDecimal trd_disc_amt) {
        this.trd_disc_amt = trd_disc_amt;
    }

    public BigDecimal getSchm_disc_amt() {
        return schm_disc_amt;
    }

    public void setSchm_disc_amt(BigDecimal schm_disc_amt) {
        this.schm_disc_amt = schm_disc_amt;
    }

    public BigDecimal getTotal_taxable_amt() {
        return total_taxable_amt;
    }

    public void setTotal_taxable_amt(BigDecimal total_taxable_amt) {
        this.total_taxable_amt = total_taxable_amt;
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

    public BigDecimal getCess_bill_amt() {
        return cess_bill_amt;
    }

    public void setCess_bill_amt(BigDecimal cess_bill_amt) {
        this.cess_bill_amt = cess_bill_amt;
    }

    public String getMan_intransit() {
        return man_intransit;
    }

    public void setMan_intransit(String man_intransit) {
        this.man_intransit = man_intransit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPkglst_no() {
        return pkglst_no;
    }

    public void setPkglst_no(String pkglst_no) {
        this.pkglst_no = pkglst_no;
    }

    public String getBl_no() {
        return bl_no;
    }

    public void setBl_no(String bl_no) {
        this.bl_no = bl_no;
    }

    public Long getCost_sheet_id() {
        return cost_sheet_id;
    }

    public void setCost_sheet_id(Long cost_sheet_id) {
        this.cost_sheet_id = cost_sheet_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getConv_rate() {
        return conv_rate;
    }

    public void setConv_rate(Long conv_rate) {
        this.conv_rate = conv_rate;
    }

    public String getPur_inv_num() {
        return pur_inv_num;
    }

    public void setPur_inv_num(String pur_inv_num) {
        this.pur_inv_num = pur_inv_num;
    }

    public String getPur_inv_date() {
        return pur_inv_date;
    }

    public void setPur_inv_date(String pur_inv_date) {
        this.pur_inv_date = pur_inv_date;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAppr_status() {
        return appr_status;
    }

    public void setAppr_status(String appr_status) {
        this.appr_status = appr_status;
    }

    public String getRate_type() {
        return rate_type;
    }

    public void setRate_type(String rate_type) {
        this.rate_type = rate_type;
    }

    public String getGst_reverse_chg() {
        return gst_reverse_chg;
    }

    public void setGst_reverse_chg(String gst_reverse_chg) {
        this.gst_reverse_chg = gst_reverse_chg;
    }

    public String getGst_doc_type() {
        return gst_doc_type;
    }

    public void setGst_doc_type(String gst_doc_type) {
        this.gst_doc_type = gst_doc_type;
    }

    public Long getCustoms_duty() {
        return customs_duty;
    }

    public void setCustoms_duty(Long customs_duty) {
        this.customs_duty = customs_duty;
    }

    public String getAuto_grn_dt() {
        return auto_grn_dt;
    }

    public void setAuto_grn_dt(String auto_grn_dt) {
        this.auto_grn_dt = auto_grn_dt;
    }

    public String getAuto_grn_auth() {
        return auto_grn_auth;
    }

    public void setAuto_grn_auth(String auto_grn_auth) {
        this.auto_grn_auth = auto_grn_auth;
    }

    public String getNew_prod() {
        return new_prod;
    }

    public void setNew_prod(String new_prod) {
        this.new_prod = new_prod;
    }

    public String getIn_transit() {
        return in_transit;
    }

    public void setIn_transit(String in_transit) {
        this.in_transit = in_transit;
    }

    public String getLocked_yn() {
        return locked_yn;
    }

    public void setLocked_yn(String locked_yn) {
        this.locked_yn = locked_yn;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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
