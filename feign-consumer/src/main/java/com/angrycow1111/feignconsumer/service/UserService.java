package com.angrycow1111.feignconsumer.service;

import com.angrycow1111.feignconsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * UserService
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-21
 */
@FeignClient( value = "user-service" )
public interface UserService {
    @GetMapping( "/user/user" )
    List<User> user(@RequestParam( "id" ) Long id);
}
