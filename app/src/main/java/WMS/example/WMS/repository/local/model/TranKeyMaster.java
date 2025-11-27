package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TRANS_KEY_MASTER")
public class TranKeyMaster {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "ACC_CO_CODE")
    private String acc_co_code;

    @ColumnInfo(name = "LOC_ID")
    private Long loc_id;

    @ColumnInfo(name = "INV_GRP_ID")
    private Long inv_grp_id;

    @ColumnInfo(name = "TRAN_TYPE_ID")
    private Long tran_type_id;

    @ColumnInfo(name = "PREFIX")
    private String prefix;

    @ColumnInfo(name = "OUT_STATE_IND")
    private String out_state_ind;

    @ColumnInfo(name = "LAST_NUM")
    private String last_num;

    @ColumnInfo(name = "HEADING")
    private String heading;

    @ColumnInfo(name = "SLNO")
    private Long slno;

    @ColumnInfo(name = "FIN_YEAR")
    private String fin_year;

    @ColumnInfo(name = "POST_GL_ID")
    private Long post_gl_id;

    @ColumnInfo(name = "LC")
    private String lc;

    @ColumnInfo(name = "TYPE")
    private String type;

    @ColumnInfo(name = "STOCK_POINT_ID")
    private Long stock_point_id;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getAcc_co_code() {
        return acc_co_code;
    }

    public void setAcc_co_code(String acc_co_code) {
        this.acc_co_code = acc_co_code;
    }

    public Long getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(Long loc_id) {
        this.loc_id = loc_id;
    }

    public Long getInv_grp_id() {
        return inv_grp_id;
    }

    public void setInv_grp_id(Long inv_grp_id) {
        this.inv_grp_id = inv_grp_id;
    }

    public Long getTran_type_id() {
        return tran_type_id;
    }

    public void setTran_type_id(Long tran_type_id) {
        this.tran_type_id = tran_type_id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getOut_state_ind() {
        return out_state_ind;
    }

    public void setOut_state_ind(String out_state_ind) {
        this.out_state_ind = out_state_ind;
    }

    public String getLast_num() {
        return last_num;
    }

    public void setLast_num(String last_num) {
        this.last_num = last_num;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        this.slno = slno;
    }

    public String getFin_year() {
        return fin_year;
    }

    public void setFin_year(String fin_year) {
        this.fin_year = fin_year;
    }

    public Long getPost_gl_id() {
        return post_gl_id;
    }

    public void setPost_gl_id(Long post_gl_id) {
        this.post_gl_id = post_gl_id;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getStock_point_id() {
        return stock_point_id;
    }

    public void setStock_point_id(Long stock_point_id) {
        this.stock_point_id = stock_point_id;
    }
}
