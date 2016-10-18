package com.lirenkj.pattern.adapter;

import com.lirenkj.pattern.adapter.interfaces.AdvancedMediaPlayer;
import com.lirenkj.pattern.adapter.interfaces.MediaPlayer;

/**
 * MediaAdapter
 * <p>
 * Created by Alexander on 2016/10/18.
 */
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer mAdvancedMediaPlayer;

    MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvancedMediaPlayer.playMp4(fileName);
        }
    }
}
