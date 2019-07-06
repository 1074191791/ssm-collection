package com.zhou.mapper;

import com.zhou.model.pojo.User;

/**
 * @author zhous
 * @create 2019-07-06 14:06
 */
public interface UserMapper {

    User selByPrimaryKey(String uid);

}
