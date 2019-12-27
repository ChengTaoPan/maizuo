package com.bdqn.maizuo.controller;

import com.bdqn.maizuo.entity.Course;
import com.bdqn.maizuo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    private CourseService courseService;

    @RequestMapping({"","index.html"})
    @ResponseBody
    public String Index(){
       Course list=courseService.getDate();
       Course obj=courseService.getDate2();
        return list.toString().concat(obj.toString());
    }
}
