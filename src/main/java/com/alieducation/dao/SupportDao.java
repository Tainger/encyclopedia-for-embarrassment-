package com.alieducation.dao;

import com.alieducation.entity.Support;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:07
 */
@Mapper
public interface SupportDao extends TKMapper<Support> {


    /**
     * 查找点赞记录
     * @param support 点赞记录
     * @return 点赞记录
     */
    Support findSupport(@Param("destSupport") Support support);

    /**
     * 更新帖子的信息
     * @param support
     * @return
     */
    int updateSupport(@Param("support") Support support);
}
