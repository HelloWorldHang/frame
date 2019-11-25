package wang.doug.frame.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wang.doug.frame.common.BaseResult;
import wang.doug.frame.common.BootstrapTable;
import wang.doug.frame.common.QueryParam;
import wang.doug.frame.model.*;
import wang.doug.frame.service.*;
import wang.doug.frame.vo.ColPvVo;
import wang.doug.frame.vo.SitePvVo;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

/**
 * pv统计页面
 */
@Controller
@RequestMapping("/stat")
public class StatController {


    private static final Log logger = LogFactory
            .getLog(StatController.class);

    @Autowired
    private ISitePvService sitePvService;
    @Autowired
    private IMonthPvService monthPvService;
    @Autowired
    private IMySystemService mySystemService;
    @Autowired
    private IColPvService colPvService;
    @Autowired
    private IMyColumnService myColumnService;
    @Autowired
    private IResPvService resPvService;
    @Autowired
    private ISysPvService sysPvService;
    @Autowired
    private IYearPvService yearPvService;


    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping({"index", ""})
    public String index(Model model) {

        return "stat/index";
    }

    /**
     * 分页查询
     *
     * @param
     * @return
     */

    @RequestMapping("query_by_page.json")
    @ResponseBody
    public BootstrapTable queryByPage(@RequestBody(required = false) final QueryParam queryParam) {
        //查询的关键词
        String search = String.valueOf(queryParam.getSearch().get("searchLike"));
        //根据页码计算开始记录索引
        long pageIndex = (queryParam.getPageNumber() - 1) * queryParam.getPageSize();
        //根据当前查询条件，查询符合条件的记录数
        //long total = this.sitePvService.countBySystem();
        long total = this.sysPvService.countByName(search);
        List<SysPv> sysList = this.sysPvService.queryByName(search, pageIndex, queryParam.getPageSize());

        return new BootstrapTable(total, sysList);

    }
    /**
     * 跳转到year.html
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/year"})
    public String toYear(Model model,@PathVariable final int sysId) {
        model.addAttribute("sysId",sysId);
        return "/stat/year";
    }


    /**
     * 每个年详情页面
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/query_by_page.json"})
    @ResponseBody
    public BootstrapTable everyYear(@PathVariable final int sysId,@RequestBody(required = false) final QueryParam queryParam) {
        // 暂未启用搜索功能
        //查询的关键词
        //String search = String.valueOf(queryParam.getSearch().get("searchLike"));
        //根据页码计算开始记录索引
        long pageIndex = (queryParam.getPageNumber() - 1) * queryParam.getPageSize();
        //根据当前查询条件，查询符合条件的记录数
        long total = this.yearPvService.countBySysId(sysId);
        List<YearPv> yearPvList = this.yearPvService.queryBySysId(sysId,pageIndex,queryParam.getPageSize());

        return new BootstrapTable(total, yearPvList);
    }

    /**
     * 每月详情页面
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/{year}/query_by_page.json"})
    @ResponseBody
    public BootstrapTable everyMonth(@RequestBody(required = false) final QueryParam queryParam,@PathVariable final int sysId,@PathVariable final short year) {
        List<MonthPv> monthPvList = monthPvService.query(sysId, year);
        return new BootstrapTable(0L,monthPvList);
    }

    /**
     * 跳转到month.html
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/{year}/month"})
    public String toMonth(Model model,@PathVariable final int sysId,@PathVariable final short year) {
        MySystem mySystem = mySystemService.loadById(sysId);
        model.addAttribute("sysName",mySystem.getName());
        model.addAttribute("sysId",sysId);
        model.addAttribute("year",year);
        return "/stat/month";
    }

    /**
     * 跳转到col.html
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/{year}/{month}/colPv"})
    public String toColPv(Model model,@PathVariable final int sysId,@PathVariable final short year,@PathVariable final short month) {
        MySystem mySystem = mySystemService.loadById(sysId);
        model.addAttribute("sysName",mySystem.getName());
        model.addAttribute("sysId",sysId);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        return "/stat/colPv";
    }

    @RequestMapping({"{sysId}/{year}/{month}/query_by_page.json"})
    @ResponseBody
    public BootstrapTable everyCol(@PathVariable final int sysId,@PathVariable final short year,@PathVariable final short month) {
        List<ColPv> colPvList = colPvService.query(sysId, year,month);
        return new BootstrapTable(0L,convert(colPvList));
    }

    /**
     * 跳转到resPv.html
     *
     * @param
     * @param    sysId
     * @return
     */
    @RequestMapping({"{sysId}/{year}/{month}/{colId}/resPv"})
    public String toResPv(Model model,@PathVariable final int sysId,@PathVariable final short year,@PathVariable final short month,@PathVariable final int colId) {
        MySystem mySystem = mySystemService.loadById(sysId);
        MyColumn col = myColumnService.loadById(colId);
        model.addAttribute("sysName",mySystem.getName());
        model.addAttribute("colName",col.getName());
        model.addAttribute("sysId",sysId);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        return "/stat/resPv";
    }

    @RequestMapping({"{sysId}/{year}/{month}/{colId}/query_by_page.json"})
    @ResponseBody
    public BootstrapTable everyRes(@PathVariable final int sysId,@PathVariable final short year,@PathVariable final short month,@PathVariable final int colId) {
        List<ResPv> resPvList = resPvService.selectByYearAndMonthAndSysIdAndColId(year,month,sysId,colId);
        return new BootstrapTable(0L,resPvList);
    }



    public List<ColPvVo> convert(List<ColPv> colPvs){
        List<ColPvVo> colPvVos = new ArrayList<>();
        for(ColPv colPv:colPvs){
            ColPvVo colPvVo = new ColPvVo();
            BeanUtils.copyProperties(colPv,colPvVo);
            colPvVo.setSysColName(colPv.getSysName()+"--"+colPv.getColName());
            colPvVos.add(colPvVo);

        }
        return colPvVos;
    }

}