package arrayAndMethod;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter index you want to add element: ");
        int index = scanner.nextInt();

        if (index < 0 || index > array.length - 1) {
            System.out.printf("Can NOT add element at index %d", index);
        } else {
            System.out.print("Enter element value: ");
            array[index] = scanner.nextInt();
        }

        for (int anInt : array) {
            System.out.printf("%d%5s", anInt, "");
        }

    }
}
