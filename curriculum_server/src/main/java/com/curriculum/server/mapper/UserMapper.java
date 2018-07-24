package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.User;
import com.curriculum.server.provider.UserMapperProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * 用户
 * @author liumengwei
 * @since 2018/5/30
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(username, password) values(#{username}, #{password})")
    int insert(@Param("username") String username, @Param("password") String password);

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return User
     * @author liumengwei
     * @since 2018/5/30
     */
    @Select("select id, username, password from user where username = #{username} and password = #{password}")
    User login(@Param("username") String username, @Param("password") String password);

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return User
     * @author liumengwei
     * @since 2018/5/30
     */
    @SelectProvider(type = UserMapperProvider.class, method = "findByName")
    String login1(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("username") String username, @Param("password") String password);
}

