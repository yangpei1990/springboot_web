package com.test.springboot.springboot_web.controller;

import org.springframework.web.bind.annotation.*;
import com.test.springboot.springboot_web.model.User;
@RestController  //@RestController = @Controller + @ResponseBody ,使用RestController直接返回json数据
public class SpringBootMvcController {
    @RequestMapping(value = "/boot/getUser", method = RequestMethod.GET)
    public Object getUser(){
        User user = new User();
        user.setId("100");
        user.setName("杨佩");
       return user;
    }

    /**
     * GetMapping 等价于RequestMapping + RequestMethod.GET，  只支持get请求
     * @return
     */
    @GetMapping("/boot/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId("100");
        user.setName("杨佩");
        return user;
    }

    /**
     * PostMapping 等价于RequestMapping + RequestMethod.POST，  只支持POST请求,url请求不支持post请求，
     * @return
     */
    @PostMapping("/boot/getUser2")
    public Object getUser2(){
        User user = new User();
        user.setId("100");
        user.setName("杨佩");
        return user;
    }
}
