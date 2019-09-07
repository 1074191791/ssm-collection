package com.zhou.service;

import java.math.BigDecimal;

/**
 * @author zhous
 * @create 2019-07-18 19:01
 */
public class BigTest {


    public static void main(String[] args) {
        /*BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = new BigDecimal(123);

        a = a.add(b);

        System.out.println(a);*/

        BigDecimal a1 = new BigDecimal("2.00");
        BigDecimal b1 = new BigDecimal(2.00d);
        BigDecimal c1 = new BigDecimal("2.00");
        BigDecimal d1 = new BigDecimal(2.0d);

        System.out.println(b1 == d1);
        System.out.println(b1.equals(d1));
        System.out.println(b1.compareTo(d1) == 0);

        System.out.println("================================");

        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));
        System.out.println(a1.compareTo(b1) == 0);

        System.out.println("================================");

        System.out.println(a1 == c1);
        System.out.println(a1.equals(c1));
        System.out.println(a1.compareTo(c1) == 0);

        /*BigDecimal a2 = new BigDecimal("2");
        BigDecimal b2 = new BigDecimal(2);
        System.out.println(a2 == b2);*/

    }
}
