package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.User;
import com.curriculum.server.fBean.PayUserCorseBean;
import com.curriculum.server.provider.UserMapperProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户
 * @author liumengwei
 * @since 2018/5/30
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user(nick_hame, gender, grade, phone, create_time, status)" +
            "values(#{nick_hame}, #{gender}, #{grade}, #{phone}, #{create_time}, #{status})")
    void addUser(User user);

    @Update("update user set nick_hame = #{nick_hame}, gender = #{gender},  grade = #{grade}, phone = #{phone} where id = #{id}")
    void updateUser(User user);

    @SelectProvider(type = UserMapperProvider.class, method = "findSql")
    List<PayUserCorseBean> findUser(String orderNo, String nickHame, String phone);


}

