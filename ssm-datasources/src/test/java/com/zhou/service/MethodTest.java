package com.zhou.service;

import com.zhou.model.dto.UserDTO;
import com.zhou.model.pojo.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhous
 * @create 2019-07-19 14:57
 */
public class MethodTest {


    @Test
    public void Test01() {

        UserDTO userDTO = new UserDTO();
        Result result = new Result();

        result.i = 1;

        if (checkInputParameter(userDTO, result)){
            System.out.println(result.i);
        }

    }


    public Boolean checkInputParameter(UserDTO userDTO, Result result) {
        result.i = 10;

        return true;
    }



    @Test
    public void test02() {

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

    private void setUser(User user) {
//        User replace = new User();
//        replace.setUsername("azhe");
//        user = replace;
        user.setUsername("adsfadfasf");
    }

    private void set(Map<String, String> param) {
        //param.put("123","123");
        Map<String, String> aa = new HashMap<String, String>();
        aa.put("123","123");
        param = aa;
    }

}
