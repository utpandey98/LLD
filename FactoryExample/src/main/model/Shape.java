package main.model;

public class Shape {

    private String shape;

    public Shape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public void draw() {
        System.out.println(shape);
    }
}
