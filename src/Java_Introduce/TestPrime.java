package Java_Introduce;

import java.util.Scanner;

public class TestPrime {

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (TestPrime.isPrime(number)) {
            System.out.printf("%d is a prime number", number);
        } else {
            System.out.printf("%d is NOT a prime number", number);
        }
    }

}
