package com.curriculum.web.controller;

import com.curriculum.web.common.bean.ResultStruct;
import com.curriculum.web.common.utils.Constant;
import com.curriculum.web.common.utils.HttpRequest;
import com.curriculum.web.common.utils.SystemException;
import com.curriculum.web.common.utils.TransferUtils;
import com.curriculum.web.controller.bean.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import java.util.Map;

/**
 * User module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String addUser(
            @BeanParam UserBean userBean) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = TransferUtils.transBeanToMap(userBean);
            return HttpRequest.sendPost(Constant.ADD_USER, param);
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String updateUser(
            @BeanParam UserBean userBean) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = TransferUtils.transBeanToMap(userBean);
            return HttpRequest.sendPost(Constant.UPDATE_USER, param);
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }
}