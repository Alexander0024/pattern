package com.lirenkj.pattern.memento;

/**
 * Originator
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Originator {
    private String mState;

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public Memento saveStateToMemento() {
        return new Memento(mState);
    }

    public void getStateFromMento(Memento memento) {
        mState = memento.getState();
    }
}
