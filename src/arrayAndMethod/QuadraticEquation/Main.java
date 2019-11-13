package arrayAndMethod.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = scanner.nextDouble();
        System.out.println("enter b: ");
        double b = scanner.nextDouble();
        System.out.println("enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double discriminant = quadraticEquation.getDiscriminant();

        if (a==0){
            System.out.println("This is not a quadratic equation bcz a = 0");
            return;
        }
        if (discriminant > 0) {
            System.out.println("Equation have two roots:");
            System.out.println("Root1: " + quadraticEquation.getRoot1());
            System.out.println("Root2: " + quadraticEquation.getRoot2());
            return;
        }
        if (discriminant == 0) {
            System.out.println("Equation have one root:");
            System.out.println(quadraticEquation.getRoot1());
            return;
        }

        System.out.println("Equation have no real roots");

    }
}
