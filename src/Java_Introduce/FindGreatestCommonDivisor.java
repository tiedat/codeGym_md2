import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find greatest common divisor of a and b");

        do {
            System.out.print("Value a: ");
            int a = scanner.nextInt();
            System.out.print("Value b: ");
            int b = scanner.nextInt();
            int absOfa = Math.abs(a);
            int absOfb = Math.abs(b);

            if ((absOfa == 0 && absOfb == 0)) {
                System.out.println("No greatest common divisor");
            } else if (absOfa == 0) {
                System.out.printf("Greatest Common Divisor of %d and %d is %d\n", a, b, absOfb);
            } else if (absOfb == 0){
                System.out.printf("Greatest Common Divisor of %d and %d is %d\n", a, b, absOfa);
            } else {
                int gcd = findGreatestCommonDivisor(absOfa, absOfb);
                System.out.printf("Greatest Common Divisor of %d and %d is %d\n", a, b, gcd);
            }
        } while (true);
    }

    private static int findGreatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
