package com.curriculum.server.fBean;

import javax.ws.rs.FormParam;

public class PayOrderBean {

    @FormParam("uid")
    private String uid;
    @FormParam("cid")
    private String cid;
    @FormParam("createTime")
    private String createTime;
    @FormParam("patTtype")
    private String patTtype;
    @FormParam("patTime")
    private String patTime;
    @FormParam("payAccount")
    private String payAccount;
    @FormParam("payResult")
    private String payResult;
    @FormParam("payMony")
    private String payMony;
    @FormParam("orderNo")
    private String orderNo;


    public String getUid() {
        return uid;
    }

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

    public String getPatTtype() {
        return patTtype;
    }

    public void setPatTtype(String patTtype) {
        this.patTtype = patTtype;
    }

    public String getPatTime() {
        return patTime;
    }

    public void setPatTime(String patTime) {
        this.patTime = patTime;
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
