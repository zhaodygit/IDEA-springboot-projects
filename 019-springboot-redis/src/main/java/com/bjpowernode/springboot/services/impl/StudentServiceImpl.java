package com.bjpowernode.springboot.services.impl;

import com.bjpowernode.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void pub(String key, String value) {

        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String getValue(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
