package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/count")
    @ResponseBody
    public Object studentCount(){
        Integer allStudentCount = studentService.queryAllSutdentCount();
        return "学生数量为:"+ allStudentCount;
    }
}
