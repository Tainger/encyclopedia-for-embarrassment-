package com.alieducation.service.Impl;

import com.alieducation.dao.SupportDao;
import com.alieducation.entity.Support;
import com.alieducation.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/3 21:33
 */

/**
 * 用户点赞的信息
 */
@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private SupportDao supportDao;

    @Override
    public Support findSupport(Support support) {
        return supportDao.findSupport(support);
    }

    @Override
    public int insertSupport(Support support) {
        return supportDao.insert(support);
    }

    @Override
    public int updateSupport(Support support) {
        return supportDao.updateByPrimaryKey(support);
    }
}
