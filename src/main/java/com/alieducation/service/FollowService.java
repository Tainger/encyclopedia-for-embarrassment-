package com.alieducation.service;

import com.alieducation.entity.Follow;
import com.alieducation.entity.User;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 14:17
 */
public interface FollowService {
    int insert(Follow follow);

    List<User> getFriends(Follow follow);


    List<User> getFollowers(Follow follow);

    List<User> getFollowees(Follow follow);
}
