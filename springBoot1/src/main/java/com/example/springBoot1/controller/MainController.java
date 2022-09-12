package com.example.springBoot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page){
        page.addAttribute("username", "Maxim");
        page.addAttribute("color", "red");
        return "home.html";
    }
}
