package InsertionSortVsArrSort;

public class InsertionSort {
    public static void insertSort(int[] array) {
        int p = array.length;
        int i;

        for (i = 0; i < p; i++) {
            int j = i - 1;
            int tmp = array[i];
            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }
    }
}