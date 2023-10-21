package main.factory;

import main.model.Shape;

public class ShapeFactory {

    public Shape getShape(String shape) {

        switch(shape.toLowerCase()) {
            case "circle":
                return new Shape("Circle");
            case "rectangle":
                return new Shape("rectangle");
            case "square":
                return new Shape("square");

        }
        return new Shape("Default");
    }
}
