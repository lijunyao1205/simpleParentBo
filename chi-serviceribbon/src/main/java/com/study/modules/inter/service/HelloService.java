package com.study.modules.inter.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//断路器
    public String sayHi(String name){
        //return restTemplate.getForObject("http://localhost:8762/inter/sayHi?name=liLei", String.class);
        //return restTemplate.getForObject("http://service-hi/inter/sayHi?name=" + name, String.class);
        //此处的应用名称，是注册到spring cloud里的服务名称 大写
        return restTemplate.getForObject("http://SERVICE-HI/inter/sayHi?name=liLei", String.class);
    }

    public String hiError(String name){
        return "hi " + name + ", sorry error!";
    }
}
