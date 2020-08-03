package com.alieducation.controller;

import com.alieducation.entity.Feedback;
import com.alieducation.service.FeedBackService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:28
 */
@RestController
@RequestMapping("/api/v1/feedback")
public class FeedbackController {


    @Autowired
    private FeedBackService feedBackService;


    @RequestMapping("add")
    public Object insertFeedback(@Validated @RequestBody Feedback feedback) {
        int res = feedBackService.insertFeedback(feedback);
        if (res != 1) {
            return ChoushiUtil.getJsonString(500, "插入失败");
        }
        return ChoushiUtil.getJsonString(200, "插入成功");
    }
}
