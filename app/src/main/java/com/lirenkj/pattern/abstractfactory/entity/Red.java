package com.lirenkj.pattern.abstractfactory.entity;

import com.lirenkj.pattern.abstractfactory.interfaces.Color;

/**
 * Red
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
