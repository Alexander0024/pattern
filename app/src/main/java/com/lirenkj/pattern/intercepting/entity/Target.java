package com.lirenkj.pattern.intercepting.entity;

/**
 * Target
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
