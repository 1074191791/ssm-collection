package com.zhou.test;

import com.zhou.mapper.UserMapper;
import com.zhou.model.pojo.User;
import com.zhou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhous
 * @create 2019-07-06 14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Demo1 {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @Test
    public void test01() {

       /* User user = userMapper.selByPrimaryKey("1138691164166201346");
        System.out.println(user);*/
        User user = userService.selByPrimaryKey("1138691164166201346");
        System.out.println(user);

    }

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = ac.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
