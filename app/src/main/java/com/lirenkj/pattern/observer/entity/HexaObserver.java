package com.lirenkj.pattern.observer.entity;

import com.lirenkj.pattern.observer.Observer;
import com.lirenkj.pattern.observer.Subject;

/**
 * HexaObserver
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class HexaObserver extends Observer<Subject> {
    public HexaObserver(Subject subject) {
        this.mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(mSubject.getState()).toUpperCase());
    }
}
