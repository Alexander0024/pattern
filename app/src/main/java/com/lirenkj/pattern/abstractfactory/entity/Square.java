package com.lirenkj.pattern.abstractfactory.entity;

import com.lirenkj.pattern.abstractfactory.interfaces.Shape;

/**
 * Square
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
