package com.lirenkj.pattern.bridge.abs;

import com.lirenkj.pattern.bridge.interfaces.DrawAPI;

/**
 * Shape
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public abstract class Shape {
    protected DrawAPI mDrawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.mDrawAPI = drawAPI;
    }

    public abstract void draw();
}
