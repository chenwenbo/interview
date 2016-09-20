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

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        List<String>  words = readFileSplitByLine(new File(dir.getCanonicalFile() + File.separator + "filtered_words"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            String inputWrod = scanner.nextLine();
            if(!containFilterWord(words, inputWrod)){
                System.out.println(RIGHT_ANSWER);
            }
        }
    }

    private static boolean containFilterWord(List<String> words, String inputWrod) {
        for (String word : words) {
            if(inputWrod.contains(word)){
                replaceFilterWord(inputWrod,word);
                return true;
            }
        }
        return false;
    }

    private static void replaceFilterWord(String inputWord, String filterWord) {
        StringBuffer replaceWord = new StringBuffer();
        for (int i = 0; i < filterWord.length(); i++) {
            replaceWord.append(FILTER_CHAR);
        }
        System.out.println(inputWord.replaceAll(filterWord, replaceWord.toString()));
    }

}
