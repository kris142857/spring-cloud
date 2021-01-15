package com.yizhou.cloud.demo.service;

import com.yizhou.cloud.common.api.CommonResult;
import com.yizhou.cloud.demo.dto.UmsAdminLoginParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by yizhou on 2019/10/18.
 */
@FeignClient("cloud-admin")
public interface FeignAdminService {

    @PostMapping("/admin/login")
    CommonResult login(@RequestBody UmsAdminLoginParam loginParam);

    @GetMapping("/brand/listAll")
    CommonResult getList();
}
