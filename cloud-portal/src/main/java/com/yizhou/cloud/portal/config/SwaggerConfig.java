package com.yizhou.cloud.portal.config;

import com.yizhou.cloud.common.config.BaseSwaggerConfig;
import com.yizhou.cloud.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by yizhou on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.yizhou.cloud.portal.controller")
                .title("mall前台系统")
                .description("mall前台相关接口文档")
                .contactName("yizhou")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
