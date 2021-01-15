package com.yizhou.cloud.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.yizhou.cloud.mapper")
public class MyBatisConfig {
}
