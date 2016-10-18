package com.lirenkj.pattern.builder.entity;

import com.lirenkj.pattern.builder.entity.abs.ColdDrink;

/**
 * Pepsi
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
