package com.alieducation.controller;

import com.alieducation.dto.DtoEditUserPic;
import com.alieducation.dto.DtoUnFollow;
import com.alieducation.dto.DtoUpdateUserInfo;
import com.alieducation.entity.User;
import com.alieducation.service.UserService;
import com.alieducation.util.ChoushiUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/5 19:05
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("login")
    @ApiOperation(value="获取user", notes="根据id获取User的接口")
    public Object Login(@ApiParam(required=true, name="id", value="主键id")
                              @RequestParam(name = "id", required=true) String id){
        return "success";
    }


    @PutMapping("editUserpic")
    @ApiOperation(value="修改用户头像", notes="目前只提供上传头像的url链接")
    public Object editUserpic( @Validated @RequestBody DtoEditUserPic dtoEditUserPic){
        User user = new User();
        BeanUtils.copyProperties(dtoEditUserPic,user);
        int res = userService.editUserpic(user);
        if(res!=1){
            return ChoushiUtil.getJsonString(500,"更新失败");
        }
        return ChoushiUtil.getJsonString(200,"更新成功");
    }

    @PutMapping("editInfo")
    @ApiOperation(value="修改用户头像", notes="目前只提供上传头像的url链接")
    public Object editInfo( @Validated @RequestBody DtoUpdateUserInfo dtoUpdateUserInfo){
        User user = new User();
        BeanUtils.copyProperties(dtoUpdateUserInfo,user);
        int res = userService.editUserInfo(user);
        if(res!=1){
            return ChoushiUtil.getJsonString(500,"更新失败");
        }
        return ChoushiUtil.getJsonString(200,"更新成功");
    }
}
