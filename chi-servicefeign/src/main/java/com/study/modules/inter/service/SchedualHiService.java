package com.study.modules.inter.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi") //对应的eurekaclient应用下application.yml文件中定义的应用名称
public interface SchedualHiService {

    @RequestMapping(value = "/inter/sayHi", method = RequestMethod.GET)//上边对应应用，对外提供的接口类
    public String sayHiFromClientOne(@RequestParam(name = "name") String name);
}
