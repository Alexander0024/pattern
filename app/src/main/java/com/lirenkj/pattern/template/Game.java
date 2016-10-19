package com.lirenkj.pattern.template;

/**
 * Game
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
