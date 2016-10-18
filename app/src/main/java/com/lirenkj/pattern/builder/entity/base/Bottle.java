package com.lirenkj.pattern.builder.entity.base;

import com.lirenkj.pattern.builder.interfaces.Packing;

/**
 * Bottle
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
