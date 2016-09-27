package com.interview.singleton;

/**
 * 饿汉型单例
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
