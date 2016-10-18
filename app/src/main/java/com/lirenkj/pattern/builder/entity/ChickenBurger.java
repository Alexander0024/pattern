package com.lirenkj.pattern.builder.entity;

import com.lirenkj.pattern.builder.entity.abs.Burger;

/**
 * ChickenBurger
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
