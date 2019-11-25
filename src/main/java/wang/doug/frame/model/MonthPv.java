package wang.doug.frame.model;

public class MonthPv {
    private Integer id;

    private Short tdMonth;

    private Short tdYear;

    private Integer sysId;

    private String sysName;

    private Integer pv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }
}