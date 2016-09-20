package com.interview.other;

import com.interview.other.ArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/9/18.
 */
public class ArrayListTest {

    private ArrayList list = new ArrayList();

    @Before
    public void initList(){
        list.add("1"); list.add("2"); list.add("3"); list.add("4"); list.add("5");
        list.add("6"); list.add("7"); list.add("8"); list.add("9"); list.add("10");
        list.add("11");
    }

    @Test
    public void newArrayListSizeTest() {
        assertEquals(11,list.size());
    }

    @Test
    public void newArrayListAddTest() {
        list.add("test");
        assertEquals(12,list.size());
    }

    @Test
    public void newArrayListGetTest() {
        list.add("test");
        assertEquals("test",list.get(11));
    }

}
