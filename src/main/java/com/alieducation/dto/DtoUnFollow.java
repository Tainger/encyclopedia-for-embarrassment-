package com.alieducation.dto;

import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class DtoUnFollow {
    private int id;
    @NotNull(message = "followId不能为空")
    @Min(value = 1, message = "必须为正整数")
    private int followId;
    @NotNull(message = "userId不能为空")
    @Min(value = 1, message = "必须为正整数")
    private int userId;
    private Date createTime;
}
