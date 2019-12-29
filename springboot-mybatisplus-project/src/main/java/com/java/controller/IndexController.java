package com.java.controller;

import com.java.pojo.User;
import com.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private com.java.service.IUserService IUserService;

    @RequestMapping("/")
    public String list(ModelMap modelMap){
        List<User> users = IUserService.list();
        modelMap.put("users",users);
        return "index";
    }

}
