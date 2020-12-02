package com.baidu.controller;

import com.baidu.bean.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserTest {
    @Autowired
    private UserService service;
    @RequestMapping("/test")
    public String test(){
        System.out.println("执行");
        service.login();
        return "test";
    }
    @RequestMapping("/findAll")
    public String findAll(){
   User user = service.findAll();
        System.out.println(user);
        return "test";
    }
}
