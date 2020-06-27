package com.aliEducation.entity.mysql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserBind {
    private Integer id;
    private Integer type;
    private String openid;
    private Integer userId;
    private String nickName;
    private String avatarUrl;
}
