package com.ysy.springcloud.controller;


import com.ysy.springcloud.entities.Dept;
import com.ysy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 21:46
 */
@RestController
public class DeptController_Consumer {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptClientService.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    @GetMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return deptClientService;
    }
}
