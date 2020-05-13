package com.ysy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 19:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dept implements Serializable {
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
