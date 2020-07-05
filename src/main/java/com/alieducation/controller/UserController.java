package com.alieducation.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/5 19:05
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    @GetMapping("login")
    @ApiOperation(value="获取user", notes="根据id获取User的接口")
    public Object Login(@ApiParam(required=true, name="id", value="主键id")
                              @RequestParam(name = "id", required=true) String id){
        return "success";
    }
}
