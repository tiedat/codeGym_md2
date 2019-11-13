package arrayAndMethod;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {8, 9, 10},
                {11, 23, 64, 1, 3},
                {43, 5, 6, 90, 15, 8, 9, 0}
        };

        double max = Double.NEGATIVE_INFINITY;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                } // end if
            } // end loop j
        } // end loop i

        System.out.println("max = " + max);;

    }
}
