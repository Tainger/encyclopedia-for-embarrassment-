package com.alieducation.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:47
 */
@Data
public class AdSense {
    private Integer Id;
    private String src;
    private String url;
    private Integer type;
    private Date createTime;
}
