package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "WH_MASTER")
public class WH_Master {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name ="WH_ID")
    private Long wh_id;

    @ColumnInfo(name ="COMPANY")
    private String company;

    @ColumnInfo(name ="SUB_COMPANY")
    private String sub_company;

    @ColumnInfo(name ="WH_CODE")
    private String wh_code;

    @ColumnInfo(name ="LOC_ID")
    private Long loc_id;

    @ColumnInfo(name ="LOC_CODE")
    private String loc_code;

    @ColumnInfo(name ="WH_TYPE")
    private String wh_type;

    @ColumnInfo(name ="WH_NAME")
    private String wh_name;

    @ColumnInfo(name ="WH_Address1")
    private String wh_address1;

    @ColumnInfo(name ="WH_Address2")
    private String wh_address2;

    @ColumnInfo(name ="WH_Address3")
    private String wh_address3;

    @ColumnInfo(name ="WH_Address4")
    private String wh_address4;

    @ColumnInfo(name ="DLIC1")
    private String dlic1;

    @ColumnInfo(name ="DLIC1_VALID_UPTO")
    private String dlic1_valid_upto;

    @ColumnInfo(name ="DLIC2")
    private String dlic2;

    @ColumnInfo(name ="DLIC2_VALID_UPTO")
    private String dlic2_valid_upto;

    @ColumnInfo(name ="DLIC3")
    private String dlic3;

    @ColumnInfo(name ="DLIC3_VALID_UPTO")
    private String dlic3_valid_upto;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getWh_id() {
        return wh_id;
    }

    public void setWh_id(Long wh_id) {
        this.wh_id = wh_id;
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

    public String getWh_code() {
        return wh_code;
    }

    public void setWh_code(String wh_code) {
        this.wh_code = wh_code;
    }

    public Long getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(Long loc_id) {
        this.loc_id = loc_id;
    }

    public String getLoc_code() {
        return loc_code;
    }

    public void setLoc_code(String loc_code) {
        this.loc_code = loc_code;
    }

    public String getWh_type() {
        return wh_type;
    }

    public void setWh_type(String wh_type) {
        this.wh_type = wh_type;
    }

    public String getWh_name() {
        return wh_name;
    }

    public void setWh_name(String wh_name) {
        this.wh_name = wh_name;
    }

    public String getWh_address1() {
        return wh_address1;
    }

    public void setWh_address1(String wh_address1) {
        this.wh_address1 = wh_address1;
    }

    public String getWh_address2() {
        return wh_address2;
    }

    public void setWh_address2(String wh_address2) {
        this.wh_address2 = wh_address2;
    }

    public String getWh_address3() {
        return wh_address3;
    }

    public void setWh_address3(String wh_address3) {
        this.wh_address3 = wh_address3;
    }

    public String getWh_address4() {
        return wh_address4;
    }

    public void setWh_address4(String wh_address4) {
        this.wh_address4 = wh_address4;
    }

    public String getDlic1() {
        return dlic1;
    }

    public void setDlic1(String dlic1) {
        this.dlic1 = dlic1;
    }

    public String getDlic1_valid_upto() {
        return dlic1_valid_upto;
    }

    public void setDlic1_valid_upto(String dlic1_valid_upto) {
        this.dlic1_valid_upto = dlic1_valid_upto;
    }

    public String getDlic2() {
        return dlic2;
    }

    public void setDlic2(String dlic2) {
        this.dlic2 = dlic2;
    }

    public String getDlic2_valid_upto() {
        return dlic2_valid_upto;
    }

    public void setDlic2_valid_upto(String dlic2_valid_upto) {
        this.dlic2_valid_upto = dlic2_valid_upto;
    }

    public String getDlic3() {
        return dlic3;
    }

    public void setDlic3(String dlic3) {
        this.dlic3 = dlic3;
    }

    public String getDlic3_valid_upto() {
        return dlic3_valid_upto;
    }

    public void setDlic3_valid_upto(String dlic3_valid_upto) {
        this.dlic3_valid_upto = dlic3_valid_upto;
    }
}
