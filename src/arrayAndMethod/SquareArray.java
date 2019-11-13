package arrayAndMethod;

import java.util.Scanner;

public class SquareArray {
    static Scanner scanner = new Scanner(System.in);

    static int[][] initArray() {
        System.out.print("Enter length of square double-dimensional array: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        return array;
    }


    static int calTotalElementInDiagonal(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        return total;
    } // end method

    public static void main(String[] args) {
        int[][] array = initArray();
        System.out.println("Total elements of array's diagonal: "
                + calTotalElementInDiagonal(array));
    }
}
