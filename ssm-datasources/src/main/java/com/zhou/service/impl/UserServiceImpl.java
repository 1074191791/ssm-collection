package com.zhou.service.impl;

import com.zhou.annotation.DataSourceSelector;
import com.zhou.emum.DataSourceKey;
import com.zhou.mapper.TbUserMapper;
import com.zhou.model.pojo.TbUser;
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
    TbUserMapper tbUserMapper;

    @DataSourceSelector(dataSource = DataSourceKey.DB1)
    public TbUser selByPrimaryKey1(String uid) {
        return tbUserMapper.selectByPrimaryKey(Long.parseLong(uid));
    }

    @DataSourceSelector(dataSource = DataSourceKey.DB2)
    public TbUser selByPrimaryKey2(String uid) {
        return tbUserMapper.selectByPrimaryKey(Long.parseLong(uid));
    }


}
