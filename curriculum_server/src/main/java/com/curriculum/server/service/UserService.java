package com.curriculum.server.service;

import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.daoBean.User;
import com.curriculum.server.mapper.UserMapper;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends IoHandlerAdapter {
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public ReturnValue userLogin(User user) throws NullPointerException {
        ReturnValue resultBean = new ReturnValue();
        User u = userMapper.findWithLoginnameAndPassword(user.getUsername(), user.getPassword());
//        String username = userMapper.login1(user.getUsername(), user.getPassword());
//        resultBean.setObject(username);
        resultBean.setObject(u);
        return resultBean;
    }

}
