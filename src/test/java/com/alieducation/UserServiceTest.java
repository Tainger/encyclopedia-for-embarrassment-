package com.alieducation;

import com.alieducation.entity.mysql.User;
import com.alieducation.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/6/27 8:15
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void test(){
        User user = userService.selectUserById(10);
        System.out.println(user);
    }
}
