package com.angrycow1111.streamhello.Consumer;

import com.angrycow1111.streamhello.StreamHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


/**
 * SinkReceiver
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-02
 */

@EnableBinding( value = {Sink.class} )
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener( Sink.INPUT )
    public void receive(Object payload) {
        logger.info("receiver:" + payload);
    }
}
