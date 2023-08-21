package algorithms;

import java.util.ArrayList;

public class SumOfThePreFixAndSuffix {
    public static void SumOfThePreFixAndSuffix(int[] arr) {
        ArrayList<Integer> equArrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int suffixSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                suffixSum += arr[j];
            }
            int prefixSum = 0;
            for (int k = 0; k <= i; k++) {
                prefixSum += arr[k];
            }
            // System.out.println(prefixSum + " " + suffixSum);
            if (prefixSum == suffixSum) {
                equArrayList.add(prefixSum);
            }
        }
        if (equArrayList.size() == 1) {
            System.out.println(equArrayList.get(0));
        } else {
            int max = equArrayList.get(0);
            for (int i = 1; i < equArrayList.size(); i++) {
                if (max < equArrayList.get(i)) {
                    max = equArrayList.get(i);
                }
            }
            System.out.println(max);
        }
    }

    public static int SumOfThePreFixAndSuffixOptimized(int[] arr) {
        int totalSum = 0;
        int prefixSum = 0;
        int maxSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int num : arr) {
            totalSum -= num;
            prefixSum += num;
            if (prefixSum == totalSum) {
                maxSum = prefixSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 0, 3, 1, 5 };
        System.out.println(new SumOfThePreFixAndSuffix().SumOfThePreFixAndSuffixOptimized(arr));
    }
}
