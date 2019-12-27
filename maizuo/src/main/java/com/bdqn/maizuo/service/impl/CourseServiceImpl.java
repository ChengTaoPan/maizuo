package com.bdqn.maizuo.service.impl;

import com.bdqn.maizuo.dao.CourseMapper;
import com.bdqn.maizuo.entity.Course;
import com.bdqn.maizuo.service.CourseService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
//@Component
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public Course getDate() {
//        return courseMapper.selectByPrimaryKey(1);
        return courseMapper.selectByPrimaryKey(1);
    }

    public Course getDate2(){
        return  courseMapper.select();
    }

}
