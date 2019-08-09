package com.zhou;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zhou.mapper.UserMapper;
import com.zhou.model.dto.UserDTO;
import com.zhou.model.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhous
 * @create 2019-08-02 20:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyBatisPlusTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        UserDTO user = new UserDTO();
        //user.setId(1L);
        user.setUsername("zhouzhzouzhouzhzozu");
        User result = userMapper.selectById(user);
        System.out.println("result = " + result);
    }


    @Test
    public void test02() {
        //当使用selectOne 方法时， 如果传入的数据不能保证返回数据为一个，就会throw Exception
        User param = new User();
        //param.setId(1L);
        param.setId(99999L);
        User result = userMapper.selectOne(param);
        System.out.println("user = " + result);
    }

    @Test
    public void test03() {
        //selectById的方式查, 此时查到的数据返回值为Null
        User result1 = userMapper.selectById(null);
        System.out.println("result1 = " + result1);

        User user = userMapper.selectById(888);
        System.out.println("user = " + user);

        User result2 = userMapper.selectById("1");
        System.out.println("result2 = " + result2);

        User result3 = userMapper.selectById(1L);
        System.out.println("result3 = " + result3);

        User result4 = userMapper.selectById(new Long(1));
        System.out.println("result4 = " + result4);
    }

    @Test
    public void test04() {
        //使用updateById方法
        User user = new User();
        user.setUsername("hahahahahha");
        Integer count = userMapper.updateById(user);
        System.out.println("count = " + count);
    }

    @Test
    public void test05() {
        //使用update方法
        User user = new User();
        //User user = null;
        user.setId(1L);
        //user.setUsername("hahahah");
        Integer update = userMapper.update(user, getWrapper(user));
        System.out.println("update = " + update);

    }

    private Wrapper<User> getWrapperById(User user) {
        Wrapper<User> wrapper = new EntityWrapper<User>();
        wrapper.eq("id", user.getId());
        return wrapper;
    }


    private Wrapper<User> getWrapper(User user) {
        Wrapper<User> wrapper = new EntityWrapper<User>();
        //暂时写这俩
        if (null != user) {
            if (null != user.getId()) {
                wrapper.eq("id", user.getId());
            }
            if (null != user.getUsername()) {
                wrapper.eq("username", user.getUsername());
            }
        }
        return wrapper;
    }

}
