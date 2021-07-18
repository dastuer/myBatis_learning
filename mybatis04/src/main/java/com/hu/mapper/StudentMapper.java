package com.hu.mapper;

import com.hu.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudents();
    List<Student> getStudents01();
}
