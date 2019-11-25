package wang.doug.frame.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wang.doug.frame.common.BaseResult;
import wang.doug.frame.common.BootstrapTable;
import wang.doug.frame.common.QueryParam;
import wang.doug.frame.model.MyColumn;
import wang.doug.frame.model.MySystem;
import wang.doug.frame.model.Resource;
import wang.doug.frame.service.IMyColumnService;
import wang.doug.frame.service.IResourceService;
import wang.doug.frame.service.IMySystemService;
import wang.doug.frame.vo.ResourceVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 系统页面
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {


    private static final Log logger = LogFactory
            .getLog(Resource.class);


    @Autowired
    private IResourceService resourceService;
    @Autowired
    private IMySystemService mySystemService;
    @Autowired
    private IMyColumnService myColumnService;

    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping({"index", ""})
    public String index(Model model) {

        return "resource/index";
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
        long total = this.resourceService.countByName(search);

        List<ResourceVo> resourceVoList = this.resourceService.queryByNameContainSysAndCol(search, pageIndex, queryParam.getPageSize());

        return new BootstrapTable(total, resourceVoList);

    }

    /**
     * 新增页面
     *
     * @param model
     * @return
     */
    @RequestMapping({"new"})
    public String toNew(Model model) {
        Resource resource = new Resource();
        model.addAttribute("resource", resource);
        MyColumn myColumn = new MyColumn();
        model.addAttribute("myColumn",myColumn);
        List<MyColumn> myColumnList = myColumnService.query();
        model.addAttribute("myColumnList", myColumnList);
        List<MySystem> mySystemList = mySystemService.query();
        model.addAttribute("mySystemList", mySystemList);
        return "resource/new";
    }

    /**
     * 编辑页面
     *
     * @param model
     * @param id    ID
     * @return
     */
    @RequestMapping({"{id}/edit"})
    public String toEdit(Model model, @PathVariable final int id) {
        Resource resource = this.resourceService.loadById(id);
        model.addAttribute("resource", resource);
        MyColumn myColumn = this.myColumnService.loadById(resource.getColId());
        model.addAttribute("myColumn", myColumn);
        List<MyColumn> myColumnList = myColumnService.query();
        model.addAttribute("myColumnList", myColumnList);
        List<MySystem> mySystemList = mySystemService.query();
        model.addAttribute("mySystemList", mySystemList);
        return "resource/new";
    }

    /**
     * 保存
     *
     * @param request
     * @param response
     * @param resource   系统信息
     * @return
     */
    @RequestMapping("save.json")
    @ResponseBody
    public BaseResult save(HttpServletRequest request,
                           HttpServletResponse response, @RequestBody Resource resource) {

       //TODO：服务器端验证

        int count = 0;
        //系统ID为null，表示新增加,否则根据ID更新
        if (resource.getId() == null) {
            count = this.resourceService.insert(resource);
        } else {

            count = this.resourceService.update(resource);
        }

        BaseResult result = new BaseResult();
        result.setSuccess(count > 0 ? true : false);


        return result;

    }

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @RequestMapping("delete.json")
    @ResponseBody
    public BaseResult delete(@RequestParam final int id) {

        //TODO：服务器端验证id的权限

        //删除
        int count = this.resourceService.delete(id);

        BaseResult result = new BaseResult();
        result.setSuccess(count > 0 ? true : false);

        return result;

    }


}