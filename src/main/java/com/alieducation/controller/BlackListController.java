package com.alieducation.controller;

import com.alieducation.dto.DtoBlackList;
import com.alieducation.entity.BlackList;
import com.alieducation.service.BlackListService;
import com.alieducation.util.ChoushiUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 16:34
 */
@RestController
@RequestMapping("/api/v1/blackList")
public class BlackListController {

    @Autowired
    private BlackListService blackListService;

    @RequestMapping("add")
    public Object addBlackList(@Validated @RequestBody DtoBlackList dtoBlackList){
        BlackList blackList = new BlackList();
        BeanUtils.copyProperties(dtoBlackList,blackList);
        int res = blackListService.insertBlackList(blackList);
        if(res != 1){
            return ChoushiUtil.getJsonString(500,"黑名单加入失败");
        }
        return ChoushiUtil.getJsonString(200,"黑名单加入成功");
    }
}
