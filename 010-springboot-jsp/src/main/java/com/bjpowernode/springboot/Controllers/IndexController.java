package com.bjpowernode.springboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/say")
    public ModelAndView say() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello Spring Booot");
        mv.setViewName("say");
        return mv;
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","Hello Index");
        return "say";
    }


    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("message", "Springboot Project");

        return retMap;
    }
}
