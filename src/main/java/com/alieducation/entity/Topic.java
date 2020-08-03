package com.alieducation.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/5 21:54
 */


@Data
public class Topic {

    /**
     * 主键id
     */
    private int id;
    /**
     * 名字
     */
    private String name;
    /**
     * 图片
     */
    private String picture;
    /**
     * 描述
     */
    private String desc;
    /**
     * 0禁用， 1启用
     */
    private boolean type;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 话题分类id
     */
    private int topicCategoryId;
}
