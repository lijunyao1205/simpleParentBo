package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientTApplication {

   public static void main(String[] args){
       SpringApplication.run(EurekaClientTApplication.class, args);
   }
}
