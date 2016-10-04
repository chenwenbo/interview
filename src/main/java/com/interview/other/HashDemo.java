package com.interview.other;

/**
 * Created by apple on 2016/10/04 13:26.
 */
public class HashDemo {
    public static void main(String[] args) {
        HashDemo hashDemo = new HashDemo();
        HashDemo hashDemo1 = new HashDemo();
        System.out.println(hashDemo.hashCode());
        System.out.println(hashDemo.hashCode());
        System.out.println(hashDemo1.hashCode());
        System.out.println(hashDemo1.hashCode());
    }
}
