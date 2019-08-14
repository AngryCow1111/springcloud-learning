package com.angrycow1111.configclient.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-31
 */
@RestController
@RequestMapping( "/test" )
@RefreshScope
public class TestController {

    @Value( "${from}" )
    private String from;

    @GetMapping( "/from" )
    public String from() {
        String from = null;
        if (StringUtils.isNotBlank(this.from)) {

            from = this.from;
        }

        return from;
    }

}
