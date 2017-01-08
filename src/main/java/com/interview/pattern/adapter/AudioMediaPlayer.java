package com.interview.pattern.adapter;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 15:06.
 */
public class AudioMediaPlayer implements MediaPlayer{

    @Override
    public void play(MediaEnum mediaEnum, String fileName) {
        if (mediaEnum.equals(MediaEnum.MP3)) {
            System.out.println("play mp3" + fileName);
        } else {
            MediaPlayer adapterMediaPlayer = new AdapterMediaPlayer(mediaEnum);
            adapterMediaPlayer.play(mediaEnum, fileName);
        }
    }

}
