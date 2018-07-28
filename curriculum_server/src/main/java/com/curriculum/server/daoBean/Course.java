package com.curriculum.server.daoBean;

public class Course {
    private Integer id;
    private String course_begin_time;
    private String course_end_time;
    private Double course_money;
    private String create_time;
    private Integer num;
    private Integer is_delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getCourse_money() {
        return course_money;
    }

    public void setCourse_money(Double course_money) {
        this.course_money = course_money;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
