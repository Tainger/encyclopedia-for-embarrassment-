package com.aliEducation.entity;

import com.aliEducation.validator.isMobile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String userPic;
    private String password;
    @isMobile()
    private String phone;
    private String email;
    private Boolean status;
    private Date createTime;
}
