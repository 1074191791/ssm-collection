package com.zhou.service;

import com.zhou.model.pojo.User;

/**
 * @author zhous
 * @create 2019-07-06 14:22
 */
public interface UserService {

    /**
     * 通过uid查找
     *
     * @param uid
     * @return
     */
    User selByPrimaryKey1(String uid);

}
