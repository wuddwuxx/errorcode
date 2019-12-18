package com.easy.springboot.spring_with_mybatis.service;

import com.easy.springboot.spring_with_mybatis.entity.Student;
import com.easy.springboot.spring_with_mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student getStudentByAge(int age){
        return studentMapper.selectByPrimaryKey(age);
    }

    public List<Student> getAllStudents(){
        return studentMapper.getAllStudents();
    }
}
