package com.angrycow1111.feignconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RibbonConfiguration
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-18
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
