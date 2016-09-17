package com.interview.words;

import com.interview.Words.Words;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WordsTest {

    private Words words = new Words();

    @Test
    public void one_word_test() throws Exception {
        String[] strs = {"hello"};
        Map<String, Integer> result = words.printWordCount(strs);
        assertEquals(new Integer(1),result.get("hello"));
    }

    @Test
    public void two_same_word_test() throws Exception {
        String[] strs = {"hello","hello"};
        Map<String, Integer> result = words.printWordCount(strs);
        assertEquals(new Integer(2),result.get("hello"));
    }

    @Test
    public void two_different_word_test() throws Exception {
        String[] strs = {"hello", "world"};
        Map<String, Integer> result = words.printWordCount(strs);
        assertEquals(new Integer(1), result.get("hello"));
        assertEquals(new Integer(1), result.get("world"));
    }

    @Test
    public void more_word_test() throws Exception {
        String[] strs = {"hello", "world", "Paul", "Paul"};
        Map<String, Integer> result = words.printWordCount(strs);
        assertEquals(new Integer(1), result.get("hello"));
        assertEquals(new Integer(1), result.get("world"));
        assertEquals(new Integer(2), result.get("Paul"));
    }

}
