package com.java.controller;


import com.java.pojo.User;
import com.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-12-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService IUserService;

    @RequestMapping("list.json")
    @ResponseBody
    public List<User> list(){
        List<User> users = IUserService.list();
        return users;
    }

}
