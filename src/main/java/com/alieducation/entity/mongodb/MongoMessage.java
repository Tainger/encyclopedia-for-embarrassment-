package com.alieducation.entity.mongodb;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 12:42
 */

@Document("message")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MongoMessage {
    @Id
    private ObjectId id;
    private String msg;
    //用来判断消息是否读取 0 表示未读， 1表示 已读，2表示撤回
    private Integer status;
    @Field("send_date")
    private Date sendDate;
    @Field("reda_date")
    private Date readDate;
    private MongoUser from;
    private MongoUser to;
}
