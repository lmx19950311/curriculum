package com.curriculum.web.common.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import javax.ws.rs.core.Response;

public class ResultStruct {
    private String status = OK;
    private Object body = "null";
    private String msg = "";
    @JSONField(serialize = false, deserialize = false)
    public final static String OK = "0";
    @JSONField(serialize = false, deserialize = false)
    public final static String ERROR = "1";
    @JSONField(serialize = false, deserialize = false)
    public final static String PROTECT = "2";
    @JSONField(serialize = false, deserialize = false)
    public final static String NotAssess = "4";


    /**
     * 返回结果
     * @param resultStruct 结果对象
     * @param <T>
     * @return Response
     * @author liumengwei
     * @date 2018/7/27
     */
    public static <T> Response returnResule(String resultStruct) {
        return Response.ok(resultStruct).build();
    }

    /**
     * 返回结果
     * @param resultStruct 结果对象
     * @param <T>
     * @return Response
     * @author liumengwei
     * @date 2018/7/27
     */
    public static <T> Response returnResule(ResultStruct resultStruct) {
        return Response.ok(resultStruct.toString()).build();
    }
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
