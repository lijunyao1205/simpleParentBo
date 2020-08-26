package com.study.modules.inter.web;

import com.study.modules.inter.service.SchedualHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class HelloController {

    @Autowired
    private SchedualHiService schedualHiService; //接口service

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi(String name){
        return schedualHiService.sayHiFromClientOne(name);
    }
}
