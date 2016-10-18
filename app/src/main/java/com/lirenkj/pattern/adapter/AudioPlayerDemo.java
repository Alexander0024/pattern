package com.lirenkj.pattern.adapter;

/**
 * AudioPlayerDemo
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class AudioPlayerDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "faraway.vlc");
        audioPlayer.play("avi", "cang.avi");
    }
}
