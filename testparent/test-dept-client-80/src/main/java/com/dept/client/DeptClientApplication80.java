package com.dept.client;

import com.dept.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-TESTDEPT",configuration = MyRule.class)
public class DeptClientApplication80 {
    public static void main(String[] args) {
        System.out.println(
                SpringApplication.run(DeptClientApplication80.class,args)
        );
    }
}
