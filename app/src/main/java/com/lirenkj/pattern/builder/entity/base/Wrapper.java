package com.lirenkj.pattern.builder.entity.base;

import com.lirenkj.pattern.builder.interfaces.Packing;

/**
 * Wrapper
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
