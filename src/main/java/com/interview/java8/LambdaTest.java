package com.interview.java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * chen wenbo
 * Created by apple on 2016/10/28 12:58.
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("aaa", "bbb");
        strs.forEach(System.out::println);
        strs.forEach(c -> {
            if (c.equals("aaa")) {
                System.out.println("bingo");
            }
        });

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.forEach((k, v) -> System.out.println(k + v));

        strs.stream().filter(c -> c.equals("aaa")).forEach(System.out::println);

        String result = map.entrySet().stream()
                .filter(c -> !c.getKey().equals("key1"))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(","));
        System.out.println(result);

        List<Integer> numbers = Arrays.asList(1, 1, 3, 4);
        numbers.stream().distinct().forEach(System.out::print);

    }
}
