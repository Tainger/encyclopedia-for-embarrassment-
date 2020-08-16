package com.alieducation.dto;

import lombok.Data;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 15:01
 */

@Data
public class DtoSearch {

    /**
     *用于搜索标题
     */
    private String topic;

    /**
     * 用于搜所文章
     */
    private String article;

    /**
     * 用于搜索文章
     */
    private String user;
}
