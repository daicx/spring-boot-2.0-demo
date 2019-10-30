package com.example.freemaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/user")
    public String user(ModelMap modelMap) {
        Locale locale = LocaleContextHolder.getLocale();
        modelMap.addAttribute("well", messageSource.getMessage("message", null, locale));
        modelMap.addAttribute("name", "小张");
        return "index";
    }
}
