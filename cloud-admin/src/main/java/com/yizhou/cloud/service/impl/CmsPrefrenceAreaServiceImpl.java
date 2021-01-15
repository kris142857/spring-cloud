package com.yizhou.cloud.service.impl;

import com.yizhou.cloud.mapper.CmsPrefrenceAreaMapper;
import com.yizhou.cloud.model.CmsPrefrenceArea;
import com.yizhou.cloud.model.CmsPrefrenceAreaExample;
import com.yizhou.cloud.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
