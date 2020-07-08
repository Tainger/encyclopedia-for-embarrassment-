package com.alieducation.service;

import com.alieducation.dao.TopicDao;
import com.alieducation.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 13:34
 */
@Service
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    public void addTopic(Topic topic){
        topicDao.insert(topic);
    }
}
