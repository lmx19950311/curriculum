package com.curriculum.server.controller;

import com.curriculum.server.common.bean.ResultStruct;
import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.fBean.PayOrderBean;
import com.curriculum.server.fBean.UserOrderBean;
import com.curriculum.server.service.UserOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.BeanParam;

@Controller
@EnableAutoConfiguration
@RequestMapping("userOrder")
public class UserOrderController {
    private final static Logger logger = LoggerFactory.getLogger(UserOrderController.class);

    @Autowired
    private UserOrderService userOrderService;

    @RequestMapping(value = "/addPayOrder", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultStruct addUserOrder(@BeanParam UserOrderBean userOrderBean) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = userOrderService.addUserOrder(userOrderBean);
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }
}
