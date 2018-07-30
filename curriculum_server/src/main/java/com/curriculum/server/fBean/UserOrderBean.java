package com.curriculum.server.fBean;

import javax.ws.rs.FormParam;

public class UserOrderBean {

    @FormParam("uid")
    private Long uid;
    @FormParam("cid")
    private Long cid;
    @FormParam("createTime")
    private String createTime;
    @FormParam("payResult")
    private Integer payResult;
    @FormParam("status")
    private Integer status;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getPayResult() {
        return payResult;
    }

    public void setPayResult(Integer payResult) {
        this.payResult = payResult;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
