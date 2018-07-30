package com.curriculum.web.controller.bean;

import javax.ws.rs.FormParam;

public class UserBean {
    @FormParam("nickHame")
    private String nickHame;
    @FormParam("gender")
    private String gender;
    @FormParam("grade")
    private String grade;
    @FormParam("phone")
    private String phone;
    @FormParam("createTime")
    private String createTime;
    @FormParam("status")
    private String status;

    public String getNickHame() {
        return nickHame;
    }

    public void setNickHame(String nickHame) {
        this.nickHame = nickHame;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
