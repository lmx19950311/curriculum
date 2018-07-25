package com.curriculum.server.controller;

import com.curriculum.server.common.bean.ResultStruct;
import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.daoBean.User;
import com.curriculum.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Context;

/**
 * User module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/25
 */
@Controller
@EnableAutoConfiguration
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * user login
     * @param username username
     * @param password password
     * @return ResultStruct
     * @author liumengwei
     * @since V1.0
     * @date 2018/7/25
     */
    @GetMapping("/userLogin")
    @ResponseBody
    public ResultStruct userLogin(
            @FormParam("username") String username,
            @FormParam("password") String password,
            @Context HttpServletRequest request) {
        ResultStruct result = new ResultStruct();
        String content="";
        try {
            User u =new User();
            u.setUsername(username);
            u.setPassword(password);
            ReturnValue rb = userService.userLogin(u);
            result = ResultStruct.setResultStructInfo(rb, result);
            return result;
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return result;
        }
    }

}
