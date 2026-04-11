package com.shlok.access;

public class A {
    private int num = 10;
    protected String name;
    int[] arr;

    public A(int num,String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }


}


