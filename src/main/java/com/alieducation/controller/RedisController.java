package com.alieducation.controller;


import com.alieducation.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rocky
 */
@Controller
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/set/string", method = RequestMethod.GET)
    @ResponseBody
    public String OperationForSetString(){
        redisService.operationForSetString();
        return "执行了";
    }

    @RequestMapping("/get/string")
    @ResponseBody
    public String OperationForGetString(){
        redisService.opertationForGetString();
        return "执行了";
    }

    @RequestMapping("/set/set")
    @ResponseBody
    public String operationForSetSet(){
        redisService.operationForSetSet();
        return "执行了";
    }
    @RequestMapping("/get/set")
    @ResponseBody
    public String operationForGetSet(){
        redisService.operationForGetSet();
        return "执行了";
    }
}
