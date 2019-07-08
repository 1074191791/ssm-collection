package com.zhou.test;

import com.zhou.model.pojo.User;
import com.zhou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author zhous
 * @create 2019-07-06 18:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AccountServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void queryByUserId1() {

        String userId = "1";

        User user1 = userService.selByPrimaryKey1(userId);
        System.out.println("user1 = " + user1);
        User user2 = userService.selByPrimaryKey2(userId);
        System.out.println("user2 = " + user2);
    }
}
