package com.lirenkj.pattern.observer;

import com.lirenkj.pattern.observer.entity.BinaryObserver;
import com.lirenkj.pattern.observer.entity.HexaObserver;
import com.lirenkj.pattern.observer.entity.OctalObserver;

/**
 * ObserverDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 20");
        subject.setState(20);
    }
}
