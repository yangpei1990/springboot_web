package com.test.springboot.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/boot/hello")
    public  @ResponseBody String hello(){
        String str =  "hello spring boot";
        System.out.println("hello");
                return str;
    }
}
