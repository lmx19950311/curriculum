package com.curriculum.web.controller;

import com.curriculum.web.common.bean.ResultStruct;
import com.curriculum.web.common.utils.Constant;
import com.curriculum.web.common.utils.HttpRequest;
import com.curriculum.web.common.utils.SystemException;
import com.curriculum.web.common.utils.TransferUtils;
import com.curriculum.web.controller.bean.UserOrderBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import java.util.Map;

@RestController
@RequestMapping("/userOrder")
public class UserOrderController {
    private final static Logger logger = LoggerFactory.getLogger(UserOrderController.class);

    @RequestMapping(value = "/addUserOrder", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String addCourse(
            @BeanParam UserOrderBean userOrderBean) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = TransferUtils.transBeanToMap(userOrderBean);
            return HttpRequest.sendPost(Constant.ADD_USER_ORDER, param);
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }
}
