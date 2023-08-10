import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        boolean isSwapped = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    isSwapped = false;
                }
            }
            if (isSwapped)
                return arr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 5, 1, 2, 1 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}