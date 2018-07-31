package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.UserOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserOrderMapper {

    @Insert("insert into user_order(uid, cid, is_delete, create_time, pay_result, status)" +
            " values (#{uid}, #{cid}, #{is_delete}, #{create_time}, #{pay_result}, #{status})")
    void addUserOrder(UserOrder userOrder);

    @Update("update user_order set is_delete = #{is_delete} where id = #{id}")
    void deleteUserOrder(@Param("is_delete") String is_delete, @Param("id") String id);
}
