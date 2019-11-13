package arrayAndMethod;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveElementFromArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 101);
        }

        System.out.println("original array: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element you want to remove: ");
        int element = scanner.nextInt();

        removeElement(element,array);
        int[] array1 = {1,1,2,3,4,5,6};
        removeElement(1,array1);
    }

    private static void removeElement(int element, int... array) {
        if (!isExist(element, array)) {
            System.out.println("array does not contain " + element);
        } else {
            for (int i = 0; i < array.length; i++) {
                int lastIndex = array.length - 1;
                if (array[i] == element) {
                    System.arraycopy(array,i+1,array,i,array.length-i-1);
                    array[lastIndex]= 0;
                    i--;
                } // end if
            } // end loop
        } // end if

        System.out.println("result: " + Arrays.toString(array));
    } // end method

    private static boolean isExist(int element, int... array) {
        for (int value : array) {
            if (value == element)
                return true;
        }
        return false;
    } // end method
}
