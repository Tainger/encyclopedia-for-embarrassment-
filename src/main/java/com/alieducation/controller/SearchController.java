package com.alieducation.controller;

import com.alieducation.entity.Post;
import com.alieducation.entity.Topic;
import com.alieducation.entity.User;
import com.alieducation.service.SearchService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:58
 */

@RestController
@RequestMapping("/api/v1/Search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("topic")
    public Object searchTopic(@Validated String topicName){
        List<Topic> topicList = searchService.searchTopic(topicName);
        Map<String, Object> map = new HashMap<>();
        map.put("topics",topicList);
        return ChoushiUtil.getJsonString(200,"查询成功",map);
    }

    @GetMapping("post")
    public Object searchPost(@Validated String postName){
        List<Post> topicList = searchService.searchPost(postName);
        Map<String, Object> map = new HashMap<>();
        map.put("topics",topicList);
        return ChoushiUtil.getJsonString(200,"查询成功",map);
    }

    @GetMapping("user")
    public Object searchUser(@Validated String userName){
        List<User> topicList = searchService.searchUser(userName);
        Map<String, Object> map = new HashMap<>();
        map.put("topics",topicList);
        return ChoushiUtil.getJsonString(200,"查询成功",map);
    }

}
