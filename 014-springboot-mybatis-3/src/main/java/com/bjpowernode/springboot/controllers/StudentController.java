package com.bjpowernode.springboot.controllers;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Student queryStudentById(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }
}
