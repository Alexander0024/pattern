package com.lirenkj.pattern.builder.entity;

import com.lirenkj.pattern.builder.entity.abs.ColdDrink;

/**
 * Coke
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
