package WMS.example.WMS.repository.local.model;



import java.math.BigDecimal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import WMS.example.WMS.util.converter.BigDecimalConverter;

@Entity(tableName = "PARAMETER")
public class Parameter {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "ACCNTG_CO_CD")
    private String accntg_co_cd;

    @ColumnInfo(name = "PARA_ID")
    private Long para_id;

    @ColumnInfo(name = "PARA_TYPE")
    private String para_type;

    @ColumnInfo(name = "PARA_CODE")
    private String para_code;

    @ColumnInfo(name = "PARA_DESCR")
    private String para_descr;

    @ColumnInfo(name = "Para_Remarks")
    private String para_remarks;

    @ColumnInfo(name = "MEDICO1")
    private String medico1;

    @ColumnInfo(name = "MEDICO2")
    private String medico2;

    @TypeConverters(BigDecimalConverter.class)
    @ColumnInfo(name = "PARA_NUM")
    private BigDecimal para_num;

    @ColumnInfo(name = "TEXT1")
    private String text1;

    @ColumnInfo(name = "TEXT2")
    private String text2;

    @ColumnInfo(name = "TEXT3")
    private String text3;

    @ColumnInfo(name = "TEXT4")
    private String text4;

    @ColumnInfo(name = "VAL1")
    private BigDecimal val1;

    @ColumnInfo(name = "VAL2")
    private BigDecimal val2;

    @ColumnInfo(name = "VAL3")
    private BigDecimal val3;

    @ColumnInfo(name = "VAL4")
    private BigDecimal val4;

    @ColumnInfo(name = "TEXT5")
    private String text5;

    @ColumnInfo(name = "PROFCD")
    private String profcd;

    @ColumnInfo(name = "PARA_DESCR_BAK")
    private String para_descr_bak;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getAccntg_co_cd() {
        return accntg_co_cd;
    }

    public void setAccntg_co_cd(String accntg_co_cd) {
        this.accntg_co_cd = accntg_co_cd;
    }

    public Long getPara_id() {
        return para_id;
    }

    public void setPara_id(Long para_id) {
        this.para_id = para_id;
    }

    public String getPara_type() {
        return para_type;
    }

    public void setPara_type(String para_type) {
        this.para_type = para_type;
    }

    public String getPara_code() {
        return para_code;
    }

    public void setPara_code(String para_code) {
        this.para_code = para_code;
    }

    public String getPara_descr() {
        return para_descr;
    }

    public void setPara_descr(String para_descr) {
        this.para_descr = para_descr;
    }

    public String getPara_remarks() {
        return para_remarks;
    }

    public void setPara_remarks(String para_remarks) {
        this.para_remarks = para_remarks;
    }

    public String getMedico1() {
        return medico1;
    }

    public void setMedico1(String medico1) {
        this.medico1 = medico1;
    }

    public String getMedico2() {
        return medico2;
    }

    public void setMedico2(String medico2) {
        this.medico2 = medico2;
    }

    public BigDecimal getPara_num() {
        return para_num;
    }

    public void setPara_num(BigDecimal para_num) {
        this.para_num = para_num;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public BigDecimal getVal1() {
        return val1;
    }

    public void setVal1(BigDecimal val1) {
        this.val1 = val1;
    }

    public BigDecimal getVal2() {
        return val2;
    }

    public void setVal2(BigDecimal val2) {
        this.val2 = val2;
    }

    public BigDecimal getVal3() {
        return val3;
    }

    public void setVal3(BigDecimal val3) {
        this.val3 = val3;
    }

    public BigDecimal getVal4() {
        return val4;
    }

    public void setVal4(BigDecimal val4) {
        this.val4 = val4;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getProfcd() {
        return profcd;
    }

    public void setProfcd(String profcd) {
        this.profcd = profcd;
    }

    public String getPara_descr_bak() {
        return para_descr_bak;
    }

    public void setPara_descr_bak(String para_descr_bak) {
        this.para_descr_bak = para_descr_bak;
    }
}
