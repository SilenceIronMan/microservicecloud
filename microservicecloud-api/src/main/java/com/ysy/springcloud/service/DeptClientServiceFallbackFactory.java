package com.ysy.springcloud.service;

import com.ysy.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @anthor silenceYin
 * @date 2020/5/8 - 0:53
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return  Dept.builder().deptno(id)
                        .dname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                        .db_source("no this database in MySQL").build();
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
