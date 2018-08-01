package com.curriculum.server.controller;

import com.curriculum.server.common.bean.ResultStruct;
import com.curriculum.server.common.bean.ReturnValue;
import com.curriculum.server.common.utils.SystemException;
import com.curriculum.server.fBean.CourseBean;
import com.curriculum.server.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;

/**
 * User module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/25
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("course")
public class CourseController {
    private final static Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    /**
     * add course time and money
     * @param courseBean course's param
     * @return ResultStruct
     * @author liumengwei
     * @since V1.0
     * @date 2018/7/27
     */
    @RequestMapping(value = "/addCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultStruct addCourse(
            @BeanParam CourseBean courseBean) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = courseService.addCourse(courseBean);
            result = ResultStruct.setResultStructInfo(returnValue, result);
//            return ResultStruct.returnResule(result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
//            return ResultStruct.returnResule(result);
            return result;
        }
    }

    @RequestMapping(value = "/updateCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public  ResultStruct updateCourse(@BeanParam CourseBean courseBean) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = courseService.updateCourse(courseBean);
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }

    @RequestMapping(value = "/deleteCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public  ResultStruct deleteCourse(String isDelete, String id) {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = courseService.deleteCourse(isDelete, id);
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }

    @RequestMapping(value = "/findCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public  ResultStruct findCourse() {
        ResultStruct result = new ResultStruct();
        try {
            ReturnValue returnValue = courseService.findCourse();
            result = ResultStruct.setResultStructInfo(returnValue, result);
            return result;
        } catch (Exception ex) {
            SystemException.setResult(result, ex, logger);
            return result;
        }
    }
}
