package com.test.springboot.springboot_web.controller;

import com.test.springboot.springboot_web.config.PropertyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
    @Value("${boot.name}")
    private String name;
    @Value("${boot.address}")
    private String address;
    @Autowired
    private PropertyInfo propertyinfo;



    @RequestMapping("/boot/config")
    public @ResponseBody String getConfigInfo(){
        return name + "------>" + address + "||    " + propertyinfo.getName() + "-------------->" + propertyinfo.getAddress();
    }
}
