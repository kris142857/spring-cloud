package com.yizhou.cloud.portal.service.impl;

import com.yizhou.cloud.mapper.OmsOrderReturnApplyMapper;
import com.yizhou.cloud.model.OmsOrderReturnApply;
import com.yizhou.cloud.portal.domain.OmsOrderReturnApplyParam;
import com.yizhou.cloud.portal.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 * Created by yizhou on 2018/10/17.
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
