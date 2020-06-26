package com.aliEducation.controller;

import com.aliEducation.entity.User;
import com.aliEducation.service.UserService;
import com.aliEducation.util.CommunityUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    @ResponseBody
    public String getUser(){
        User user =  userService.selectUserById(1);
        return JSONObject.toJSON(user).toString();
    }

}
