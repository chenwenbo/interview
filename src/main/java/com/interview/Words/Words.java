package com.interview.Words;

import java.io.*;
import java.util.HashMap;
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

    private static String[] readFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuffer sbf = new StringBuffer();
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            sbf.append(line);
        }
        return sbf.toString().split(" ");
    }

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String[] words = readFile(new File(dir.getCanonicalFile() + File.separator + "words"));
        printWordCount(words);
    }
}
