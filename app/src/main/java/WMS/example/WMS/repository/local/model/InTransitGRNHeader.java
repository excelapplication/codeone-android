package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "INTRANSIT_HDR")
public class InTransitGRNHeader {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "DSP_ID")
    private Long dsp_id;

    @ColumnInfo(name = "DSP_NO")
    private String dsp_no;

    @ColumnInfo(name = "FINYEAR_ID")
    private Long finyear_id;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String loc_code;

    @ColumnInfo(name = "DSP_DT")
    private Date dsp_dt;

    @ColumnInfo(name = "DSP_PARENT_COCD")
    private String dsp_parent_cocd;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "DSP_PARTY_CODE")
    private String dsp_party_code;

    @ColumnInfo(name = "PARTY_ORDER_NO")
    private String party_order_no;

    @ColumnInfo(name = "CHALLAN_DT")
    private Date challan_dt;

    @ColumnInfo(name = "CHALLAN_NO")
    private String challan_no;

    @ColumnInfo(name = "LR_NO")
    private String lr_no;

    @ColumnInfo(name = "LR_DT")
    private Date lr_dt;

    @ColumnInfo(name = "LORRY_NO")
    private String lorry_no;

    @ColumnInfo(name = "ROAD_PERMIT")
    private String road_permit;

    @ColumnInfo(name = "ROAD_PERMIT_DT")
    private Date road_permit_dt;

    @ColumnInfo(name = "TRANSPORTER")
    private String transporter;

    @ColumnInfo(name = "INV_NO")
    private String inv_no;

    @ColumnInfo(name = "INV_DATE")
    private Date inv_date;

    @ColumnInfo(name = "NEW_PROD")
    private String new_prod;

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

    @ColumnInfo(name = "GRN_HDR_ID")
    private Long grn_hdr_id;

    @ColumnInfo(name = "GRN_DATE")
    private Date grn_date;

    @ColumnInfo(name = "IN_TRANSIT_IND")
    private String in_transit_ind;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

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

    public Long getDsp_id() {
        return dsp_id;
    }

    public void setDsp_id(Long dsp_id) {
        this.dsp_id = dsp_id;
    }

    public String getDsp_no() {
        return dsp_no;
    }

    public void setDsp_no(String dsp_no) {
        this.dsp_no = dsp_no;
    }

    public Long getFinyear_id() {
        return finyear_id;
    }

    public void setFinyear_id(Long finyear_id) {
        this.finyear_id = finyear_id;
    }

    public String getLoc_code() {
        return loc_code;
    }

    public void setLoc_code(String loc_code) {
        this.loc_code = loc_code;
    }

    public Date getDsp_dt() {
        return dsp_dt;
    }

    public void setDsp_dt(Date dsp_dt) {
        this.dsp_dt = dsp_dt;
    }

    public String getDsp_parent_cocd() {
        return dsp_parent_cocd;
    }

    public void setDsp_parent_cocd(String dsp_parent_cocd) {
        this.dsp_parent_cocd = dsp_parent_cocd;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public String getDsp_party_code() {
        return dsp_party_code;
    }

    public void setDsp_party_code(String dsp_party_code) {
        this.dsp_party_code = dsp_party_code;
    }

    public String getParty_order_no() {
        return party_order_no;
    }

    public void setParty_order_no(String party_order_no) {
        this.party_order_no = party_order_no;
    }

    public Date getChallan_dt() {
        return challan_dt;
    }

    public void setChallan_dt(Date challan_dt) {
        this.challan_dt = challan_dt;
    }

    public String getChallan_no() {
        return challan_no;
    }

    public void setChallan_no(String challan_no) {
        this.challan_no = challan_no;
    }

    public String getLr_no() {
        return lr_no;
    }

    public void setLr_no(String lr_no) {
        this.lr_no = lr_no;
    }

    public Date getLr_dt() {
        return lr_dt;
    }

    public void setLr_dt(Date lr_dt) {
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

    public Date getRoad_permit_dt() {
        return road_permit_dt;
    }

    public void setRoad_permit_dt(Date road_permit_dt) {
        this.road_permit_dt = road_permit_dt;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public String getInv_no() {
        return inv_no;
    }

    public void setInv_no(String inv_no) {
        this.inv_no = inv_no;
    }

    public Date getInv_date() {
        return inv_date;
    }

    public void setInv_date(Date inv_date) {
        this.inv_date = inv_date;
    }

    public String getNew_prod() {
        return new_prod;
    }

    public void setNew_prod(String new_prod) {
        this.new_prod = new_prod;
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

    public Long getGrn_hdr_id() {
        return grn_hdr_id;
    }

    public void setGrn_hdr_id(Long grn_hdr_id) {
        this.grn_hdr_id = grn_hdr_id;
    }

    public Date getGrn_date() {
        return grn_date;
    }

    public void setGrn_date(Date grn_date) {
        this.grn_date = grn_date;
    }

    public String getIn_transit_ind() {
        return in_transit_ind;
    }

    public void setIn_transit_ind(String in_transit_ind) {
        this.in_transit_ind = in_transit_ind;
    }
}
