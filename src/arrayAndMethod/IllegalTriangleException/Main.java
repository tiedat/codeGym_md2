package arrayAndMethod.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side 1:");
        double a = scanner.nextDouble();
        System.out.println("enter side 2:");
        double b = scanner.nextDouble();
        System.out.println("enter side 3:");
        double c = scanner.nextDouble();

        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}
