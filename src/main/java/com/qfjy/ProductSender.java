package com.qfjy;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Created by IntelliJ IDEA.
 * @Package: com.qfjy.Sender
 * @ClassName: provider
 * @Description: TODO
 * @Author: zhouneng
 * @DateTime: 2020/3/14 14:30
 * @Vession: v1.0.0
 */

@Component
public class ProductSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${mq.config.exchange}")
    private String exchange;



    public  void  setMengage(String mengage){


        this.rabbitTemplate.convertAndSend(this.exchange,"product.log.info","info"+mengage);
        this.rabbitTemplate.convertAndSend(this.exchange,"product.log.error","error"+mengage);
        this.rabbitTemplate.convertAndSend(this.exchange,"product.log.debug","debug"+mengage);
    }


}
