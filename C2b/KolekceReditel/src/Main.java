import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int pocet = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(66);
        list.add(87);
        list.add(12);
        list.add(0);
        list.add(13);
        list.add(2);
        list.add(23);


        List<Integer> sub = list.subList(0, 4);
        List<Integer> sub1 = list.subList(4, 7);

        for (int i = 0; i < list.size(); i++) {
            pocet++;
        }

        System.out.print(sub);

    }

    public static void useMergeSort(ArrayList<Integer> list) {
        ArrayList<Integer> listTp = new ArrayList<>(list.size());
        mergeSort(list, listTp, 0, list.size() - 1);
    }

    private static void mergeSort(ArrayList<Integer> list, ArrayList<Integer> listTp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, listTp, left, mid);
            mergeSort(list, listTp, (mid + 1), right);
            merge(list, listTp, left, mid, right);
        }
    }
    private static void merge(ArrayList<Integer> list, ArrayList<Integer> listTp, int left, int mid, int right){
            int i = left, j = mid, k = right;
            while (i <= mid && j <= right) {

            }
    }
}