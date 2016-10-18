package com.lirenkj.pattern.abstractfactory.entity;

import com.lirenkj.pattern.abstractfactory.interfaces.Color;

/**
 * Green
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
