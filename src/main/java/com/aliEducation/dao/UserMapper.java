package com.aliEducation.dao;


import com.aliEducation.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User selectUserById(@Param("userId") int userId);

    User selectUserByUserName(@Param("userName") String userName);
}
