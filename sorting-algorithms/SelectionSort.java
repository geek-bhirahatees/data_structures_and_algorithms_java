import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int isLowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[isLowest] > arr[j]) {
                    isLowest = j;
                }
            }
            int temp = arr[isLowest];
            arr[isLowest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 5, 1, 2, 1 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
