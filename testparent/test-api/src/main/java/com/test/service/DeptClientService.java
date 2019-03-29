package com.test.service;

import com.test.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(value = "MICROSERVICECLOUD-TESTDEPT")
@FeignClient(value = "MICROSERVICECLOUD-TESTDEPT",fallbackFactory=DeptClientFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/getlist/{id}")
    public List<Dept> getlist(@PathVariable("id") Long id);

}
