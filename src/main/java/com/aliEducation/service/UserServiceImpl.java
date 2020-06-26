package com.aliEducation.service;

import com.aliEducation.dao.UserMapper;
import com.aliEducation.entity.User;
import com.aliEducation.exception.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public boolean login(User user) {

        if(user == null){
            throw new GlobalException("服务端异常");
        }
        String userName = user.getUserName();
        String password = user.getPassword();
        User toUser = userMapper.selectUserByUserName(userName);
        if(toUser == null){
            throw  new GlobalException("查无此用户");
        }
        if(!toUser.getPassword().equals(user.getPassword())){
            throw  new GlobalException("密码不对");
        }
        return true;
    }
}
