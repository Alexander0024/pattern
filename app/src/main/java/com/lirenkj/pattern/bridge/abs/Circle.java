package com.lirenkj.pattern.bridge.abs;

import com.lirenkj.pattern.bridge.interfaces.DrawAPI;

/**
 * Circle
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        mDrawAPI.drawCircle(radius, x, y);
    }
}
