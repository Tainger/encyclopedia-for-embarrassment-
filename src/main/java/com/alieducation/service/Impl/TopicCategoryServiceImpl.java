package com.alieducation.service.Impl;

import com.alieducation.dao.TopicCategoryDao;
import com.alieducation.entity.TopicCategory;
import com.alieducation.service.TopicCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 12:25
 */

@Service
public class TopicCategoryServiceImpl implements TopicCategoryService {

    @Autowired
    private TopicCategoryDao topicCategoryDao;

    @Override
    public List<TopicCategory> queryTopicCategory() {
        return topicCategoryDao.selectAll();
    }
}
