package com.interview.question001;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券），使用 Python 如何生成 200 个激活码（或者优惠券）？
 */
public class ActiviteCode {

    private static final String ALL_CHARS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Set<String> getActiviteCode(int count, int length){
        Set<String> activiteCodes = new HashSet<String>();
        while (activiteCodes.size() < count) {
            activiteCodes.add(generateKey(length));
        }
        return activiteCodes;
    }

    private String generateKey(int length) {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sbf.append(ALL_CHARS.charAt(new Random().nextInt(ALL_CHARS.length())));
        }
        return sbf.toString();
    }

}
