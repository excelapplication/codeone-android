package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "APMAS")
public class APMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "SL_NO")
    private Long sl_no;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "PARENT_COCD")
    private String parent_cocd;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "ERP_PARTY_CODE")
    private String erp_party_code;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "COMP_CD")
    private String comp_cd;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "DIV_ID")
    private Long div_id;

    @ColumnInfo(name = "TRAN_ID")
    private Long tran_id;

    @ColumnInfo(name = "TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name = "TRAN_NO")
    private String tran_no;

    @ColumnInfo(name = "INV_NUM")
    private String inv_num;

    @ColumnInfo(name = "TRAN_DATE")
    private String tran_date;

    @ColumnInfo(name = "DUE_DATE")
    private String due_date;

    @ColumnInfo(name = "LR_DATE")
    private String lr_date;

    @ColumnInfo(name = "LR_NUMBER")
    private String lr_number;

    @ColumnInfo(name = "AMOUNT")
    private BigDecimal amount;

    @ColumnInfo(name = "ADJ_COLLECTION")
    private BigDecimal adj_collection;

    @ColumnInfo(name = "ADJ_INVOICE")
    private BigDecimal adj_invoice;

    @ColumnInfo(name = "ADJ_CN")
    private BigDecimal adj_cn;

    @ColumnInfo(name = "ADJ_DN")
    private BigDecimal adj_dn;

    @ColumnInfo(name = "ADJ_CRA")
    private BigDecimal adj_cra;

    @ColumnInfo(name = "ADJ_JV_CR")
    private BigDecimal adj_jv_cr;

    @ColumnInfo(name = "PENDING")
    private BigDecimal pending;

    @ColumnInfo(name = "NEW_PROD_IND")
    private String new_prod_ind;

    @ColumnInfo(name = "REMARK")
    private String remark;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    @ColumnInfo(name = "LAST_MOD_DT")
    private String last_mod_dt;

    private BigDecimal paid;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getSl_no() {
        return sl_no;
    }

    public void setSl_no(Long sl_no) {
        this.sl_no = sl_no;
    }

    public Long getHeader_pk() {
        return header_pk;
    }

    public void setHeader_pk(Long header_pk) {
        this.header_pk = header_pk;
    }

    public String getParent_cocd() {
        return parent_cocd;
    }

    public void setParent_cocd(String parent_cocd) {
        this.parent_cocd = parent_cocd;
    }

    public String getAccntg_cocd() {
        return accntg_cocd;
    }

    public void setAccntg_cocd(String accntg_cocd) {
        this.accntg_cocd = accntg_cocd;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
    }

    public String getCfa_loc_code() {
        return cfa_loc_code;
    }

    public void setCfa_loc_code(String cfa_loc_code) {
        this.cfa_loc_code = cfa_loc_code;
    }

    public String getComp_cd() {
        return comp_cd;
    }

    public void setComp_cd(String comp_cd) {
        this.comp_cd = comp_cd;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public Long getDiv_id() {
        return div_id;
    }

    public void setDiv_id(Long div_id) {
        this.div_id = div_id;
    }

    public Long getTran_id() {
        return tran_id;
    }

    public void setTran_id(Long tran_id) {
        this.tran_id = tran_id;
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

    public String getInv_num() {
        return inv_num;
    }

    public void setInv_num(String inv_num) {
        this.inv_num = inv_num;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
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

    public String getLr_number() {
        return lr_number;
    }

    public void setLr_number(String lr_number) {
        this.lr_number = lr_number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAdj_collection() {
        return adj_collection;
    }

    public void setAdj_collection(BigDecimal adj_collection) {
        this.adj_collection = adj_collection;
    }

    public BigDecimal getAdj_invoice() {
        return adj_invoice;
    }

    public void setAdj_invoice(BigDecimal adj_invoice) {
        this.adj_invoice = adj_invoice;
    }

    public BigDecimal getAdj_cn() {
        return adj_cn;
    }

    public void setAdj_cn(BigDecimal adj_cn) {
        this.adj_cn = adj_cn;
    }

    public BigDecimal getAdj_dn() {
        return adj_dn;
    }

    public void setAdj_dn(BigDecimal adj_dn) {
        this.adj_dn = adj_dn;
    }

    public BigDecimal getAdj_cra() {
        return adj_cra;
    }

    public void setAdj_cra(BigDecimal adj_cra) {
        this.adj_cra = adj_cra;
    }

    public BigDecimal getAdj_jv_cr() {
        return adj_jv_cr;
    }

    public void setAdj_jv_cr(BigDecimal adj_jv_cr) {
        this.adj_jv_cr = adj_jv_cr;
    }

    public BigDecimal getPending() {
        return pending;
    }

    public void setPending(BigDecimal pending) {
        this.pending = pending;
    }

    public String getNew_prod_ind() {
        return new_prod_ind;
    }

    public void setNew_prod_ind(String new_prod_ind) {
        this.new_prod_ind = new_prod_ind;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }
}
