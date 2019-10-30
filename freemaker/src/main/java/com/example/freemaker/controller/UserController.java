package com.example.freemaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String user(ModelMap modelMap) {
        modelMap.addAttribute("name", "小张");
        return "index";
    }
}
