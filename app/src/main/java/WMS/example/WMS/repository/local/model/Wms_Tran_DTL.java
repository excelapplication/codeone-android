package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "WMS_TRAN_DTL")
public class Wms_Tran_DTL {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "TRAN_DTL_ID")
    private Long tran_dtl_id;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "WH_ID")
    private Long wh_id;

    @ColumnInfo(name = "SB_CODE")
    private String sb_code;

//    @ColumnInfo(name = "TRAN_DATE")
//    private Date tran_date;

    @ColumnInfo(name = "COMPANY")
    private String company;

    @ColumnInfo(name = "SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name = "PERIOD_CD")
    private String period_cd;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "SD_TRAN_TYPE")
    private String sd_tran_type;

    @ColumnInfo(name = "SD_TRAN_ID")
    private Long sd_tran_id;

    @ColumnInfo(name = "SD_TRAN_DTL_ID")
    private Long sd_tran_dtl_id;

    @ColumnInfo(name = "SD_TRAN_NO")
    private String sd_tran_no;

//    @ColumnInfo(name = "SD_TRAN_DATE")
//    private Date sd_tran_date;

    @ColumnInfo(name = "WMS_DTL_SLNO")
    private Long wms_dtl_slno;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "STOCK_TYPE")
    private String stock_type;

    @ColumnInfo(name = "BATCH_ID")
    private Long batch_id;

    @ColumnInfo(name = "BATCH_NAME")
    private String batch_name;

    @ColumnInfo(name = "PROD_NAME")
    private String prod_name;


//    @ColumnInfo(name = "MFG_DATE")
//    private Date mfg_date;

//    @ColumnInfo(name = "EXPIRY_DATE")
//    private Date expiry_date;

    @ColumnInfo(name = "BIN_ID")
    private Long bin_id;

    @ColumnInfo(name = "RACK_ID")
    private Long rack_id;

    @ColumnInfo(name = "TRAN_QTY")
    public BigDecimal tran_qty;

    @ColumnInfo(name = "WMS_CONFIRMED")
    private String wms_confirmed;



    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getTran_id() {
        return tran_id;
    }

    public void setTran_id(Long tran_id) {
        this.tran_id = tran_id;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public Long getWh_id() {
        return wh_id;
    }

    public void setWh_id(Long wh_id) {
        this.wh_id = wh_id;
    }

    public String getSb_code() {
        return sb_code;
    }

    public void setSb_code(String sb_code) {
        this.sb_code = sb_code;
    }

//    public Date getTran_date() {
//        return tran_date;
//    }
//
//    public void setTran_date(Date tran_date) {
//        this.tran_date = tran_date;
//    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSub_company() {
        return sub_company;
    }

    public void setSub_company(String sub_company) {
        this.sub_company = sub_company;
    }

    public String getPeriod_cd() {
        return period_cd;
    }

    public void setPeriod_cd(String period_cd) {
        this.period_cd = period_cd;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getSd_tran_type() {
        return sd_tran_type;
    }

    public void setSd_tran_type(String sd_tran_type) {
        this.sd_tran_type = sd_tran_type;
    }

    public Long getSd_tran_id() {
        return sd_tran_id;
    }

    public void setSd_tran_id(Long sd_tran_id) {
        this.sd_tran_id = sd_tran_id;
    }

    public Long getSd_tran_dtl_id() {
        return sd_tran_dtl_id;
    }

    public void setSd_tran_dtl_id(Long sd_tran_dtl_id) {
        this.sd_tran_dtl_id = sd_tran_dtl_id;
    }

    public String getSd_tran_no() {
        return sd_tran_no;
    }

    public void setSd_tran_no(String sd_tran_no) {
        this.sd_tran_no = sd_tran_no;
    }

//    public Date getSd_tran_date() {
//        return sd_tran_date;
//    }
//
//    public void setSd_tran_date(Date sd_tran_date) {
//        this.sd_tran_date = sd_tran_date;
//    }

    public Long getWms_dtl_slno() {
        return wms_dtl_slno;
    }

    public void setWms_dtl_slno(Long wms_dtl_slno) {
        this.wms_dtl_slno = wms_dtl_slno;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    public Long getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Long batch_id) {
        this.batch_id = batch_id;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

//    public Date getMfg_date() {
//        return mfg_date;
//    }
//
//    public void setMfg_date(Date mfg_date) {
//        this.mfg_date = mfg_date;
//    }

//    public Date getExpiry_date() {
//        return expiry_date;
//    }
//
//    public void setExpiry_date(Date expiry_date) {
//        this.expiry_date = expiry_date;
//    }

    public Long getBin_id() {
        return bin_id;
    }

    public void setBin_id(Long bin_id) {
        this.bin_id = bin_id;
    }

    public Long getRack_id() {
        return rack_id;
    }

    public void setRack_id(Long rack_id) {
        this.rack_id = rack_id;
    }

    public BigDecimal getTran_qty() {
        return tran_qty;
    }

    public void setTran_qty(BigDecimal tran_qty) {
        this.tran_qty = tran_qty;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Long getTran_dtl_id() {
        return tran_dtl_id;
    }

    public void setTran_dtl_id(Long tran_dtl_id) {
        this.tran_dtl_id = tran_dtl_id;
    }

    public String getWms_confirmed() {
        return wms_confirmed;
    }

    public void setWms_confirmed(String wms_confirmed) {
        this.wms_confirmed = wms_confirmed;
    }

    @Override
    public String toString() {
        return "Wms_Tran_DTL{" +
                "pk=" + pk +
                ", tran_dtl_id=" + tran_dtl_id +
                ", tran_id=" + tran_id +
                ", tran_type='" + tran_type + '\'' +
                ", wh_id=" + wh_id +
                ", sb_code='" + sb_code + '\'' +
                ", company='" + company + '\'' +
                ", sub_company='" + sub_company + '\'' +
                ", period_cd=" + period_cd +
                ", fin_year_id=" + fin_year_id +
                ", sd_tran_type='" + sd_tran_type + '\'' +
                ", sd_tran_id=" + sd_tran_id +
                ", sd_tran_dtl_id=" + sd_tran_dtl_id +
                ", sd_tran_no='" + sd_tran_no + '\'' +
                ", wms_dtl_slno=" + wms_dtl_slno +
                ", prod_id=" + prod_id +
                ", stock_type='" + stock_type + '\'' +
                ", batch_id=" + batch_id +
                ", batch_name='" + batch_name + '\'' +
                ", prod_name='" + prod_name + '\'' +
                ", bin_id=" + bin_id +
                ", rack_id=" + rack_id +
                ", tran_qty=" + tran_qty +
                ", wms_confirmed=" + wms_confirmed +
                '}';
    }
}
