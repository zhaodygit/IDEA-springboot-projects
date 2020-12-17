package com.bjpowernode.springboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return String.format("say:hello world");
    }


    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("message", "Springboot Project");

        return retMap;
    }
}
