package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;


@Entity(tableName = "PICKSLIP_HDR")
public class PickslipHeader {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "SL_NO")
    private Long sl_no;

    @ColumnInfo(name = "PS_TRAN_DATE")
    private String ps_tran_date;

    @ColumnInfo(name = "PS_HDR_STATUS")
    private String ps_hdr_status;

    @ColumnInfo(name = "PS_TRAN_NO")
    private String ps_tran_no;

    @ColumnInfo(name = "PS_COMP_CD")
    private String ps_comp_cd;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "PERIOD_CD")
    private String period_cd;

    @ColumnInfo(name = "WH_ID")
    private Long wh_id;

    @ColumnInfo(name = "SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name = "PS_TOTAL_WEIGHT")
    private BigDecimal ps_total_weight;

    @ColumnInfo(name = "PS_TOTAL_VOLUME")
    private BigDecimal ps_total_volume;

    @ColumnInfo(name = "INSERT_USER_ID")
    private String insert_user_id;

    @ColumnInfo(name = "MOD_USER_ID")
    private String mod_user_id;

    @ColumnInfo(name = "MOD_DATE")
    private String mod_date;

    @ColumnInfo(name = "PICKSLIP_NO")
    private Long pickslip_no;

    @ColumnInfo(name = "PS_HDR_CONFIRM")
    private String ps_hdr_confirm;

    @ColumnInfo(name = "INSERTED_DATE")
    private String inserted_date;



    @ColumnInfo(name = "DSP_LR_NO")
    private String dsp_lr_no;

    @ColumnInfo(name = "DSP_LR_DT")
    private String dsp_lr_dt;

    @ColumnInfo(name = "DSP_LORRY_NO")
    private String dsp_lorry_no;

    @ColumnInfo(name = "DSP_TRANSPORTER")
    private String dsp_transporter;

    @ColumnInfo(name = "DSP_WT")
    private BigDecimal dsp_wt;

    @ColumnInfo(name = "DSP_CASES")
    private Integer dsp_cases;

    @ColumnInfo(name = "DSP_BILLABLE_WT")
    private BigDecimal dsp_billable_wt;

    @ColumnInfo(name = "DSP_DELIVERY_DATE")
    private String dsp_delivery_date;

    @ColumnInfo(name = "DSP_RECD_BY")
    private String dsp_recd_by;

    @ColumnInfo(name = "DSP_REMARK")
    private String dsp_remark;

    @ColumnInfo(name = "COURIER_EXPENSES")
    private BigDecimal courier_expenses;

    @ColumnInfo(name = "ACTUAL_DELIVERY_DATE")
    private String actual_delivery_date;

    @ColumnInfo(name = "DELIVERY_DETAIL_MODIFY_DATE")
    private String delivery_detail_modify_date;

    @ColumnInfo(name = "EMAIL_SEND_IND_AFTER_LR")
    private String email_send_ind_after_lr;

    @ColumnInfo(name = "transport_mode")
    private String transport_mode;

    @ColumnInfo(name = "INSERT_IP_ADDRESS")
    private String insert_ip_address;

    @ColumnInfo(name = "MOD_IP_ADDRESS")
    private String mod_ip_address;


    @ColumnInfo(name = "PACKING_CONFIRM")
    private String packing_confirm;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getSl_no() {
        return sl_no;
    }

    public void setSl_no(Long sl_no) {
        this.sl_no = sl_no;
    }

    public String getPs_tran_date() {
        return ps_tran_date;
    }

    public void setPs_tran_date(String ps_tran_date) {
        this.ps_tran_date = ps_tran_date;
    }

    public String getPs_hdr_status() {
        return ps_hdr_status;
    }

    public void setPs_hdr_status(String ps_hdr_status) {
        this.ps_hdr_status = ps_hdr_status;
    }

    public String getPs_tran_no() {
        return ps_tran_no;
    }

    public void setPs_tran_no(String ps_tran_no) {
        this.ps_tran_no = ps_tran_no;
    }

    public String getPs_comp_cd() {
        return ps_comp_cd;
    }

    public void setPs_comp_cd(String ps_comp_cd) {
        this.ps_comp_cd = ps_comp_cd;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getPeriod_cd() {
        return period_cd;
    }

    public void setPeriod_cd(String period_cd) {
        this.period_cd = period_cd;
    }

    public Long getWh_id() {
        return wh_id;
    }

    public void setWh_id(Long wh_id) {
        this.wh_id = wh_id;
    }

    public String getSub_company() {
        return sub_company;
    }

    public void setSub_company(String sub_company) {
        this.sub_company = sub_company;
    }

    public BigDecimal getPs_total_weight() {
        return ps_total_weight;
    }

    public void setPs_total_weight(BigDecimal ps_total_weight) {
        this.ps_total_weight = ps_total_weight;
    }

    public BigDecimal getPs_total_volume() {
        return ps_total_volume;
    }

    public void setPs_total_volume(BigDecimal ps_total_volume) {
        this.ps_total_volume = ps_total_volume;
    }

    public String getInsert_user_id() {
        return insert_user_id;
    }

    public void setInsert_user_id(String insert_user_id) {
        this.insert_user_id = insert_user_id;
    }

    public String getMod_user_id() {
        return mod_user_id;
    }

    public void setMod_user_id(String mod_user_id) {
        this.mod_user_id = mod_user_id;
    }

    public String getMod_date() {
        return mod_date;
    }

    public void setMod_date(String mod_date) {
        this.mod_date = mod_date;
    }

    public Long getPickslip_no() {
        return pickslip_no;
    }

    public void setPickslip_no(Long pickslip_no) {
        this.pickslip_no = pickslip_no;
    }

    public String getPs_hdr_confirm() {
        return ps_hdr_confirm;
    }

    public void setPs_hdr_confirm(String ps_hdr_confirm) {
        this.ps_hdr_confirm = ps_hdr_confirm;
    }

    public String getInserted_date() {
        return inserted_date;
    }

    public void setInserted_date(String inserted_date) {
        this.inserted_date = inserted_date;
    }

    public String getDsp_lr_no() {
        return dsp_lr_no;
    }

    public void setDsp_lr_no(String dsp_lr_no) {
        this.dsp_lr_no = dsp_lr_no;
    }

    public String getDsp_lr_dt() {
        return dsp_lr_dt;
    }

    public void setDsp_lr_dt(String dsp_lr_dt) {
        this.dsp_lr_dt = dsp_lr_dt;
    }

    public String getDsp_lorry_no() {
        return dsp_lorry_no;
    }

    public void setDsp_lorry_no(String dsp_lorry_no) {
        this.dsp_lorry_no = dsp_lorry_no;
    }

    public String getDsp_transporter() {
        return dsp_transporter;
    }

    public void setDsp_transporter(String dsp_transporter) {
        this.dsp_transporter = dsp_transporter;
    }

    public BigDecimal getDsp_wt() {
        return dsp_wt;
    }

    public void setDsp_wt(BigDecimal dsp_wt) {
        this.dsp_wt = dsp_wt;
    }

    public Integer getDsp_cases() {
        return dsp_cases;
    }

    public void setDsp_cases(Integer dsp_cases) {
        this.dsp_cases = dsp_cases;
    }

    public BigDecimal getDsp_billable_wt() {
        return dsp_billable_wt;
    }

    public void setDsp_billable_wt(BigDecimal dsp_billable_wt) {
        this.dsp_billable_wt = dsp_billable_wt;
    }

    public String getDsp_delivery_date() {
        return dsp_delivery_date;
    }

    public void setDsp_delivery_date(String dsp_delivery_date) {
        this.dsp_delivery_date = dsp_delivery_date;
    }

    public String getDsp_recd_by() {
        return dsp_recd_by;
    }

    public void setDsp_recd_by(String dsp_recd_by) {
        this.dsp_recd_by = dsp_recd_by;
    }

    public String getDsp_remark() {
        return dsp_remark;
    }

    public void setDsp_remark(String dsp_remark) {
        this.dsp_remark = dsp_remark;
    }

    public BigDecimal getCourier_expenses() {
        return courier_expenses;
    }

    public void setCourier_expenses(BigDecimal courier_expenses) {
        this.courier_expenses = courier_expenses;
    }

    public String getActual_delivery_date() {
        return actual_delivery_date;
    }

    public void setActual_delivery_date(String actual_delivery_date) {
        this.actual_delivery_date = actual_delivery_date;
    }

    public String getDelivery_detail_modify_date() {
        return delivery_detail_modify_date;
    }

    public void setDelivery_detail_modify_date(String delivery_detail_modify_date) {
        this.delivery_detail_modify_date = delivery_detail_modify_date;
    }

    public String getEmail_send_ind_after_lr() {
        return email_send_ind_after_lr;
    }

    public void setEmail_send_ind_after_lr(String email_send_ind_after_lr) {
        this.email_send_ind_after_lr = email_send_ind_after_lr;
    }

    public String getTransport_mode() {
        return transport_mode;
    }

    public void setTransport_mode(String transport_mode) {
        this.transport_mode = transport_mode;
    }

    public String getInsert_ip_address() {
        return insert_ip_address;
    }

    public void setInsert_ip_address(String insert_ip_address) {
        this.insert_ip_address = insert_ip_address;
    }

    public String getMod_ip_address() {
        return mod_ip_address;
    }

    public void setMod_ip_address(String mod_ip_address) {
        this.mod_ip_address = mod_ip_address;
    }

    public String getPacking_confirm() {
        return packing_confirm;
    }

    public void setPacking_confirm(String packing_confirm) {
        this.packing_confirm = packing_confirm;
    }

    @Override
    public String toString() {
        return "PickslipHeader{" +
                "pk=" + pk +
                ", sl_no=" + sl_no +
                ", ps_tran_date='" + ps_tran_date + '\'' +
                ", ps_hdr_status='" + ps_hdr_status + '\'' +
                ", ps_tran_no='" + ps_tran_no + '\'' +
                ", ps_comp_cd='" + ps_comp_cd + '\'' +
                ", fin_year_id=" + fin_year_id +
                ", period_cd='" + period_cd + '\'' +
                ", wh_id=" + wh_id +
                ", sub_company='" + sub_company + '\'' +
                ", ps_total_weight=" + ps_total_weight +
                ", ps_total_volume=" + ps_total_volume +
                ", insert_user_id='" + insert_user_id + '\'' +
                ", mod_user_id='" + mod_user_id + '\'' +
                ", mod_date='" + mod_date + '\'' +
                ", pickslip_no=" + pickslip_no +
                ", ps_hdr_confirm='" + ps_hdr_confirm + '\'' +
                ", inserted_date='" + inserted_date + '\'' +
                ", dsp_lr_no='" + dsp_lr_no + '\'' +
                ", dsp_lr_dt='" + dsp_lr_dt + '\'' +
                ", dsp_lorry_no='" + dsp_lorry_no + '\'' +
                ", dsp_transporter='" + dsp_transporter + '\'' +
                ", dsp_wt=" + dsp_wt +
                ", dsp_cases=" + dsp_cases +
                ", dsp_billable_wt=" + dsp_billable_wt +
                ", dsp_delivery_date='" + dsp_delivery_date + '\'' +
                ", dsp_recd_by='" + dsp_recd_by + '\'' +
                ", dsp_remark='" + dsp_remark + '\'' +
                ", courier_expenses=" + courier_expenses +
                ", actual_delivery_date='" + actual_delivery_date + '\'' +
                ", delivery_detail_modify_date='" + delivery_detail_modify_date + '\'' +
                ", email_send_ind_after_lr='" + email_send_ind_after_lr + '\'' +
                ", transport_mode='" + transport_mode + '\'' +
                ", insert_ip_address='" + insert_ip_address + '\'' +
                ", mod_ip_address='" + mod_ip_address + '\'' +
                ", packing_confirm='" + packing_confirm + '\'' +
                '}';
    }
}