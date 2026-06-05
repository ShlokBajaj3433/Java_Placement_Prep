package Basic.Array;

import java.util.Arrays;

public class RemoveDuplicate {

    static void removeDuplicate(int arr[]) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
    removeDuplicate(new int[]{1,2,3,4,4,5,5,6});

    }
}
