package com.curriculum.server.controller;

import com.curriculum.server.common.bean.ResultStruct;
import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.fBean.PayOrderBean;
import com.curriculum.server.service.PayOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.BeanParam;

/**
 * @author liumingxin
 * @since V1.0
 * @date 2018/7/30
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("payOrder")
public class PayOrderController {
    private final static Logger logger = LoggerFactory.getLogger(PayOrderController.class);

    @Autowired
    private PayOrderService payOrderService;

    @RequestMapping(value = "/addPayOrder", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultStruct addPayOrder(@BeanParam PayOrderBean payOrderBean) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = payOrderService.addPayOrder(payOrderBean);
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }

}
