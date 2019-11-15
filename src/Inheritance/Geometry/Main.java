package Inheritance.Geometry;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);


        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);
        circles[3] = new ComparableCircle(3.6);
        circles[4] = new ComparableCircle(3.7);

        System.out.println("\n Pre-sorted:");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }

        System.out.println(" \n use compareTo() method");
        Arrays.sort(circles); // su dung sort bang phuong thuc compareTo()

        System.out.println("After-sorted:");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }

        System.out.println(" \n use compare() method");

        ComparableCircle[] circles1 = new ComparableCircle[5];
        circles1[0] = circles[4];
        circles1[1] = circles[2];
        circles1[2] = circles[0];
        ;
        circles1[3] = circles[1];
        ;
        circles1[4] = circles[3];
        ;

        System.out.println("Pre-sorted:");
        for (ComparableCircle c : circles1) {
            System.out.println(c);
        }
        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles1, circleComparator); // su dung sort bang phuong thuc compare()

        System.out.println(" \n After-sorted:");
        for (Circle c : circles1) {
            System.out.println(c);
        }

        System.out.println("\n test interface IColorable");

        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Circle(2);
        shapes[3] = new Square("Mau Nho", true, 3);

        for (Shape i : shapes) {
            if (i instanceof IColorable) {
                System.out.println("area: " + ((Rectangle)i).getArea());
                ((IColorable) i).howToColor();
            }
        }


    }
}
