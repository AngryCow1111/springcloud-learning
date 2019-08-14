package com.angrycow1111.consumer.controller;

import com.angrycow1111.consumer.entity.User;
import com.angrycow1111.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * UserController
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-18
 */
@RestController
@RequestMapping( "/user" )
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping( "/user" )
    public User user(@RequestParam( "id" ) Long id) {
        long beginTime = System.currentTimeMillis();
        User user = userService.get(id);
        long endTime = System.currentTimeMillis();
        long execTime = endTime - beginTime;
        System.out.println(execTime);
        return user;
    }

    @GetMapping( "/users" )
    public List<User> users() {
        long beginTime = System.currentTimeMillis();
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        List<User> users = userService.list(ids);
        long endTime = System.currentTimeMillis();
        long execTime = endTime - beginTime;
        System.out.println(execTime);
        return users;
    }
}
