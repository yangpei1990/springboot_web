package com.test.springboot.springboot_web.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JSPController {
    @RequestMapping("/boot/index")
    public String index(Model model){
        System.out.println("test................");
        model.addAttribute("msg","welcome spring boot jsp");
        return "index";
    }
}
