package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ACC_COMPANY")
public class ACCCompany {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "ACC_CO_ID")
    private Long acc_co_id;

    @ColumnInfo(name = "ACC_CO_NAME")
    private String acc_co_name;

    @ColumnInfo(name = "ACC_CO_CODE")
    private String acc_co_code;

    @ColumnInfo(name = "ACC_Address1")
    private String acc_address1;

    @ColumnInfo(name = "ACC_Address2")
    private String acc_address2;

    @ColumnInfo(name = "ACC_ADDRESS3")
    private String acc_address3;

    @ColumnInfo(name = "ACC_PIN_CODE")
    private String acc_pin_code;

    @ColumnInfo(name = "ACC_City")
    private String acc_city;

    @ColumnInfo(name = "ACC_State")
    private String acc_state;

    @ColumnInfo(name = "ACC_PAN")
    private String acc_pan;

    @ColumnInfo(name = "ACC_GSTNO")
    private String acc_gstno;

    @ColumnInfo(name = "ACC_DLIC1")
    private String acc_dlic1;

    @ColumnInfo(name = "ACC_DLIC2")
    private String acc_dlic2;

    @ColumnInfo(name = "ACC_DLIC3")
    private String acc_dlic3;

    @ColumnInfo(name = "ACC_DLIC1_VALID")
    private String acc_dlic1_valid;

    @ColumnInfo(name = "ACC_DLIC2_VALID")
    private String acc_dlic2_valid;

    @ColumnInfo(name = "ACC_DLIC3_VALID")
    private String acc_dlic3_valid;

    @ColumnInfo(name = "SYNC_FLAG")
    private String sync_flag;

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

    public Long getAcc_co_id() {
        return acc_co_id;
    }

    public void setAcc_co_id(Long acc_co_id) {
        this.acc_co_id = acc_co_id;
    }

    public String getAcc_co_name() {
        return acc_co_name;
    }

    public void setAcc_co_name(String acc_co_name) {
        this.acc_co_name = acc_co_name;
    }

    public String getAcc_co_code() {
        return acc_co_code;
    }

    public void setAcc_co_code(String acc_co_code) {
        this.acc_co_code = acc_co_code;
    }

    public String getAcc_address1() {
        return acc_address1;
    }

    public void setAcc_address1(String acc_address1) {
        this.acc_address1 = acc_address1;
    }

    public String getAcc_address2() {
        return acc_address2;
    }

    public void setAcc_address2(String acc_address2) {
        this.acc_address2 = acc_address2;
    }

    public String getAcc_address3() {
        return acc_address3;
    }

    public void setAcc_address3(String acc_address3) {
        this.acc_address3 = acc_address3;
    }

    public String getAcc_pin_code() {
        return acc_pin_code;
    }

    public void setAcc_pin_code(String acc_pin_code) {
        this.acc_pin_code = acc_pin_code;
    }

    public String getAcc_city() {
        return acc_city;
    }

    public void setAcc_city(String acc_city) {
        this.acc_city = acc_city;
    }

    public String getAcc_state() {
        return acc_state;
    }

    public void setAcc_state(String acc_state) {
        this.acc_state = acc_state;
    }

    public String getAcc_pan() {
        return acc_pan;
    }

    public void setAcc_pan(String acc_pan) {
        this.acc_pan = acc_pan;
    }

    public String getAcc_gstno() {
        return acc_gstno;
    }

    public void setAcc_gstno(String acc_gstno) {
        this.acc_gstno = acc_gstno;
    }

    public String getAcc_dlic1() {
        return acc_dlic1;
    }

    public void setAcc_dlic1(String acc_dlic1) {
        this.acc_dlic1 = acc_dlic1;
    }

    public String getAcc_dlic2() {
        return acc_dlic2;
    }

    public void setAcc_dlic2(String acc_dlic2) {
        this.acc_dlic2 = acc_dlic2;
    }

    public String getAcc_dlic3() {
        return acc_dlic3;
    }

    public void setAcc_dlic3(String acc_dlic3) {
        this.acc_dlic3 = acc_dlic3;
    }

    public String getAcc_dlic1_valid() {
        return acc_dlic1_valid;
    }

    public void setAcc_dlic1_valid(String acc_dlic1_valid) {
        this.acc_dlic1_valid = acc_dlic1_valid;
    }

    public String getAcc_dlic2_valid() {
        return acc_dlic2_valid;
    }

    public void setAcc_dlic2_valid(String acc_dlic2_valid) {
        this.acc_dlic2_valid = acc_dlic2_valid;
    }

    public String getAcc_dlic3_valid() {
        return acc_dlic3_valid;
    }

    public void setAcc_dlic3_valid(String acc_dlic3_valid) {
        this.acc_dlic3_valid = acc_dlic3_valid;
    }

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }
}
