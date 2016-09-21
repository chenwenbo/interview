package com.interview.question011;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/9/21.
 */
public class FilterWordTest {

    private List<String> filterWords = null;
    @Before
    public void before(){
        filterWords = Arrays.asList("chen","wen");
    }

    @Test
    public void string_chen_should_be_true() {
        assertEquals(FilterWord.FAIL_WORD, FilterWord.getFilterWordResult(filterWords,"chen"));
    }
    @Test
    public void string_wen_should_be_true() {
        assertEquals(FilterWord.FAIL_WORD, FilterWord.getFilterWordResult(filterWords,"wen"));
    }
    @Test
    public void string_bo_should_be_false() {
        assertEquals(FilterWord.PASS_WORD, FilterWord.getFilterWordResult(filterWords,"bo"));
    }
}