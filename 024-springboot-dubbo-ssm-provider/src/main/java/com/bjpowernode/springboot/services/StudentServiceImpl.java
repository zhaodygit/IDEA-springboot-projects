package com.bjpowernode.springboot.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceName = "com.bjpowernode.springboot.services.StudentService", version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        //先查询redis 无查询数据库在redis缓存
        Integer allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if(allStudentCount == null){
            allStudentCount = studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount", allStudentCount, 15 , TimeUnit.SECONDS);
        }
        return allStudentCount;
    }
}
