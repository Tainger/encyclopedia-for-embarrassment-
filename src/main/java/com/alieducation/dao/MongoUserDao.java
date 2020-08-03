package com.alieducation.dao;

import com.alieducation.entity.mongodb.MongoUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 21:39
 */
@Mapper
public interface MongoUserDao {
    MongoUser insertMongoUser(MongoUser mongoUser);
}
