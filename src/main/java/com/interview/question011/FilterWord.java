package com.interview.question011;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.interview.question004.Words.readFileSplitByLine;

/**
 * 第 0011 题： 敏感词文本文件 filtered_words.txt，里面的内容为以下内容，当用户输入敏感词语时，则打印出 Freedom，否则打印出 Human Rights。
 */
public class FilterWord {

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        List<String>  words = readFileSplitByLine(new File(dir.getCanonicalFile() + File.separator + "filtered_words"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            String inputWrod = scanner.nextLine();
            if(isContainsFilterWord(words,inputWrod)){
                System.out.println("Freedom");
            }else {
                System.out.println("Human Rights");
            }
        }
    }

    private static boolean isContainsFilterWord(List<String> words, String inputWrod) {
        for (String word : words) {
            if(inputWrod.contains(word)){
                return true;
            }
        }
        return false;
    }

}
