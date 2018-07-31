package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

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
}

