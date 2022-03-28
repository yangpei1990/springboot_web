package com.test.springboot.spring_web.dao;

public class RespStat {
    private int code;
    private String msg;
    private String data;

    public RespStat() {
        super();
    }

    public RespStat(int code, String msg, String data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static RespStat build(int id) {
        return new RespStat(id, "ok", "");
    }
}
