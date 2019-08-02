package com.zhou.service;

import com.zhou.model.dto.UserDTO;
import org.junit.Test;

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
}
