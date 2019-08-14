package com.angrycow1111.feignconsumer.controller;

import com.angrycow1111.feignconsumer.entity.User;
import com.angrycow1111.feignconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-21
 */
@RestController
@RequestMapping( "/user" )
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping( "/user" )
    public User user(@RequestParam( "id" ) Long id) {
        return userService.user(id).get(0);
    }
}
