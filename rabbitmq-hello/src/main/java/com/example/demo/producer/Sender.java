package com.example.demo.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Sender
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-02
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String content = "hello world!";
        System.out.println("sender:" + content);
        this.amqpTemplate.convertAndSend(content);
        this.amqpTemplate.convertAndSend("queue.hello", "hello");


    }
}