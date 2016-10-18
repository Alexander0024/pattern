package com.lirenkj.pattern.builder.entity.abs;

import com.lirenkj.pattern.builder.entity.base.Bottle;
import com.lirenkj.pattern.builder.interfaces.Item;
import com.lirenkj.pattern.builder.interfaces.Packing;

/**
 * ColdDrink
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
