package InsertionSortVsArrSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        /*final int numberCount = 10;
        final int maxNumber = 100;*/
        //int array[] = new int[numberCount];

        int array[] = new int[100000];
        InsertionSort in = new InsertionSort();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000)+1;
            //array[i] = rnd.nextInt(maxNumber);
            //System.out.print(array[i] + " ");
        }

        /*long start = System.currentTimeMillis();
        in.insertSort(array);
        long end = System.currentTimeMillis() - start;
        */
        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long end = System.currentTimeMillis() - start;
        float elapsedTimeSec = end / 1000F;

        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i] + " ");
        }

        System.out.println("\n"+elapsedTimeSec+"s");
    }
}
