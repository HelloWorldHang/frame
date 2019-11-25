package wang.doug.frame.model;

import java.util.Date;

public class SitePv {
    private Integer id;

    private Date tdTime;

    private Short tdYear;

    private Short tdMonth;

    private Short tdDay;

    private Short tdHour;

    private String ip;

    private Integer resId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTdTime() {
        return tdTime;
    }

    public void setTdTime(Date tdTime) {
        this.tdTime = tdTime;
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

    public Short getTdDay() {
        return tdDay;
    }

    public void setTdDay(Short tdDay) {
        this.tdDay = tdDay;
    }

    public Short getTdHour() {
        return tdHour;
    }

    public void setTdHour(Short tdHour) {
        this.tdHour = tdHour;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }
}