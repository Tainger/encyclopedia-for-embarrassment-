package com.alieducation.entity;

import com.alieducation.validator.isMobile;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String userName;
    private String headerUrl;
    private String password;
    @isMobile()
    private String phone;
    private String email;
    private Boolean status;
    private Date createTime;
}
