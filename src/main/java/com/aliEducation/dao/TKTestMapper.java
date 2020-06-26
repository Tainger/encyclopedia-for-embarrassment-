package com.aliEducation.dao;

import com.aliEducation.entity.User;
import com.aliEducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TKTestMapper extends TKMapper <User>{

    List<User> selectUserList();

}
