package com.lirenkj.pattern.bridge;

import com.lirenkj.pattern.bridge.abs.Circle;
import com.lirenkj.pattern.bridge.abs.Shape;
import com.lirenkj.pattern.bridge.entity.GreenCircle;
import com.lirenkj.pattern.bridge.entity.RedCircle;

/**
 * BridgeDemo
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
