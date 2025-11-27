package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "DB_STOCK")
public class DateBatchWiseStock {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "DB_ID")
    private Long db_id;

    @ColumnInfo(name = "FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name = "PRINCIPAL_CODE")
    private String principal_code;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "DB_DATE")
    private String db_date;

    @ColumnInfo(name = "DB_PROD_ID")
    private Long db_prod_id;

    @ColumnInfo(name = "DB_BATCH_ID")
    private Long db_batch_id;

    @ColumnInfo(name = "DB_TYPE")
    private Long db_type;

    @ColumnInfo(name = "DB_SOLD_QTY")
    private BigDecimal db_sold_qty;

    @ColumnInfo(name = "DB_FREE_QTY")
    private BigDecimal db_free_qty;

    @ColumnInfo(name = "DB_REPL_QTY")
    private BigDecimal db_repl_qty;

    @ColumnInfo(name = "DB_SOLD_VAL")
    private BigDecimal db_sold_val;

    @ColumnInfo(name = "DB_FREE_VAL")
    private BigDecimal db_free_val;

    @ColumnInfo(name = "DB_REPL_VAL")
    private BigDecimal db_repl_val;

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

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getDb_id() {
        return db_id;
    }

    public void setDb_id(Long db_id) {
        this.db_id = db_id;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getPrincipal_code() {
        return principal_code;
    }

    public void setPrincipal_code(String principal_code) {
        this.principal_code = principal_code;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public String getDb_date() {
        return db_date;
    }

    public void setDb_date(String db_date) {
        this.db_date = db_date;
    }

    public Long getDb_prod_id() {
        return db_prod_id;
    }

    public void setDb_prod_id(Long db_prod_id) {
        this.db_prod_id = db_prod_id;
    }

    public Long getDb_batch_id() {
        return db_batch_id;
    }

    public void setDb_batch_id(Long db_batch_id) {
        this.db_batch_id = db_batch_id;
    }

    public Long getDb_type() {
        return db_type;
    }

    public void setDb_type(Long db_type) {
        this.db_type = db_type;
    }

    public BigDecimal getDb_sold_qty() {
        return db_sold_qty;
    }

    public void setDb_sold_qty(BigDecimal db_sold_qty) {
        this.db_sold_qty = db_sold_qty;
    }

    public BigDecimal getDb_free_qty() {
        return db_free_qty;
    }

    public void setDb_free_qty(BigDecimal db_free_qty) {
        this.db_free_qty = db_free_qty;
    }

    public BigDecimal getDb_repl_qty() {
        return db_repl_qty;
    }

    public void setDb_repl_qty(BigDecimal db_repl_qty) {
        this.db_repl_qty = db_repl_qty;
    }

    public BigDecimal getDb_sold_val() {
        return db_sold_val;
    }

    public void setDb_sold_val(BigDecimal db_sold_val) {
        this.db_sold_val = db_sold_val;
    }

    public BigDecimal getDb_free_val() {
        return db_free_val;
    }

    public void setDb_free_val(BigDecimal db_free_val) {
        this.db_free_val = db_free_val;
    }

    public BigDecimal getDb_repl_val() {
        return db_repl_val;
    }

    public void setDb_repl_val(BigDecimal db_repl_val) {
        this.db_repl_val = db_repl_val;
    }
}
