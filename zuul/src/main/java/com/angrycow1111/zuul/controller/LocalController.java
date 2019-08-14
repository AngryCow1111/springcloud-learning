package com.angrycow1111.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LocalController
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-22
 */
@RestController
@RequestMapping( "/local" )
public class LocalController {
    @GetMapping( "/local" )
    public String local() {
        return "local";
    }
}
