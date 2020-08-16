package com.alieducation.dto;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/3 21:06
 */
@Data
public class DtoSupport {

    /**
     * 用户的id
     */
    @NotNull(message = "userId不能为null")
    @Min(value = 1, message = "必须为正整数")
    private Integer userId;

    /**
     * 帖子id
     */
    @NotNull(message = "userId不能为null")
    @Min(value = 1, message = "必须为正整数")
    private Integer postId;
}
