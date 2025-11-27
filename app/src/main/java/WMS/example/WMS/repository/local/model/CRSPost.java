package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CRS_POST")
public class CRSPost {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

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

    @ColumnInfo(name = "DUE_DATE")
    private String due_date;

    @ColumnInfo(name = "LR_DATE")
    private String lr_date;

    @ColumnInfo(name = "DEPOSIT_SLIP_NO")
    private String deposit_slip_no;

    @ColumnInfo(name = "DEPOSIT_DT")
    private String deposit_dt;

    @ColumnInfo(name = "ADJ_TRAN_ID")
    private Long adj_tran_id;

    @ColumnInfo(name = "ADJ_TYPE")
    private String adj_type;

    @ColumnInfo(name = "ADJ_INV_GRP")
    private Long adj_inv_grp;

    @ColumnInfo(name = "ADJ_AMOUNT")
    private BigDecimal adj_amount;

    @ColumnInfo(name = "ADJ_TRAN_REF")
    private String adj_tran_ref;

    @ColumnInfo(name = "AC_CCD")
    private String ac_ccd;

    @ColumnInfo(name = "INVOICE_NO")
    private String invoice_no;

    @ColumnInfo(name = "ARAP_HEADER_IND")
    private String arap_header_ind;

    @ColumnInfo(name = "INSTRU_TYPE_ID")
    private Long instru_type_id;

    @ColumnInfo(name = "CHEQUE_NO")
    private String cheque_no;

    @ColumnInfo(name = "CHEQUE_DT")
    private String cheque_dt;

    @ColumnInfo(name = "CHQ_BANK")
    private String chq_bank;

    @ColumnInfo(name = "NEW_PROD_IND")
    private String new_prod_ind;

    @ColumnInfo(name = "PND_CHQ_RETURN")
    private String pnd_chq_return;

    @ColumnInfo(name = "SL_REQ_IND")
    private String sl_req_ind;

    @ColumnInfo(name = "SLNO")
    private Long slno;

    @ColumnInfo(name = "GL_CODE_REF")
    private String gl_code_ref;

    @ColumnInfo(name = "ADJ_DT")
    private String adj_dt;

    @ColumnInfo(name = "ADJ_DUE_DT")
    private String adj_due_dt;

    @ColumnInfo(name = "PERIOD_CD")
    private String period_cd;

    @ColumnInfo(name = "CNDN_ADJUST")
    private String cndn_adjust;

    @ColumnInfo(name = "CRA_CREATED")
    private String cra_created;

    @ColumnInfo(name = "ADJ_HEADER_ID")
    private String adj_header_id;

    @ColumnInfo(name = "ADJ_HEADER_DT")
    private String adj_header_dt;

    @ColumnInfo(name = "REMARK")
    private String remark;

    @ColumnInfo(name = "BLOCKED")
    private String blocked;

    @ColumnInfo(name = "REF_TRAN_ID")
    private Long ref_tran_id;

    @ColumnInfo(name = "REF_TRAN_TYPE")
    private String ref_tran_type;

    @ColumnInfo(name = "STOCK_POINT_ID")
    private Long stock_point_id;

    @ColumnInfo(name = "UPLOADED")
    private String uploaded;

    @ColumnInfo(name = "ERR_MSG")
    private String err_msg;

    @ColumnInfo(name = "ERR_DTL")
    private String err_dtl;

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

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getLr_date() {
        return lr_date;
    }

    public void setLr_date(String lr_date) {
        this.lr_date = lr_date;
    }

    public String getDeposit_slip_no() {
        return deposit_slip_no;
    }

    public void setDeposit_slip_no(String deposit_slip_no) {
        this.deposit_slip_no = deposit_slip_no;
    }

    public String getDeposit_dt() {
        return deposit_dt;
    }

    public void setDeposit_dt(String deposit_dt) {
        this.deposit_dt = deposit_dt;
    }

    public Long getAdj_tran_id() {
        return adj_tran_id;
    }

    public void setAdj_tran_id(Long adj_tran_id) {
        this.adj_tran_id = adj_tran_id;
    }

    public String getAdj_type() {
        return adj_type;
    }

    public void setAdj_type(String adj_type) {
        this.adj_type = adj_type;
    }

