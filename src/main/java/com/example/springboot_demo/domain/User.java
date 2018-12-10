package com.example.springboot_demo.domain;

import java.util.List;

public class User {

    private int id;
    private String account;
    private String password;
    private String name;
    private String type;
    private int status;
    private int themenum;
    private String userimage;

    private List<Recomment> recomments;

    public List<Recomment> getRecomments() {
        return recomments;
    }

    public void setRecomments(List<Recomment> recomments) {
        this.recomments = recomments;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getThemenum() {
        return themenum;
    }

    public void setThemenum(int themenum) {
        this.themenum = themenum;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }
}
