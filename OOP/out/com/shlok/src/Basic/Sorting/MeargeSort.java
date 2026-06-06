package Basic.Sorting;

import java.util.Arrays;

public class MeargeSort {
    static int[] Mearge(int[] arr1, int[] arr2) {

        int merged[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];  
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    static int[] meargeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = meargeSort(left);
        right = meargeSort(right);

        return Mearge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
        int[] sorted = meargeSort(arr);

        System.out.println(Arrays.toString(sorted));
    }
}
