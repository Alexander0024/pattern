package com.lirenkj.pattern.abstractfactory.entity;

import com.lirenkj.pattern.abstractfactory.interfaces.Color;

/**
 * Blue
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
