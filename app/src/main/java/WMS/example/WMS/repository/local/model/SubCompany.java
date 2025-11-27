package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Sub_Company")
public class SubCompany {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "SubComp_id")
    private Long subcomp_id;

    @ColumnInfo(name = "SubComp_COMPANY")
    private String subcomp_company;

    @ColumnInfo(name = "SubComp_code")
    private String subcomp_code;

    @ColumnInfo(name = "SubComp_Nm")
    private String subcomp_nm;

    @ColumnInfo(name = "SubComp_ins_usr_id")
    private String SubComp_ins_usr_id;

    @ColumnInfo(name = "SubComp_mod_usr_id")
    private String SubComp_mod_usr_id;

    @ColumnInfo(name = "SubComp_status")
    private String subcomp_status;


    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getSubcomp_id() {
        return subcomp_id;
    }

    public void setSubcomp_id(Long subcomp_id) {
        this.subcomp_id = subcomp_id;
    }

    public String getSubcomp_company() {
        return subcomp_company;
    }

    public void setSubcomp_company(String subcomp_company) {
        this.subcomp_company = subcomp_company;
    }

    public String getSubcomp_code() {
        return subcomp_code;
    }

    public void setSubcomp_code(String subcomp_code) {
        this.subcomp_code = subcomp_code;
    }

    public String getSubcomp_nm() {
        return subcomp_nm;
    }

    public void setSubcomp_nm(String subcomp_nm) {
        this.subcomp_nm = subcomp_nm;
    }

    public String getSubComp_ins_usr_id() {
        return SubComp_ins_usr_id;
    }

    public void setSubComp_ins_usr_id(String subComp_ins_usr_id) {
        SubComp_ins_usr_id = subComp_ins_usr_id;
    }

    public String getSubComp_mod_usr_id() {
        return SubComp_mod_usr_id;
    }

    public void setSubComp_mod_usr_id(String subComp_mod_usr_id) {
        SubComp_mod_usr_id = subComp_mod_usr_id;
    }

    public String getSubcomp_status() {
        return subcomp_status;
    }

    public void setSubcomp_status(String subcomp_status) {
        this.subcomp_status = subcomp_status;
    }
}
