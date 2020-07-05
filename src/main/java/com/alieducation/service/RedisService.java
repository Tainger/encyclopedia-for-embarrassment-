package com.alieducation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void operationForSetString(){
        redisTemplate.opsForValue().set("123",123);
        redisTemplate.opsForValue().set("567",567);
    }

    public void opertationForGetString(){
       int str = (Integer) redisTemplate.opsForValue().get("123");
       int str2 = (Integer) redisTemplate.opsForValue().get("567");
       System.out.println(str);
       System.out.println(str2);
    }

    public void operationForSetSet(){
        redisTemplate.opsForSet().add("testSet",123,4565,5645);
    }

    public void operationForGetSet(){
      Set<Integer> set = redisTemplate.opsForSet().members("testSet");
       System.out.println(set);
    }
}
