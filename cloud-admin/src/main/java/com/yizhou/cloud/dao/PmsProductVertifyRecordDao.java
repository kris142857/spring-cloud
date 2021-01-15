package com.yizhou.cloud.dao;

import com.yizhou.cloud.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品审核日志管理Dao
 * Created by yizhou on 2018/4/27.
 */
public interface PmsProductVertifyRecordDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
