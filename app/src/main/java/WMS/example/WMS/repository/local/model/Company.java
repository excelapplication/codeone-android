package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Company")
public class Company {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "COMPANY")
    private String company;

    @ColumnInfo(name="COMPANY_NAME")
    public String company_name;

    @ColumnInfo(name="COMPANY_GROUP_ID")
    public String company_group_id;

    @ColumnInfo(name="COMPANY_PERF_PARAMETER")
    public String company_perf_parameter;

    @ColumnInfo(name="COMPANY_SALEPERFALL_FLG")
    public String company_saleperfall_flg;

    @ColumnInfo(name="COMPANY_MAP_CD")
    public String company_map_cd;

    @ColumnInfo(name="COMPANY_ins_usr_id")
    public String company_ins_usr_id;

    @ColumnInfo(name="COMPANY_mod_usr_id")
    public String company_mod_usr_id;

    @ColumnInfo(name="COMPANY_ins_dt")
    public String company_ins_dt;

    @ColumnInfo(name="COMPANY_mod_dt")
    public String company_mod_dt;

    @ColumnInfo(name="COMPANY_ins_ip_add")
    public String company_ins_ip_add;

    @ColumnInfo(name="COMPANY_mod_ip_add")
    public String company_mod_ip_add;

    @ColumnInfo(name="COMPANY_status")
    public String company_status;

    @ColumnInfo(name="COMPANY_LOGO")
    public String company_logo;

    @ColumnInfo(name="SAMP_DISP_IND")
    public String samp_disp_ind;

    @ColumnInfo(name="ALLOC_STOCK_CHECK")
    public String alloc_stock_check;

    @ColumnInfo(name="PENDING_DISP_IND")
    public String pending_disp_ind;

    @ColumnInfo(name="ADDRESS1")
    public String address1;

    @ColumnInfo(name="ADDRESS2")
    public String address2;

    @ColumnInfo(name="ADDRESS3")
    public String address3;

    @ColumnInfo(name="ADDRESS4")
    public String address4;

    @ColumnInfo(name="WEBSITE")
    public String website;

    @ColumnInfo(name="CINNO")
    public String cinno;

    @ColumnInfo(name="TEAM_REQD")
    public String team_reqd;

    @ColumnInfo(name="WEB_SITE")
    public String web_site;

    @ColumnInfo(name="AUDIT_XLS_IND")
    public String audit_xls_ind;

    @ColumnInfo(name="MARGIN_REQD")
    public String margin_reqd;

    @ColumnInfo(name="PAN_NO")
    public String pan_no;

    @ColumnInfo(name="STOCK_AT_CFA")
    public String stock_at_cfa;

    @ColumnInfo(name="GST_REG_NO")
    public String gst_reg_no;

    @ColumnInfo(name="NIL_GST_STN")
    public String nil_gst_stn;

    @ColumnInfo(name="FREE_GOODS_STN")
    public String free_goods_stn;

    @ColumnInfo(name="WMS_IS_LIVE")
    private String wms_is_live;


    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_group_id() {
        return company_group_id;
    }

    public void setCompany_group_id(String company_group_id) {
        this.company_group_id = company_group_id;
    }

    public String getCompany_perf_parameter() {
        return company_perf_parameter;
    }

    public void setCompany_perf_parameter(String company_perf_parameter) {
        this.company_perf_parameter = company_perf_parameter;
    }

    public String getCompany_saleperfall_flg() {
        return company_saleperfall_flg;
    }

    public void setCompany_saleperfall_flg(String company_saleperfall_flg) {
        this.company_saleperfall_flg = company_saleperfall_flg;
    }

    public String getCompany_map_cd() {
        return company_map_cd;
    }

    public void setCompany_map_cd(String company_map_cd) {
        this.company_map_cd = company_map_cd;
    }

    public String getCompany_ins_usr_id() {
        return company_ins_usr_id;
    }

    public void setCompany_ins_usr_id(String company_ins_usr_id) {
        this.company_ins_usr_id = company_ins_usr_id;
    }

    public String getCompany_mod_usr_id() {
        return company_mod_usr_id;
    }

    public void setCompany_mod_usr_id(String company_mod_usr_id) {
        this.company_mod_usr_id = company_mod_usr_id;
    }

    public String getCompany_ins_dt() {
        return company_ins_dt;
    }

    public void setCompany_ins_dt(String company_ins_dt) {
        this.company_ins_dt = company_ins_dt;
    }

    public String getCompany_mod_dt() {
        return company_mod_dt;
    }

    public void setCompany_mod_dt(String company_mod_dt) {
        this.company_mod_dt = company_mod_dt;
    }

    public String getCompany_ins_ip_add() {
        return company_ins_ip_add;
    }

    public void setCompany_ins_ip_add(String company_ins_ip_add) {
        this.company_ins_ip_add = company_ins_ip_add;
    }

    public String getCompany_mod_ip_add() {
        return company_mod_ip_add;
    }

    public void setCompany_mod_ip_add(String company_mod_ip_add) {
        this.company_mod_ip_add = company_mod_ip_add;
    }

    public String getCompany_status() {
        return company_status;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getSamp_disp_ind() {
        return samp_disp_ind;
    }

    public void setSamp_disp_ind(String samp_disp_ind) {
        this.samp_disp_ind = samp_disp_ind;
    }

    public String getAlloc_stock_check() {
        return alloc_stock_check;
    }

    public void setAlloc_stock_check(String alloc_stock_check) {
        this.alloc_stock_check = alloc_stock_check;
    }

    public String getPending_disp_ind() {
        return pending_disp_ind;
    }

    public void setPending_disp_ind(String pending_disp_ind) {
        this.pending_disp_ind = pending_disp_ind;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCinno() {
        return cinno;
    }

    public void setCinno(String cinno) {
        this.cinno = cinno;
    }

    public String getTeam_reqd() {
        return team_reqd;
    }

    public void setTeam_reqd(String team_reqd) {
        this.team_reqd = team_reqd;
    }

    public String getWeb_site() {
        return web_site;
    }

    public void setWeb_site(String web_site) {
        this.web_site = web_site;
    }

    public String getAudit_xls_ind() {
        return audit_xls_ind;
    }

    public void setAudit_xls_ind(String audit_xls_ind) {
        this.audit_xls_ind = audit_xls_ind;
    }

    public String getMargin_reqd() {
        return margin_reqd;
    }

    public void setMargin_reqd(String margin_reqd) {
        this.margin_reqd = margin_reqd;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getStock_at_cfa() {
        return stock_at_cfa;
    }

    public void setStock_at_cfa(String stock_at_cfa) {
        this.stock_at_cfa = stock_at_cfa;
    }

    public String getGst_reg_no() {
        return gst_reg_no;
    }

    public void setGst_reg_no(String gst_reg_no) {
        this.gst_reg_no = gst_reg_no;
    }

    public String getNil_gst_stn() {
        return nil_gst_stn;
    }

    public void setNil_gst_stn(String nil_gst_stn) {
        this.nil_gst_stn = nil_gst_stn;
    }

    public String getFree_goods_stn() {
        return free_goods_stn;
    }

    public void setFree_goods_stn(String free_goods_stn) {
        this.free_goods_stn = free_goods_stn;
    }

    public String getWms_is_live() {
        return wms_is_live;
    }

    public void setWms_is_live(String wms_is_live) {
        this.wms_is_live = wms_is_live;
    }
}
