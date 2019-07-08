package com.zhou.service.impl;

import com.zhou.annotation.DataSourceSelector;
import com.zhou.emum.DataSourceKey;
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

    @DataSourceSelector(dataSource = DataSourceKey.DB1)
    public User selByPrimaryKey1(String uid) {
        return userMapper.selByPrimaryKey(uid);
    }

    @DataSourceSelector(dataSource = DataSourceKey.DB2)
    public User selByPrimaryKey2(String uid) {
        return userMapper.selByPrimaryKey(uid);
    }


}
