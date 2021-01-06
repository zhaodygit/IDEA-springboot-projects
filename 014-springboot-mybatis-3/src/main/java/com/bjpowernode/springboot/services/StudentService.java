package com.bjpowernode.springboot.services;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
