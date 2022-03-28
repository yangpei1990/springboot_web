package com.test.springboot.spring_web.controller;

import com.test.springboot.spring_web.dao.AccountsRepository;
import com.test.springboot.spring_web.dao.RespStat;
import com.test.springboot.spring_web.entity.Accounts;
import com.test.springboot.spring_web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    public LoginService loginService;
    public Accounts accounts;

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    @RequestMapping("/login/{id}")
    public String login(int id) {
        loginService.login(id);
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerP(HttpServletRequest request, Accounts accounts) {
        String loginName = (String) request.getParameter("loginName");
        RespStat stat = loginService.register(accounts);
        request.setAttribute("stat", stat);
        return "register";
    }

    @RequestMapping("/list")
    //  @ResponseBody
    public String doList(Model model, HttpServletRequest request) {
        List<Accounts> accounts = (List) loginService.findAll();
        model.addAttribute("accounts", accounts);
        request.setAttribute("accounts", accounts);
        //  return loginService.findAll();
        return "list";
    }


}
