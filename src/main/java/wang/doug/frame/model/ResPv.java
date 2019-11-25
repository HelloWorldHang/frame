package wang.doug.frame.model;

public class ResPv {
    private Integer id;

    private Integer resId;

    private Short tdMonth;

    private Short tdYear;

    private String rcsName;

    private String pv;

    private Integer sysId;

    private Integer colId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Short getTdMonth() {
        return tdMonth;
    }

    public void setTdMonth(Short tdMonth) {
        this.tdMonth = tdMonth;
    }

    public Short getTdYear() {
        return tdYear;
    }

    public void setTdYear(Short tdYear) {
        this.tdYear = tdYear;
    }

    public String getRcsName() {
        return rcsName;
    }

    public void setRcsName(String rcsName) {
        this.rcsName = rcsName == null ? null : rcsName.trim();
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv == null ? null : pv.trim();
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
    }
}