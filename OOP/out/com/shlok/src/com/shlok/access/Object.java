package com.shlok.access;

public class Object {
    public Object() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main() {
            Object obj1 = new Object();
            Object obj2 = new Object();

            System.out.println("HashCode of obj1: " + obj1.hashCode());
            System.out.println("HashCode of obj2: " + obj2.hashCode());

            System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

            System.out.println("String representation of obj1: " + obj1.toString());

            System.out.println(obj1.getClass().getName());
    }

}
