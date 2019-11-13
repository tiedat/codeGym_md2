import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which year do you want to check ?");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.printf("%d is leap year!", year);
        } else {
            System.out.printf("%d is NOT leap year!", year);
        }
    }

    private static boolean isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } //end if
        return year % 400 == 0;
    }
}
