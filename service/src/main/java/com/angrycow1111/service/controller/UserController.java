package com.angrycow1111.service.controller;

import com.angrycow1111.service.entity.po.User;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
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

    @GetMapping( "/user" )
    public List<User> user(@RequestParam( "id" ) Long id) throws InterruptedException {
        int sleppTimeSeconds = RandomUtils.nextInt(3000);
//        Thread.sleep(sleppTimeSeconds);
        User user = new User();
        user.setId(id);
        user.setName("张三");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

    @GetMapping( "/users" )
    public List<User> users(@RequestParam( "ids" ) String ids) throws InterruptedException {
        String[] idsArr = StringUtils.split(ids, ",");
        List<Long> idsL = new ArrayList<>();
        Arrays.asList(idsArr).forEach(id ->
                idsL.add(Long.valueOf(id)));
        ArrayList<User> users = Lists.newArrayListWithExpectedSize(2);
        for (Long id : idsL) {
            User user = new User();
            user.setId(id);
            user.setName("张三");
            users.add(user);

        }
        return users;
    }
}
