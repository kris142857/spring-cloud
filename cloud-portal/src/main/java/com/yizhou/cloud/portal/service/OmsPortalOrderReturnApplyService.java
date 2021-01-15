package com.yizhou.cloud.portal.service;

import com.yizhou.cloud.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by yizhou on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
