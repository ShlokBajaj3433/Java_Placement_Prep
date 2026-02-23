package com.shlok.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(23, "Shlok", 100000);
        Human h2 = new Human(24, "Sparsh", 50000);
        System.out.println(h1.name + " " + h1.age + " " + h1.salary);
        System.out.println(h2.name + " " + h2.age + " " + h2.salary);

        System.out.println(Human.Population);
        System.out.println(Human.Population);
    }
}