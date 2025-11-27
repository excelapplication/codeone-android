package WMS.example.WMS.repository.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Hr_m_employee")
public class Hr_m_employee {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PK")
    private Long pk;

    @ColumnInfo(name = "emp_id")
    private Long emp_id;

    @ColumnInfo(name = "emp_egrp_id")
    private String  emp_egrp_id;

    @ColumnInfo(name = "emp_dept_id")
    private String  emp_dept_id;

    @ColumnInfo(name = "emp_loc_id")
    private int  emp_loc_id;

    @ColumnInfo(name = "emp_COMP_id")
    private String  emp_COMP_id;

    @ColumnInfo(name = "emp_desg_id")
    private String  emp_desg_id;


    @ColumnInfo(name = "emp_sup_emp_id")
    private String  emp_sup_emp_id;

    @ColumnInfo(name = "emp_fnm")
    private String  emp_fnm;

    @ColumnInfo(name = "emp_add")
    private String  emp_add;

    @ColumnInfo(name = "emp_phno")
    private String  emp_phno;


    @ColumnInfo(name = "emp_email")
    private String  emp_email;

    @ColumnInfo(name = "emp_ins_usr_id")
    private String  emp_ins_usr_id;

    @ColumnInfo(name = "gco_emp_id")
    private String  gco_emp_id;

    @ColumnInfo(name = "sm_emp_id")
    private String  sm_emp_id;

    @ColumnInfo(name = "EMP_DESG_ANG")
    private String  emp_desg_ang;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_egrp_id() {
        return emp_egrp_id;
    }

    public void setEmp_egrp_id(String emp_egrp_id) {
        this.emp_egrp_id = emp_egrp_id;
    }

    public String getEmp_dept_id() {
        return emp_dept_id;
    }

    public void setEmp_dept_id(String emp_dept_id) {
        this.emp_dept_id = emp_dept_id;
    }

    public int getEmp_loc_id() {
        return emp_loc_id;
    }

    public void setEmp_loc_id(int emp_loc_id) {
        this.emp_loc_id = emp_loc_id;
    }

    public String getEmp_COMP_id() {
        return emp_COMP_id;
    }

    public void setEmp_COMP_id(String emp_COMP_id) {
        this.emp_COMP_id = emp_COMP_id;
    }

    public String getEmp_desg_id() {
        return emp_desg_id;
    }

    public void setEmp_desg_id(String emp_desg_id) {
        this.emp_desg_id = emp_desg_id;
    }

    public String getEmp_sup_emp_id() {
        return emp_sup_emp_id;
    }

    public void setEmp_sup_emp_id(String emp_sup_emp_id) {
        this.emp_sup_emp_id = emp_sup_emp_id;
    }

    public String getEmp_fnm() {
        return emp_fnm;
    }

    public void setEmp_fnm(String emp_fnm) {
        this.emp_fnm = emp_fnm;
    }

    public String getEmp_add() {
        return emp_add;
    }

    public void setEmp_add(String emp_add) {
        this.emp_add = emp_add;
    }

    public String getEmp_phno() {
        return emp_phno;
    }

    public void setEmp_phno(String emp_phno) {
        this.emp_phno = emp_phno;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_ins_usr_id() {
        return emp_ins_usr_id;
    }

    public void setEmp_ins_usr_id(String emp_ins_usr_id) {
        this.emp_ins_usr_id = emp_ins_usr_id;
    }

    public String getGco_emp_id() {
        return gco_emp_id;
    }

    public void setGco_emp_id(String gco_emp_id) {
        this.gco_emp_id = gco_emp_id;
    }

    public String getSm_emp_id() {
        return sm_emp_id;
    }

    public void setSm_emp_id(String sm_emp_id) {
        this.sm_emp_id = sm_emp_id;
    }

    public String getEmp_desg_ang() {
        return emp_desg_ang;
    }

    public void setEmp_desg_ang(String emp_desg_ang) {
        this.emp_desg_ang = emp_desg_ang;
    }
}
