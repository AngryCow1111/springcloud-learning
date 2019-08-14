package com.angrycow1111.consumer.service.impl;

import com.angrycow1111.consumer.entity.User;
import com.angrycow1111.consumer.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * UserServiceImpl
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-18
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand( fallbackMethod = "kindfulError" )
//    @HystrixCollapser( batchMethod = "list", collapserProperties = {
//            @HystrixProperty( name = "timerDelayInMilliseconds ", value = "100" )
//    } )
    @Override
    public User get(Long id) {
        List<User> users = restTemplate.getForObject("http://USER-SERVICE/user/user", List.class, id);
        restTemplate.getForObject("http://USER-SERVICE/user/user", User.class, id);
        return users.get(0);
    }

    //    @HystrixCommand
    @Override
    public List<User> list(List<Long> ids) {
        List<User> users = restTemplate.getForObject("http://USER-SERVICE/user/users", List.class, StringUtils.join(ids), ",");
        return users;
    }

    public User kindfulError(Long id) {
        User user = new User();
        System.out.println("cannot find service");
        logger.info("params:{}", id);
        return user;
    }
}