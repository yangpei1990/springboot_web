package com.test.springboot.spring_web.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String loginName;
    private String password;
    private int age;
    private String nickName;
    private String location;

    public Accounts() {
        super();
    }

    public Accounts(int id, String loginName, String password, int age, String nickName, String location) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.age = age;
        this.nickName = nickName;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
