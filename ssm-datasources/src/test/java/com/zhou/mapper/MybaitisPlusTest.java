package com.zhou.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zhou.CommonTest;
import com.zhou.model.pojo.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zhous
 * @create 2019-09-07 10:36
 */
public class MybaitisPlusTest extends CommonTest {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Test
    public void test01() {

        List<TbUser> tbUsers = tbUserMapper.selectList(null);
        tbUsers.stream().forEach(System.out::println);
    }


}
