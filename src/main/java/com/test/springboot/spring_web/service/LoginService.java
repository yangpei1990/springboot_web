package com.test.springboot.spring_web.service;

import com.test.springboot.spring_web.dao.LoginRepository;
import com.test.springboot.spring_web.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    public LoginRepository loginRepository;
    public List<Users> login(){
        System.out.println("hello,service start..");
        return loginRepository.findAll();
    }
}
