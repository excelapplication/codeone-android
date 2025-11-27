package WMS.example.WMS.ui.model;

public class PickslipBean {

        private Long sl_no;
        private Long ps_hdr_slno;
        private Long sd_tran_hdr_id;
        private String sd_tran_hdr_no;
        private String party_name;
        private String ps_dtl_status;
        private String insert_user_id;
        private Long mod_user_id;
        private String mod_date;
        private Long  pickslip_hdr_id;
        private Boolean isSelected = false; // for checkbox or selection
        private String dsp_transporter;

        public String getDsp_transporter() {
                return dsp_transporter;
        }

        public void setDsp_transporter(String dsp_transporter) {
                this.dsp_transporter = dsp_transporter;
        }

        public boolean isSelected() {
                return isSelected;
        }

        public void setSelected(boolean selected) {
                isSelected = selected;
        }

        public Long getPickslip_hdr_id() {
                return pickslip_hdr_id;
        }

        public void setPickslip_hdr_id(Long pickslip_hdr_id) {
                this.pickslip_hdr_id = pickslip_hdr_id;
        }

        public Long getSl_no() {
                return sl_no;
        }

        public void setSl_no(Long sl_no) {
                this.sl_no = sl_no;
        }

        public Long getPs_hdr_slno() {
                return ps_hdr_slno;
        }

        public void setPs_hdr_slno(Long ps_hdr_slno) {
                this.ps_hdr_slno = ps_hdr_slno;
        }

        public Long getSd_tran_hdr_id() {
                return sd_tran_hdr_id;
        }

        public void setSd_tran_hdr_id(Long sd_tran_hdr_id) {
                this.sd_tran_hdr_id = sd_tran_hdr_id;
        }

        public String getSd_tran_hdr_no() {
                return sd_tran_hdr_no;
        }

        public void setSd_tran_hdr_no(String sd_tran_hdr_no) {
                this.sd_tran_hdr_no = sd_tran_hdr_no;
        }

        public String getParty_name() {
                return party_name;
        }

        public void setParty_name(String party_name) {
                this.party_name = party_name;
        }

        public String getPs_dtl_status() {
                return ps_dtl_status;
        }

        public void setPs_dtl_status(String ps_dtl_status) {
                this.ps_dtl_status = ps_dtl_status;
        }

        public String getInsert_user_id() {
                return insert_user_id;
        }

        public void setInsert_user_id(String insert_user_id) {
                this.insert_user_id = insert_user_id;
        }

        public Long getMod_user_id() {
                return mod_user_id;
        }

        public void setMod_user_id(Long mod_user_id) {
                this.mod_user_id = mod_user_id;
        }

        public String getMod_date() {
                return mod_date;
        }

        public void setMod_date(String mod_date) {
                this.mod_date = mod_date;
        }


    @Override
    public String toString() {
        return "PickslipBean{" +
                "sl_no=" + sl_no +
                ", ps_hdr_slno=" + ps_hdr_slno +
                ", sd_tran_hdr_id=" + sd_tran_hdr_id +
                ", sd_tran_hdr_no='" + sd_tran_hdr_no + '\'' +
                ", party_name='" + party_name + '\'' +
                ", ps_dtl_status='" + ps_dtl_status + '\'' +
                ", insert_user_id='" + insert_user_id + '\'' +
                ", mod_user_id=" + mod_user_id +
                ", mod_date='" + mod_date + '\'' +
                ", pickslip_hdr_id=" + pickslip_hdr_id +
                '}';
    }
}
