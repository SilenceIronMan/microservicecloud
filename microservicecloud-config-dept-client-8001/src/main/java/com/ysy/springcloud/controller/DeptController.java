package com.ysy.springcloud.controller;


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
    public Dept get(@PathVariable Long id) {
        return  deptService.get(id);
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
