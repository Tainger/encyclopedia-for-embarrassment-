package com.alieducation.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/3 21:23
 */
@Data
public class Support {
    private Integer id;
    private Integer userId;
    private Integer postId;
    private Integer type;
    private Date date;
}
