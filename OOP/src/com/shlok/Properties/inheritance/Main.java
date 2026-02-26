package com.shlok.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2, 3, 4);

        System.out.println("Box 1: " + box1.getLength() + " " + box1.getHeight() + " " + box1.getWidth());
        System.out.println("Box 2: " + box2.getLength() + " " + box2.getHeight() + " " + box2.getWidth());
        System.out.println("Box 3: " + box3.getLength() + " " + box3.getHeight() + " " + box3.getWidth());

    }
}
