package com.test.springboot.spring_web.service;

import com.test.springboot.spring_web.dao.AccountsRepository;
import com.test.springboot.spring_web.dao.LoginRepository;
import com.test.springboot.spring_web.dao.RespStat;
import com.test.springboot.spring_web.entity.Accounts;
import com.test.springboot.spring_web.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    public LoginRepository loginRepository;
    @Autowired
    public AccountsRepository accountsRepository;

    public List<Users> login() {
        System.out.println("hello,service start..");
        return loginRepository.findAll();
    }

    public Accounts login(int id) {
        return accountsRepository.getOne(id);
    }

    public RespStat register(Accounts accounts) {
        try {
            accountsRepository.save(accounts);
        } catch (Exception e) {
            return new RespStat(500, "系统错误", e.getMessage());
        }
        return RespStat.build(200);
    }

    public Object findAll() {
        //调用接口查询
        return accountsRepository.findAll();
        //自定义查询
        //    return  accountsRepository.findByIdBetween(1 ,6);
        //      return accountsRepository.findByLoginNameAndPassword("yp", "123456");

        //自定义HQL
        // return accountsRepository.findById1(1);

    }

}
