package com.aliEducation.websocket;

import com.aliEducation.dao.MessageDao;
import com.aliEducation.entity.mongodb.MongoMessage;
import com.aliEducation.entity.mongodb.MongoUser;
import com.aliEducation.entity.mysql.User;
import com.aliEducation.service.UserService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.JSONPDeserializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import sun.jvm.hotspot.types.JLongField;

import javax.persistence.criteria.From;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 15:25
 */
@Component
public class MessageHandler extends TextWebSocketHandler {

    @Autowired
    private MessageDao messageDao;
    @Autowired
    private UserService userService;

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Map<Long, WebSocketSession> SESSIONS = new HashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session){
        Long uid = (Long)session.getAttributes().get("uid");
        //将id,对应的session放入对话框中,后面会有Session进行对话
        SESSIONS.put(uid,session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session,TextMessage textMessage) throws IOException {
        Long uid = (Long)session.getAttributes().get("uid");
        System.out.println(uid);
        //根据前端接口解析字符串
        JsonNode jsonNode  = MAPPER.readTree(textMessage.getPayload());
        Long toId = jsonNode.get("toId").asLong();
        String msg = jsonNode.get("msg").asText();
        User fromUser = userService.selectUserById(uid);
        String fromName =fromUser.getUserName();
        User toUser = userService.selectUserById(toId);
        String toName = toUser.getUserName();
        WebSocketSession toSession=SESSIONS.get(toId);
        //将解析的数据转换成mongoDB的格式并且存储
        MongoMessage mongoMessage = MongoMessage.builder().
                id(new ObjectId()).msg(msg).status(0).sendDate(new Date())
                .readDate(new Date()).from(new MongoUser(new ObjectId(String.valueOf(uid)),fromName))
                .to(new MongoUser(new ObjectId(String.valueOf(toId)),toName)).build();
        MongoMessage returnMessage = messageDao.insertMessage(mongoMessage);
        //判读收件人在不在线，在线的话发给他，并把消息置换为已读
        if(toSession != null && toSession.isOpen()){
            //这行代码？
            toSession.sendMessage(new TextMessage(MAPPER.writeValueAsString(returnMessage)));
            messageDao.updateMessageStatusById(returnMessage.getId(),2);
        }
    }
}
