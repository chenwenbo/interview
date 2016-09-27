package com.interview.singleton;

/**
 * 嵌套静态内部类
 */
public class NestedSingleton {

    private static class Singleton {
        private static NestedSingleton nestedSingleton = new NestedSingleton();
    }

    public static NestedSingleton getInstance(){
        return Singleton.nestedSingleton;
    }

}
