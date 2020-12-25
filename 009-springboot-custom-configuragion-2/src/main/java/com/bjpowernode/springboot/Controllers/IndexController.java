package com.bjpowernode.springboot.Controllers;

import com.bjpowernode.springboot.config.Abc;
import com.bjpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return String.format("say<br>schoolName:%s<br>webSit:%s",school.getName(),school.getWebsit() +"<br>abc.name:"+abc.getName() +"<br>abc.websit:"+abc.getWebsit());
    }


    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("message", "Springboot Project");

        return retMap;
    }
}
