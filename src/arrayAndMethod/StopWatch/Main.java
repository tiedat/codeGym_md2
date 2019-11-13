package arrayAndMethod.StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)Math.floor(Math.random()*10001);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        // selection sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            } // end j loop

            if (indexMin != i) {
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }
        } // end i loop

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
