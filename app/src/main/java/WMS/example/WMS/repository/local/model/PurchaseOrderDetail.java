package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PO_DETAIL")
public class PurchaseOrderDetail {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "HEADER_PK")
    private Long header_pk;

    @ColumnInfo(name = "ORD_DTL_ID")
    private Long ord_dtl_id;

    @ColumnInfo(name = "ORD_ID")
    private Long ord_id;

    @ColumnInfo(name = "ORD_PRINCIPAL_COCD")
    private String ord_principal_cocd;

    @ColumnInfo(name = "ORD_ERP_PARTY_CODE")
    private String erp_party_code;

    @ColumnInfo(name = "ACCNTG_COCD")
    private String accntg_cocd;

    @ColumnInfo(name = "CFA_LOC_CODE")
    private String cfa_loc_code;

    @ColumnInfo(name = "ERP_PROD_CD")
    private String erp_prod_cd;

    @ColumnInfo(name = "PROD_CD")
    private String prod_cd;

    @ColumnInfo(name = "PROD_ID")
    private Long prod_id;

    @ColumnInfo(name = "DIV_ID")
    private Long div_id;

    @ColumnInfo(name = "STATUS")
    private String status;

    @ColumnInfo(name = "ORD_TOT_QTY")
    private Long ord_tot_qty;

    @ColumnInfo(name = "ORD_SOLD_QTY")
    private Long ord_sold_qty;

    @ColumnInfo(name = "ORD_FREE_QTY")
    private Long ord_free_qty;

    @ColumnInfo(name = "ORD_REPL_QTY")
    private Long ord_repl_qty;

    @ColumnInfo(name = "SUPPLY_SOLD_QTY")
    private Long supply_sold_qty;

    @ColumnInfo(name = "SUPPLY_FREE_QTY")
    private Long supply_free_qty;

    @ColumnInfo(name = "SUPPLY_REPL_QTY")
    private Long supply_repl_qty;

    @ColumnInfo(name = "SCHEME_CODE")
    private String scheme_code;

    @ColumnInfo(name = "RATE")
    private BigDecimal rate;

    @ColumnInfo(name = "SPECIAL_RATE")
    private BigDecimal special_rate;

    @ColumnInfo(name = "PARTY_DISC_PERC")
    private BigDecimal party_disc_perc;

    @ColumnInfo(name = "PROD_DISC")
    private BigDecimal prod_disc;

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

    public Long getOrd_dtl_id() {
        return ord_dtl_id;
    }

    public void setOrd_dtl_id(Long ord_dtl_id) {
        this.ord_dtl_id = ord_dtl_id;
    }

    public String getProd_cd() {
        return prod_cd;
    }

    public void setProd_cd(String prod_cd) {
        this.prod_cd = prod_cd;
    }

    public Long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Long ord_id) {
        this.ord_id = ord_id;
    }

    public String getOrd_principal_cocd() {
        return ord_principal_cocd;
    }

    public void setOrd_principal_cocd(String ord_principal_cocd) {
        this.ord_principal_cocd = ord_principal_cocd;
    }

    public String getErp_party_code() {
        return erp_party_code;
    }

    public void setErp_party_code(String erp_party_code) {
        this.erp_party_code = erp_party_code;
    }

    public String getErp_prod_cd() {
        return erp_prod_cd;
    }

    public void setErp_prod_cd(String erp_prod_cd) {
        this.erp_prod_cd = erp_prod_cd;
    }

    public String getAccntg_cocd() {
        return accntg_cocd;
    }

    public void setAccntg_cocd(String accntg_cocd) {
        this.accntg_cocd = accntg_cocd;
    }

    public String getCfa_loc_code() {
        return cfa_loc_code;
    }

    public void setCfa_loc_code(String cfa_loc_code) {
        this.cfa_loc_code = cfa_loc_code;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public Long getDiv_id() {
        return div_id;
    }

    public void setDiv_id(Long div_id) {
        this.div_id = div_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOrd_tot_qty() {
        return ord_tot_qty;
    }

    public void setOrd_tot_qty(Long ord_tot_qty) {
        this.ord_tot_qty = ord_tot_qty;
    }

    public Long getOrd_sold_qty() {
        return ord_sold_qty;
    }

    public void setOrd_sold_qty(Long ord_sold_qty) {
        this.ord_sold_qty = ord_sold_qty;
    }

    public Long getOrd_free_qty() {
        return ord_free_qty;
    }

    public void setOrd_free_qty(Long ord_free_qty) {
        this.ord_free_qty = ord_free_qty;
    }

    public Long getOrd_repl_qty() {
        return ord_repl_qty;
    }

    public void setOrd_repl_qty(Long ord_repl_qty) {
        this.ord_repl_qty = ord_repl_qty;
    }

    public Long getSupply_sold_qty() {
        return supply_sold_qty;
    }

    public void setSupply_sold_qty(Long supply_sold_qty) {
        this.supply_sold_qty = supply_sold_qty;
    }

    public Long getSupply_free_qty() {
        return supply_free_qty;
    }

    public void setSupply_free_qty(Long supply_free_qty) {
        this.supply_free_qty = supply_free_qty;
    }

    public Long getSupply_repl_qty() {
        return supply_repl_qty;
    }

    public void setSupply_repl_qty(Long supply_repl_qty) {
        this.supply_repl_qty = supply_repl_qty;
    }

    public String getScheme_code() {
        return scheme_code;
    }

    public void setScheme_code(String scheme_code) {
        this.scheme_code = scheme_code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getSpecial_rate() {
        return special_rate;
    }

    public void setSpecial_rate(BigDecimal special_rate) {
        this.special_rate = special_rate;
    }

    public BigDecimal getParty_disc_perc() {
        return party_disc_perc;
    }

    public void setParty_disc_perc(BigDecimal party_disc_perc) {
        this.party_disc_perc = party_disc_perc;
    }

    public BigDecimal getProd_disc() {
        return prod_disc;
    }

    public void setProd_disc(BigDecimal prod_disc) {
        this.prod_disc = prod_disc;
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
