package com.bjpowernode.springboot.controllers;

import com.bjpowernode.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/put")
    public Object put(String key, String value) {

        studentService.pub(key,value);

        return String.format("%s key %s value 成功存入redis", key, value);
    }

    @RequestMapping("/get")
    public  Object get(){
        String value = studentService.getValue("count");
        return "数量count 为" + value;
    }

}
