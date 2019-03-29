package com.dept.client.controller;

import com.test.entity.Dept;
import com.test.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DeptClientController {

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-TESTDEPT";

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/dept/client/getlist/{id}")
    public List<Dept> getlist(@PathVariable("id") Long id){
//        Map map = new HashMap();
        System.out.println("---查詢--dept client--"+id);
//        map.put("deptno",id);
//        return restTemplate.getDeptList(map);
//        return restTemplate.getForObject(REST_URL_PREFIX,"/dept/getlist/"+id,List.class);
//        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/getlist/"+id,List.class);
        return deptClientService.getlist(id);
    }
}
