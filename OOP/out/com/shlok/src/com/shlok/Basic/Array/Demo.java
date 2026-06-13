package com.shlok.Basic.Array;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,4,56,7,4};
        int arr2[] = new int[10];

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println(arr2[1]);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i < arr2.length; i++) {
            System.out.println("Enter the value for index " + i);
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
