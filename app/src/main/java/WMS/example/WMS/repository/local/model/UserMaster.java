package WMS.example.WMS.repository.local.model;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "am_m_login_detail")
public class UserMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;


    @ColumnInfo(name = "ld_id")
    private Long ld_id;


    @ColumnInfo(name = "ld_emp_cb_id")
    private String  ld_emp_cb_id;


    @ColumnInfo(name = "ld_usr_typ_flg")
    private String  ld_usr_typ_flg;

    @ColumnInfo(name = "ld_lgnid")
    private String  ld_lgnid;

    @ColumnInfo(name = "ld_pass")
    private String  ld_pass;

    @ColumnInfo(name = "ld_email")
    private String  ld_email;

    @ColumnInfo(name = "ld_ins_usr_id")
    private String  ld_ins_usr_id;

     @ColumnInfo(name = "ld_ins_dt")
    private String  ld_ins_dt;


    @ColumnInfo(name = "ld_mod_dt")
    private String  ld_mod_dt;

    @ColumnInfo(name = "ld_ins_ip_add")
    private String  ld_ins_ip_add;

    @ColumnInfo(name = "ld_status")
    private String  ld_status;

    @ColumnInfo(name = "ld_mod_ip_add")
    private String  ld_mod_ip_add;


    @ColumnInfo(name = "is_temp")
    private String  is_temp;


    @ColumnInfo(name = "ld_no_of_attempt_flg")
    private String  ld_no_of_attempt_flg;


    @ColumnInfo(name = "user_lock")
    private String  user_lock;


    @ColumnInfo(name = "DPTLOC_ID")
    private String  DPTLOC_ID;

    @ColumnInfo(name = "allow_batch_create")
    private String  allow_batch_create;

    @ColumnInfo(name = "user_type")
    private String  user_type;

    @ColumnInfo(name = "pass_mod_dt")
    private String  pass_mod_dt;

    @ColumnInfo(name = "ld_pass_ang")
    private String  ld_pass_ang;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getLd_id() {
        return ld_id;
    }

    public void setLd_id(Long ld_id) {
        this.ld_id = ld_id;
    }

    public String getLd_emp_cb_id() {
        return ld_emp_cb_id;
    }

    public void setLd_emp_cb_id(String ld_emp_cb_id) {
        this.ld_emp_cb_id = ld_emp_cb_id;
    }

    public String getLd_usr_typ_flg() {
        return ld_usr_typ_flg;
    }

    public void setLd_usr_typ_flg(String ld_usr_typ_flg) {
        this.ld_usr_typ_flg = ld_usr_typ_flg;
    }

    public String getLd_lgnid() {
        return ld_lgnid;
    }

    public void setLd_lgnid(String ld_lgnid) {
        this.ld_lgnid = ld_lgnid;
    }

    public String getLd_pass() {
        return ld_pass;
    }

    public void setLd_pass(String ld_pass) {
        this.ld_pass = ld_pass;
    }

    public String getLd_email() {
        return ld_email;
    }

    public void setLd_email(String ld_email) {
        this.ld_email = ld_email;
    }

    public String getLd_ins_usr_id() {
        return ld_ins_usr_id;
    }

    public void setLd_ins_usr_id(String ld_ins_usr_id) {
        this.ld_ins_usr_id = ld_ins_usr_id;
    }

    public String getLd_ins_dt() {
        return ld_ins_dt;
    }

    public void setLd_ins_dt(String ld_ins_dt) {
        this.ld_ins_dt = ld_ins_dt;
    }

    public String getLd_mod_dt() {
        return ld_mod_dt;
    }

    public void setLd_mod_dt(String ld_mod_dt) {
        this.ld_mod_dt = ld_mod_dt;
    }

    public String getLd_ins_ip_add() {
        return ld_ins_ip_add;
    }

    public void setLd_ins_ip_add(String ld_ins_ip_add) {
        this.ld_ins_ip_add = ld_ins_ip_add;
    }

    public String getLd_status() {
        return ld_status;
    }

    public void setLd_status(String ld_status) {
        this.ld_status = ld_status;
    }

    public String getLd_mod_ip_add() {
        return ld_mod_ip_add;
    }

    public void setLd_mod_ip_add(String ld_mod_ip_add) {
        this.ld_mod_ip_add = ld_mod_ip_add;
    }

    public String getIs_temp() {
        return is_temp;
    }

    public void setIs_temp(String is_temp) {
        this.is_temp = is_temp;
    }

    public String getLd_no_of_attempt_flg() {
        return ld_no_of_attempt_flg;
    }

    public void setLd_no_of_attempt_flg(String ld_no_of_attempt_flg) {
        this.ld_no_of_attempt_flg = ld_no_of_attempt_flg;
    }

    public String getUser_lock() {
        return user_lock;
    }

    public void setUser_lock(String user_lock) {
        this.user_lock = user_lock;
    }

    public String getDPTLOC_ID() {
        return DPTLOC_ID;
    }

    public void setDPTLOC_ID(String DPTLOC_ID) {
        this.DPTLOC_ID = DPTLOC_ID;
    }

    public String getAllow_batch_create() {
        return allow_batch_create;
    }

    public void setAllow_batch_create(String allow_batch_create) {
        this.allow_batch_create = allow_batch_create;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPass_mod_dt() {
        return pass_mod_dt;
    }

    public void setPass_mod_dt(String pass_mod_dt) {
        this.pass_mod_dt = pass_mod_dt;
    }

    public String getLd_pass_ang() {
        return ld_pass_ang;
    }

    public void setLd_pass_ang(String ld_pass_ang) {
        this.ld_pass_ang = ld_pass_ang;
    }
}
