public class LeaderInArray {
    /* Big O(n * n) Solution */
    public static void LeaderElementInAnArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    break;
                }
            }
            if (max == arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }

    /* Big O(n) Solution */
    public static void LeaderElementInAnArrayModified(int[] arr) {
        int max = arr[arr.length - 1];
        System.out.println(max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 10, 9, 15, 7, 3, 1, 12 };
        new LeaderInArray().LeaderElementInAnArrayModified(arr);
    }
}