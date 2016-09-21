package com.interview.question012;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.interview.question004.Words.readFileSplitByLine;

/**
 * 第 0012 题： 敏感词文本文件 filtered_words.txt，里面的内容 和 0011题一样，当用户输入敏感词语，
 * 则用 星号 * 替换，例如当用户输入「北京是个好城市」，则变成「**是个好城市」。
 */
public class ReplaceFilterWord {

    public static final String RIGHT_ANSWER = "Human Rights";
    public static final String FILTER_CHAR = "*";
    public static final String FILTERED_WORDS_FILE = "filtered_words";

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        List<String>  words = readFileSplitByLine(new File(dir.getCanonicalFile() + File.separator + FILTERED_WORDS_FILE));
        Scanner scanner = new Scanner(System.in);
        while (true){
            String result = getFilterWordResult(words, scanner.nextLine());
            System.out.println(result);
        }
    }

    public static String getFilterWordResult(List<String> words, String inputWrod) {
        boolean flag = false;
        for (String word : words) {
            if(inputWrod.contains(word)){
                flag = true;
                inputWrod = replaceFilterWord(inputWrod, word);
            }
        }
        return flag ? inputWrod : RIGHT_ANSWER;
    }

    private static String replaceFilterWord(String inputWord, String filterWord) {
        StringBuffer replaceWord = new StringBuffer();
        for (int i = 0; i < filterWord.length(); i++) {
            replaceWord.append(FILTER_CHAR);
        }
        return inputWord.replaceAll(filterWord, replaceWord.toString());
    }

}
