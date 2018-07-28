package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.Course;
import com.curriculum.server.daoBean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/27
 */
@Mapper
public interface CourseMapper {
    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return User
     * @author liumengwei
     * @since V1.0
     * @date 2018/7/27
     */
    @Select("select id, username, password from user where username = #{username} and password = #{password}")
    User login(@Param("username") String username, @Param("password") String password);

    /**
     * add course info
     * @param course course info
     * @author liumengwei
     * @since 2018/7/27
     */
    @Insert("insert into course(course_begin_time, course_end_time, course_money, create_time, num, is_delete) " +
            "values(#{course_begin_time}, #{course_end_time}, #{course_money}, #{create_time}, #{num}, #{is_delete})")
    void addCourse(Course course);
}
