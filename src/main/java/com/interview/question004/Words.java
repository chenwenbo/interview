package com.interview.question004;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {

    public static Map<String,Integer> printWordCount(String[] words) {
        Map<String,Integer> result = new HashMap<String,Integer>();
        for (String word : words) {
            if(result.get(word)!=null){
                result.put(word,result.get(word)+1);
            }else{
                result.put(word,1);
            }
        }
        System.out.println(result);
        return result;
    }

    public static String[] readFileSplitByBlank(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuffer sbf = new StringBuffer();
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            sbf.append(line);
        }
        return sbf.toString().split(" ");
    }

    public static List<String> readFileSplitByLine(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<String> words = new ArrayList<>();
        String word = null;
        while ((word = bufferedReader.readLine())!=null){
            words.add(word.trim());
        }
        return words;
    }

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String[] words = readFileSplitByBlank(new File(dir.getCanonicalFile() + File.separator + "words"));
        printWordCount(words);
    }
}
