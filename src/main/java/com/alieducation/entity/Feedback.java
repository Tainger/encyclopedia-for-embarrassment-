package com.alieducation.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 13:31
 */

@Data
public class Feedback {
    private int id;
    private int toId;
    private int fromId;
    private String data;
    private Date date;
}
