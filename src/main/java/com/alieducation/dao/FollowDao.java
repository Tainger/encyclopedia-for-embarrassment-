package com.alieducation.dao;

import com.alieducation.entity.Follow;
import com.alieducation.entity.User;
import com.alieducation.util.TKMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 14:18
 */

@Mapper
public interface FollowDao extends TKMapper<Follow> {

    /**
     * 查询互相关注的好友
     * @param follow 查询条件
     * @return 查询数据
     */
    List<User> getFriends(@Param("follow") Follow follow);

    /**
     * 查询一个人的粉丝
     * @param follow 参数
     * @return 条件
     */
    List<User> getFollowers(Follow follow);

    /**
     * 获取你关注的人
     * @param follow 参数
     * @return 返回结果
     */
    List<User> getFollowees(Follow follow);
}
