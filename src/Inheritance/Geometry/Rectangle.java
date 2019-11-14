package Inheritance.Geometry;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + this.getWidth()
                + " and length="
                + this.getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(length * percent);
        setWidth(width * percent);
    }
}
