package com.alieducation.service.Impl;

import com.alieducation.dao.TopicDao;
import com.alieducation.entity.Topic;
import com.alieducation.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 13:34
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;


    @Override
    public List<Topic> queryTopicByCategoryId(Topic topic) {
        return topicDao.select(topic);
    }

    @Override
    public List<Topic> getHotTenTopic() {
        return topicDao.getHotTenTopic();
    }
}
