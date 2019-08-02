package com.zhou.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhou.model.pojo.User;

/**
 * @author zhous
 * @create 2019-07-06 14:06
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过主键查询
     * @param uid
     * @return
     */
    //User selByPrimaryKey(String uid);

}
