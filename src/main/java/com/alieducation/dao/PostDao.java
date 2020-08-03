package com.alieducation.dao;

import com.alieducation.entity.Post;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/9 9:12
 */

@Mapper
public interface PostDao extends TKMapper<Post> {
}
