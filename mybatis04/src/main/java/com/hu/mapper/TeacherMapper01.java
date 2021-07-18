package com.hu.mapper;

import com.hu.pojo.Student;
import com.hu.pojo.Student01;
import com.hu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper01 {
    List<Student01> getStudents(@Param("id") int id);
    List<Student01> getStudents01(@Param("id") int id);
}
