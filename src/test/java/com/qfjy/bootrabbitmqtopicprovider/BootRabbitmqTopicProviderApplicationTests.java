package com.qfjy.bootrabbitmqtopicprovider;

import com.qfjy.OrderSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootRabbitmqTopicProviderApplicationTests {

    @Autowired
    OrderSender orderSender;

    @Test
    void contextLoads() {
    }

}
