package WMS.example.WMS.repository.local.model;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PERIOD")
public class PeriodMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;


    @ColumnInfo(name="PERIOD_ID")
    public Long period_id;

    @ColumnInfo(name="PERIOD_COMPANY")
    public String period_company;

    @ColumnInfo(name="PERIOD_FIN_YEAR")
    public String period_fin_year;

    @ColumnInfo(name="PERIOD_CODE")
    public String period_code;

    @ColumnInfo(name="PERIOD_NAME")
    public String period_name;

    @ColumnInfo(name="PERIOD_ALT_NAME")
    public String period_alt_name;

    @ColumnInfo(name="PERIOD_START_DATE")
    public String period_start_date;

    @ColumnInfo(name="PERIOD_END_DATE")
    public String period_end_date;

    @ColumnInfo(name="PERIOD_CURRENT")
    public String period_current;

    @ColumnInfo(name="PERIOD_MAP_CD")
    public String period_map_cd;

    @ColumnInfo(name="PERIOD_MONTHCLOSE")
    public String period_monthclose;

    @ColumnInfo(name="PERIOD_ins_usr_id")
    public String period_ins_usr_id;

    @ColumnInfo(name="PERIOD_mod_usr_id")
    public String period_mod_usr_id;

    @ColumnInfo(name="PERIOD_ins_dt")
    public String period_ins_dt;

    @ColumnInfo(name="PERIOD_mod_dt")
    public String period_mod_dt;

    @ColumnInfo(name="PERIOD_ins_ip_add")
    public String period_ins_ip_add;

    @ColumnInfo(name="PERIOD_mod_ip_add")
    public String period_mod_ip_add;

    @ColumnInfo(name="PERIOD_status")
    public String period_status;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getPeriod_company() {
        return period_company;
    }

    public void setPeriod_company(String period_company) {
        this.period_company = period_company;
    }

    public String getPeriod_fin_year() {
        return period_fin_year;
    }

    public void setPeriod_fin_year(String period_fin_year) {
        this.period_fin_year = period_fin_year;
    }

    public String getPeriod_code() {
        return period_code;
    }

    public void setPeriod_code(String period_code) {
        this.period_code = period_code;
    }

    public String getPeriod_name() {
        return period_name;
    }

    public void setPeriod_name(String period_name) {
        this.period_name = period_name;
    }

    public String getPeriod_alt_name() {
        return period_alt_name;
    }

    public void setPeriod_alt_name(String period_alt_name) {
        this.period_alt_name = period_alt_name;
    }

    public String getPeriod_start_date() {
        return period_start_date;
    }

    public void setPeriod_start_date(String period_start_date) {
        this.period_start_date = period_start_date;
    }

    public String getPeriod_end_date() {
        return period_end_date;
    }

    public void setPeriod_end_date(String period_end_date) {
        this.period_end_date = period_end_date;
    }

    public String getPeriod_current() {
        return period_current;
    }

    public void setPeriod_current(String period_current) {
        this.period_current = period_current;
    }

    public String getPeriod_map_cd() {
        return period_map_cd;
    }

    public void setPeriod_map_cd(String period_map_cd) {
        this.period_map_cd = period_map_cd;
    }

    public String getPeriod_monthclose() {
        return period_monthclose;
    }

    public void setPeriod_monthclose(String period_monthclose) {
        this.period_monthclose = period_monthclose;
    }

    public String getPeriod_ins_usr_id() {
        return period_ins_usr_id;
    }

    public void setPeriod_ins_usr_id(String period_ins_usr_id) {
        this.period_ins_usr_id = period_ins_usr_id;
    }

    public String getPeriod_mod_usr_id() {
        return period_mod_usr_id;
    }

    public void setPeriod_mod_usr_id(String period_mod_usr_id) {
        this.period_mod_usr_id = period_mod_usr_id;
    }

    public String getPeriod_ins_dt() {
        return period_ins_dt;
    }

    public void setPeriod_ins_dt(String period_ins_dt) {
        this.period_ins_dt = period_ins_dt;
    }

    public String getPeriod_mod_dt() {
        return period_mod_dt;
    }

    public void setPeriod_mod_dt(String period_mod_dt) {
        this.period_mod_dt = period_mod_dt;
    }

    public String getPeriod_ins_ip_add() {
        return period_ins_ip_add;
    }

    public void setPeriod_ins_ip_add(String period_ins_ip_add) {
        this.period_ins_ip_add = period_ins_ip_add;
    }

    public String getPeriod_mod_ip_add() {
        return period_mod_ip_add;
    }

    public void setPeriod_mod_ip_add(String period_mod_ip_add) {
        this.period_mod_ip_add = period_mod_ip_add;
    }

    public String getPeriod_status() {
        return period_status;
    }

    public void setPeriod_status(String period_status) {
        this.period_status = period_status;
    }

    public Long getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(Long period_id) {
        this.period_id = period_id;
    }
}