package com.interview.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("A");
        strs.add("B");
        iterator(strs); // pass
        foreach(strs); // error
    }

    private static void iterator(List<String> strs) {
        Iterator<String> iterator = strs.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if ("B".equals(str)) {
                iterator.remove();
            }
        }
    }

    private static void foreach(List<String> strs) {
        for (String str : strs) {
            if ("B".equals(str)) {
                strs.remove(str);
            }
        }
    }
}
