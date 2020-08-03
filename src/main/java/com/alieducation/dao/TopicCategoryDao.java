package com.alieducation.dao;

import com.alieducation.entity.TopicCategory;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 12:33
 */

@Mapper
public interface TopicCategoryDao extends TKMapper<TopicCategory> {
}
