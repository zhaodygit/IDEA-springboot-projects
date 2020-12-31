package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    /**
     *
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
