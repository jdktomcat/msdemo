package com.xdd.mdemo.pack.blog.mappers;


import com.xdd.mdemo.pack.blog.entry.StatisticsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by angelo.tang on 2016-12-30.
 */
public interface StatisticsMapper {
    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertBatch(List<StatisticsInfo> list);

    /**
     * 获取统计数据的最近值
     * @return 最近统计日期时间
     */
    Date getStatisticsMaxDate();

    /**
     * 根据主键获取实体
     * @param id 主键
     * @return
     */
    StatisticsInfo fetchInfoById(@Param("id") Long id);

    /**
     * 插入实体
     * @param statisticsInfo 实体
     * @return
     */
    int insertInfo(StatisticsInfo statisticsInfo);
}
