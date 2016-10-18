package com.lirenkj.pattern.abstractfactory;

/**
 * FactoryProducer
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
