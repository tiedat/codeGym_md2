package arrayAndMethod.IllegalTriangleException;

import java.util.Scanner;

class Triangle {
    private double a, b, c;

    Triangle(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;

        boolean check1 = a + b > c;
        boolean check2 = a + c > b;
        boolean check3 = c + b > a;

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Triangle Sides length is NOT positive float");
        } else if (!check1 || !check2 || !check3) {
            throw new IllegalTriangleException("This is NOT Triangle");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
