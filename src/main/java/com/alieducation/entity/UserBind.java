package com.alieducation.entity;

import lombok.*;

@Data
public class UserBind {
    private Integer id;
    private Integer type;
    private String openid;
    private Integer userId;
    private String nickName;
    private String avatarUrl;
}
