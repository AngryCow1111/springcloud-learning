package com.example.demo.controller;

import com.example.demo.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-02
 */
@RestController
@RequestMapping( "/message" )
public class MessageController {

    @Autowired
    private Sender sender;

    @RequestMapping( "/send" )
    public void send() {
        sender.send();
    }
}
