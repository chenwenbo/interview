package com.interview.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    /**
     * no ordering
     */
    @Test
    public void hashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", "2");
        map.put("4", "4");
        System.out.println(map);
    }

    /**
     * order
     */
    @Test
    public void linkedHashMap() {
        Map<String, String> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("1", "1");
        linkedhashmap.put("3", "3");
        linkedhashmap.put("2", "2");
        linkedhashmap.put("4", "4");
        System.out.println(linkedhashmap);
    }

    @Test
    public void treeMap(){
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("4", "4");
        treeMap.put("3", "3");
        treeMap.put("2", "2");
        treeMap.put("1", "1");
        System.out.println(treeMap);
    }
}

