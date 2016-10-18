package com.lirenkj.pattern.factory;

import com.lirenkj.pattern.factory.entity.Circle;
import com.lirenkj.pattern.factory.entity.Rectangle;
import com.lirenkj.pattern.factory.entity.Square;
import com.lirenkj.pattern.factory.interfaces.Shape;

class ShapeFactory {
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
