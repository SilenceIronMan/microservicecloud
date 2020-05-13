package com.ysy.springcloud.service;

import com.ysy.springcloud.entities.Dept;

import java.util.List;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 20:40
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
