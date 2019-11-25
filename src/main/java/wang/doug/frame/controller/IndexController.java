package wang.doug.frame.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wang.doug.frame.common.BaseController;
import wang.doug.frame.common.BaseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 登录页面、首页
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    private static final Log logger = LogFactory.getLog(IndexController.class);


    /**
     * 登录页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"", "login.html"})

    public String toLogin(Model model) {

        return "login";

    }

    /**
     * 登录接口
     *
     * @param model
     * @param loginData JSON格式的登录信息，可以使用Java类描述，也可以使用Map
     * @return
     */
    @RequestMapping(value = {"login.json"})
    @ResponseBody
    public BaseResult login(Model model, @RequestBody Map<String, Object> loginData

    ) {
        //TODO： 从loginData中获取账号和密码，进行验证，根据验证结果返回信息

        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(true);
        return baseResult;
    }

    /**
     * 主页
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = {"index.html"})
    public String index(HttpServletRequest request,
                        HttpServletResponse response) {

        return "index";
    }

    /**
     * 注销页面
     *
     * @param request
     * @param response
     * @return
     */

    @RequestMapping(value = {"logout.html"})
    public String logout(HttpServletRequest request,
                         HttpServletResponse response) {

        //TODO: 从Session中删除用户信息

        return "login";

    }


}
