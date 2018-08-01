package com.curriculum.server.service;

import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.DateUtil;
import com.curriculum.server.common.utils.MeaasgeUtil;
import com.curriculum.server.common.utils.ResultMsgConstant;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.daoBean.Course;
import com.curriculum.server.daoBean.DeleteStatus;
import com.curriculum.server.fBean.CourseBean;
import com.curriculum.server.mapper.CourseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * course Service
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/27
 */
@Service
public class CourseService {
    private final static Logger logger = LoggerFactory.getLogger(CourseService.class);

    @Autowired
    private CourseMapper courseMapper;
    private MeaasgeUtil me = new MeaasgeUtil();

    /**
     * add course info
     * @param courseBean course's param
     * @return ReturnValue
     * @author liumengwei
     * @since V1.0
     * @date 2018/7/27
     */
    public ReturnValue addCourse(CourseBean courseBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            Course course = new Course();
            course.setCourse_begin_time(DateUtil.getTime(courseBean.getStartTime()));
            course.setCourse_end_time(DateUtil.getTime(courseBean.getEndTime()));
            course.setCreate_time(DateUtil.getSystem());
            course.setCourse_money(Double.parseDouble(courseBean.getMoney()));
            course.setIs_delete(DeleteStatus.NO.getStatus());
            course.setNum(Integer.parseInt(courseBean.getNum()));
            courseMapper.addCourse(course);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.addSuccess));
            returnValue.setObject(courseBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

    public ReturnValue updateCourse(CourseBean courseBean) {
        ReturnValue returnValue = new ReturnValue();
        try {
            Course course = new Course();
            course.setCourse_begin_time(DateUtil.getTime(courseBean.getStartTime()));
            course.setCourse_end_time(DateUtil.getTime(courseBean.getEndTime()));
            course.setCourse_money(Double.parseDouble(courseBean.getMoney()));
            course.setNum(Integer.parseInt(courseBean.getNum()));
            course.setId(Integer.parseInt(courseBean.getId()));
            courseMapper.updateCourse(course);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.modifySuccess));
            returnValue.setObject(courseBean);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

    public ReturnValue deleteCourse(String isDelete, String id) {
        ReturnValue returnValue = new ReturnValue();
        try {
            courseMapper.deleteCourse(isDelete, id);
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.deleteSuccess));
            returnValue.setObject("{\"isDelete\" : \"" + isDelete + "\"}");
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }

    public ReturnValue findCourse() {
        ReturnValue returnValue = new ReturnValue();
        try {
            List<Course> e = courseMapper.findCourse();
            returnValue.setFlag(ReturnValue.FLAG_SUCCESS);
            returnValue.setMeg(me.getValue(ResultMsgConstant.querySuccess));
            returnValue.setObject(e);
        } catch (Exception ex) {
            return SystemException.setResult(returnValue, ex, logger);
        }
        return returnValue;
    }
}
