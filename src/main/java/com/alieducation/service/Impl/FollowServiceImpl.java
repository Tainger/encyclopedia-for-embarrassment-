package com.alieducation.service.Impl;

import com.alieducation.dao.FollowDao;
import com.alieducation.entity.Follow;
import com.alieducation.entity.User;
import com.alieducation.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 14:17
 */
@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowDao followDao;

    @Override
    public int insert(Follow follow) {
        return followDao.insert(follow);
    }

    @Override
    public List<User> getFriends(Follow follow) {
        return followDao.getFriends(follow);
    }

    @Override
    public List<User> getFollowers(Follow follow) {
        return followDao.getFollowers(follow);
    }

    @Override
    public List<User> getFollowees(Follow follow) {
        return followDao.getFollowees(follow);
    }

}
