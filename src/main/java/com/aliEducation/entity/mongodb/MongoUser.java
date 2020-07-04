package com.aliEducation.entity.mongodb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/26 13:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("user")
@Builder
public class MongoUser {
    @Id
    private ObjectId id;
    @Field("user_name")
    private String userName;
}
