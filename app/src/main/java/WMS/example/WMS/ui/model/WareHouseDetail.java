package WMS.example.WMS.ui.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "WareHouse_Detail")
public class WareHouseDetail {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "WH_ID")
    private Long  wh_id;

    @ColumnInfo(name = "LOC_ID")
    private Long loc_id;

    @ColumnInfo(name = "COMPANY")
    private String company;

    @ColumnInfo(name = "WH_NAME")
    private String wh_name;

    @ColumnInfo(name = "WH_Address1")
    private String wh_address1;

    @ColumnInfo(name = "WH_Address2")
    private String wh_address2;

    @ColumnInfo(name = "WH_Address3")
    private String wh_address3;

    @ColumnInfo(name = "WH_Address4")
    private String wh_address4;

    @ColumnInfo(name = "isActive")
    private String isActive;


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

    public Long getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(Long loc_id) {
        this.loc_id = loc_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}

