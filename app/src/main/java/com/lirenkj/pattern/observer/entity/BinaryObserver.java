package com.lirenkj.pattern.observer.entity;

import com.lirenkj.pattern.observer.Observer;
import com.lirenkj.pattern.observer.Subject;

/**
 * BinaryObserver
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class BinaryObserver extends Observer<Subject> {
    public BinaryObserver(Subject subject) {
        this.mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(mSubject.getState()));
    }
}
