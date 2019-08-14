package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * RabbitMqConfig
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-02
 */
@Configuration
public class RabbitMqConfiguration {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
