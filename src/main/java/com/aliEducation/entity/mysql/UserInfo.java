package com.aliEducation.entity.mysql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
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
