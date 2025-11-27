package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class PurchaseValues {

    private String col_code;
    private String col_type;
    private String col_glacc;
    private String gl_acc_id;
    private String col_descr;
    private BigDecimal amount;
    private String col_addsub;

    public String getCol_addsub() {
        return col_addsub;
    }

    public void setCol_addsub(String col_addsub) {
        this.col_addsub = col_addsub;
    }

    public String getCol_code() {
        return col_code;
    }

    public void setCol_code(String col_code) {
        this.col_code = col_code;
    }

    public String getCol_type() {
        return col_type;
    }

    public void setCol_type(String col_type) {
        this.col_type = col_type;
    }

    public String getCol_glacc() {
        return col_glacc;
    }

    public void setCol_glacc(String col_glacc) {
        this.col_glacc = col_glacc;
    }

    public String getGl_acc_id() {
        return gl_acc_id;
    }

    public void setGl_acc_id(String gl_acc_id) {
        this.gl_acc_id = gl_acc_id;
    }

    public String getCol_descr() {
        return col_descr;
    }

    public void setCol_descr(String col_descr) {
        this.col_descr = col_descr;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
