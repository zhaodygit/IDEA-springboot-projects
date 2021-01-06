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

    @RequestMapping("/update")
    @ResponseBody
    public Object update(Integer id, String name){

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);

        return String.format("id %s的姓名修改结果:%s",id,updateCount);
    }
}
