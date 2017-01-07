package com.interview.pattern.adapter;

/**
 * description : 适配器模式Demo
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 14:43.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioMediaPlayer();
        mediaPlayer.play(MediaEnum.MP3,"song1");
        mediaPlayer.play(MediaEnum.MP4,"song2");
        mediaPlayer.play(MediaEnum.VIC,"song3");
    }

}
