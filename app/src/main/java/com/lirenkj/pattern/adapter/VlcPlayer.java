package com.lirenkj.pattern.adapter;

import com.lirenkj.pattern.adapter.interfaces.AdvancedMediaPlayer;

/**
 * VlcPlayer
 * <p>
 * Created by Alexander on 2016/10/18.
 */
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name = " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
