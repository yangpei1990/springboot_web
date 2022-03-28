package com.test.spring.controller;


import com.test.springboot.spring_web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginController {
    @Autowired
    public LoginService loginService;

    public String login() {
        //  Users user =  loginService.login();
        return "SUCCESS";
    }
}
