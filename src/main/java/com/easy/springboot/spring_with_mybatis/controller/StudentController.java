package com.easy.springboot.spring_with_mybatis.controller;

import com.easy.springboot.spring_with_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStu/{age}")
    public String GetStu(@PathVariable int age){
        return studentService.getStudentByAge(age).toString();
    }
}
