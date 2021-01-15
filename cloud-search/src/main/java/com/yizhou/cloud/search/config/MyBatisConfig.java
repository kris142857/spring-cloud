package com.yizhou.cloud.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by yizhou on 2019/4/8.
 */
@Configuration
@MapperScan({"com.yizhou.cloud.mapper","com.yizhou.cloud.search.dao"})
public class MyBatisConfig {
}
