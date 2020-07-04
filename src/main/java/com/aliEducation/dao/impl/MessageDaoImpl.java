package com.aliEducation.dao.impl;

import com.aliEducation.dao.MessageDao;
import com.aliEducation.entity.mongodb.MongoMessage;
import com.aliEducation.entity.mongodb.MongoUser;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.mysql.cj.protocol.Message;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 12:57
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<MongoMessage> selectMessageByFromAndTo(Long fromId, Long toId, Integer page, Integer rows) {
        Criteria fromList = Criteria.where("from.id").is(fromId).and("to.id").is("toId");
        Criteria toList = Criteria.where("to.id").is(fromId).and("from.id").is("toId");
        Criteria criteria = new Criteria().orOperator(fromList, toList);
        PageRequest pageRequest = PageRequest.of(page - 1, rows, Sort.by(Sort.Direction.ASC, "send_date"));
        //查询条件
        Query query = new Query().addCriteria(criteria).with(pageRequest);

        List<MongoMessage> messages = mongoTemplate.find(query, MongoMessage.class);
        return messages;
    }

    @Override
    public MongoMessage selectMessageById(String id) {
//        Criteria criteria = Criteria.where("id").is(id);
//        Query query = new Query().addCriteria(criteria)
//        mongoTemplate.find(query,Message.class);
        return mongoTemplate.findById(new ObjectId(id), MongoMessage.class);
    }

    @Override
    public UpdateResult  updateMessageStatusById(ObjectId id, Integer status) {

        //写一个条件
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query();
        query.addCriteria(criteria);
        //写一个你要修改的信息
        Update update = Update.update("status",status);
        /**
         * 改状态顺便，改下信息
         */
        if(status.intValue() == 1){
            update.set("send_date",new Date());
        }else if (status.intValue() == 2){
            update.set("read_date", new Date());
        }
        //修改信息
        return mongoTemplate.updateFirst(query, update, MongoMessage.class);

    }

    @Override
    public MongoMessage insertMessage(MongoMessage message) {
        return mongoTemplate.save(message);
    }

    @Override
    public DeleteResult deleteMessageById(String id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query();
        query.addCriteria(criteria);
        return mongoTemplate.remove(query,MongoMessage.class);
    }

    /**
     * 根据fromUserId查询user
     * @param fromUserId
     * @return
     */
    @Override
    public MongoUser findUserById(long fromUserId) {
        Criteria criteria = Criteria.where("id").is(fromUserId);
        Query query = new Query();
        query.addCriteria(criteria);
        return mongoTemplate.findOne(query, MongoUser.class);
    }


    //toDo bupt
    @Override
    public List<MongoMessage> selectNewestMessageOfConversation(long fromUserId, long toUserId) {
        return null;
    }


}
