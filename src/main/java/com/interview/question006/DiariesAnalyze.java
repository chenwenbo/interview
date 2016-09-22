package com.interview.question006;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static com.interview.question004.Words.getFrequentWord;
import static com.interview.question004.Words.readFileSplitByBlank;

/**
 * 第 0006 题：你有一个目录，放了你一个月的日记，都是 txt，为了避免分词的问题，假设内容都是英文，请统计出你认为每篇日记最重要的词。
 */
public class DiariesAnalyze {

    private List<File> fileArray = new ArrayList<>();

    public static final String DIARIES_RESOURCE = "diaries";

    public void printEveryFileFrequentWord(List<File> files) throws IOException {
        for (File file : files) {
            TreeMap<String, Integer> result = getFrequentWord(readFileSplitByBlank(file));
            Map.Entry<String, Integer> firstEntry = result.firstEntry();
            System.out.println(file.getName() + "--" + firstEntry.getKey() + ":" + firstEntry.getValue());
        }
    }

    public void printAllFilesFrequentWord(List<File> files) throws IOException {
        String[] allTexts = {};
        for (File file : files) {
            String[] text = readFileSplitByBlank(file);
            allTexts = addArray(allTexts, text);
        }
        TreeMap<String, Integer> result = getFrequentWord(allTexts);
        Map.Entry<String, Integer> firstEntry = result.firstEntry();
        System.out.println("all files" + "--" + firstEntry.getKey() + ":" + firstEntry.getValue());
    }

    private String[] addArray(String[] allTexts, String[] text) {
        int desLength = allTexts.length;

        String[] tempArr = allTexts;
        allTexts = new String[allTexts.length + text.length];
        System.arraycopy(tempArr, 0, allTexts, 0, tempArr.length);

        System.arraycopy(text, 0, allTexts, desLength, text.length);
        return allTexts;
    }


    public List<File> getFile(File f) {
        File[] ff = f.listFiles();
        for (File child : ff) {
            if (child.isDirectory()) {
                getFile(child);
            } else {
                fileArray.add(child);
            }
        }
        return fileArray;
    }
}
