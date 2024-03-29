package Inheritance.Geometry;

public class Circle extends Shape implements IResizeable {

    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + this.getRadius() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(radius * percent);
    }
}
