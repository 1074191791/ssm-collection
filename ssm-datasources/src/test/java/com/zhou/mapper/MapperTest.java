package com.zhou.mapper;

import com.zhou.model.dto.TraOrderDTO;
import com.zhou.model.pojo.TbItem;
import com.zhou.model.pojo.TbOrderItem;
import com.zhou.model.pojo.TbOrderItemExample;
import com.zhou.model.pojo.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhous
 * @create 2019-09-05 14:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MapperTest {

    @Autowired
    private TbUserMapper userMapper;

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;


    @Test
    public void testSel() {
        TbUser tbUser = userMapper.selectByPrimaryKey(1L);
        System.out.println(tbUser);
    }

    @Test
    public void testSelChild() {
        TraOrderDTO traOrderDTO = tbOrderMapper.selectOrderAndOrderID("1");
        System.out.println("traOrderDTO = " + traOrderDTO);
        List<TbItem> tbItems = traOrderDTO.getTbItems();
        System.out.println("tbItems = " + tbItems.size());
    }

    @Test
    public void testDelByStringIds() {
        String ids = "1,2,3";
        int i = tbOrderItemMapper.deleteByIds(ids);
        System.out.println(i);

    }

    @Test
    public void testCount() {
        int i = tbOrderItemMapper.countByExample(new TbOrderItemExample());
        System.out.println(i);
    }

}
