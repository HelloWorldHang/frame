package wang.doug.frame.vo;

import wang.doug.frame.model.SitePv;

/**
 * @description: *
 * @author: 司云航
 * @create: 2019-07-22 10:20
 */
public class SitePvVo extends SitePv {
    private String rcsName; // 网站pv页面只用到这一个页面

    public String getRcsName() {
        return rcsName;
    }

    public void setRcsName(String rcsName) {
        this.rcsName = rcsName;
    }
}
