package com.yizhou.cloud.service;

import com.yizhou.cloud.dto.OssCallbackResult;
import com.yizhou.cloud.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by yizhou on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
