package InsertionSort;

public class InsertionSort {
    public static void insertSort(int[] array){
        /*int p = array.length;
        int i;
        // Od nejmensi po nejvetsi
        for(i = 0; i < p; i++){
            int j = i - 1;
            int tmp = array[i];
            while(j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }
        /* Od nejvetsiho po nejmensimu
        for(i = 1; i < p; i++){
            int j = i - 1;
            int tmp = array[i];
            while(j >= 0 && tmp > array[j]){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }*/

        /* Od nejvetsiho po nejmensimu
        for(i = 0; i < p - 1; i++){
            int j = i + 1;
            int tmp = array[j];

            while(j > 0 && tmp > array[j - 1]){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }*/
    }
}
