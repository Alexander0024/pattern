package com.lirenkj.pattern.abstractfactory;

import com.lirenkj.pattern.abstractfactory.entity.Circle;
import com.lirenkj.pattern.abstractfactory.entity.Rectangle;
import com.lirenkj.pattern.abstractfactory.entity.Square;
import com.lirenkj.pattern.abstractfactory.interfaces.Color;
import com.lirenkj.pattern.abstractfactory.interfaces.Shape;

/**
 * ShapeFactory
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
