package com.curriculum.server.fBean;

import javax.ws.rs.FormParam;

public class UserOrderBean {

    @FormParam("uid")
    private String uid;
    @FormParam("cid")
    private String cid;
    @FormParam("createTime")
    private String createTime;
    @FormParam("payResult")
    private String payResult;
    @FormParam("status")
    private String status;

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

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
