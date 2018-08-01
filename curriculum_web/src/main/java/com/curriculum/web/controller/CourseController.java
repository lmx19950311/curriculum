package com.curriculum.web.controller;

import com.curriculum.web.common.bean.ResultStruct;
import com.curriculum.web.common.utils.Constant;
import com.curriculum.web.common.utils.HttpRequest;
import com.curriculum.web.common.utils.SystemException;
import com.curriculum.web.common.utils.TransferUtils;
import com.curriculum.web.controller.bean.CourseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import java.util.HashMap;
import java.util.Map;

/**
 * course module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/27
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    private final static Logger logger = LoggerFactory.getLogger(CourseController.class);

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
    public String addCourse(
            @BeanParam CourseBean courseBean) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = TransferUtils.transBeanToMap(courseBean);
            String content = HttpRequest.sendPost(Constant.ADD_COURSE, param);
            return content;
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }

    @RequestMapping(value = "/updateCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String updateCourse(
            @BeanParam CourseBean courseBean) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = TransferUtils.transBeanToMap(courseBean);
            String content = HttpRequest.sendPost(Constant.UPDATE_COURSE, param);
            return content;
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }

    @RequestMapping(value = "/deleteCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String deleteCourse(String isDelete, String id) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("isDelete", isDelete);
            param.put("id", id);
            String content = HttpRequest.sendPost(Constant.DELETE_COURSE, param);
            return content;
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }

    @RequestMapping(value = "/findCourse", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String findCourse(String id) {
        ResultStruct result = new ResultStruct();
        try {
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("id", id);
            String content = HttpRequest.sendPost(Constant.FIND_COURSE, param);
            return content;
        } catch (Exception ex) {
            return SystemException.setResult(result, ex, logger);
        }
    }
}
