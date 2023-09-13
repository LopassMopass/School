package Algoritmus;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rnd = new Random();
        int[] arrays = new int[11];

        for (int i = 0; i < 100; i++) {
            int number = rnd.nextInt(11);
            arrays[number] += 1;
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i]; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

