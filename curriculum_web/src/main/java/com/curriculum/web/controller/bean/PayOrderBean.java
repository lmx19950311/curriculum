package com.curriculum.web.controller.bean;

import javax.ws.rs.FormParam;

public class PayOrderBean {

    @FormParam("uid")
    private String uid;
    @FormParam("cid")
    private String cid;
    @FormParam("createTime")
    private String createTime;
    @FormParam("payType")
    private String payType;
    @FormParam("payTime")
    private String payTime;
    @FormParam("payAccount")
    private String payAccount;
    @FormParam("payResult")
    private String payResult;
    @FormParam("payMony")
    private String payMony;
    @FormParam("orderNo")
    private String orderNo;


    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getPayMony() {
        return payMony;
    }

    public void setPayMony(String payMony) {
        this.payMony = payMony;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
