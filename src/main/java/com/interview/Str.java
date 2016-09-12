package com.interview;

/**
 * convert String to number
 */
public class Str {

    public static final char ZERO_CHAR = '0';

    public int convert(String str) {

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
           result = result * 10 + str.charAt(i)-ZERO_CHAR;
        }
        return result;
    }

}
