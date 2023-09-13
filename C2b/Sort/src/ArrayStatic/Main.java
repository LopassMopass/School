package ArrayStatic;

import java.util.Random;

public class Main extends BubbleSort {
    public static void main(String[] args) {
        int array[] = {8, 6, 4, 7, 1};
        bubble(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
