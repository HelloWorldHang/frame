package wang.doug.frame.vo;

import wang.doug.frame.model.Resource;

/**
 * @description: *
 * @author: 司云航
 * @create: 2019-07-20 11:12
 */
public class ResourceVo extends Resource {
    private String sysName;
    private String colName;
    private int sysId;

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }
}
