package arrayAndMethod;

import javax.swing.*;
import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};
        int[] array3 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array3, 0, array1.length);

        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        System.out.print("array3" + Arrays.toString(array3));

    }
}
