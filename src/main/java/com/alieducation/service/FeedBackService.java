package com.alieducation.service;

import com.alieducation.entity.Feedback;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:34
 */
public interface FeedBackService {
    /**
     * 增加反馈
     * @param feedback 增加参数
     * @return 返回影响行数
     */
    int insertFeedback(Feedback feedback);
}
