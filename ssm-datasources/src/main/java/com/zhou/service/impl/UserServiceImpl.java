package com.zhou.service.impl;

import com.zhou.mapper.UserMapper;
import com.zhou.model.pojo.User;
import com.zhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhous
 * @create 2019-07-06 14:22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User selByPrimaryKey(String uid) {
        return userMapper.selByPrimaryKey(uid);
    }
}
