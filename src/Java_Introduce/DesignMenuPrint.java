import java.util.Scanner;

public class DesignMenuPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            } // end switch
        } while (true);
    }

    private static void printRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            } // end for j
            System.out.println();
        }
    } // end method

    private static void printSquareTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            } // end for j
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            } // end for j
            System.out.println();
        }
    } // end method

    private static void printIsoscelesTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } // end method

}
