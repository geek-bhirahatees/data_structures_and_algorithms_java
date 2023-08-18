import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = t;
        return (i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] unSorted = new int[size];
        for (int i = 0; i < size; i++)
            unSorted[i] = scan.nextInt();

        quickSort(unSorted, 0, size - 1);

        for (int i = 0; i < size; i++)
            System.out.print(unSorted[i] + " ");

    }
}