package com.lirenkj.pattern.memento;

/**
 * MementoDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
