package com.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication_7001.class,args) ;
    }
}
