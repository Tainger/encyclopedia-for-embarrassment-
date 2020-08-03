package com.alieducation.dto;

import com.alieducation.validator.isMobile;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 20:32
 */
@Data
public class DtoEditUserPic {

    @NotNull(message = "id不能为空")
    @Min(value = 1, message = "必须为正整数")
    private Long id;
    private String userName;
    @NotNull(message = "头像的url不能为空")
    private String headerUrl;
    private String password;
    private String phone;
    private String email;
    private Boolean status;
    private Date createTime;
}
