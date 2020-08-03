package com.alieducation.service;

import com.alieducation.dao.TopicDao;
import com.alieducation.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 13:34
 */
@Service
public interface TopicService {

    List<Topic> queryTopicByCategoryId(Topic topic);

    List<Topic> getHotTenTopic();
}
