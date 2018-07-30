package com.curriculum.server.daoBean;

public class PayOrder {
    private Long id;
    private Long uid;
    private Long cid;
    private String create_time;
    private Integer pay_type;
    private String pay_time;
    private String pay_account;
    private Integer pay_result;
    private Double pay_money;
    private String order_no;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getPay_account() {
        return pay_account;
    }

    public void setPay_account(String pay_account) {
        this.pay_account = pay_account;
    }

    public Integer getPay_result() {
        return pay_result;
    }

    public void setPay_result(Integer pay_result) {
        this.pay_result = pay_result;
    }

    public Double getPay_money() {
        return pay_money;
    }

    public void setPay_money(Double pay_money) {
        this.pay_money = pay_money;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }
}
