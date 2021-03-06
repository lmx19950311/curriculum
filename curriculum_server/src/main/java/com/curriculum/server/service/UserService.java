package com.curriculum.server.service;

import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.DateUtil;
import com.curriculum.server.common.utils.MeaasgeUtil;
import com.curriculum.server.common.utils.ResultMsgConstant;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.daoBean.User;
import com.curriculum.server.fBean.PayUserCorseBean;
import com.curriculum.server.fBean.UserBean;
import com.curriculum.server.mapper.UserMapper;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends IoHandlerAdapter {
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;
    private MeaasgeUtil me = new MeaasgeUtil();

    public ReturnValue addUser(UserBean userBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            User e = new User();
            e.setNick_hame(userBean.getNickHame());
            e.setGender(Integer.parseInt(userBean.getGender()));
            e.setGrade(userBean.getGrade());
            e.setPhone(userBean.getPhone());
            e.setCreate_time(DateUtil.getTime(userBean.getCreateTime()));
            e.setStatus(Integer.parseInt(userBean.getStatus()));
            userMapper.addUser(e);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.addSuccess));
            returnValue.setObject(userBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

    public ReturnValue updateUser(UserBean userBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            User e = new User();
            e.setNick_hame(userBean.getNickHame());
            e.setGender(Integer.parseInt(userBean.getGender()));
            e.setGrade(userBean.getGrade());
            e.setPhone(userBean.getPhone());
            e.setId(Long.parseLong(userBean.getId()));
            userMapper.updateUser(e);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.modifySuccess));
            returnValue.setObject(userBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

    public ReturnValue findUser(String orderNo, String nickHame, String phone) {
        ReturnValue returnValue = new ReturnValue();
        try {
            List<PayUserCorseBean> l = userMapper.findUser(orderNo, nickHame, phone);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.querySuccess));
            returnValue.setObject(l);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

}
