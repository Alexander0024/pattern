package com.lirenkj.pattern.factory.entity;

import com.lirenkj.pattern.factory.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
