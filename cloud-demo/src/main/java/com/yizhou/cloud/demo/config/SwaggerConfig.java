package com.yizhou.cloud.demo.config;

import com.yizhou.cloud.common.config.BaseSwaggerConfig;
import com.yizhou.cloud.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by yizhou on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.yizhou.cloud.demo.controller")
                .title("cloud-demo系统")
                .description("SpringCloud版本中的一些示例")
                .contactName("yizhou")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
