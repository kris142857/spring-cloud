package com.yizhou.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by yizhou on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.yizhou.cloud.mapper","com.yizhou.cloud.dao"})
public class MyBatisConfig {
}
