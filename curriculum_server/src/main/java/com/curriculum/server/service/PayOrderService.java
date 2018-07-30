package com.curriculum.server.service;

import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.DateUtil;
import com.curriculum.server.common.utils.MeaasgeUtil;
import com.curriculum.server.common.utils.ResultMsgConstant;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.daoBean.PayOrder;
import com.curriculum.server.fBean.PayOrderBean;
import com.curriculum.server.mapper.PayOrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayOrderService {
    private final static Logger logger = LoggerFactory.getLogger(PayOrderService.class);

    @Autowired
    private PayOrderMapper payOrderMapper;
    private MeaasgeUtil me = new MeaasgeUtil();

    public ReturnValue addPayOrder(PayOrderBean payOrderBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            PayOrder e = new PayOrder();
            e.setUid(Long.parseLong(payOrderBean.getUid()));
            e.setCid(Long.parseLong(payOrderBean.getCid()));
            e.setCreate_time(DateUtil.getTime(payOrderBean.getCreateTime()));
            e.setPay_type(Integer.parseInt(payOrderBean.getPayType()));
            e.setPay_time(DateUtil.getTime(payOrderBean.getPayTime()));
            e.setPay_account(payOrderBean.getPayAccount());
            e.setPay_result(Integer.parseInt(payOrderBean.getPayResult()));
            e.setPay_money(Double.parseDouble(payOrderBean.getPayMony()));
            e.setOrder_no(payOrderBean.getOrderNo());
            payOrderMapper.addPayOrder(e);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.addSuccess));
            returnValue.setObject(payOrderBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }
}
