package com.zhou.service;


import com.zhou.model.pojo.TbUser;

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
    TbUser selByPrimaryKey1(String uid);

    /**
     * 切换数据源
     * @param uid
     * @return
     */
    TbUser selByPrimaryKey2(String uid);

}
