package com.aliEducation.dao;

import com.aliEducation.entity.mongodb.MongoUser;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 21:39
 */
public interface MongoUserDao {
    MongoUser insertMongoUser(MongoUser mongoUser);
}
