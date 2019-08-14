package com.angrycow1111.teststream.channel;

/**
 * MyChannel
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-03
 */

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface MyChannel {

    String INPUT = "input1";
    String OUTPUT = "output1";

    @Input( MyChannel.INPUT )
    SubscribableChannel input();

    @Output( MyChannel.OUTPUT )
    MessageChannel output();
}
