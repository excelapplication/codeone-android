package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "WMS_TRF_DTL")
public class Wms_trf_dtl {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;


    @ColumnInfo(name="TRAN_DTL_ID")
    private Long tran_dtl_id;

    @ColumnInfo(name="TRAN_ID")
    private Long tran_id;

    @ColumnInfo(name="TRAN_TYPE")
    private String tran_type;

    @ColumnInfo(name="WH_ID")
    private Long  wh_id;

    @ColumnInfo(name="SB_CODE")
    private String sb_code;

   @ColumnInfo(name="TRAN_DATE")
    private String tran_date;

    @ColumnInfo(name="COMPANY")
    private String company;

    @ColumnInfo(name="SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name="PERIOD_ID")
    private Long period_id;

    @ColumnInfo(name="FIN_YEAR_ID")
    private Long fin_year_id;

    @ColumnInfo(name="WMS_DTL_SLNO")
    private String wms_dtl_slno;

    @ColumnInfo(name="OUT_PROD_ID")
    private Long out_prod_id;

    @ColumnInfo(name="OUT_STOCK_TYPE")
    private String out_stock_type;

    @ColumnInfo(name="OUT_BATCH_ID")
    private Long out_batch_id;

    @ColumnInfo(name="OUT_BATCH_NAME")
    private String out_batch_name;

    @ColumnInfo(name="OUT_BIN_ID")
    private Long out_bin_id;

    @ColumnInfo(name="OUT_RACK_ID")
    private Long out_rack_id;

    @ColumnInfo(name="OUT_TRAN_QTY")
    private Long out_tran_qty;

    @ColumnInfo(name="IN_PROD_ID")
    private Long in_prod_id;

    @ColumnInfo(name="IN_STOCK_TYPE")
    private String in_stock_type;

    @ColumnInfo(name="IN_BATCH_ID")
    private Long in_batch_id;

    @ColumnInfo(name="IN_BATCH_NAME")
    private String IN_BATCH_NAME;


    @ColumnInfo(name="IN_BIN_ID")
    private Long in_bin_id;

    @ColumnInfo(name="IN_RACK_ID")
    private Long in_rack_id;


    @ColumnInfo(name="IN_TRAN_QTY")
    private String in_tran_qty ;


    @ColumnInfo(name="PROD_NAME")
    private String prod_name ;

    @ColumnInfo(name="WMS_CONFIRMED")
    private String wms_confirmed;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getTran_dtl_id() {
        return tran_dtl_id;
    }

    public void setTran_dtl_id(Long tran_dtl_id) {
        this.tran_dtl_id = tran_dtl_id;
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

    public Long getWh_id() {
        return wh_id;
    }

    public void setWh_id(Long wh_id) {
        this.wh_id = wh_id;
    }

    public String getSb_code() {
        return sb_code;
    }

    public void setSb_code(String sb_code) {
        this.sb_code = sb_code;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSub_company() {
        return sub_company;
    }

    public void setSub_company(String sub_company) {
        this.sub_company = sub_company;
    }

    public Long getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(Long period_id) {
        this.period_id = period_id;
    }

    public Long getFin_year_id() {
        return fin_year_id;
    }

    public void setFin_year_id(Long fin_year_id) {
        this.fin_year_id = fin_year_id;
    }

    public String getWms_dtl_slno() {
        return wms_dtl_slno;
    }

    public void setWms_dtl_slno(String wms_dtl_slno) {
        this.wms_dtl_slno = wms_dtl_slno;
    }

    public Long getOut_prod_id() {
        return out_prod_id;
    }

    public void setOut_prod_id(Long out_prod_id) {
        this.out_prod_id = out_prod_id;
    }

    public String getOut_stock_type() {
        return out_stock_type;
    }

    public void setOut_stock_type(String out_stock_type) {
        this.out_stock_type = out_stock_type;
    }

    public Long getOut_batch_id() {
        return out_batch_id;
    }

    public void setOut_batch_id(Long out_batch_id) {
        this.out_batch_id = out_batch_id;
    }

    public String getOut_batch_name() {
        return out_batch_name;
    }

    public void setOut_batch_name(String out_batch_name) {
        this.out_batch_name = out_batch_name;
    }

    public Long getOut_bin_id() {
        return out_bin_id;
    }

    public void setOut_bin_id(Long out_bin_id) {
        this.out_bin_id = out_bin_id;
    }

    public Long getOut_rack_id() {
        return out_rack_id;
    }

    public void setOut_rack_id(Long out_rack_id) {
        this.out_rack_id = out_rack_id;
    }

    public Long getOut_tran_qty() {
        return out_tran_qty;
    }

    public void setOut_tran_qty(Long out_tran_qty) {
        this.out_tran_qty = out_tran_qty;
    }

    public Long getIn_prod_id() {
        return in_prod_id;
    }

    public void setIn_prod_id(Long in_prod_id) {
        this.in_prod_id = in_prod_id;
    }

    public String getIn_stock_type() {
        return in_stock_type;
    }

    public void setIn_stock_type(String in_stock_type) {
        this.in_stock_type = in_stock_type;
    }

    public Long getIn_batch_id() {
        return in_batch_id;
    }

    public void setIn_batch_id(Long in_batch_id) {
        this.in_batch_id = in_batch_id;
    }

    public String getIN_BATCH_NAME() {
        return IN_BATCH_NAME;
    }

    public void setIN_BATCH_NAME(String IN_BATCH_NAME) {
        this.IN_BATCH_NAME = IN_BATCH_NAME;
    }

    public Long getIn_bin_id() {
        return in_bin_id;
    }

    public void setIn_bin_id(Long in_bin_id) {
        this.in_bin_id = in_bin_id;
    }

    public Long getIn_rack_id() {
        return in_rack_id;
    }

    public void setIn_rack_id(Long in_rack_id) {
        this.in_rack_id = in_rack_id;
    }

    public String getIn_tran_qty() {
        return in_tran_qty;
    }

    public void setIn_tran_qty(String in_tran_qty) {
        this.in_tran_qty = in_tran_qty;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getWms_confirmed() {
        return wms_confirmed;
    }

    public void setWms_confirmed(String wms_confirmed) {
        this.wms_confirmed = wms_confirmed;
    }
}

