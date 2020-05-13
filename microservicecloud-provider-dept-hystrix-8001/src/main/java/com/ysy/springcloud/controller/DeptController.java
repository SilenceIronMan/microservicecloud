package com.ysy.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.ysy.springcloud.entities.Dept;
import com.ysy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 20:49
 */
@RestController
public class DeptController  {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;



    /**
     * 添加部门
     * @param dept
     * @return
     */
    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return  deptService.add(dept);
    }

    /**
     * 查询部门
     * @param id
     * @return
     */
    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable Long id) {
        Dept dept = deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("该ID：" + id + "没有对应的信息");
        }
        return dept;
    }

    /**
     * 熔断回调方法
     * @param id
     * @return
     */
    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return  Dept.builder().deptno(id)
                .dname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .db_source("no this database in MySQL").build();
    }

    /**
     * 查询所有部门
     * @return
     */
    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return  deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********1" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
