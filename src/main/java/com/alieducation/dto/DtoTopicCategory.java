package com.alieducation.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 12:44
 */

@Data
public class DtoTopicCategory {
    private  int id;
    private String name;
    /**
     * 0禁用， 1删除
     */
    private boolean status;
    private Date createTime;
}
