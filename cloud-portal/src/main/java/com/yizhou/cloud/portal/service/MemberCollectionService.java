package com.yizhou.cloud.portal.service;

import com.yizhou.cloud.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

/**
 * 会员收藏Service
 * Created by yizhou on 2018/8/2.
 */
public interface MemberCollectionService {
    int add(MemberProductCollection productCollection);

    int delete(Long productId);

    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    MemberProductCollection detail(Long productId);

    void clear();
}
