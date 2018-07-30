package com.curriculum.server.fBean;

import javax.ws.rs.FormParam;

public class UserBean {
    @FormParam("nickHame")
    private String nickHame;
    @FormParam("gender")
    private Integer gender;
    @FormParam("grade")
    private String grade;
    @FormParam("phone")
    private String phone;
    @FormParam("createTime")
    private String createTime;
    @FormParam("status")
    private Integer status;

    public String getNickHame() {
        return nickHame;
    }

    public void setNickHame(String nickHame) {
        this.nickHame = nickHame;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
