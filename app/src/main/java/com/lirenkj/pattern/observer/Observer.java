package com.lirenkj.pattern.observer;

/**
 * Observer
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public abstract class Observer<T> {
    protected T mSubject;

    public abstract void update();
}
