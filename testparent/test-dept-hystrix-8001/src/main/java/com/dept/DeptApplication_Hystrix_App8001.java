package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker  // 对hystrix熔断机制的支持
public class DeptApplication_Hystrix_App8001 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(DeptApplication_Hystrix_App8001.class,args));
    }
}
