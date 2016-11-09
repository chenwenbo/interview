package com.interview.java8;

import java.util.Arrays;
import java.util.List;

/**
 * chen wenbo
 * Created by apple on 2016/11/09 10:07.
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("111", "222", "333", "444", "555");
        list.stream().mapToLong(Long::valueOf).forEach(System.out::print);

        List<String> list1 = Arrays.asList("111", "222", "333", "444", "555");
        boolean flag = list1.stream().anyMatch(c -> c.equals("222"));
        boolean flag1 = list1.stream().allMatch(c -> c.equals("222"));
        boolean flag2 = list1.stream().noneMatch(c -> c.equals("2143"));
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
    }
}
