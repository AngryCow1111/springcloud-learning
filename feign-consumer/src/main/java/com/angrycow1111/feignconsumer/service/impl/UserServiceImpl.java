//package com.angrycow1111.feignconsumer.service.impl;
//
//import com.angrycow1111.feignconsumer.entity.*;
//import com.angrycow1111.feignconsumer.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
///**
// * UserServiceImpl
// *
// * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
// * @since 2019-05-21
// */
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Override
//    public User get(Long id) {
//        List<User> users = restTemplate.getForObject("http://USER-SERVICE/user/user", List.class, id);
//        restTemplate.getForObject("http://USER-SERVICE/user/user", User.class, id);
//        return users.get(0);
//    }
//}
