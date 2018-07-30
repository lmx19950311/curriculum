package com.curriculum.server.controller;

import com.curriculum.server.common.bean.ResultStruct;
import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.fBean.UserBean;
import com.curriculum.server.service.UserService;
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
 * User module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/25
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultStruct addUser(@BeanParam UserBean userBean) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = userService.addUser(userBean);
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }

}
