package com.lirenkj.pattern.observer.entity;

import com.lirenkj.pattern.observer.Observer;
import com.lirenkj.pattern.observer.Subject;

/**
 * OctalObserver
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class OctalObserver extends Observer<Subject> {
    public OctalObserver(Subject subject) {
        this.mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(mSubject.getState()));
    }
}
