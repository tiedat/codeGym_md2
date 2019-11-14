package Inheritance.CircleAndCylinder;

public class Cylinder extends Cirlce {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " and volume=" + getVolume() +
                " subclass of " +
                super.toString() +
                '}';
    }
}
