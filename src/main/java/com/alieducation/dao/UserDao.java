package com.alieducation.dao;

import com.alieducation.entity.Topic;
import com.alieducation.entity.User;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 8:01
 */
@Mapper
public interface UserDao extends TKMapper<User> {

    int editUserpic(User user);

    int updateUserpic(User user);

    List<User> searchUser(String userName);
}
