package Inheritance.Geometry.Circle;

import Inheritance.Geometry.Shape.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius +
                ", which is a subclass of " + super.toString();
    }
}
