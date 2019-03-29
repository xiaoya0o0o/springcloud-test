package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7001_App {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(EurekaApplication7001_App.class,args));
    }
}
