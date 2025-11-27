package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "BIN_MASTER")
public class Bin_Master {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;
    @ColumnInfo(name = "BIN_ID")
    private Long bin_id;
    @ColumnInfo(name = "RACK_ID")
    private Long rack_id;
    @ColumnInfo(name = "SB_ID")
    private Long sb_id;
    @ColumnInfo(name = "WH_ID")
    private Long wh_id;
    @ColumnInfo(name = "BIN_CODE")
    private String bin_code;
    @ColumnInfo(name = "COMPANY")
    private String company;
    @ColumnInfo(name = "SUB_COMPANY")
    private String sub_company;
    @ColumnInfo(name = "SHELF_NUMBER")
    private String shelf_number;
    @ColumnInfo(name = "BIN_NUMBER")
    private String bin_number;
    @ColumnInfo(name = "Storage_Unit")
    private String storage_unit;
    @ColumnInfo(name = "Total_Capacity")
    private BigDecimal total_capacity;
    @ColumnInfo(name = "Used_Capacity")
    private BigDecimal used_capacity;
    @ColumnInfo(name = "Max_Weight")
    private String max_weight;
    @ColumnInfo(name = "Max_volume")
    private String max_volume;
    @ColumnInfo(name = "Used_Weight")
    private String used_weight;
    @ColumnInfo(name = "Used_Volume")
    private String used_volume;
    @ColumnInfo(name = "Aisle_Number")
    private String aisle_number;
    @ColumnInfo(name = "Stack_Number")
    private String stack_number;
    @ColumnInfo(name = "BIN_Depth")
    private Long bin_depth;
    @ColumnInfo(name = "QR_Code")
    private String qr_code;
    @ColumnInfo(name = "BAR_CODE")
    private String bar_code;
    @ColumnInfo(name="Assign_Putaway")
    private BigDecimal assign_putaway;

    @ColumnInfo(name="Assign_Picking")
    private BigDecimal assign_picking;

    @ColumnInfo(name="Assign_in")
    private BigDecimal assign_in;

    @ColumnInfo(name="Assign_out")
    private BigDecimal assign_out;


    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getBin_id() {
        return bin_id;
    }

    public void setBin_id(Long bin_id) {
        this.bin_id = bin_id;
    }

    public Long getRack_id() {
        return rack_id;
    }

    public void setRack_id(Long rack_id) {
        this.rack_id = rack_id;
    }

    public Long getSb_id() {
        return sb_id;
    }

    public void setSb_id(Long sb_id) {
        this.sb_id = sb_id;
    }

    public Long getWh_id() {
        return wh_id;
    }

    public void setWh_id(Long wh_id) {
        this.wh_id = wh_id;
    }

    public String getBin_code() {
        return bin_code;
    }

    public void setBin_code(String bin_code) {
        this.bin_code = bin_code;
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

    public String getShelf_number() {
        return shelf_number;
    }

    public void setShelf_number(String shelf_number) {
        this.shelf_number = shelf_number;
    }

    public String getBin_number() {
        return bin_number;
    }

    public void setBin_number(String bin_number) {
        this.bin_number = bin_number;
    }

    public String getStorage_unit() {
        return storage_unit;
    }

    public void setStorage_unit(String storage_unit) {
        this.storage_unit = storage_unit;
    }

    public BigDecimal getTotal_capacity() {
        return total_capacity;
    }

    public void setTotal_capacity(BigDecimal total_capacity) {
        this.total_capacity = total_capacity;
    }

    public BigDecimal getUsed_capacity() {
        return used_capacity;
    }

    public void setUsed_capacity(BigDecimal used_capacity) {
        this.used_capacity = used_capacity;
    }

    public String getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(String max_weight) {
        this.max_weight = max_weight;
    }

    public String getMax_volume() {
        return max_volume;
    }

    public void setMax_volume(String max_volume) {
        this.max_volume = max_volume;
    }

    public String getUsed_weight() {
        return used_weight;
    }

    public void setUsed_weight(String used_weight) {
        this.used_weight = used_weight;
    }

    public String getUsed_volume() {
        return used_volume;
    }

    public void setUsed_volume(String used_volume) {
        this.used_volume = used_volume;
    }

    public String getAisle_number() {
        return aisle_number;
    }

    public void setAisle_number(String aisle_number) {
        this.aisle_number = aisle_number;
    }

    public String getStack_number() {
        return stack_number;
    }

    public void setStack_number(String stack_number) {
        this.stack_number = stack_number;
    }

    public Long getBin_depth() {
        return bin_depth;
    }

    public void setBin_depth(Long bin_depth) {
        this.bin_depth = bin_depth;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public BigDecimal getAssign_putaway() {
        return assign_putaway;
    }

    public void setAssign_putaway(BigDecimal assign_putaway) {
        this.assign_putaway = assign_putaway;
    }

    public BigDecimal getAssign_picking() {
        return assign_picking;
    }

    public void setAssign_picking(BigDecimal assign_picking) {
        this.assign_picking = assign_picking;
    }

    public BigDecimal getAssign_in() {
        return assign_in;
    }

    public void setAssign_in(BigDecimal assign_in) {
        this.assign_in = assign_in;
    }

    public BigDecimal getAssign_out() {
        return assign_out;
    }

    public void setAssign_out(BigDecimal assign_out) {
        this.assign_out = assign_out;
    }
}