    public Long getAdj_inv_grp() {
        return adj_inv_grp;
    }

    public void setAdj_inv_grp(Long adj_inv_grp) {
        this.adj_inv_grp = adj_inv_grp;
    }

    public BigDecimal getAdj_amount() {
        return adj_amount;
    }

    public void setAdj_amount(BigDecimal adj_amount) {
        this.adj_amount = adj_amount;
    }

    public String getAdj_tran_ref() {
        return adj_tran_ref;
    }

    public void setAdj_tran_ref(String adj_tran_ref) {
        this.adj_tran_ref = adj_tran_ref;
    }

    public String getAc_ccd() {
        return ac_ccd;
    }

    public void setAc_ccd(String ac_ccd) {
        this.ac_ccd = ac_ccd;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getArap_header_ind() {
        return arap_header_ind;
    }

    public void setArap_header_ind(String arap_header_ind) {
        this.arap_header_ind = arap_header_ind;
    }

    public Long getInstru_type_id() {
        return instru_type_id;
    }

    public void setInstru_type_id(Long instru_type_id) {
        this.instru_type_id = instru_type_id;
    }

    public String getCheque_no() {
        return cheque_no;
    }

    public void setCheque_no(String cheque_no) {
        this.cheque_no = cheque_no;
    }

    public String getCheque_dt() {
        return cheque_dt;
    }

    public void setCheque_dt(String cheque_dt) {
        this.cheque_dt = cheque_dt;
    }

    public String getChq_bank() {
        return chq_bank;
    }

    public void setChq_bank(String chq_bank) {
        this.chq_bank = chq_bank;
    }

    public String getNew_prod_ind() {
        return new_prod_ind;
    }

    public void setNew_prod_ind(String new_prod_ind) {
        this.new_prod_ind = new_prod_ind;
    }

    public String getPnd_chq_return() {
        return pnd_chq_return;
    }

    public void setPnd_chq_return(String pnd_chq_return) {
        this.pnd_chq_return = pnd_chq_return;
    }

    public String getSl_req_ind() {
        return sl_req_ind;
    }

    public void setSl_req_ind(String sl_req_ind) {
        this.sl_req_ind = sl_req_ind;
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        this.slno = slno;
    }

    public String getGl_code_ref() {
        return gl_code_ref;
    }

    public void setGl_code_ref(String gl_code_ref) {
        this.gl_code_ref = gl_code_ref;
    }

    public String getAdj_dt() {
        return adj_dt;
    }

    public void setAdj_dt(String adj_dt) {
        this.adj_dt = adj_dt;
    }

    public String getAdj_due_dt() {
        return adj_due_dt;
    }

    public void setAdj_due_dt(String adj_due_dt) {
        this.adj_due_dt = adj_due_dt;
    }

    public String getPeriod_cd() {
        return period_cd;
    }

    public void setPeriod_cd(String period_cd) {
        this.period_cd = period_cd;
    }

    public String getCndn_adjust() {
        return cndn_adjust;
    }

    public void setCndn_adjust(String cndn_adjust) {
        this.cndn_adjust = cndn_adjust;
    }

    public String getCra_created() {
        return cra_created;
    }

    public void setCra_created(String cra_created) {
        this.cra_created = cra_created;
    }

    public String getAdj_header_id() {
        return adj_header_id;
    }

    public void setAdj_header_id(String adj_header_id) {
        this.adj_header_id = adj_header_id;
    }

    public String getAdj_header_dt() {
        return adj_header_dt;
    }

    public void setAdj_header_dt(String adj_header_dt) {
        this.adj_header_dt = adj_header_dt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public Long getRef_tran_id() {
        return ref_tran_id;
    }

    public void setRef_tran_id(Long ref_tran_id) {
        this.ref_tran_id = ref_tran_id;
    }

    public String getRef_tran_type() {
        return ref_tran_type;
    }

    public void setRef_tran_type(String ref_tran_type) {
        this.ref_tran_type = ref_tran_type;
    }

    public Long getStock_point_id() {
        return stock_point_id;
    }

    public void setStock_point_id(Long stock_point_id) {
        this.stock_point_id = stock_point_id;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
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
