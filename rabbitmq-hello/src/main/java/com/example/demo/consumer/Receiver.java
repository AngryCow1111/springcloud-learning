package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Receiver
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-02
 */
@Component
@RabbitListener( queues = {"hello"} )
public class Receiver {

    @RabbitHandler
    public void process(String content) {
        System.out.println("receiver:" + content);
    }

}
