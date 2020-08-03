package com.alieducation.entity;

import lombok.Data;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 16:30
 */

@Data
public class BlackList {
    private int id;

    /**
     * 被拉黑的id
     */
    private int blackId;

    /**
     * 用户的id
     */
    private int userId;

    /**
     * 创建的时间
     */
    private int createTime;
}
