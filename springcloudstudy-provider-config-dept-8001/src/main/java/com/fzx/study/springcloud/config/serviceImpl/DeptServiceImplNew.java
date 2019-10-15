package com.fzx.study.springcloud.config.serviceImpl;

import com.fzx.study.springcloud.config.service.DeptService;
import com.fzx.study.springcloud.config.dao.DeptDao;
import com.fzx.study.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class DeptServiceImplNew implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
