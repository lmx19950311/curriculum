package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.UserOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderMapper {

    @Insert("insert into user_order(uid, cid, is_delelte, create_time, pay_result, status)" +
            " values (#{uid}, #{cid}, #{is_delelte}, #{create_time}, #{pay_result}, #{status})")
    void addUserOrder(UserOrder userOrder);
}
