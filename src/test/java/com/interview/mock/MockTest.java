package com.interview.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * this test case show mock & spy different
 * Created by apple on 2016/11/13 22:53.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    @Mock
    private List<String> mockList;
    @Spy
    private List<String> spyList = new ArrayList<>(); // spy need instance

    @Test
    public void arrayMockListTest() throws Exception {

        //arrange
        mockList.add("aaa");
        verify(mockList).add("aaa");
        assertEquals(0, mockList.size()); // mock not actual execute add

        //when
        when(mockList.size()).thenReturn(100);

        //then
        assertEquals(100, mockList.size());


    }

    @Test
    public void spyListTest() throws Exception {
        //arrange
        spyList.add("aaa");
        verify(spyList).add("aaa");
        assertEquals(1, spyList.size()); // spy will exexute add method

        //when
        when(spyList.size()).thenReturn(100);

        //then
        assertEquals(100, spyList.size());

    }
}
