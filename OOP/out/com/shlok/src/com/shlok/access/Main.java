package com.shlok.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(5,"Shlok");

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Subclass);
    }
}