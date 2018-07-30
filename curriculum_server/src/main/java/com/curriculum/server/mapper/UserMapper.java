package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.PayOrder;
import com.curriculum.server.daoBean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

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
}

