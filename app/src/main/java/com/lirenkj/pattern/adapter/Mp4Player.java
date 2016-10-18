package com.lirenkj.pattern.adapter;

import com.lirenkj.pattern.adapter.interfaces.AdvancedMediaPlayer;

/**
 * Mp4Player
 * <p>
 * Created by Alexander on 2016/10/18.
 */
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name = " + fileName);
    }
}
