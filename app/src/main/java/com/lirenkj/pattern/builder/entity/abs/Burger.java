package com.lirenkj.pattern.builder.entity.abs;

import com.lirenkj.pattern.builder.entity.base.Wrapper;
import com.lirenkj.pattern.builder.interfaces.Item;
import com.lirenkj.pattern.builder.interfaces.Packing;

/**
 * Burger
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
