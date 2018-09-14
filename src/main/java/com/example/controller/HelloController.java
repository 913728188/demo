package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller
@RequestMapping("hello")
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    public String hello(Map<String,Object> map){
        System.out.print("hello");
        User user = new User();
        user.setAccount("admin");
        user.setPassword("123456");
        userService.add(user);
        return "hello";
    }
}
