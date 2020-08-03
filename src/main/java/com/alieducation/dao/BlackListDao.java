package com.alieducation.dao;

import com.alieducation.entity.BlackList;
import com.alieducation.entity.Feedback;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 16:50
 */
@Mapper
public interface BlackListDao extends TKMapper<BlackList> {
}
