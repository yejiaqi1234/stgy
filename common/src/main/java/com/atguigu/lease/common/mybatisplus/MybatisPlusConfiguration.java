package com.atguigu.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.atguigu.lease.web.*.mapper")  // 扫描mapper接口，这个就是定义mapper接口位置直接扫后面都不需要加mapping
public class MybatisPlusConfiguration {

}