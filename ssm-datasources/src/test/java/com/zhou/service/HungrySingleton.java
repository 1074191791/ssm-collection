package com.zhou.service;

/**
 * @author zhous
 * @create 2019-08-28 9:33
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有化构造方法
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
