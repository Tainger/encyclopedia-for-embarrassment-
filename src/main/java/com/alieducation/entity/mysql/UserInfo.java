package com.alieducation.entity.mysql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserInfo {
    private Integer id;
    private Integer userId;
    private Integer age;
    private boolean sex;
    private boolean relationStatus;
    private String job;
    private String hometown;
    private Date  birthday;
}
