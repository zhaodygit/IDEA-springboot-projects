package com.bjpowernode.springboot.services;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 获取人数总人数
     * @return
     */
    Integer queryAllStudentCount();
}
