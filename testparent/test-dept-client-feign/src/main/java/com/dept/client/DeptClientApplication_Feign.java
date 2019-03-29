package com.dept.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com")
@ComponentScan("com")
public class DeptClientApplication_Feign {
    public static void main(String[] args) {
        System.out.println(

                SpringApplication.run(DeptClientApplication_Feign.class,args)
        );
    }
}
