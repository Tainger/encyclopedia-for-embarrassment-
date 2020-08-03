package com.alieducation.service.Impl;

import com.alieducation.dao.FeedBackDao;
import com.alieducation.entity.Feedback;
import com.alieducation.service.FeedBackService;
import org.springframework.stereotype.Service;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:34
 */
@Service
public class FeedBackServiceImpl  implements FeedBackService {

    private FeedBackDao feedBackDao;
    @Override
    public int insertFeedback(Feedback feedback) {
       return feedBackDao.insert(feedback);
    }
}
