package com.study.modules.inter.web;

import com.study.modules.inter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam String name){
        return helloService.sayHi(name);
    }

}
