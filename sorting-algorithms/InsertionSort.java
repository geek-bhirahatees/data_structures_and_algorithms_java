import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while ((j > -1) && (current < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 5, 1, 2, 1 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}