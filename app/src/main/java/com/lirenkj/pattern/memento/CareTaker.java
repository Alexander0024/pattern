package com.lirenkj.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * CareTaker
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class CareTaker {
    private List<Memento> mMementoList = new ArrayList<>();

    public void add(Memento state) {
        mMementoList.add(state);
    }

    public Memento get(int index) {
        return mMementoList.get(index);
    }

    public int size() {
        return mMementoList.size();
    }
}
