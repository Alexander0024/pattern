package com.lirenkj.pattern.abstractfactory;

import com.lirenkj.pattern.abstractfactory.entity.Blue;
import com.lirenkj.pattern.abstractfactory.entity.Green;
import com.lirenkj.pattern.abstractfactory.entity.Red;
import com.lirenkj.pattern.abstractfactory.interfaces.Color;
import com.lirenkj.pattern.abstractfactory.interfaces.Shape;

/**
 * ColorFactory
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
