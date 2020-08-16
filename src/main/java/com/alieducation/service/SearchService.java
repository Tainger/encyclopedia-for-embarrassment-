package com.alieducation.service;

import com.alieducation.entity.Post;
import com.alieducation.entity.Topic;
import com.alieducation.entity.User;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 15:32
 */
public interface SearchService {

    /**
     * 搜索话题
     * @param topicName
     * @return
     */
    List<Topic> searchTopic(String topicName);

    /**
     * 搜索帖子
     * @param postName
     * @return
     */
    List<Post> searchPost(String postName);


    /**
     * 搜索用户
     * @param userName
     * @return
     */
    List<User> searchUser(String userName);
}
