package com.zking.controller.demo;

import java.util.List;

public class User {
    private Integer id; //编号
    private String name;//姓名
    private String[] loves;//爱好
    private List<String> source;//来源
    private String sex;//性别
    private String cityId;//城市

    public User(Integer id) {
        this.id = id;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public List<String> getSource() {
        return source;
    }

    public void setSource(List<String> source) {
        this.source = source;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //省略get/set
}