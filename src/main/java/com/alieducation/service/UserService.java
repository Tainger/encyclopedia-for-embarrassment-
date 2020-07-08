package com.alieducation.service;

 import com.alieducation.dao.UserDao;
 import com.alieducation.entity.User;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

/**
 * @author rocky
 */
@Service
public class UserService {

    @Autowired
    private UserDao userMapper;


    public User selectUserById(long id){
        return userMapper.selectByPrimaryKey(id);
    }

}
