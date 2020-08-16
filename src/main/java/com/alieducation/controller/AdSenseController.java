package com.alieducation.controller;

import com.alieducation.entity.AdSense;
import com.alieducation.service.AdSenseService;
import com.alieducation.util.ChoushiUtil;
import org.graalvm.compiler.nodes.calc.ObjectEqualsNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:50
 */

@RestController
@RequestMapping("/api/v1/adSense")
public class AdSenseController {

    @Autowired
    private AdSenseService adSenseService;

    @RequestMapping("select-all")
    public Object queryAdSense(){
        Map<String,Object> map = new HashMap<>();
        List<AdSense> adSenseList = adSenseService.selectAllAdSense();
        map.put("daSenses",adSenseList);
        return ChoushiUtil.getJsonString(200,"获取成功",map);
    }
}
