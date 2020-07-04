package com.aliEducation;

import com.aliEducation.dao.MessageDao;
import com.aliEducation.dao.MongoUserDao;
import com.aliEducation.entity.mongodb.MongoMessage;
import com.aliEducation.entity.mongodb.MongoUser;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.UpdateDefinition;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 14:10
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDBTest {

    @Autowired
    private MessageDao messageDao;
    @Autowired
    private MongoUserDao mongoUserDao;

    @Test
    public void insertMongoDBFromUser(){
//        MongoUser user = MongoUser.builder().id(new ObjectId()).userName("456").build();
//        MongoMessage message = new MongoMessage();
//        message.setFrom(user);
//        message.setId(new ObjectId());
//        message.setTo(MongoUser.builder().id(456465L).userName("fdfdf").build());
//        message.setStatus(1);
//        message.setSendDate(new Date());
//        message.setReadDate(new Date());
//        message.setMsg("今天吃饭了吗");
//        messageDao.insertMessage(message);
    }

    @Test
    public void insertMongoDBToUser(){
//        MongoUser user = MongoUser.builder().id(456465L).userName("456").build();
//        MongoMessage message = new MongoMessage();
//        message.setFrom(user);
//        message.setId(new ObjectId());
//        message.setTo(MongoUser.builder().id(12313L).userName("fdfdf").build());
//        message.setStatus(1);
//        message.setSendDate(new Date());
//        message.setReadDate(new Date());
//        message.setMsg("我吃过了");
//        messageDao.insertMessage(message);
    }
    @Test
    public void insertUser(){
        MongoUser mongoUser = new MongoUser();
        mongoUser.setUserName("常哲");
        mongoUser.setId(new ObjectId());
        MongoUser res = mongoUserDao.insertMongoUser(mongoUser);

    }
    @Test
    public void deleteMessageById(){
        DeleteResult deleteResult = messageDao.deleteMessageById("5ef597d146037a4aab73e287");
        System.out.println(deleteResult.getDeletedCount());
    }

    @Test
    public void updateMessageStatusById(){
        UpdateResult UpdateResult = messageDao.updateMessageStatusById(new ObjectId("5ef59eabdbea2448befb09d5"),2);
        System.out.println(UpdateResult.getModifiedCount());
    }

    @Test
    public void selectMessageById(){
        MongoMessage mongoMessage =  messageDao.selectMessageById("5ef59eabdbea2448befb09d5");
        System.out.println(mongoMessage);
    }
}
