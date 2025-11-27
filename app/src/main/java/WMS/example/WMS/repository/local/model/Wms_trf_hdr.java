package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "WMS_TRF_HDR")
public class Wms_trf_hdr {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name="WMS_TRAN_DATE")
    private String wms_tran_date;

    @ColumnInfo(name="WMS_TRAN_NO")
    private String wms_tran_no;


    @ColumnInfo(name="COMPANY")
    private String company;

    @ColumnInfo(name="SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name="PERIOD_ID")
    private Long period_id;

    @ColumnInfo(name="FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name="TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name="WH_ID")
    private String wh_id;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getWms_tran_date() {
        return wms_tran_date;
    }

    public void setWms_tran_date(String wms_tran_date) {
        this.wms_tran_date = wms_tran_date;
    }

    public String getWms_tran_no() {
        return wms_tran_no;
    }

    public void setWms_tran_no(String wms_tran_no) {
        this.wms_tran_no = wms_tran_no;
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

    public Long getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(Long period_id) {
        this.period_id = period_id;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public String getWh_id() {
        return wh_id;
    }

    public void setWh_id(String wh_id) {
        this.wh_id = wh_id;
    }
}
