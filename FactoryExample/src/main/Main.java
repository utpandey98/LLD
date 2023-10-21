package main;

import main.factory.ShapeFactory;
import main.model.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();
    }
}
