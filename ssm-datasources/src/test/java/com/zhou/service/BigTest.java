package com.zhou.service;

import java.math.BigDecimal;

/**
 * @author zhous
 * @create 2019-07-18 19:01
 */
public class BigTest {


    public static void main(String[] args) {
        BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = new BigDecimal(123);

        a = a.add(b);

        System.out.println(a);

    }
}
