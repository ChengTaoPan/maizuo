package com.bdqn.maizuo.dao;

import com.bdqn.maizuo.entity.Course;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    @Select("SELECT * FROM  `course` WHERE `CId`=1")
    Course select();

}