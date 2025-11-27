package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class ACCTran {

    private Long pk;
    private Long tran_id;
    private Long fin_year_id;
    private String accntg_co_cd;
    private BigDecimal tds_post_amt;
    private BigDecimal tds_perc;

    private Long cust_id;
    private String tran_type;
    private String tran_no;
    private String tran_date;
    private String ac_ccd;
    private Long gl_acc_id;
    private Long sl_acc_id;
    private String deposit_dt;
    private Long post_gl_id;
    private Long post_sl_acc_id;
    private Long instru_type_id;
    private String cheque_no;
    private String cheque_dt;
    private String cheque_bank;
    private String bounce_ind;
    private Long bounce_rsn_id;
    private BigDecimal amount;
    private String narration;
    private String deposit_slip_no;
    private String chq_rep_ind;
    private Long times_represented;
    private Long curr_id;
    private BigDecimal conv_rate;
    private BigDecimal conv_value;
    private String hsn_code;
    private String goods_descr;
    private String gst_reverse_chg;
    private Long cgst_rate;
    private BigDecimal cgst_value;
    private Long sgst_rate;
    private BigDecimal sgst_value;
    private Long igst_rate;
    private BigDecimal igst_value;
    private String adv_tran;
    private String gst_advance;
    private BigDecimal gst_adv_amt;
    private String gst_doc_type;
    private String last_mod_by;
    private String last_mod_dt;

    public Long getPk() {
        return pk;
    }


    public BigDecimal getTds_post_amt() {
        return tds_post_amt;
    }

    public void setTds_post_amt(BigDecimal tds_post_amt) {
        this.tds_post_amt = tds_post_amt;
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

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public String getTran_no() {
        return tran_no;
    }

    public void setTran_no(String tran_no) {
        this.tran_no = tran_no;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
    }

    public String getAc_ccd() {
        return ac_ccd;
    }

    public void setAc_ccd(String ac_ccd) {
        this.ac_ccd = ac_ccd;
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

    public String getDeposit_dt() {
        return deposit_dt;
    }

    public void setDeposit_dt(String deposit_dt) {
        this.deposit_dt = deposit_dt;
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

    public String getCheque_bank() {
        return cheque_bank;
    }

    public void setCheque_bank(String cheque_bank) {
        this.cheque_bank = cheque_bank;
    }

    public String getBounce_ind() {
        return bounce_ind;
    }

    public void setBounce_ind(String bounce_ind) {
        this.bounce_ind = bounce_ind;
    }

    public Long getBounce_rsn_id() {
        return bounce_rsn_id;
    }

    public void setBounce_rsn_id(Long bounce_rsn_id) {
        this.bounce_rsn_id = bounce_rsn_id;
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

    public String getDeposit_slip_no() {
        return deposit_slip_no;
    }

    public void setDeposit_slip_no(String deposit_slip_no) {
        this.deposit_slip_no = deposit_slip_no;
    }

    public String getChq_rep_ind() {
        return chq_rep_ind;
    }

    public void setChq_rep_ind(String chq_rep_ind) {
        this.chq_rep_ind = chq_rep_ind;
    }

    public Long getTimes_represented() {
        return times_represented;
    }

    public void setTimes_represented(Long times_represented) {
        this.times_represented = times_represented;
    }

    public Long getCurr_id() {
        return curr_id;
    }

    public void setCurr_id(Long curr_id) {
        this.curr_id = curr_id;
    }

    public BigDecimal getConv_rate() {
        return conv_rate;
    }

    public void setConv_rate(BigDecimal conv_rate) {
        this.conv_rate = conv_rate;
    }

    public BigDecimal getConv_value() {
        return conv_value;
    }

    public void setConv_value(BigDecimal conv_value) {
        this.conv_value = conv_value;
    }

    public String getHsn_code() {
        return hsn_code;
    }

    public void setHsn_code(String hsn_code) {
        this.hsn_code = hsn_code;
    }

    public String getGoods_descr() {
        return goods_descr;
    }

    public void setGoods_descr(String goods_descr) {
        this.goods_descr = goods_descr;
    }

    public String getGst_reverse_chg() {
        return gst_reverse_chg;
    }

    public void setGst_reverse_chg(String gst_reverse_chg) {
        this.gst_reverse_chg = gst_reverse_chg;
    }

    public Long getCgst_rate() {
        return cgst_rate;
    }

    public void setCgst_rate(Long cgst_rate) {
        this.cgst_rate = cgst_rate;
    }

    public BigDecimal getCgst_value() {
        return cgst_value;
    }

    public void setCgst_value(BigDecimal cgst_value) {
        this.cgst_value = cgst_value;
    }

    public Long getSgst_rate() {
        return sgst_rate;
    }

    public void setSgst_rate(Long sgst_rate) {
        this.sgst_rate = sgst_rate;
    }

    public BigDecimal getSgst_value() {
        return sgst_value;
    }

    public void setSgst_value(BigDecimal sgst_value) {
        this.sgst_value = sgst_value;
    }

    public Long getIgst_rate() {
        return igst_rate;
    }

    public void setIgst_rate(Long igst_rate) {
        this.igst_rate = igst_rate;
    }

    public BigDecimal getIgst_value() {
        return igst_value;
    }

    public void setIgst_value(BigDecimal igst_value) {
        this.igst_value = igst_value;
    }

    public String getAdv_tran() {
        return adv_tran;
    }

    public void setAdv_tran(String adv_tran) {
        this.adv_tran = adv_tran;
    }

    public String getGst_advance() {
        return gst_advance;
    }

    public void setGst_advance(String gst_advance) {
        this.gst_advance = gst_advance;
    }

    public BigDecimal getGst_adv_amt() {
        return gst_adv_amt;
    }

    public void setGst_adv_amt(BigDecimal gst_adv_amt) {
        this.gst_adv_amt = gst_adv_amt;
    }

    public String getGst_doc_type() {
        return gst_doc_type;
    }

    public void setGst_doc_type(String gst_doc_type) {
        this.gst_doc_type = gst_doc_type;
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

    public BigDecimal getTds_perc() {
        return tds_perc;
    }

    public void setTds_perc(BigDecimal tds_perc) {
        this.tds_perc = tds_perc;
    }
}
