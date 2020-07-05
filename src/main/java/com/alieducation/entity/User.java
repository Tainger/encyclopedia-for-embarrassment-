package com.alieducation.entity;

import com.alieducation.validator.isMobile;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="Mysql")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "header_url")
    private String headerUrl;
    @Column(name = "password")
    private String password;
    @isMobile()
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "create_time")
    private Date createTime;
}
