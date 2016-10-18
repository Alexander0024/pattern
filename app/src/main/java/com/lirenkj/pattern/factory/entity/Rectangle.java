package com.lirenkj.pattern.factory.entity;

import com.lirenkj.pattern.factory.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
