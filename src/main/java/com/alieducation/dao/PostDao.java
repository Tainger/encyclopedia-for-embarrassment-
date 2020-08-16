package com.alieducation.dao;

import com.alieducation.entity.Post;
import com.alieducation.entity.Topic;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/9 9:12
 */

@Mapper
public interface PostDao extends TKMapper<Post> {
    /**
     * 文章搜索
     * @param postName
     * @return
     */
    List<Post> searchPost(@Param("postName") String postName);
}
