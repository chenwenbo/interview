package com.interview.pattern.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    /**
     * 对象锁，防止并发造成到实例
     * @return
     */
    public static LazySingleton getSafeInstance1(){
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }

    /**
     * 方法锁，粒度比对象锁大，效率低，防止并发造成多实例
     * @return
     */
    public static synchronized LazySingleton getSafeInstance(){
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public static LazySingleton getInstance(){
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
