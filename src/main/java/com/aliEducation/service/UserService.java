package com.aliEducation.service;

 import com.aliEducation.dao.UserMapper;
 import com.aliEducation.entity.mysql.User;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User selectUserById(long id){
        return userMapper.selectByPrimaryKey(id);
    }

}
