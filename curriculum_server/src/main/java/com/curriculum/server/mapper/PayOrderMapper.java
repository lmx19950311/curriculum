package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.PayOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PayOrderMapper {

    @Insert("insert into pay_order(uid, cid, create_time, pay_type, pay_time, pay_account, pay_result, pay_money, order_no)" +
            " values(#{uid}, #{cid}, #{create_time}, #{pay_type}, #{pay_time}, #{pay_account}, #{pay_result}, #{pay_money}, #{order_no})")
    void addPayOrder(PayOrder payOrder);

    @Select("select pay_money as 'pay_money', FROM_UNIXTIME(create_time,'%Y-%m-%d %H:%i:%s') as 'create_time', " +
            "pay_result as 'pay_result', order_no as 'order_no' from pay_order where uid = #{id}")
    List<PayOrder> findPayOrder(String id);
}
