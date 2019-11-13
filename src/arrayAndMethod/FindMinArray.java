package arrayAndMethod;

import java.util.Scanner;

public class FindMinArray {
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
        int i = 0;
        while (i < array.length) {
            array[i] = (int) Math.floor(Math.random()*101);
            i++;
        }

        System.out.print("Property list: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.printf("The smallest value in the list is %d at position %d", min, index);
    }
}
