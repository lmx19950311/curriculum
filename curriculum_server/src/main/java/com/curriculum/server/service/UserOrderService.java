package com.curriculum.server.service;

import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.DateUtil;
import com.curriculum.server.common.utils.MeaasgeUtil;
import com.curriculum.server.common.utils.ResultMsgConstant;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.daoBean.DeleteStatus;
import com.curriculum.server.daoBean.UserOrder;
import com.curriculum.server.fBean.UserOrderBean;
import com.curriculum.server.mapper.UserOrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrderService {
    private final static Logger logger = LoggerFactory.getLogger(UserOrderService.class);

    @Autowired
    private UserOrderMapper userOrderMapper;
    private MeaasgeUtil me = new MeaasgeUtil();

    public ReturnValue addUserOrder(UserOrderBean userOrderBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            UserOrder e = new UserOrder();
            e.setUid(Long.parseLong(userOrderBean.getUid()));
            e.setCid(Long.parseLong(userOrderBean.getCid()));
            e.setIs_delelte(DeleteStatus.NO.getStatus());
            e.setCreate_time(DateUtil.getTime(userOrderBean.getCreateTime()));
            e.setPay_result(Integer.parseInt(userOrderBean.getPayResult()));
            e.setStatus(Integer.parseInt(userOrderBean.getStatus()));
            userOrderMapper.addUserOrder(e);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.addSuccess));
            returnValue.setObject(userOrderBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }
}
