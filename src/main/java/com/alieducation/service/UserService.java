package com.alieducation.service;

import com.alieducation.dao.UserDao;
import com.alieducation.dto.DtoUnFollow;
import com.alieducation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author rocky
 */
@Service
public class UserService {

    @Autowired
    private UserDao userMapper;


    public User selectUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int editUserpic(User user) {
        return userMapper.updateUserpic(user);
    }

    public int editUserInfo(User user) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", user.getId());
        return userMapper.updateByExample(user, example);
    }
}
