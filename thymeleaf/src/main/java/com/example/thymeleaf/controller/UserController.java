package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//注意此处必须为controller,而不是restController,否则将无法跳转到页面
@Controller
public class UserController {

    @GetMapping("/user")
    public String index(Model modelMap){
        modelMap.addAttribute("username","小明");
        return "index";
    }
}
