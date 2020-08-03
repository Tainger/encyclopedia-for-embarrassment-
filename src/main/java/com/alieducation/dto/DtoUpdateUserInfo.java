package com.alieducation.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 20:57
 */

@Data
public class DtoUpdateUserInfo {
    @NotNull(message = "id不能为null")
    @Min(value = 1, message = "id必须为正整数")
    private Long id;
    @NotNull(message = "userName不能为null")
    private String userName;
    @NotNull(message = "headerUrl不能为null")
    private String headerUrl;
    @NotNull(message = "password不能为null")
    private String password;
    @NotNull(message = "phone不能为null")
    private String phone;
    @NotNull(message = "email不能为null")
    private String email;
    @NotNull(message = "status不能为null")
    private Boolean status;

}
