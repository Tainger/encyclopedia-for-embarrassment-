package com.alieducation.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 14:01
 */

@Data
public class Follow {
    private int id;
    private int followId;
    private int userId;
    private Date createTime;
}
