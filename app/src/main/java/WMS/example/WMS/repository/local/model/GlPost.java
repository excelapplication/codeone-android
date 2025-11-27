package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "GL_POST")
public class GlPost {

    @PrimaryKey
    @ColumnInfo(name =  "PK")
    private Long pk;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

    @ColumnInfo(name = "POST_IND")
    private String post_ind;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "TRAN_DATE")
    private String tran_date;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "GL_ACC_ID")
    private Long gl_acc_id;

    @ColumnInfo(name = "SL_ACC_ID")
    private Long sl_acc_id;

    @ColumnInfo(name = "POST_GL_ID")
    private Long post_gl_id;

    @ColumnInfo(name = "POST_SL_ACC_ID")
    private Long post_sl_acc_id;

    @ColumnInfo(name = "BOUNCE_IND")
    private String bounce_ind;

    @ColumnInfo(name = "AMOUNT")
    private BigDecimal amount;

    @ColumnInfo(name = "NARRATION")
    private String narration;

    @ColumnInfo(name = "SUMMARY_IND")
    private String summary_ind;

    @ColumnInfo(name = "SLNO")
    private Long slno;

    @ColumnInfo(name = "GL_CODE")
    private String gl_code;

    @ColumnInfo(name = "PERIOD_CD")
    private String period_cd;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    @ColumnInfo(name = "ERR_MSG")
    private String err_msg;

    @ColumnInfo(name = "ERR_DTL")
    private String err_dtl;

    @ColumnInfo(name = "UPD_IND")
    private Long upd_ind;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getHeader_pk() {
        return header_pk;
    }

    public void setHeader_pk(Long header_pk) {
        this.header_pk = header_pk;
    }

    public Long getTran_id() {
        return tran_id;
    }

    public void setTran_id(Long tran_id) {
        this.tran_id = tran_id;
    }

    public String getPost_ind() {
        return post_ind;
    }

    public void setPost_ind(String post_ind) {
        this.post_ind = post_ind;
    }

    public String getTran_no() {
        return tran_no;
    }

    public void setTran_no(String tran_no) {
        this.tran_no = tran_no;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public Long getGl_acc_id() {
        return gl_acc_id;
    }

    public void setGl_acc_id(Long gl_acc_id) {
        this.gl_acc_id = gl_acc_id;
    }

    public Long getSl_acc_id() {
        return sl_acc_id;
    }

    public void setSl_acc_id(Long sl_acc_id) {
        this.sl_acc_id = sl_acc_id;
    }

    public Long getPost_gl_id() {
        return post_gl_id;
    }

    public void setPost_gl_id(Long post_gl_id) {
        this.post_gl_id = post_gl_id;
    }

    public Long getPost_sl_acc_id() {
        return post_sl_acc_id;
    }

    public void setPost_sl_acc_id(Long post_sl_acc_id) {
        this.post_sl_acc_id = post_sl_acc_id;
    }

    public String getBounce_ind() {
        return bounce_ind;
    }

    public void setBounce_ind(String bounce_ind) {
        this.bounce_ind = bounce_ind;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getSummary_ind() {
        return summary_ind;
    }

    public void setSummary_ind(String summary_ind) {
        this.summary_ind = summary_ind;
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        this.slno = slno;
    }

    public String getGl_code() {
        return gl_code;
    }

    public void setGl_code(String gl_code) {
        this.gl_code = gl_code;
    }

    public String getPeriod_cd() {
        return period_cd;
    }

    public void setPeriod_cd(String period_cd) {
        this.period_cd = period_cd;
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

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getErr_dtl() {
        return err_dtl;
    }

    public void setErr_dtl(String err_dtl) {
        this.err_dtl = err_dtl;
    }

    public Long getUpd_ind() {
        return upd_ind;
    }

    public void setUpd_ind(Long upd_ind) {
        this.upd_ind = upd_ind;
    }
}
