package com.alieducation;

import com.alieducation.dao.TopicDao;
import com.alieducation.entity.Topic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/6 11:02
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicDao topicDao;


    @Test
    public void testInsert(){
        Topic topic = new Topic();
        topic.setCreateTime(new Date());
        topic.setName("pao");
    }
}
