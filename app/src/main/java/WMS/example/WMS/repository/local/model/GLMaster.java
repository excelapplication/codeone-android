package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "GL_MAST")
public class GLMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "GL_ACC_ID")
    private Long gl_acc_id;

    @ColumnInfo(name = "GL_ACC_CODE")
    private String gl_acc_code;

    @ColumnInfo(name = "ACCTG_COMP_CD")
    private String acctg_comp_cd;

    @ColumnInfo(name = "ACC_TYPE")
    private String acc_type;

    @ColumnInfo(name = "ACC_NAME")
    private String acc_name;

    @ColumnInfo(name = "SUMM_IND")
    private String summ_ind;

    @ColumnInfo(name = "BANK_IND")
    private String bank_ind;

    @ColumnInfo(name = "DEP_SLIP_SERIES")
    private String dep_slip_series;

    @ColumnInfo(name = "BANK_ACC_NUM")
    private String bank_acc_num;

    @ColumnInfo(name = "DEBTORS_CTRL")
    private String debtors_ctrl;

    @ColumnInfo(name = "CREDITORS_CTRL")
    private String creditors_ctrl;

    @ColumnInfo(name = "CASH_IND")
    private String cash_ind;

    @ColumnInfo(name = "BANK_CLIENT_CODE")
    private String bank_client_code;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getGl_acc_id() {
        return gl_acc_id;
    }

    public void setGl_acc_id(Long gl_acc_id) {
        this.gl_acc_id = gl_acc_id;
    }

    public String getGl_acc_code() {
        return gl_acc_code;
    }

    public void setGl_acc_code(String gl_acc_code) {
        this.gl_acc_code = gl_acc_code;
    }

    public String getAcctg_comp_cd() {
        return acctg_comp_cd;
    }

    public void setAcctg_comp_cd(String acctg_comp_cd) {
        this.acctg_comp_cd = acctg_comp_cd;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public String getSumm_ind() {
        return summ_ind;
    }

    public void setSumm_ind(String summ_ind) {
        this.summ_ind = summ_ind;
    }

    public String getBank_ind() {
        return bank_ind;
    }

    public void setBank_ind(String bank_ind) {
        this.bank_ind = bank_ind;
    }

    public String getDep_slip_series() {
        return dep_slip_series;
    }

    public void setDep_slip_series(String dep_slip_series) {
        this.dep_slip_series = dep_slip_series;
    }

    public String getBank_acc_num() {
        return bank_acc_num;
    }

    public void setBank_acc_num(String bank_acc_num) {
        this.bank_acc_num = bank_acc_num;
    }

    public String getDebtors_ctrl() {
        return debtors_ctrl;
    }

    public void setDebtors_ctrl(String debtors_ctrl) {
        this.debtors_ctrl = debtors_ctrl;
    }

    public String getCreditors_ctrl() {
        return creditors_ctrl;
    }

    public void setCreditors_ctrl(String creditors_ctrl) {
        this.creditors_ctrl = creditors_ctrl;
    }

    public String getCash_ind() {
        return cash_ind;
    }

    public void setCash_ind(String cash_ind) {
        this.cash_ind = cash_ind;
    }

    public String getBank_client_code() {
        return bank_client_code;
    }

    public void setBank_client_code(String bank_client_code) {
        this.bank_client_code = bank_client_code;
    }

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
}
