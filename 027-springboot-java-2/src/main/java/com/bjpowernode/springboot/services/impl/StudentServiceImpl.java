package com.bjpowernode.springboot.services.impl;

import com.bjpowernode.springboot.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "say"+ msg;
    }
}
