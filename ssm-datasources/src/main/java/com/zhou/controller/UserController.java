package com.zhou.controller;

import com.zhou.model.pojo.User;
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

    @Autowired
    UserService userService;

    @RequestMapping("/selByPrimaryKey/{uid}/{type}")
    @ResponseBody
    public User selByPrimaryKey(@PathVariable("uid") String uid, @PathVariable("type") String type) {

        if("1".equals(type)) {
            return userService.selByPrimaryKey1(uid);
        } else {
            return userService.selByPrimaryKey2(uid);
        }

    }



}
