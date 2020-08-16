package com.alieducation.service;

import com.alieducation.entity.Post;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/9 9:06
 */
public interface PostService {
    int selectCountOfPost();

    Post findPostById(int postId);
}
