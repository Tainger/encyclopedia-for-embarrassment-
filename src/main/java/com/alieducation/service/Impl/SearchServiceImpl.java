package com.alieducation.service.Impl;

import com.alieducation.dao.PostDao;
import com.alieducation.dao.TopicDao;
import com.alieducation.dao.UserDao;
import com.alieducation.entity.Post;
import com.alieducation.entity.Topic;
import com.alieducation.entity.User;
import com.alieducation.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 15:34
 */

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private TopicDao topicDao;
    @Autowired
    private PostDao postDao;
    @Autowired
    private UserDao userDao;

    @Override
    public List<Topic> searchTopic(String topicName) {
        return topicDao.searchTopic(topicName);
    }

    @Override
    public List<Post> searchPost(String postName) {
        return postDao.searchPost(postName);
    }

    @Override
    public List<User> searchUser(String userName) {
        return userDao.searchUser(userName);
    }
}
