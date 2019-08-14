package com.angrycow1111.teststream.consumer;

import com.angrycow1111.teststream.channel.MyChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * SinkReceiver
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-03
 */
@Slf4j
@EnableBinding( value = {Sink.class, MyChannel.class} )
public class SinkReceiver {

    @StreamListener( Sink.INPUT )
    public void receive(Object payload) {
        log.info("receiver:" + payload);
    }


    @StreamListener( MyChannel.INPUT )
    @SendTo( MyChannel.OUTPUT )
    public Object receive1(Object payload) {
        log.info("receiver:" + payload);
        return payload;
    }
}
