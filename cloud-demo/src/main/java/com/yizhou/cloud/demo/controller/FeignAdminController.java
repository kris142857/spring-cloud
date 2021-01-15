package com.yizhou.cloud.demo.controller;

/**
 * Created by yizhou on 2019/10/18.
 */

import com.yizhou.cloud.common.api.CommonResult;
import com.yizhou.cloud.demo.dto.UmsAdminLoginParam;
import com.yizhou.cloud.demo.service.FeignAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign调用mall-admin接口示例
 */
@Api(tags = "FeignAdminController", description = "Feign调用mall-admin接口示例")
@RestController
@RequestMapping("/feign/admin")
public class FeignAdminController {
    @Autowired
    private FeignAdminService adminService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam loginParam) {
        return adminService.login(loginParam);
    }

    @GetMapping("/getBrandList")
    public CommonResult getBrandList(){
        return adminService.getList();
    }
}
