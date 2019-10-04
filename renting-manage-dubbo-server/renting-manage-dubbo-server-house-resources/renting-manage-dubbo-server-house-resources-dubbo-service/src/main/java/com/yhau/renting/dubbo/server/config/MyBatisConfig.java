package com.yhau.renting.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.yhau.renting.dubbo.server.mapper")
@Configuration
public class MyBatisConfig {
}
