package com.curriculum.server.daoBean;

public enum DeleteStatus {

    YES(1, "是"), NO(0, "否");

    private Integer status;
    private String content;

    DeleteStatus(Integer status, String content) {
        this.status = status;
        this.content = content;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
