package com.curriculum.server.fBean;

public class PayUserCorseBean {

    private Long id;
    private String nick_hame;
    private Integer gender;
    private String grade;
    private String phone;
    private String create_time;
    private Integer pay_result;
    private Integer pay_results;
    private Double pay_money;
    private String order_no;
    private String course_begin_time;
    private String course_end_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick_hame() {
        return nick_hame;
    }

    public void setNick_hame(String nick_hame) {
        this.nick_hame = nick_hame;
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

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
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

    public Integer getPay_results() {
        return pay_results;
    }

    public void setPay_results(Integer pay_results) {
        this.pay_results = pay_results;
    }

    public String getCourse_begin_time() {
        return course_begin_time;
    }

    public void setCourse_begin_time(String course_begin_time) {
        this.course_begin_time = course_begin_time;
    }

    public String getCourse_end_time() {
        return course_end_time;
    }

    public void setCourse_end_time(String course_end_time) {
        this.course_end_time = course_end_time;
    }
}
