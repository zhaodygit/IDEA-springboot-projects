package com.bjpowernode.springboot.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${websit}")
    private  String webSit;

    @RequestMapping("/say")
    @ResponseBody
    public String say() {

        return String.format("say: %s : %s",schoolName,webSit);
    }


    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("message", "Springboot Project");

        return retMap;
    }
}
