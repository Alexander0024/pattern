package com.lirenkj.pattern.memento;

/**
 * Memento
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Memento {
    private String mState;

    public Memento(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }
}
