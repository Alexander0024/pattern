package com.lirenkj.pattern.mediator;

/**
 * MediatorDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User alex = new User("Alex");

        robert.sendMessage("Hi Alex");
        alex.sendMessage("Hi Robert");
    }
}
