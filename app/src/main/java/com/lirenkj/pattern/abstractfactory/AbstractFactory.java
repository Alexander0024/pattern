package com.lirenkj.pattern.abstractfactory;

import com.lirenkj.pattern.abstractfactory.interfaces.Color;
import com.lirenkj.pattern.abstractfactory.interfaces.Shape;

/**
 * AbstractFactory
 * <p>
 * Created by Alexander on 2016/10/18.
 */
abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
