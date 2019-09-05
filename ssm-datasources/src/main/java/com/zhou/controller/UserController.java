package com.zhou.controller;

import com.zhou.model.pojo.TbUser;
import com.zhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhous
 * @create 2019-07-06 13:48
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 选择DB1数据源
     */
    private static final String DB1 = "1";

    @Autowired
    UserService userService;

    @RequestMapping("/selByPrimaryKey/{uid}/{type}")
    @ResponseBody
    public TbUser selByPrimaryKey(@PathVariable("uid") String uid, @PathVariable("type") String type) {

        if(DB1.equals(type)) {
            return userService.selByPrimaryKey1(uid);
        } else {
            return userService.selByPrimaryKey2(uid);
        }

    }



}
