package com.study.modules.inter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class Hello2Controller {

    private static Logger logger = LoggerFactory.getLogger(Hello2Controller.class); //日志对象

    @Value("${server.port}")
    private String port;

    /**
     * 对外提供访问方法
     * @param name
     * @return
     */
    @RequestMapping("sayHi")
    public String sayHi(@RequestParam String name){
        logger.debug("sayHi~~~~~~~~:" + name);
        return "hi " + name + ", i am from port: " + port;
    }
}
