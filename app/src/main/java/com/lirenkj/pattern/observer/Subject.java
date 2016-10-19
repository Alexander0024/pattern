package com.lirenkj.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Subject {
    private List<Observer> mObserversList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        mObserversList.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : mObserversList) {
            observer.update();
        }
    }
}
