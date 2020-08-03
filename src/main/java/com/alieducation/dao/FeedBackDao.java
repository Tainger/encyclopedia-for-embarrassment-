package com.alieducation.dao;

import com.alieducation.entity.Feedback;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:37
 */

@Mapper
public interface FeedBackDao extends TKMapper<Feedback> {
}
