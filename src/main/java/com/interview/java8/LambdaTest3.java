package com.interview.java8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * chen wenbo
 * Created by apple on 2016/11/09 10:07.
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("111", "222", "333", "444", "555").stream();
    }
}
