package com.test.springboot.spring_web.controller;

import com.test.springboot.spring_web.entity.Users;
import com.test.springboot.spring_web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/boot/list")
    public String login(Model model) {
        List<Users> list = loginService.login();
        for (Users user : list) {
            System.out.println(user.getId() + "============" + user.getName());
        }
        model.addAttribute("list", list);
        return "list";
    }
}
