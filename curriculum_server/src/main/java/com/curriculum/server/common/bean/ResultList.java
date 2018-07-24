package com.curriculum.server.common.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支持body 是list集合
 *
 * @author starlee
 */
public class ResultList<T> {
    private String status = "0";
    private List<T> body;
    private String msg = "";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBody(List<T> body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        ResultBean bean = new ResultBean();
        bean.setMsg(this.msg);
        bean.setStatus(this.status);
        if (body == null) {
            return bean.toString();
        }
        StringBuffer strBuffer = toInnerString();
        Map<String, ResultBean.Type> map = new HashMap<String, ResultBean.Type>();
        ResultBean.Type statusType = bean.new Type();
        statusType.setContent(this.status);
        map.put("status", statusType);
        ResultBean.Type bodyType = bean.new Type();
        bodyType.setContent(strBuffer.toString());
        bodyType.setType(ResultBean.Type.PRIMITIVE);
        map.put("body", bodyType);
        ResultBean.Type msgType = bean.new Type();
        msgType.setContent(this.msg);
        map.put("msg", msgType);
        return bean.map2Json(map);
    }

    public StringBuffer toInnerString() {
        ResultBean bean = new ResultBean();
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("[");
        int length = body.size();
        int n = 0;
        for (T oo : body) {
            n++;
            if (Map.class.isAssignableFrom(oo.getClass())) {
                Map<String, ResultBean.Type> newmap = new HashMap<String, ResultBean.Type>();
                Map<String, Object> map = (Map) oo;
                ResultBean rb = new ResultBean();
                rb.setBody(map);
                strBuffer.append(rb.map2Json(rb.toInnerString()));
            } else
                strBuffer.append(bean.map2Json(bean.extract(oo)));
            if (n < length) {
                strBuffer.append(",");
            }
        }
        strBuffer.append("]");
        return strBuffer;
    }
}
