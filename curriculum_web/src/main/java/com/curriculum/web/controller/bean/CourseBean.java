package com.curriculum.web.controller.bean;

import javax.ws.rs.FormParam;

public class CourseBean {

    @FormParam("startTime") 
    private String startTime;
    @FormParam("endTime")
    private String endTime;
    @FormParam("num")
    private String num;
    @FormParam("money")
    private String money;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
