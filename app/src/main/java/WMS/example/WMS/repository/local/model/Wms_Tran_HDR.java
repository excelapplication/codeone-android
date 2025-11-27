package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "WMS_TRAN_HDR")
public class Wms_Tran_HDR {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "WMS_TRAN_ID")
    private Long wms_tran_id;

    @ColumnInfo(name = "WMS_TRAN_DATE")
    private Long WMS_TRAN_DATE;

    @ColumnInfo(name = "WMS_TRAN_NO")
    private String wms_tran_no;

    @ColumnInfo(name = "SD_TRAN_TYPE")
    private String sd_tran_type;

    @ColumnInfo(name = "SD_TRAN_ID")
    private Long sd_tran_id;

    @ColumnInfo(name = "SD_TRAN_NO")
    private String sd_tran_no;

   @ColumnInfo(name = "SD_TRAN_DATE")
    private String sd_tran_date;

    @ColumnInfo(name = "COMPANY")
    private String company;

    @ColumnInfo(name = "SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name = "PERIOD_ID")
    private String period_id;

    @ColumnInfo(name="FIN_YEAR_ID")
    private String fin_year_id;


    @ColumnInfo(name="TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name="WH_ID")
    private Long wh_id;

    @ColumnInfo(name="WMS_CONFIRMED")
    private String wms_confirmed;

    public String getWms_confirmed() {
        return wms_confirmed;
    }

    public void setWms_confirmed(String wms_confirmed) {
        this.wms_confirmed = wms_confirmed;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getWms_tran_id() {
        return wms_tran_id;
    }

    public void setWms_tran_id(Long wms_tran_id) {
        this.wms_tran_id = wms_tran_id;
    }

    public Long getWMS_TRAN_DATE() {
      return WMS_TRAN_DATE;
    }

    public void setWMS_TRAN_DATE(Long WMS_TRAN_DATE) {
        this.WMS_TRAN_DATE = WMS_TRAN_DATE;
   }

    public String getWms_tran_no() {
        return wms_tran_no;
    }

    public void setWms_tran_no(String wms_tran_no) {
        this.wms_tran_no = wms_tran_no;
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

    public String getSd_tran_no() {
        return sd_tran_no;
    }

    public void setSd_tran_no(String sd_tran_no) {
        this.sd_tran_no = sd_tran_no;
    }

    public String getSd_tran_date() {
        return sd_tran_date;
    }

    public void setSd_tran_date(String sd_tran_date) {
        this.sd_tran_date = sd_tran_date;
   }

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

    public String getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(String period_id) {
        this.period_id = period_id;
    }

    public String getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(String fin_year_id) {
        this.fin_year_id = fin_year_id;
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


    @Override
    public String toString() {
        return "Wms_Tran_HDR{" +
                "pk=" + pk +
                ", wms_tran_id=" + wms_tran_id +
                ", WMS_TRAN_DATE=" + WMS_TRAN_DATE +
                ", wms_tran_no='" + wms_tran_no + '\'' +
                ", sd_tran_type='" + sd_tran_type + '\'' +
                ", sd_tran_id=" + sd_tran_id +
                ", sd_tran_no='" + sd_tran_no + '\'' +
                ", sd_tran_date='" + sd_tran_date + '\'' +
                ", company='" + company + '\'' +
                ", sub_company='" + sub_company + '\'' +
                ", period_id='" + period_id + '\'' +
                ", fin_year_id='" + fin_year_id + '\'' +
                ", tran_type='" + tran_type + '\'' +
                ", wh_id=" + wh_id +
                ", wms_confirmed='" + wms_confirmed + '\'' +
                '}';
    }
}
