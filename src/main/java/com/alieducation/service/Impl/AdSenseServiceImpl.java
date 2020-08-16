package com.alieducation.service.Impl;

import com.alieducation.dao.AdSenseDao;
import com.alieducation.entity.AdSense;
import com.alieducation.service.AdSenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:52
 */

@Service
public class AdSenseServiceImpl implements AdSenseService {

    @Autowired
    private AdSenseDao adSenseDao;

    @Override
    public List<AdSense> selectAllAdSense() {
        return adSenseDao.selectAll();
    }
}
