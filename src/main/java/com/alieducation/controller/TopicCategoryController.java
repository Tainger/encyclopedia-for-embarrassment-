package com.alieducation.controller;

import com.alieducation.entity.Topic;
import com.alieducation.entity.TopicCategory;
import com.alieducation.service.TopicCategoryService;
import com.alieducation.service.TopicService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 12:21
 */

@RestController
@RequestMapping("/api/v1/topic-category")
public class TopicCategoryController {

    @Autowired
    private TopicCategoryService topicCategoryService;

    @RequestMapping("query")
    public Object queryTopicCategory(){
        List<TopicCategory> topicCategoryList = topicCategoryService.queryTopicCategory();
        Map <String, Object> map = new HashMap<>();
        map.put("topicCategorys",topicCategoryList);
        return ChoushiUtil.getJsonString(400,"话题分类查询成功",map);
    }
}
