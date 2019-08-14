package com.angrycow1111.consumer.service;

import com.angrycow1111.consumer.entity.User;

import java.util.List;

/**
 * UserService
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-05-18
 */
public interface UserService {
    User get(Long id);

    List<User> list(List<Long> ids);
}
