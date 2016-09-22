package com.interview.question004;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static com.interview.other.Contans.INPUT_PATH;
import static com.interview.question004.Words.*;
import static org.junit.Assert.assertEquals;


/**
 * 第 0004 题：任一个英文的纯文本文件，统计其中的单词出现的个数。
 */
public class WordsTest {

    private File inputFile = new File(INPUT_PATH + File.separator + "words");

    @Test
    public void one_word_test() throws Exception {
        String[] strs = {"hello"};
        Map<String, Integer> result = getWordCount(strs);
        assertEquals(new Integer(1), result.get("hello"));
    }

    @Test
    public void two_same_word_test() throws Exception {
        String[] strs = {"hello", "hello"};
        Map<String, Integer> result = getWordCount(strs);
        assertEquals(new Integer(2), result.get("hello"));
    }

    @Test
    public void two_different_word_test() throws Exception {
        String[] strs = {"hello", "world"};
        Map<String, Integer> result = getWordCount(strs);
        assertEquals(new Integer(1), result.get("hello"));
        assertEquals(new Integer(1), result.get("world"));
    }

    @Test
    public void more_word_test() throws Exception {
        String[] strs = {"hello", "world", "Paul", "Paul"};
        Map<String, Integer> result = getWordCount(strs);
        assertEquals(new Integer(1), result.get("hello"));
        assertEquals(new Integer(1), result.get("world"));
        assertEquals(new Integer(2), result.get("Paul"));
    }

    @Test
    public void readFileSplitByLineTest() throws IOException {
        for (String word : readFileSplitByBlank(inputFile)) {
            System.out.println(word);
        }
    }

    @Test
    public void readFileSplitByBlankTest() throws IOException {
        for (String word : readFileSplitByLine(inputFile)) {
            System.out.println(word);
        }
    }

    @Test
    public void searchWordCountsTest() throws IOException {
        getWordCount(readFileSplitByBlank(inputFile));
    }

}
