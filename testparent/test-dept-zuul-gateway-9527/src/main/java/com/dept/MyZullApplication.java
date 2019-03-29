package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyZullApplication {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(MyZullApplication.class,args));
    }
}
