package com.bjpowernode.springboot.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceName = "com.bjpowernode.springboot.services.StudentService", version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable("id") Integer id){

        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @RequestMapping("/student/detailJson/{id}")
    @ResponseBody
    public Object studentDetailJson( @PathVariable("id") Integer id){

        Student student = studentService.queryStudentById(id);
        return student;
    }

    @RequestMapping("/student/count")
    @ResponseBody
    public Object allStudentCount() {

        Integer allStudentCount = studentService.queryAllStudentCount();

        return "学生总人数为: " + allStudentCount;
    }
}
