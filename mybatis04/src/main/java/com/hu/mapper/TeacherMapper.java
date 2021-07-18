package com.hu.mapper;

import com.hu.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> getTeachers();
}
