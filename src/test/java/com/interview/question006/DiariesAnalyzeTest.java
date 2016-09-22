package com.interview.question006;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.interview.other.Contans.INPUT_DIARIES_PATH;

/**
 * 第 0006 题：你有一个目录，放了你一个月的日记，都是 txt，为了避免分词的问题，假设内容都是英文，请统计出你认为每篇日记最重要的词。
 */
public class DiariesAnalyzeTest {

    private DiariesAnalyze diariesAnalyze = new DiariesAnalyze();

    private List<File> files;

    @Before
    public void before() throws IOException {
        files = diariesAnalyze.getFile(new File(INPUT_DIARIES_PATH));
    }

    @Test
    public void everyFileFrequentWordTest() throws IOException {
        diariesAnalyze.printEveryFileFrequentWord(files);
    }

    @Test
    public void allFilesFrequentWordTest() throws IOException {
        diariesAnalyze.printAllFilesFrequentWord(files);
    }

}