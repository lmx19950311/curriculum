package com.curriculum.server.mapper;

import com.curriculum.server.daoBean.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * course
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/27
 */
@Mapper
public interface CourseMapper {
//    @Select("select id, username, password from user where username = #{username} and password = #{password}")
//    User login(@Param("username") String username, @Param("password") String password);

    /**
     * add course info
     * @param course course info
     * @author liumengwei
     * @since 2018/7/27
     */
    @Insert("insert into course(course_begin_time, course_end_time, course_money, create_time, num, is_delete) " +
            "values(#{course_begin_time}, #{course_end_time}, #{course_money}, #{create_time}, #{num}, #{is_delete})")
    void addCourse(Course course);

    @Update("update course set course_begin_time = #{course_begin_time}, course_end_time = #{course_end_time}," +
            " course_money = #{course_money}, num = #{num} where id = #{id}")
    void updateCourse(Course course);

    @Update("update course set is_delete = #{is_delete} where id = #{id}")
    void deleteCourse(@Param("is_delete") String is_delete, @Param("id") String id);

    @Select("select id as 'id', FROM_UNIXTIME(course_begin_time,'%Y-%m-%d %H:%i:%s') as 'course_begin_time'," +
            " FROM_UNIXTIME(course_end_time,'%Y-%m-%d %H:%i:%s') as 'course_end_time', " +
            "course_money as 'course_money', FROM_UNIXTIME(create_time,'%Y-%m-%d %H:%i:%s') as 'create_time'," +
            " num as 'num', is_delete as 'is_delete' from course order by create_time")
    List<Course> findCourse();
}