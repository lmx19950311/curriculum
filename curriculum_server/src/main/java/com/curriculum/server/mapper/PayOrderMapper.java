package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.PayOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayOrderMapper {

    @Insert("insert into pay_order(uid, cid, create_time, pay_type, pay_time, pay_account, pay_result, pay_money, order_no)" +
            " values(#{uid}, #{cid}, #{create_time}, #{pay_type}, #{pay_time}, #{pay_account}, #{pay_result}, #{pay_money}, #{order_no})")
    void addPayOrder(PayOrder payOrder);
}
