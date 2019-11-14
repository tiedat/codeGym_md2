package Inheritance.Geometry;

import arrayAndMethod.IllegalTriangleException.IllegalTriangleException;

public class Triangle extends Shape {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle() throws IllegalTriangleException {


        boolean check1 = side1 + side2 > side3;
        boolean check2 = side1 + side3 > side2;
        boolean check3 = side3 + side2 > side1;

        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Triangle Sides length is NOT positive float");
        } else if (!check1 || !check2 || !check3) {
            throw new IllegalTriangleException("This is NOT Triangle");
        }
    }

    Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        boolean check1 = side1 + side2 > side3;
        boolean check2 = side1 + side3 > side2;
        boolean check3 = side3 + side2 > side1;

        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Triangle Sides length is NOT positive float");
        } else if (!check1 || !check2 || !check3) {
            throw new IllegalTriangleException("This is NOT Triangle");
        }
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                "} " +
                super.toString();
    }
}
