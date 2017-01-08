package com.interview.pattern.adapter;

/**
 * description : 适配器模式Demo
 * 为原有的类添加功能，与装饰器模式最大的区别就是会修改原有类的内部结构，会在原有类中添加一个适配器，以适配其他功能
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
