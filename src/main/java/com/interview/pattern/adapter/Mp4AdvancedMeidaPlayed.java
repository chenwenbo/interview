package com.interview.pattern.adapter;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 15:06.
 */
public class Mp4AdvancedMeidaPlayed implements AdvancedMediaPlayed{

    @Override
    public void play(String songName) {
        System.out.println("mp4"+songName);
    }
}
