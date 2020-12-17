package com.bjpowernode.springboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/springboot/say")
    @ResponseBody
    public String say(@RequestParam(value = "name", defaultValue = "SpringBoot") String name) {
        return String.format("Hello %s!", name);
    }
}
