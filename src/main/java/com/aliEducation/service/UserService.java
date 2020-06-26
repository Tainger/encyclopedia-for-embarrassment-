package com.aliEducation.service;

 import com.aliEducation.entity.User;

public interface UserService {

    User selectUserById(int id);

    boolean login(User user);

}
