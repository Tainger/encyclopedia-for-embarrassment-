package com.alieducation.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 16:36
 */

public class DtoBlackList {

    private int id;

    /**
     * 被拉黑的id
     */
    @NotNull(message = "拉黑id不能为空")
    @Min(value = 1,message = "blackId是正整数")
    private int blackId;

    /**
     * 用户的id
     */
    @NotNull(message = "拉黑id不能为空")
    @Min(value = 1,message = "blackId是正整数")
    private int userId;

    /**
     * 创建的时间
     */
    @NotNull(message = "createTime不能为空")
    private int createTime;
}
