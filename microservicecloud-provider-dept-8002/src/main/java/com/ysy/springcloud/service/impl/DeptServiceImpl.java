package com.ysy.springcloud.service.impl;

import com.ysy.springcloud.dao.DeptDao;
import com.ysy.springcloud.entities.Dept;
import com.ysy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 20:43
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
