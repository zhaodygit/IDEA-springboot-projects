package com.bjpowernode.springboot.services;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {

    /**
     * 根据学生id修改学生信息
     * @param student
     * @return
     */
    int updateStudentById(Student student);
}
