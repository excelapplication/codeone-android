package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;
import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class DispatchHeader {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "LAST_MOD_BY")
    private String last_mod_by;

    private String outStateInd;

    private String flag;

    private BigDecimal inv_value;

    @ColumnInfo(name = "DSP_ID")
    private Long dsp_id;

    @ColumnInfo(name = "DSP_NO")
    private String dsp_no;

    @ColumnInfo(name = "FINYEAR_ID")
    private Long finyear_id;

    @ColumnInfo(name = "DSP_DT")
    private String dsp_dt;

    @ColumnInfo(name = "DSP_PARENT_COCD")
    private String dsp_parent_cocd;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "DSP_PARTY_CODE")
    private Long dsp_party_code;

    @ColumnInfo(name = "CUST_NAME")
    private String cust_name;

    @ColumnInfo(name = "CUST_ADDR1")
    private String cust_addr1;

    @ColumnInfo(name = "CUST_ADDR2")
    private String cust_addr2;

    @ColumnInfo(name = "CUST_ADDR3")
    private String cust_addr3;

    @ColumnInfo(name = "CONTACT_PERSON")
    private String contact_person;

    @ColumnInfo(name = "CONTACT_NO")
    private String contact_no;

    @ColumnInfo(name = "WALKIN_CUSTIND")
    private String walkin_custind;

    @ColumnInfo(name = "CUST_WALKIN_ID")
    private Long cust_walkin_id;

    @ColumnInfo(name = "CURRENCY_ID")
    private Long currency_id;

    @ColumnInfo(name = "CONV_RATE")
    private BigDecimal conv_rate;

    @ColumnInfo(name = "CONV_VALUE")
    private BigDecimal conv_value;

    @ColumnInfo(name = "CHALLAN_DT")
    private String challan_dt;

    @ColumnInfo(name = "CHALLAN_NO")
    private String challan_no;

    @ColumnInfo(name = "LR_NO")
    private String lr_no;

    @ColumnInfo(name = "LR_DT")
    private String lr_dt;

    @ColumnInfo(name = "LORRY_NO")
    private String lorry_no;

    @ColumnInfo(name = "INV_NO")
    private String inv_no;

    @ColumnInfo(name = "INV_DATE")
    private String inv_date;

    @ColumnInfo(name = "NEW_PROD")
    private String new_prod;

    @ColumnInfo(name = "TOTAL_GOODS_VAL")
    private BigDecimal total_goods_val;

    @ColumnInfo(name = "TOTAL_TAXABLE_AMT")
    private BigDecimal total_taxable_amt;

    @ColumnInfo(name = "TRANSPORTER")
    private String transporter;

    @ColumnInfo(name = "SGST_BILL_AMT")
    private BigDecimal sgst_bill_amt;

    @ColumnInfo(name = "CGST_BILL_AMT")
    private BigDecimal cgst_bill_amt;

    @ColumnInfo(name = "IGST_BILL_AMT")
    private BigDecimal igst_bill_amt;

    @ColumnInfo(name = "CASH_DISC_PERC")
    private BigDecimal cash_disc_perc;

    @ColumnInfo(name = "CASH_DISC_AMOUNT")
    private BigDecimal cash_disc_amount;

    @ColumnInfo(name = "CASH_DISC_TYPE")
    private String cash_disc_type;

    @ColumnInfo(name = "CUST_ORDER_NO")
    private String cust_order_no;

    @ColumnInfo(name = "CUST_ORDER_DT")
    private String cust_order_dt;

    public BigDecimal getInv_value() {
        return inv_value;
    }

    public void setInv_value(BigDecimal inv_value) {
        this.inv_value = inv_value;
    }

    public String getCust_order_no() {
        return cust_order_no;
    }

    public void setCust_order_no(String cust_order_no) {
        this.cust_order_no = cust_order_no;
    }

    public String getCust_order_dt() {
        return cust_order_dt;
    }

    public void setCust_order_dt(String cust_order_dt) {
        this.cust_order_dt = cust_order_dt;
    }

    private String cancelled;

    private String ind;


    public String getOutStateInd() {
        return outStateInd;
    }

    public void setOutStateInd(String outStateInd) {
        this.outStateInd = outStateInd;
    }

    public String getCancelled() {
        return cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getDsp_id() {
        return dsp_id;
    }

    public void setDsp_id(Long dsp_id) {
        this.dsp_id = dsp_id;
    }

    public String getDsp_no() {
        return dsp_no;
    }

    public void setDsp_no(String dsp_no) {
        this.dsp_no = dsp_no;
    }

    public Long getFinyear_id() {
        return finyear_id;
    }

    public void setFinyear_id(Long finyear_id) {
        this.finyear_id = finyear_id;
    }

    public String getDsp_dt() {
        return dsp_dt;
    }

    public void setDsp_dt(String dsp_dt) {
        this.dsp_dt = dsp_dt;
    }

    public String getDsp_parent_cocd() {
        return dsp_parent_cocd;
    }

    public void setDsp_parent_cocd(String dsp_parent_cocd) {
        this.dsp_parent_cocd = dsp_parent_cocd;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public Long getDsp_party_code() {
        return dsp_party_code;
    }

    public void setDsp_party_code(Long dsp_party_code) {
        this.dsp_party_code = dsp_party_code;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_addr1() {
        return cust_addr1;
    }

    public void setCust_addr1(String cust_addr1) {
        this.cust_addr1 = cust_addr1;
    }

    public String getCust_addr2() {
        return cust_addr2;
    }

    public void setCust_addr2(String cust_addr2) {
        this.cust_addr2 = cust_addr2;
    }

    public String getCust_addr3() {
        return cust_addr3;
    }

    public void setCust_addr3(String cust_addr3) {
        this.cust_addr3 = cust_addr3;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getWalkin_custind() {
        return walkin_custind;
    }

    public void setWalkin_custind(String walkin_custind) {
        this.walkin_custind = walkin_custind;
    }

    public Long getCust_walkin_id() {
        return cust_walkin_id;
    }

    public void setCust_walkin_id(Long cust_walkin_id) {
        this.cust_walkin_id = cust_walkin_id;
    }

    public Long getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Long currency_id) {
        this.currency_id = currency_id;
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

    public String getChallan_dt() {
        return challan_dt;
    }

    public void setChallan_dt(String challan_dt) {
        this.challan_dt = challan_dt;
    }

    public String getChallan_no() {
        return challan_no;
    }

    public void setChallan_no(String challan_no) {
        this.challan_no = challan_no;
    }

    public String getLr_no() {
        return lr_no;
    }

    public void setLr_no(String lr_no) {
        this.lr_no = lr_no;
    }

    public String getLr_dt() {
        return lr_dt;
    }

    public void setLr_dt(String lr_dt) {
        this.lr_dt = lr_dt;
    }

    public String getLorry_no() {
        return lorry_no;
    }

    public void setLorry_no(String lorry_no) {
        this.lorry_no = lorry_no;
    }

    public String getInv_no() {
        return inv_no;
    }

    public void setInv_no(String inv_no) {
        this.inv_no = inv_no;
    }

    public String getInv_date() {
        return inv_date;
    }

    public void setInv_date(String inv_date) {
        this.inv_date = inv_date;
    }

    public String getNew_prod() {
        return new_prod;
    }

    public void setNew_prod(String new_prod) {
        this.new_prod = new_prod;
    }

    public BigDecimal getTotal_goods_val() {
        return total_goods_val;
    }

    public void setTotal_goods_val(BigDecimal total_goods_val) {
        this.total_goods_val = total_goods_val;
    }

    public BigDecimal getTotal_taxable_amt() {
        return total_taxable_amt;
    }

    public void setTotal_taxable_amt(BigDecimal total_taxable_amt) {
        this.total_taxable_amt = total_taxable_amt;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public BigDecimal getSgst_bill_amt() {
        return sgst_bill_amt;
    }

    public void setSgst_bill_amt(BigDecimal sgst_bill_amt) {
        this.sgst_bill_amt = sgst_bill_amt;
    }

    public BigDecimal getCgst_bill_amt() {
        return cgst_bill_amt;
    }

    public void setCgst_bill_amt(BigDecimal cgst_bill_amt) {
        this.cgst_bill_amt = cgst_bill_amt;
    }

    public BigDecimal getIgst_bill_amt() {
        return igst_bill_amt;
    }

    public void setIgst_bill_amt(BigDecimal igst_bill_amt) {
        this.igst_bill_amt = igst_bill_amt;
    }

    public BigDecimal getCash_disc_perc() {
        return cash_disc_perc;
    }

    public void setCash_disc_perc(BigDecimal cash_disc_perc) {
        this.cash_disc_perc = cash_disc_perc;
    }

    public BigDecimal getCash_disc_amount() {
        return cash_disc_amount;
    }

    public void setCash_disc_amount(BigDecimal cash_disc_amount) {
        this.cash_disc_amount = cash_disc_amount;
    }

    public String getCash_disc_type() {
        return cash_disc_type;
    }

    public void setCash_disc_type(String cash_disc_type) {
        this.cash_disc_type = cash_disc_type;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getLast_mod_by() {
        return last_mod_by;
    }

    public void setLast_mod_by(String last_mod_by) {
        this.last_mod_by = last_mod_by;
    }

//    public Date getLast_mod_dt() {
//        return last_mod_dt;
//    }
//
//    public void setLast_mod_dt(Date last_mod_dt) {
//        this.last_mod_dt = last_mod_dt;
//    }
}
