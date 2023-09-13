package InsertionSort;

public class Main {
    public static void main(String[] args) {

        int array[] = {5,3,2,1,6,4};
        InsertionSort in = new InsertionSort();
        in.insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
