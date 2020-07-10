package com.luf.ssm.mapper;

import com.luf.ssm.beans.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StudentMapper {
    public List<Student> selectAllStudent();
}
