package com.alieducation.controller;

import com.alieducation.dto.DtoTopicCategory;
import com.alieducation.entity.Topic;
import com.alieducation.service.TopicService;
import com.alieducation.util.ChoushiUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 11:03
 */
@RestController
@RequestMapping("/api/v1/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    /**
     * 根据categoryId 去查询话题
     * @param
     */
    @GetMapping("query/{id}")
    public Object queryTopicByCategoryId(@PathVariable("id") int categoryId){
        Topic topic = new Topic();
        topic.setTopicCategoryId(categoryId);
        List<Topic> topicList = topicService.queryTopicByCategoryId(topic);
        Map<String,Object> map = new HashMap<>();
        map.put("topics",topicList);
        return ChoushiUtil.getJsonString(400,"查询成功",map);
    }

    /**
     * 查询当前最热门十条话题
     * @return
     */
    @GetMapping("query/hot")
    @ApiOperation(value="查询当前最热门的十条话题", notes="简单查询十条")
    public Object getHotTenTopic(){
        List<Topic> topicList = topicService.getHotTenTopic();
        Map<String,Object> map = new HashMap<>();
        map.put("topics",topicList);
        return ChoushiUtil.getJsonString(400,"查询成功",map);
    }
}
