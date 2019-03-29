package com.test.service;

import com.test.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component      // 不要忘记添加，不要忘记添加
public class DeptClientFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> getlist(Long id) {
                List<Dept> list = new ArrayList<>();
                Dept dp = new Dept();
                dp.setDname("test");
                dp.setDeptno(id);
                dp.setDb_source(" no database ");
                list.add(dp);
                return list;
            }
        };
    }
}
