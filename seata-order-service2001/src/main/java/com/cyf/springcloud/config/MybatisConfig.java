package com.cyf.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author by cyf
 * @date 2020/7/23.
 */
@Configuration
@MapperScan({"com.cyf.springcloud.dao"})
public class MybatisConfig {
}
