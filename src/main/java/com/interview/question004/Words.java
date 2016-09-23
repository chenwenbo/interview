package com.interview.question004;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.interview.other.Contants.INPUT_PATH;

public class Words {

    public static TreeMap<String, Integer> getFrequentWord(String[] words) {
        final Map<String, Integer> wordCount = getWordCount(words);
        TreeMap<String, Integer> result = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (wordCount.get(o1) > wordCount.get(o2)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        result.putAll(wordCount);
        return result;
    }

    public static Map<String, Integer> getWordCount(String[] words) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String word : words) {
            if (result.get(word) != null) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static String readFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuffer sbf = new StringBuffer();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            sbf.append(line);
        }
        return sbf.toString();
    }

    public static String[] readFileSplitByBlank(File file) throws IOException {
        return readFile(file).split(" ");
    }

    public static List<String> readFileSplitByLine(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<String> words = new ArrayList<>();
        String word = null;
        while ((word = bufferedReader.readLine()) != null) {
            words.add(word.trim());
        }
        return words;
    }

    public static void main(String[] args) throws IOException {
        String[] words = readFileSplitByBlank(new File(INPUT_PATH + File.separator + "words.txt"));
        getWordCount(words);
    }
}
