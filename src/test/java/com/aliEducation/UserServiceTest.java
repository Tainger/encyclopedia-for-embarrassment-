package com.aliEducation;

import com.aliEducation.dao.TKTestMapper;
import com.aliEducation.dao.UserMapper;
import com.aliEducation.entity.User;
import com.aliEducation.service.UserService;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TKTestMapper tkTestMapper;

    @Test
    public void testUserService(){
        User user = userMapper.selectUserById(1);
        User user1 = userMapper.selectUserByUserName("江湖旧人");
    }

    @Test
    public void setTkTestMapper(){
        User user = new User();
        user.setCreateTime(new Date());
        user.setEmail("670570900@qq.com");
        user.setPassword("456456");
        user.setPhone("13037135085");
        user.setUserName("大宝");
        user.setUserPic("http://localhost：8080/getPicture");
        tkTestMapper.insertSelective(user);
    }
}
