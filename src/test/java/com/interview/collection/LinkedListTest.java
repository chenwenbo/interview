package com.interview.collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {


    LinkedList linkedList = new LinkedList();

    @Before
    public void before() {
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ddd");
    }

    @Test
    public void test_list_size() {
        assertEquals(4, linkedList.size());
    }

    @Test
    public void test_list_first() {
        assertEquals("aaa", linkedList.first());
    }

    @Test
    public void test_list_last() {
        assertEquals("ddd", linkedList.last());
    }

    @Test
    public void test_list_to_array() {
        assertEquals(4, linkedList.toArray().length);
    }

    @Test
    public void test_list_remove() {
        linkedList.remove(0);
        assertEquals(3, linkedList.size());
    }

    @Test
    public void test_list_remove_index() {
        linkedList.remove("aaa");
        assertEquals(3, linkedList.size());
    }

}
