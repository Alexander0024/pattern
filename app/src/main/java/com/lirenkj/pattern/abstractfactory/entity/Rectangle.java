package com.lirenkj.pattern.abstractfactory.entity;

import com.lirenkj.pattern.abstractfactory.interfaces.Shape;

/**
 * Rectangle
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
