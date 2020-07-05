package com.alieducation.dao;

import com.alieducation.entity.User;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 8:01
 */
@Mapper
public interface UserMapper extends TKMapper<User> {

}
