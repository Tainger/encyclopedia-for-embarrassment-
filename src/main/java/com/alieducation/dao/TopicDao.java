package com.alieducation.dao;

import com.alieducation.entity.Topic;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 11:12
 */
@Mapper
public interface TopicDao extends TKMapper<Topic> {

    List<Topic> getHotTenTopic();

    /**
     * 使用like模糊查询
     * @return
     */
    List<Topic> searchTopic(String topicName);
}
