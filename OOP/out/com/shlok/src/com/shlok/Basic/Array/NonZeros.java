package com.shlok.Basic.Array;

public class NonZeros {

    static void KeepingCount(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swapping(int arr[]){
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 0, 5};

    
        KeepingCount(arr);
        System.out.println();
        swapping(arr);

    }
}
