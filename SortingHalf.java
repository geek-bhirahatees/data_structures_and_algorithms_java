import java.util.Arrays;

public class SortingHalf {
    public static int[] sortingHalf(int[] arr) {
        int length = arr.length / 2;

        if (arr.length % 2 == 1) {
            length = (arr.length / 2) + 1;
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 5, 1, 2, 1 };
        System.out.println(Arrays.toString(sortingHalf(arr)));
    }
}
