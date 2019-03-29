package com.dept.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptClientApplication80_Hystrix_dashboard {
    public static void main(String[] args) {
        System.out.println(
                SpringApplication.run(DeptClientApplication80_Hystrix_dashboard.class,args)
        );
    }
}
