package com.alieducation.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/5 22:00
 */
@Data
public class TopicCategory {
    private  int id;
    private String name;
    private boolean status;
    private Date createTime;
}
