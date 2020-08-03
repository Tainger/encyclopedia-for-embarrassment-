package com.alieducation.controller;

import com.alieducation.dto.DtoFollow;
import com.alieducation.dto.DtoUnFollow;
import com.alieducation.dto.Page;
import com.alieducation.entity.Follow;
import com.alieducation.entity.User;
import com.alieducation.service.FollowService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:54
 */

@RestController
@RequestMapping("/api/v1/feedback")
public class FollowController {

    private FollowService followService;

    /**
     * 关注
     * @param dtoFollow 关注参数
     * @return 影响结果
     */
    @PostMapping("follow")
    public Object follow(@RequestBody DtoFollow dtoFollow){
        Follow follow = new Follow();
        BeanUtils.copyProperties(dtoFollow,follow);
        int res = followService.insert(follow);
        if(res != 1){
            return ChoushiUtil.getJsonString(500,"关注失败");
        }
        return ChoushiUtil.getJsonString(200,"关注成功");
    }

    /**
     * 取消关注
     * @param dtoUnFollow 参数
     * @return 结果
     */
    @PostMapping("unfollow")
    public Object unfollow(@RequestBody DtoUnFollow dtoUnFollow){
        Follow follow = new Follow();
        BeanUtils.copyProperties(dtoUnFollow,follow);
        int res = followService.insert(follow);
        if(res != 1){
            return ChoushiUtil.getJsonString(500,"取关失败");
        }
        return ChoushiUtil.getJsonString(200,"取关成功");
    }

    /**
     * 获取一个朋友的互相关注的好友,且进行分页展示
     * @param userId 查询id
     * @return 影响结果
     */
    //to do 分页
    @GetMapping("get-friends")
    public Object getFriends(@Min (value = 1,message = "必须为正整数") @RequestParam("userId") int userId,
                             Page page){
        Follow follow = new Follow();
        follow.setUserId(userId);
        List<User> userList = followService.getFriends(follow);
        Map<String,Object> map = new HashMap<>();
        map.put("users",userList);
        return ChoushiUtil.getJsonString(200,"查询互相关注的好友",map);
    }

    /**
     *  获取粉丝
     * @param userId id
     * @param page 页数
     * @return 结果
     */
    @GetMapping("get-followers")
    public Object getFollowers(@Min (value = 1,message = "必须为正整数") @RequestParam("userId") int userId,
                             Page page){
        Follow follow = new Follow();
        follow.setUserId(userId);
        List<User> userList = followService.getFollowers(follow);
        Map<String,Object> map = new HashMap<>();
        map.put("users",userList);
        return ChoushiUtil.getJsonString(200,"查询粉丝",map);
    }

    /**
     *  获取关注的人
     * @param userId id
     * @param page 页数
     * @return 结果
     */
    @GetMapping("get-followers")
    public Object getFollowee(@Min (value = 1,message = "必须为正整数") @RequestParam("userId") int userId,
                               Page page){
        Follow follow = new Follow();
        follow.setUserId(userId);
        List<User> userList = followService.getFollowees(follow);
        Map<String,Object> map = new HashMap<>();
        map.put("users",userList);
        return ChoushiUtil.getJsonString(200,"查询粉丝",map);
    }
}
