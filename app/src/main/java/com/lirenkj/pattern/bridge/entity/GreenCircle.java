package com.lirenkj.pattern.bridge.entity;

import com.lirenkj.pattern.bridge.interfaces.DrawAPI;

/**
 * GreenCircle
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
