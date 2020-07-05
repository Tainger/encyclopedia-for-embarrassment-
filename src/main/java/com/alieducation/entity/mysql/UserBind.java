package com.alieducation.entity.mysql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserBind {
    private Integer id;
    private Integer type;
    private String openid;
    private Integer userId;
    private String nickName;
    private String avatarUrl;
}
