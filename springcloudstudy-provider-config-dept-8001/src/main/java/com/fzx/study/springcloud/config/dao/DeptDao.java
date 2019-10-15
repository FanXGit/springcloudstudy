package com.fzx.study.springcloud.config.dao;

import com.fzx.study.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);


    public Dept findById(Long id);


    public List<Dept> findAll();
}
