package WMS.example.WMS.repository.local.model;



import java.math.BigDecimal;


public class Wms_AnalyticsBean {
    private Long ROWNUM;
    private String type;

    private String warehouse;

    private String username;
    private String movement;
    private String uom;
    private BigDecimal trn_qty;

    private BigDecimal trn_value;

    private BigDecimal trn_volume;

    private BigDecimal trn_weight;
    private Long trn_shpr_pack;
    private Long loose;
    private  String  row;

    public Long getROWNUM() {
        return ROWNUM;
    }

    public void setROWNUM(Long ROWNUM) {
        this.ROWNUM = ROWNUM;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getTrn_qty() {
        return trn_qty;
    }

    public void setTrn_qty(BigDecimal trn_qty) {
        this.trn_qty = trn_qty;
    }

    public BigDecimal getTrn_value() {
        return trn_value;
    }

    public void setTrn_value(BigDecimal trn_value) {
        this.trn_value = trn_value;
    }

    public BigDecimal getTrn_volume() {
        return trn_volume;
    }

    public void setTrn_volume(BigDecimal trn_volume) {
        this.trn_volume = trn_volume;
    }

    public BigDecimal getTrn_weight() {
        return trn_weight;
    }

    public void setTrn_weight(BigDecimal trn_weight) {
        this.trn_weight = trn_weight;
    }

    public Long getTrn_shpr_pack() {
        return trn_shpr_pack;
    }

    public void setTrn_shpr_pack(Long trn_shpr_pack) {
        this.trn_shpr_pack = trn_shpr_pack;
    }

    public Long getLoose() {
        return loose;
    }

    public void setLoose(Long loose) {
        this.loose = loose;
    }
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Wms_AnalyticsBean{" +
                "ROWNUM=" + ROWNUM +
                ", type='" + type + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", username='" + username + '\'' +
                ", movement='" + movement + '\'' +
                ", uom='" + uom + '\'' +
                ", trn_qty=" + trn_qty +
                ", trn_value=" + trn_value +
                ", trn_volume=" + trn_volume +
                ", trn_weight=" + trn_weight +
                ", trn_shpr_pack=" + trn_shpr_pack +
                ", loose=" + loose +
                ", row='" + row + '\'' +
                '}';
    }
}
