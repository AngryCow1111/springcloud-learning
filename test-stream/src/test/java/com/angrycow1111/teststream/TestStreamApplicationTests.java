package com.angrycow1111.teststream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith( SpringRunner.class )
@SpringBootTest
public class TestStreamApplicationTests {

    @Autowired
//    private MyChannel myChannel;
    private MessageChannel input1;

    @Test
    public void contextLoads() {
        input1.send(MessageBuilder.withPayload("input1").build());
    }

}
