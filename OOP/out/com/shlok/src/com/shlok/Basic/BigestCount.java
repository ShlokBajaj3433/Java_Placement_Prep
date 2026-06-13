package com.shlok.Basic;

public class BigestCount {
    public static void main(String[] args) {
        int input = 39573;
        int bigest = Integer.MIN_VALUE;

        while (input != 0) {
            int digit = input % 10;
            if (digit > bigest) {
                bigest = digit;
            }
            input /= 10;
        }
        System.out.println("The biggest digit is " + bigest);
    }
}
