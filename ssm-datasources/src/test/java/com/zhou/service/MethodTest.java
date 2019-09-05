package com.zhou.service;

import com.zhou.model.pojo.TbUser;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhous
 * @create 2019-07-19 14:57
 */
public class MethodTest {


    @Test
    public void Test01() {

        TbUser userDTO = new TbUser();
        Result result = new Result();

        new HashMap<String,Object>();

        result.i = 1;

        if (checkInputParameter(userDTO, result)){
            System.out.println(result.i);
        }

    }


    public Boolean checkInputParameter(TbUser userDTO, Result result) {
        result.i = 10;

        return true;
    }



    @Test
    public void test02() {
        System.out.println("adsfasd");
    }

    public void add1() {

    }

    @Test
    public void transaction() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        char[] arr = str.toCharArray();
        System.out.println(arr.length);
        //System.out.println(Long.parseLong(new Integer(1).toString()));
    }

    @Test
    public void testMap() {
        /*Map<String,String> param = new HashMap<String, String>();
        set(param);
        System.out.println(param);*/

//        User user = new User();
//        user.setUsername("zhous");
//
//        setUser(user);


//        System.out.println("user = " + user);

//        int i = 100;
//        setInteger(i);
//        System.out.println(i);

        String str = "123123";
        setStr(str);
        System.out.println("str = " + str);


    }

    private void setStr(String str) {
        str = "123";
    }

    private void setInteger(int i){
        i = 10000;
    }

    private void setUser(TbUser user) {
//        User replace = new User();
//        replace.setUsername("azhe");
//        user = replace;
       // user.setUsername("adsfadfasf");
    }

    private void set(Map<String, String> param) {
        //param.put("123","123");
        Map<String, String> aa = new HashMap<String, String>();
        aa.put("123","123");
        param = aa;
    }


    @Test
    public void test010() {

        List<String> orderNoList = new ArrayList<String>();
        /*orderNoList.add("001");
        orderNoList.add("002");
        orderNoList.add("003");
        orderNoList.add("004");
        orderNoList.add("005");*/

        String join = StringUtils.join(orderNoList.toArray(), ",");
        System.out.println(join);

    }

}
