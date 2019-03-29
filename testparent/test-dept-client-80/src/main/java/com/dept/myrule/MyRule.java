package com.dept.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule myDingRuly(){
        //        return new RoundRobinRule();
        //        return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询
//        return new RetryRule();
        return new RandomRule_My();
    }
}
