package com.zhou.service;


/**
 * @author zhous
 * @create 2019-08-27 17:24
 */
public class LazySingleton {

    private static LazySingleton lazySingleton= null;

    //私有构造方法
    private LazySingleton() {}

    //提供获取本身的方法
    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if(null == lazySingleton) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

}
