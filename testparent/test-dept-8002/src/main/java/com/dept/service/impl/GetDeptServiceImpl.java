package com.dept.service.impl;

import com.dept.dao.GetDeptDao;
import com.dept.service.GetDeptService;
import com.test.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GetDeptServiceImpl implements GetDeptService {

    @Autowired
    private GetDeptDao getDeptDao;

    @Override
    public List<Dept> getDeptList(Map map) {
        return getDeptDao.getDeptList(map);
    }
}
