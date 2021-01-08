package com.bjpowernode.springboot.controllers;

import com.bjpowernode.springboot.model.Student;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.RtMethodGenerator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ParameterMetaData;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping("/student")
    public Object student(Integer id, String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @RequestMapping("/student2/detail/{id}/{name}")
    public Object student2(@PathVariable("id") Integer id, @PathVariable("name") String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @RequestMapping("/student2/detail/{id}/{status}")
    public Object student22(@PathVariable("id") Integer id, @PathVariable("status") String status){
       Map<String,Object> retMap = new HashMap<String,Object>();
       retMap.put("id",id);
       retMap.put("status",status);
       return retMap;
    }

    @RequestMapping("/student3/detail/{id}/{name}") //RESTful param 取不到
    public Object student3(@RequestParam Map<String,Object> param){
        Student student = new Student();

        student.setId(Integer.parseInt((String) param.get("id")));
        student.setName((String) param.get("name"));
        return student;
    }
}

