package com.zhou.mapper;

import com.zhou.CommonTest;
import com.zhou.model.pojo.TbUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
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

    @Test
    public void test02() {
        TbUser tbUser = new TbUser();
        tbUser.setId(999998L);
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());
        tbUser.setEmail("123@qq.com");
        tbUser.setPassword("sss1");
        tbUser.setPhone("123");
        tbUser.setUsername("zhou");
        int insert = tbUserMapper.insert(tbUser);
        System.out.println(insert);
    }


}
