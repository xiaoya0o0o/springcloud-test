package com.dept.controller;

import com.dept.service.GetDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.test.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GetDeptController {

    @Autowired
    private GetDeptService getDeptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/getlist/{id}")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "getHystixTest")
    public List<Dept> getlist(@PathVariable("id") Long id){
        Map map = new HashMap();
        System.out.println("---查詢-dept---"+id);
        map.put("deptno",id);
        List<Dept> deptList = getDeptService.getDeptList(map);
        if(deptList!=null && deptList.size()>0){
            return getDeptService.getDeptList(map);
        }else {
            throw new RuntimeException("该id "+ id+" 没有信息 ");
        }

    }

    public List<Dept> getHystixTest(@PathVariable("id") Long id){
        List<Dept> list = new ArrayList<>();
        Dept dp = new Dept();
        dp.setDname("test");
        dp.setDeptno(1L);
        dp.setDb_source(" no database ");
        list.add(dp);
        return list;
    }

    @RequestMapping(value = "/dept/getlist2")
    public List<Dept> getlist2(){
        Map map = new HashMap();
        System.out.println("---查詢-dept---");
//        map.put("deptno",id);
        return getDeptService.getDeptList(map);
    }
    @RequestMapping(value="/dept/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("=============="+list);
        List<ServiceInstance> instances = discoveryClient.getInstances("microservicecloud-testdept");
        for (ServiceInstance element : instances){
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
