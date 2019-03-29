package com.dept.controller;

import com.dept.service.GetDeptService;
import com.test.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Dept> getlist(@PathVariable("id") Long id){
        Map map = new HashMap();
        System.out.println("---查詢-dept---"+id);
        map.put("deptno",id);
        return getDeptService.getDeptList(map);
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
