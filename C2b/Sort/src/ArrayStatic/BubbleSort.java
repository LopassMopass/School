package ArrayStatic;

public class BubbleSort {
    public static void bubble(int[] array) {
        int p = array.length;
        int t = 0;
        boolean finished = true;

        for (int i = 0; i < p - 1; i++) {
            finished = true;
            for (int j = 0; j < p - 1 - j; j++) {
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    finished = false;
                }
            }
            if (finished) break;
        }
    }

    /*public static void Maximum(int[] arrays){
            for (int j = 0; j < arrays.length - 1; j++) {
                int maxIndex = 0;
                for (int i = 1; i < arrays.length - j; i++) {
                    if (arrays[i] > arrays[maxIndex]) {
                        maxIndex = i;
                    }
                }
                int help = arrays[arrays.length - 1 - j];
                arrays[arrays.length - 1 - j] = arrays[maxIndex];
                arrays[maxIndex] = help;
            }
        } */

        /*for(int i = 0; i < p - 1; i++){
            for(int j = 0; j < p - 1 - j; j++){

                if(array[j] > array[j+1]){
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;

                }
            }
        }*/
        /*for(int i = 0; i < p; i++){
            for(int j = 1; j < p-i; j++){
                if(array[j-1] > array[j]){
                    t = array[j-1];
                    array[j-1] = array[j];
                    array[j] = t;
                }

            }
        }*/
    }

