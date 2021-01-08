package com.bjpowernode.springboot.controllers;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class StudentController {

    @RequestMapping("/student")
    //@ResponseBody
    public Object student(){
        Student student = new Student();
        student.setId(100);
        student.setName("zhangsan");
        student.setAge(18);
        return student;
    }

    @RequestMapping("queryStudentById")
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }


    //@RequestMapping(value = "/queryStudent1",method = RequestMethod.GET)
    @GetMapping("queryStudent1")
    public Object queryStudent1(){
        return "This Get Method";
    }

//    @RequestMapping(value = "/queryStudent2",method = RequestMethod.POST)
    @PostMapping("/queryStudent2")
    public Object queryStudent2(){
        return "This POST Method";
    }

//    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @DeleteMapping("/delete")
    public Object delete(){
        return "Delete Method";
    }

//    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping("/update")
    public Object update(){
        return "Update Method";
    }
}
