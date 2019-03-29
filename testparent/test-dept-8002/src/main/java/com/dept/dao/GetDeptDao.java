package com.dept.dao;

import com.test.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GetDeptDao {
    public List<Dept> getDeptList(Map map);
//    public void insert(Dept dept);
}
