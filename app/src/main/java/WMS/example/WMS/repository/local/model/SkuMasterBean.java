package WMS.example.WMS.repository.local.model;

import java.math.BigDecimal;

public class SkuMasterBean {

    private Long pk;

    private String uom_id;

    private String uom_name;

    private Long main_prod_id;

    private String erp_prod_code;

    private Long skuId;

    private String prodCd;

    private String model;

    private BigDecimal qty;

    private String uom;

    private BigDecimal rate;

    private BigDecimal value;

    private BigDecimal localValue;

    private String prod_name;

    private Long prod_id;

    public String getUom_id() {
        return uom_id;
    }

    public void setUom_id(String uom_id) {
        this.uom_id = uom_id;
    }

    public String getUom_name() {
        return uom_name;
    }

    public void setUom_name(String uom_name) {
        this.uom_name = uom_name;
    }

    public String getErp_prod_code() {
        return erp_prod_code;
    }

    public void setErp_prod_code(String erp_prod_code) {
        this.erp_prod_code = erp_prod_code;
    }

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getProdCd() {
        return prodCd;
    }

    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getLocalValue() {
        return localValue;
    }

    public void setLocalValue(BigDecimal localValue) {
        this.localValue = localValue;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Long getMain_prod_id() {
        return main_prod_id;
    }

    public void setMain_prod_id(Long main_prod_id) {
        this.main_prod_id = main_prod_id;
    }
}
