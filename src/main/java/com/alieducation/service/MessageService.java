package com.alieducation.service;

import com.alieducation.dao.MessageDao;
import com.alieducation.entity.mongodb.MongoMessage;
import com.alieducation.entity.mongodb.MongoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 19:32
 */

@Service
public class MessageService {


    @Autowired
    private MessageDao messageDao;


    public MongoUser findUserById(long fromUserId) {
        return messageDao.findUserById(fromUserId);
    }

    public List<MongoMessage> selectHistoryMessageByPage(long fromUserId, long toUserId, int page, int size) {

        return messageDao.selectMessageByFromAndTo(fromUserId, toUserId, page, size);
    }

    public List<MongoMessage> selectNewestMessageOfConversation(long fromUserId, long toUserId) {
        return messageDao.selectNewestMessageOfConversation(fromUserId, toUserId);
    }
}
