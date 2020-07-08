package com.alieducation.controller;

import com.alieducation.entity.Topic;
import com.alieducation.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/api/v1/topic/add")
    public void add(@RequestBody Topic topic){

    }
}
