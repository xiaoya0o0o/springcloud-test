package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptApplication8002 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(DeptApplication8002.class,args));
    }
}
