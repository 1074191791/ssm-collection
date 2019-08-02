package com.zhou;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zhou.mapper.UserMapper;
import com.zhou.model.pojo.User;
import com.zhou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zhous
 * @create 2019-08-02 20:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyBatisPlusTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {

        User user = userService.selByPrimaryKey1("1");
        System.out.println("user = " + user);
    }


    @Test
    public void test02() {
        //当使用selectOne 方法时， 如果传入的数据不能保证返回数据为一个，就会throw Exception
        User user = userMapper.selectOne(new User());
        System.out.println("user = " + user);
    }

    @Test
    public void test05() {
        //selectById的方式查, 此时查到的数据返回值为Null
        User user = userMapper.selectById(null);
        System.out.println("user = " + user);
    }

    @Test
    public void test03() {
        //使用updateById方法
        User user = new User();
        user.setUsername("hahahahahha");
        Integer count = userMapper.updateById(user);
        System.out.println("count = " + count);
    }

    @Test
    public void test04() {
        //使用update方法
        User user = new User();
        user.setUsername("hahahah");
        Integer update = userMapper.update(user, getWrapper(user));
        System.out.println("update = " + update);

    }

    private Wrapper<User> getWrapper(User user) {
        Wrapper<User> wrapper = new EntityWrapper<User>();
        //暂时写这俩
        /*if(null != user.getId()) {
            wrapper.eq("id",user.getId());
        }
        if(null != user.getUsername()) {
            wrapper.eq("username", user.getUsername());
        }*/

        wrapper.eq("id", user.getId());

        return wrapper;
    }

}
