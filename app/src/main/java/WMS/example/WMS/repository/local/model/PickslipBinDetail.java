package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "pickslip_bin_detail")
public class PickslipBinDetail {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;


    @ColumnInfo(name = "slno")
    private Long slno;

    @ColumnInfo(name = "ps_hdr_slno")
    private Long ps_hdr_slno;

    @ColumnInfo(name = "product_id")
    private Long product_id;

    @ColumnInfo(name = "batch_id")
    private Long batch_id;

    @ColumnInfo(name = "bin_id")
    private Long bin_id;

    @ColumnInfo(name = "bin_number")
    private String bin_number;

    @ColumnInfo(name = "product_qty")
    private Long product_qty;


    @ColumnInfo(name = "wh_id")
    private String wh_id;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        this.slno = slno;
    }

    public Long getPs_hdr_slno() {
        return ps_hdr_slno;
    }

    public void setPs_hdr_slno(Long ps_hdr_slno) {
        this.ps_hdr_slno = ps_hdr_slno;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Long batch_id) {
        this.batch_id = batch_id;
    }

    public Long getBin_id() {
        return bin_id;
    }

    public void setBin_id(Long bin_id) {
        this.bin_id = bin_id;
    }

    public String getBin_number() {
        return bin_number;
    }

    public void setBin_number(String bin_number) {
        this.bin_number = bin_number;
    }

    public Long getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Long product_qty) {
        this.product_qty = product_qty;
    }

    public String getWh_id() {
        return wh_id;
    }

    public void setWh_id(String wh_id) {
        this.wh_id = wh_id;
    }

    @Override
    public String toString() {
        return "PickslipBinDetail{" +
                "pk=" + pk +
                ", slno=" + slno +
                ", ps_hdr_slno=" + ps_hdr_slno +
                ", product_id=" + product_id +
                ", batch_id=" + batch_id +
                ", bin_id=" + bin_id +
                ", bin_number='" + bin_number + '\'' +
                ", product_qty=" + product_qty +
                ", wh_id='" + wh_id + '\'' +
                '}';
    }
}
