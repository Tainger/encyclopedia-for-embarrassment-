package com.alieducation.service;

import com.alieducation.entity.Support;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/3 21:32
 */
public interface SupportService {

    /**
     * 查找点赞记录
     * @param support 参数
     * @return 查找结果
     */
    Support findSupport(Support support);

    /**
     * 插入点赞记录
     * @param support 点赞数据
     * @return
     */
    int insertSupport(Support support);

    /**
     * 根据主键id更新id
     * @param support
     * @return
     */
    int  updateSupport(Support support);
}
