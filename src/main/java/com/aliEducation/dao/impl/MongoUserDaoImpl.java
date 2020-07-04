package com.aliEducation.dao.impl;

import com.aliEducation.dao.MongoUserDao;
import com.aliEducation.entity.mongodb.MongoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 21:39
 */
@Repository
public class MongoUserDaoImpl implements MongoUserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public MongoUser insertMongoUser(MongoUser mongoUser){
        return mongoTemplate.insert(mongoUser);
    }
}
