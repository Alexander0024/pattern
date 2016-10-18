package com.lirenkj.pattern.builder.entity;

import com.lirenkj.pattern.builder.entity.abs.Burger;

/**
 * VegBurger
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
