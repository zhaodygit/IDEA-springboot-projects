package com.bjpowernode.springboot.services;

public interface StudentService {

    /**
     * key value 存入redis
     * @param key
     * @param value
     */
    void pub(String key, String value);

    /**
     * 获取key值
     * @param count
     * @return
     */
    String getValue(String key);
}
