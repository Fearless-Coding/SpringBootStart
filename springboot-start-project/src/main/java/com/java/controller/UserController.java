package com.java.controller;

import com.java.pojo.User;
import com.java.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    @ResponseBody
    public List<User> home(){
       List<User> users = userService.selectAll();
       LOGGER.info("----------查询成功-------------");
       return users;
    }

    @RequestMapping("/")
    public String index(ModelMap map){
        map.put("key","value");
        return "index";
    }
}
