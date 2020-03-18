package com.qfjy.bootrabbitmqtopicprovider;

import com.qfjy.BootRabbitmqTopicProviderApplication;
import com.qfjy.UserSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Created by IntelliJ IDEA.
 * @Package: com.qfjy
 * @ClassName: QueueTest
 * @Description: TODO
 * @Author: zhouneng
 * @DateTime: 2020/3/14 15:57
 * @Vession: v1.0.0
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootRabbitmqTopicProviderApplication.class)
public class QueueTest {
    @Autowired
    private UserSender userSender;


    @Test
     public void Test1(){

        this.userSender.setMengage("周能user");
       }
}
