package com.alieducation.dao;

import com.alieducation.entity.Topic;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 11:12
 */
@Mapper
public interface TopicDao extends TKMapper<Topic> {
}
