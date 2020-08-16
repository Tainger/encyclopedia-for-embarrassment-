package com.alieducation.service;

import com.alieducation.entity.AdSense;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:52
 */
public interface AdSenseService {

    /**
     * 查询所有广告
     * @return
     */
    List<AdSense> selectAllAdSense();
}
