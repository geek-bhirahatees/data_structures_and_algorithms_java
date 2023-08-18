
import java.util.Scanner;

public class MergeSort {

    public static void merge(int a[], int start, int mid, int end) {
        int right = end - mid;
        int left = mid - start + 1;
        int right_array[] = new int[right];
        int left_array[] = new int[left];
        for (int i = 0; i < left; i++)
            left_array[i] = a[start + i];
        for (int i = 0; i < right; i++)
            right_array[i] = a[mid + i + 1];
        int r = 0, l = 0, k = start;
        while (r < right && l < left) {
            if (left_array[l] < right_array[r]) {
                a[k++] = left_array[l++];
            } else {
                a[k++] = right_array[r++];
            }
        }
        while (r < right) {
            a[k++] = right_array[r++];
        }
        while (l < left) {
            a[k++] = left_array[l++];
        }
    }

    public static void merge_sort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(a, start, mid);
            merge_sort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        // a={5,1,3,2,7}
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        merge_sort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
