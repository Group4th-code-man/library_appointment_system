package com.luf.ssm.service;

import com.luf.ssm.beans.Student;
import com.luf.ssm.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getAllStudent()
    {
        return  studentMapper.selectAllStudent();
    }

}
