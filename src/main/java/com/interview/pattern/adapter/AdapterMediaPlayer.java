package com.interview.pattern.adapter;

/**
 * description : 为原有的类添加额外的功能
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 15:07.
 */
public class AdapterMediaPlayer implements MediaPlayer {
    private AdvancedMediaPlayed adapterMediaPlayer;

    public AdapterMediaPlayer(MediaEnum mediaEnum) {
        if (mediaEnum.equals(MediaEnum.MP4)) {
            adapterMediaPlayer = new Mp4AdvancedMeidaPlayed();
        } else if (mediaEnum.equals(MediaEnum.VIC)) {
            adapterMediaPlayer = new VicAdvancedMediaPlayed();
        }

    }

    @Override
    public void play(MediaEnum media, String songName) {
        adapterMediaPlayer.play(songName);
    }
}
