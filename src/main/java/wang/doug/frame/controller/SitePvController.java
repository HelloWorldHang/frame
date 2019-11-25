package wang.doug.frame.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wang.doug.frame.common.BootstrapTable;
import wang.doug.frame.common.QueryParam;
import wang.doug.frame.service.IResourceService;
import wang.doug.frame.service.ISitePvService;
import wang.doug.frame.vo.SitePvVo;

import java.util.List;

/**
 * 学校页面
 */
@Controller
@RequestMapping("/sitePv")
public class SitePvController {


    private static final Log logger = LogFactory
            .getLog(SitePvController.class);


    @Autowired
    private ISitePvService sitePvService;

    @Autowired
    private IResourceService resourceService;

    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping({"index", ""})
    public String index(Model model) {

        return "sitePv/index";
    }

    /**
     * 分页查询
     *
     * @param queryParam 查询条件
     * @return
     */

    @RequestMapping("query_by_page.json")
    @ResponseBody
    public BootstrapTable queryByPage(@RequestBody(required = false) final QueryParam queryParam

    ) {
        //查询的关键词
        String search = String.valueOf(queryParam.getSearch().get("searchLike"));
        //根据页码计算开始记录索引
        long pageIndex = (queryParam.getPageNumber() - 1) * queryParam.getPageSize();
        //根据当前查询条件，查询符合条件的记录数
        long total = this.sitePvService.countByIp(search);

        List<SitePvVo> sitePvVoList = this.sitePvService.queryByIp(search, pageIndex, queryParam.getPageSize());

        return new BootstrapTable(total, sitePvVoList);

    }

}