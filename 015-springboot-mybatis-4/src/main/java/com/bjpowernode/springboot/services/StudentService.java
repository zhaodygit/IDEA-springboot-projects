package com.bjpowernode.springboot.services;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    /**
     * 通过id查询数据
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
