package com.alieducation.controller;


import com.alieducation.dto.Page;
import com.alieducation.entity.Post;
import com.alieducation.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/8 15:52
 */

@RestController
@RequestMapping("/api/v1/index")
public class IndexController {

    @Autowired
    private PostService postService;

    @PostMapping("getPage")
    public Object getPost(@RequestBody Page page) {
        int count = postService.selectCountOfPost();
        page.setCount(count);
        return null;
    }
}
