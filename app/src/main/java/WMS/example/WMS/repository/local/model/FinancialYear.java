package WMS.example.WMS.repository.local.model;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "FINYEAR")
public class FinancialYear {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name="FIN_YEAR")
    private String fin_year;

    @ColumnInfo(name="FIN_COMPANY")
    private String fin_company;

    @ColumnInfo(name="FIN_START_DATE")
    private String fin_start_date;

    @ColumnInfo(name="FIN_END_DATE")
    private String fin_end_date;

    @ColumnInfo(name="FIN_CURRENT")
    private String fin_current;

    @ColumnInfo(name="FIN_status")
    private String fin_status;


    @ColumnInfo(name="GST_IND")
    private String gst_ind;

    @ColumnInfo(name="GST_CURR_YEAR")
    private String gst_curr_year;

    @ColumnInfo(name="GST_START_DATE")
    private String gst_start_date;

    @ColumnInfo(name="VAT_TRANSITION_END")
    private String vat_transition_end;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getFin_year() {
        return fin_year;
    }

    public void setFin_year(String fin_year) {
        this.fin_year = fin_year;
    }

    public String getFin_company() {
        return fin_company;
    }

    public void setFin_company(String fin_company) {
        this.fin_company = fin_company;
    }

    public String getFin_start_date() {
        return fin_start_date;
    }

    public void setFin_start_date(String fin_start_date) {
        this.fin_start_date = fin_start_date;
    }

    public String getFin_end_date() {
        return fin_end_date;
    }

    public void setFin_end_date(String fin_end_date) {
        this.fin_end_date = fin_end_date;
    }

    public String getFin_current() {
        return fin_current;
    }

    public void setFin_current(String fin_current) {
        this.fin_current = fin_current;
    }

    public String getFin_status() {
        return fin_status;
    }

    public void setFin_status(String fin_status) {
        this.fin_status = fin_status;
    }

    public String getGst_ind() {
        return gst_ind;
    }

    public void setGst_ind(String gst_ind) {
        this.gst_ind = gst_ind;
    }

    public String getGst_curr_year() {
        return gst_curr_year;
    }

    public void setGst_curr_year(String gst_curr_year) {
        this.gst_curr_year = gst_curr_year;
    }

    public String getGst_start_date() {
        return gst_start_date;
    }

    public void setGst_start_date(String gst_start_date) {
        this.gst_start_date = gst_start_date;
    }

    public String getVat_transition_end() {
        return vat_transition_end;
    }

    public void setVat_transition_end(String vat_transition_end) {
        this.vat_transition_end = vat_transition_end;
    }
}
