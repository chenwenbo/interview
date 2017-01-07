package com.interview.pattern.adapter;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 15:05.
 */
public class VicAdvancedMediaPlayed implements AdvancedMediaPlayed{

    @Override
    public void play(String songName) {
        System.out.println("Vic"+songName);
    }
}
