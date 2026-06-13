package com.shlok.Basic;

public class DoWhile {
    public static void main(String[] args) {
    int count = 0;
    int a, b;

    do {
        a = (int)(Math.random() * 10);
        b = (int)(Math.random() * 10);
        count++;
    } while (a != b);

    System.out.println("Matched after " + count + " attempts");
    System.out.println("a = " + a + ", b = " + b);
    }
}
