package arrayAndMethod;

import java.util.Scanner;

public class covertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.printf("Fahrenheit to Celsius: %.2f \n",fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.printf("Celsius to Fahrenheit: %.2f \n", celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);


            }
        } while (true);

    } // end class main


    private static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    } // end method


    private static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    } // end method
}
