package com.lhl.springmvc.controller.user;


import com.google.gson.Gson;
import com.lhl.springmvc.entity.User;
import com.lhl.springmvc.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2016/4/12.
 */
@Controller
@RequestMapping("/lhl/user")
public class DefaultUserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("defaultUserService")
    private IUserService defaultUserService;

    /**
     * 得到用户信息.
     *
     * @return 得到用户信息
     */
    @RequestMapping("/getUser.do")
    public String getUser(Model model) {
        model.addAttribute("message", "message");
        logger.info("你好这是测试!");
        return "/User";
    }

    @RequestMapping(value = "/getJsonUser.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getJsonUser() {
        User user = this.defaultUserService.getUser(1);
        Gson gson = new Gson();
        String str = gson.toJson(user);
        logger.info(str);
        return str;
    }

    /**
     * 返回用户洗洗视图.
     *
     * @return 返回用户信息视图
     */
    @RequestMapping("/getUserView.do")
    public String getUserView(Model model) {
        User user = defaultUserService.getUser(1);
        model.addAttribute(user);
        model.addAttribute("message", "message");
        return "/User";
    }

    @RequestMapping(value = "getJsonUserParams.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getJsonUserParams(@RequestParam(value = "id") long id) {
        User user = this.defaultUserService.getUser(id);
        Gson gson = new Gson();
        String str = gson.toJson(user);
        logger.info(str);
        return str;
    }
}
