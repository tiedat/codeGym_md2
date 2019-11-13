package arrayAndMethod;

import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int index = 0;
        while (index < array.length) {
            array[index] = (int) Math.floor(Math.random() * 101);
            index++;
        }

        System.out.printf("%-20s%s", "Property list", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
