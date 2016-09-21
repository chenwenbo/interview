package com.interview.question012;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/9/21.
 */
public class ReplaceFilterWordTest {

    private List<String> filterWords = null;

    @Before
    public void before(){
        filterWords = Arrays.asList("chen","wen");
    }

    @Test
    public void string_chen_should_be_keyword() {
        assertEquals("****", ReplaceFilterWord.getFilterWordResult(filterWords,"chen"));
    }

    @Test
    public void string_wen_should_be_keyword() {
        assertEquals("***", ReplaceFilterWord.getFilterWordResult(filterWords,"wen"));
    }

    @Test
    public void string_bo_should_be_pass() {
        assertEquals(ReplaceFilterWord.RIGHT_ANSWER, ReplaceFilterWord.getFilterWordResult(filterWords,"bo"));
    }

    @Test
    public void string_chenwen_should_be_keyword_wen() {
        assertEquals("*******", ReplaceFilterWord.getFilterWordResult(filterWords,"chenwen"));
    }

}