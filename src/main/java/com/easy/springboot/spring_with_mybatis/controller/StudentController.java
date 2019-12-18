package com.easy.springboot.spring_with_mybatis.controller;

import com.easy.springboot.spring_with_mybatis.entity.Student;
import com.easy.springboot.spring_with_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;



    @RequestMapping("/")
    public ModelAndView studentOps(){
//        Student s1 = new Student();
//        s1.setAge(3);
//        s1.setName("wenhan");
//        s1.setSex(3);
//        Student s3 = new Student();
//        s3.setAge(4);
//        s3.setName("enhan");
//        s3.setSex(4);
//        List<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s3);
//        int i = studentService.addStudent(s1);
//        System.out.println("addStudent>>>"+i);
        List<Student> allStudents = studentService.getAllStudents();
        System.out.println("getAllStudents>>>"+allStudents);
        System.out.println(allStudents.get(1));
        Student s2 = studentService.getStudentByAge(23);
        System.out.println(s2.getAge());
//        System.out.println(s1);
        ModelAndView mv = new ModelAndView();
        mv.addObject("students",allStudents);
        mv.setViewName("studentOps");
        return mv;
    }

    @RequestMapping("/getStu/{age}")
    public String GetStu(@PathVariable int age){
        return studentService.getStudentByAge(age).toString();
    }
}
