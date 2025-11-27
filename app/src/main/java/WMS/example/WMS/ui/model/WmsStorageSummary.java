package WMS.example.WMS.ui.model;



public class WmsStorageSummary {

    private Long sb_id;


    private String sb_code;

    private String tot_capacity;

    private String used_capacity;

    private String remaining_capacity;

    private String perc_fill;

    private String perc_empty;

    public Long getSb_id() {
        return sb_id;
    }

    public void setSb_id(Long sb_id) {
        this.sb_id = sb_id;
    }

    public String getSb_code() {
        return sb_code;
    }

    public void setSb_code(String sb_code) {
        this.sb_code = sb_code;
    }

    public String getTot_capacity() {
        return tot_capacity;
    }

    public void setTot_capacity(String tot_capacity) {
        this.tot_capacity = tot_capacity;
    }

    public String getUsed_capacity() {
        return used_capacity;
    }

    public void setUsed_capacity(String used_capacity) {
        this.used_capacity = used_capacity;
    }

    public String getRemaining_capacity() {
        return remaining_capacity;
    }

    public void setRemaining_capacity(String remaining_capacity) {
        this.remaining_capacity = remaining_capacity;
    }

    public String getPerc_fill() {
        return perc_fill;
    }

    public void setPerc_fill(String perc_fill) {
        this.perc_fill = perc_fill;
    }

    public String getPerc_empty() {
        return perc_empty;
    }

    public void setPerc_empty(String perc_empty) {
        this.perc_empty = perc_empty;
    }

    @Override
    public String toString() {
        return "WmsStorageSummary{" +
                "sb_id=" + sb_id +
                ", sb_code='" + sb_code + '\'' +
                ", tot_capacity='" + tot_capacity + '\'' +
                ", used_capacity='" + used_capacity + '\'' +
                ", remaining_capacity='" + remaining_capacity + '\'' +
                ", perc_fill='" + perc_fill + '\'' +
                ", perc_empty='" + perc_empty + '\'' +
                '}';
    }
}
