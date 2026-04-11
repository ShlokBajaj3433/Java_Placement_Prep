package com.shlok.access;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public void printValues() {
        System.out.println(getNum());
        System.out.println(name);
    }


}
