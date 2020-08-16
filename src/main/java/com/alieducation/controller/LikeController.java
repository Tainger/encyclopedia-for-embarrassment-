package com.alieducation.controller;

import com.alieducation.choushiEnum.LikeEnum;
import com.alieducation.dto.DtoSupport;
import com.alieducation.entity.Post;
import com.alieducation.entity.Support;
import com.alieducation.service.PostService;
import com.alieducation.service.SupportService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 此处点在可以优化成一个接口
 */
@RestController
@RequestMapping("/api/v1/fav")
public class LikeController {

    @Autowired
    private PostService postService;
    @Autowired
    private SupportService supportService;

    @RequestMapping("like")
    public Object likePost(@RequestBody DtoSupport dtoSupport){
        //判断帖子是否存在
        int postId = dtoSupport.getPostId();
        Post post = postService.findPostById(postId);
        if(null == post){
            ChoushiUtil.getJsonString(500,"帖子不存在");
        }
        Support support = new Support();
        support.setType(LikeEnum.like.getType());
        support.setDate(new Date());
        //判断你和帖子之间的关系
        Support srcSupport = supportService.findSupport(support);
        //没有记录的话，插入最新记录
        if(null == srcSupport){
            int res = supportService.insertSupport(support);
            if(res >= LikeEnum.workCount.getType()){
                return ChoushiUtil.getJsonString(200,"点赞成功");
            }
            return ChoushiUtil.getJsonString(500,"点赞失败");
        }
        //有记录，看是不是已经点攒了
        Integer type = srcSupport.getType();
        if(type.equals(LikeEnum.like.getType())){
            return ChoushiUtil.getJsonString(500,"你已经点过赞");
        }else {
            //更新帖子状态
            int res = supportService.updateSupport(support);
            if(res >= LikeEnum.workCount.getType()){
                return ChoushiUtil.getJsonString(200,"点赞成功");
            }
            return ChoushiUtil.getJsonString(500,"点赞失败");
        }
    }

    //to do unlike
    @RequestMapping("unlike")
    public Object unlikePost(@RequestBody DtoSupport dtoSupport){
        //判断帖子是否存在
        int postId = dtoSupport.getPostId();
        Post post = postService.findPostById(postId);
        if(null == post){
            ChoushiUtil.getJsonString(500,"帖子不存在");
        }
        Support support = new Support();
        support.setType(LikeEnum.like.getType());
        support.setDate(new Date());
        //判断你和帖子之间的关系
        Support srcSupport = supportService.findSupport(support);
        //没有记录的话，插入最新记录
        if(null == srcSupport){
            int res = supportService.insertSupport(support);
            if(res >= LikeEnum.workCount.getType()){
                return ChoushiUtil.getJsonString(200,"点赞成功");
            }
            return ChoushiUtil.getJsonString(500,"点赞失败");
        }
        //有记录，看是不是已经点攒了
        Integer type = srcSupport.getType();
        if(type.equals(LikeEnum.like.getType())){
            return ChoushiUtil.getJsonString(500,"你已经点过赞");
        }else {
            //更新帖子状态
            int res = supportService.updateSupport(support);
            if(res >= LikeEnum.workCount.getType()){
                return ChoushiUtil.getJsonString(200,"点赞成功");
            }
            return ChoushiUtil.getJsonString(500,"点赞失败");
        }
    }
}
