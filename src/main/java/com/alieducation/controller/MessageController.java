package com.alieducation.controller;

import com.alieducation.entity.mongodb.MongoMessage;
import com.alieducation.entity.mongodb.MongoUser;
import com.alieducation.service.MessageService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 19:26
 */
@RestController()
@RequestMapping("api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("get/history")
    public Object getHistoryMessage(long fromUserId, long toUserId, int page, int size){
        MongoUser fromUser = messageService.findUserById(fromUserId);
        if( null== fromUser){
            return ChoushiUtil.getJsonString(404,"发送的user不存在");
        }
        MongoUser toUser = messageService.findUserById(toUserId);
        if( null== toUser){
            return ChoushiUtil.getJsonString(404,"发送的user不存在");
        }
        List<MongoMessage> mongoMessages = messageService.selectHistoryMessageByPage(fromUserId, toUserId, page, size);
        Map<String, Object> map = new HashMap();
        map.put("messages",mongoMessages);
        return ChoushiUtil.getJsonString(200,"响应成功",map);
    }

    @GetMapping("get/newestone")
    public Object getNewestMessageOfConversation(long fromUserId, long toUserId){
//        MongoUser fromUser = messageService.findUserById(fromUserId);
//        if( null== fromUser){
//            return CommunityUtil.getJsonString(404,"发送的user不存在");
//        }
//        MongoUser toUser = messageService.findUserById(toUserId);
//        if( null== toUser){
//            return CommunityUtil.getJsonString(404,"接收user不存在");
//        }
//        List<MongoMessage> mongoMessages = messageService.selectNewestMessageOfConversation(fromUserId, toUserId);
//        Map<String, Object> map = new HashMap();
//        map.put("historyMessages",mongoMessages);
//        return CommunityUtil.getJsonString(404,"发送的user不存在",map);
        return null;
    }

    @GetMapping("get/current")
    public Object getCurrentMessage(long fromUserId, long toUserId,
                                    @RequestParam(value = "page", defaultValue = "0" ) int page,
                                    @RequestParam(value = "size", defaultValue = "20") int size){
        MongoUser fromUser = messageService.findUserById(fromUserId);
        if( null== fromUser){
            return ChoushiUtil.getJsonString(404,"发送的user不存在");
        }
        MongoUser toUser = messageService.findUserById(toUserId);
        if( null== toUser){
            return ChoushiUtil.getJsonString(404,"发送的user不存在");
        }
        List<MongoMessage> mongoMessages = messageService.selectHistoryMessageByPage(fromUserId, toUserId, page, size);
        for(MongoMessage mongoMessage: mongoMessages){
            if(mongoMessage.getStatus()==1){
                mongoMessage.setStatus(2);
            }
        }
        Map<String, Object> map = new HashMap();
        map.put("messages",mongoMessages);
        return ChoushiUtil.getJsonString(200,"响应成功",map);
    }
}
