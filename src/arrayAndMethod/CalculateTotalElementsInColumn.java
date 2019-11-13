package arrayAndMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTotalElementsInColumn {

    static Scanner scanner = new Scanner(System.in);

    static int[][] initArray() {
        int size;
        int[][] array;

        do {
            System.out.print("Enter length of square double-dimensional array: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        } while (size > 10);

        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        return array;
    } // end initArray method

    static int calTotalElementInColumn(int[][] array) {

        int column;
        do {
            System.out.print("Enter the index of column you want to calculate total: ");
            column = scanner.nextInt();
            if (column < 0 || column > array.length - 1) {
                System.out.printf("Index column must between of %d and %d \n", 0, array.length - 1);
            }
        } while (column < 0 || column > array.length - 1);

        int total = 0;
        for (int[] ints : array) {
            total += ints[column];
        }

        return total;
    } // end calculate method

    public static void main(String[] args) {
        int[][] array = initArray();
        System.out.println();
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Total elements in column of array: "+calTotalElementInColumn(array));
    }
}
