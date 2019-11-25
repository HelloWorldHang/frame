package wang.doug.frame.model;

public class ColPv {
    private Integer id;

    private Integer sysId;

    private String sysName;

    private Integer colId;

    private String colName;

    private Short tdYear;

    private Short tdMonth;

    private Integer pv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public Short getTdYear() {
        return tdYear;
    }

    public void setTdYear(Short tdYear) {
        this.tdYear = tdYear;
    }

    public Short getTdMonth() {
        return tdMonth;
    }

    public void setTdMonth(Short tdMonth) {
        this.tdMonth = tdMonth;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }
}