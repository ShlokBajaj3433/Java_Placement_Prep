package com.shlok.Properties.Overloding;

public class Overloading {
    private int a, b, c;
    void sum(int a, int b) {
        System.out.println("Sum of two numbers is: " + (a + b));
    }

    void sum(float a, float b) {
        System.out.println("Sum of two float numbers is: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers is: " + (a + b + c));
    }
}
